<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" href="res/css/bootstrap.min.css">
    <link rel="stylesheet" href="res/admin/css/style.css">
    
    <script src="res/js/jquery.min.js"></script>
    <script src="res/js/popper.min.js"></script>
    <script src="res/js/bootstrap.min.js"></script>
    <script src="res/admin/js/script.js"></script>
</head>
<body>
    <div class="container">
       <!--header-->
       <tiles:insertAttribute name="header" />
       <!-- /header -->
        <div class="row">  
            <!-- aside -->
            <tiles:insertAttribute name="aside" />
            <!-- //aside -->
            <tiles:insertAttribute name="body" />            
        </div>
       <tiles:insertAttribute name="footer" />
    </div>
    
<!-- modal -->
<div class="modal fade" id="gradeModal" tabindex="-1" role="dialog" aria-labelledby="gradeModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                  <div class="modal-content">
                    <div class="modal-header">
                      <h5 class="modal-title" id="gradeModalLabel">Modal title</h5>
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                      </button>
                    </div>
                    <div class="modal-body p-5 modal-grade">
                       <form name="gradeForm" id="gradeForm" action="memgrade" method="post">
                          <div class="row mt-3 pb-3 border-bottom grade">
                             <label for="" class="col-2 text-center">0</label>
                             <input type="text" class="form-control col-9" name="grade-0" value="손님">
                          </div>     
                          
                          <div class="row mt-3 pb-3 border-bottom grade">
                            <label for="" class="col-2 text-center">1</label>
                            <input type="text" class="form-control col-9" name="grade-1" value="일반회원">
                          </div>  
                          
                          <div class="row mt-3 pb-3 border-bottom grade">
                            <label for="" class="col-2 text-center">2</label>
                            <input type="text" class="form-control col-9" name="grade-2" value="특별회원">
                          </div> 

                       </form>
                          <div class="row mt-4 d-flex justify-content-center">
                             <button type="button" id="deleteGrade" class="btn btn-danger mr-2"> 회원등급 삭제 </button>
                             <button type="button" id="addGrade" class="btn btn-primary ml-2"> 회원등급 추가 </button>
                          </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                  </div>
                </div>
              </div>
   <!-- /modal -->  
            
</body>
</html>