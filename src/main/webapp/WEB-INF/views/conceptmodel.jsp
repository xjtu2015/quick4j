<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.0.3
Version: 1.5.5
Author: KeenThemes
Website: http://www.keenthemes.com/
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <title>401 未授权错误</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <meta name="MobileOptimized" content="320">
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN THEME STYLES -->
    <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
    <link href="assets/css/pages/error.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME STYLES -->
    <link rel="shortcut icon" href="favicon.ico"/>
    <style>
     .div-height{border:1px solid #DDDDDD ;  height:500px}
     .tab-height{border:1px solid #DDDDDD ;  height:200px}

    </style>

    </head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-500-full-page">
<div>
    <button type="button" class="btn btn-default pull-left" data-toggle="modal" data-target="#myM1">添加设备</button>


<div class="row" >
    <div class="col-md-5 ">
        <div class=" div-height panel panel-default ">
            <div class="panel-heading">
                <h3 class="panel-title">模型面板</h3>
            </div>

            <div class="panel-body">

            </div>
        </div>
    </div>
    <div class="col-md-5">
        <div class=" tab-height panel panel-default " >
            <div class="panel-heading">
                <h3 class="panel-title">对象表格</h3>
            </div>
            <div class="panel-body ">

            </div>
            <table class="table">
                <th>编号</th>
                <th>名称</th>
                <th>父编号</th>
                <tr>
                    <td>1</td>
                    <td></td>
                    <td>200</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>b</td>
                    <td>400</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>b</td>
                    <td>400</td>
                </tr>

            </table>
        </div>

    </div>
</div>
    <!-- 模态框（Modal） -->
    <div class="modal fade"  data-backdrop="false" id="myM1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        创建一个设备（节点）：
                    </h4>
                </div>
                <form class="form-horizontal" role="form" action="rest/model/addEq" method="post">
                <div class="modal-body">

                        <div class="form-group">
                            <label for="EqName" class="col-sm-2 control-label">设备名称</label>
                            <div class="col-sm-10">
                                <input name="nodename" type="text" class="form-control" id="EqName"
                                       placeholder="请输入名称">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="EqDesc" class="col-sm-2 control-label">设备描述</label>
                            <div class="col-sm-10">
                               <%-- <input  name="description" type="text" class="form-control" id="EqDesc" rows="3"
                                       placeholder="请输设备描述...">--%>
                                <textarea name="description" type="text" class="form-control" rows="3" id="EqDesc"
                                    placeholder="请输设备描述..."></textarea>
                            </div>
                        </div>
                        <%--<div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> 请记住我
                                    </label>
                                </div>
                            </div>
                        </div>--%>
                       <%-- <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">登录</button>
                            </div>
                        </div>--%>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消
                    </button>
                    <button type="submit" class="btn btn-primary">
                        提交信息
                    </button>
                </div>
                </form>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>

</div>
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="assets/plugins/respond.min.js"></script>
<script src="assets/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js"
        type="text/javascript"></script>
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.jsPlumb-1.4.1-all-min.js"></script>
<!-- END CORE PLUGINS -->
<script src="assets/scripts/app.js"></script>
<script>
    jQuery(document).ready(function () {
        App.init();
    });
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>
