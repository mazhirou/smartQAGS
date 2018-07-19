<%@ page language="java" pageEncoding="utf-8"%>
<!-- BEGIN PAGE HEADER-->
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN PAGE TITLE & BREADCRUMB-->
        <h3 class="page-title" id="index-page-title">我的BOT</h3>
        <%--<ul class="page-breadcrumb breadcrumb">--%>
        <%--<li>--%>
        <%--<i class="fa fa-home"></i>--%>
        <%--<a href="javascript:;">--%>
        <%--首页--%>
        <%--</a>--%>
        <%--<i class="fa fa-angle-right"></i>--%>
        <%--</li>--%>
        <%--<li>--%>
        <%--<a href="javascript:;">--%>
        <%--Dashboard--%>
        <%--</a>--%>
        <%--</li>--%>
        <%--</ul>--%>
        <!-- END PAGE TITLE & BREADCRUMB-->
    </div>
</div>
<br/>
<div class="row">
    <div class="col-md-6">
        <a class="btn btn-primary btn-sm" href="javascript:;" onclick="create_taglibs()"><i class=" fa fa-tag"></i> 新建BOT</a>
    </div>
</div>
<br/>
<!-- END PAGE HEADER-->
<div class="row">
    <div class="col-md-12">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>BOT名称</th>
                <th>版本号</th>
                <th>更新时间</th>
                <th>描述</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td style="vertical-align: middle;">601</td>
                <td style="vertical-align: middle;">客服助手</td>
                <td style="vertical-align: middle;">v1</td>
                <td style="vertical-align: middle;">2018-07-18 11:11:11</td>
                <td style="vertical-align: middle;">客服问答机器人</td>
                <td><button class='btn btn-sm btn-success'>管理</button>&nbsp&nbsp<button class='btn btn-sm btn-info'>预测</button>&nbsp&nbsp<button class='btn btn-sm btn-warning'>删除</button></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>