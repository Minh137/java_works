package net.minh137.pdf;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

@WebServlet("/orderbox")
public class PdfBoxServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String[]> parameterMap = request.getParameterMap();

        String[] productNames = parameterMap.get("pdname[]");
        String[] productPrices = parameterMap.get("pdprice[]");
        String totalPrice = request.getParameter("totalPrice");

        // PDF 파일 저장 경로
        String pdfDirPath = getServletContext().getRealPath("/pdfgen");
        File pdfDir = new File(pdfDirPath);
        if (!pdfDir.exists()) {
            pdfDir.mkdirs(); // 폴더가 없으면 생성한다.
        }

        String pdfPath = pdfDirPath + File.separator + "orderbox.pdf";

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = null;

        try {
            // 폰트 설정
            String fontPath = getServletContext().getRealPath("/res/fonts/NotoSansKR-Regular.ttf");
            PDType0Font font = PDType0Font.load(document, new File(fontPath));

            contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(font, 20);
            contentStream.newLineAtOffset(50, 750);
            contentStream.showText("주문서");
            contentStream.endText();

            contentStream.beginText();
            contentStream.setFont(font, 15);
            contentStream.newLineAtOffset(50, 730);
            contentStream.showText("-------------------------");
            contentStream.endText();

            // 제품 목록 출력
            int yPosition = 710;
            for (int i = 0; i < productNames.length; i++) {
                contentStream.beginText();
                contentStream.setFont(font, 12);
                contentStream.newLineAtOffset(50, yPosition);
                contentStream.showText("상품명: " + productNames[i] + " / 가격: " + productPrices[i] + "원");
                contentStream.endText();
                yPosition -= 20; // 각 항목 간 간격
            }

            // 총 가격 출력
            yPosition -= 20; // 총 가격과 목록 사이 간격
            contentStream.beginText();
            contentStream.setFont(font, 15);
            contentStream.newLineAtOffset(50, yPosition);
            contentStream.showText("총 가격: " + totalPrice + "원");
            contentStream.endText();

            contentStream.close();
            document.save(pdfPath);

        } catch (IOException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "PDF 생성 중 오류 발생");
            return;
        } finally {
            if (contentStream != null) {
                contentStream.close();
            }
            document.close();
        }

        response.setContentType("application/json");
        response.getWriter().write("{\"filePath\" : \"pdfgen/orderbox.pdf\"}");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
