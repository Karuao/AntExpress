<%--
  Created by IntelliJ IDEA.
  User: 11602
  Date: 2018/5/28
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/view/include.jsp" %>
<html>
<head>
    <title>Invoice Management</title>
</head>
<body>
<div id="toolbar" class="btn-group">
    <button id="btn_add" type="button" class="btn btn-default" onclick="add()">
        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>Add
    </button>
    <button id="btn_edit" type="button" class="btn btn-default">
        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>Alter
    </button>
    <button id="btn_delete" type="button" class="btn btn-default">
        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>Delete
    </button>
</div>
<table id="tb_invoice"></table>
</body>
<script>
    $(function () {
       //1.初始化Table
       var oTable = new TableInit();
        oTable.Init();
    });

    var TableInit = function () {
        var oTableInit = new Object();
        //初始化Table
        oTableInit.Init = function () {
            $('#tb_invoice').bootstrapTable({
                url: '<%=contextPath%>/dispatchbill/search'          //请求后台的URL（*）
                method: 'get',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams: oTableInit.queryParams,//传递参数（*）
                sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber:1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [5, 10, 15, 20],        //可供选择的每页的行数（*）
                search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                strictSearch: true,
                showColumns: false,                  //是否显示所有的列
                showRefresh: false,                  //是否显示刷新按钮
                minimumCountColumns: 2,             //最少允许的列数
                clickToSelect: false,                //是否启用点击选中行
                height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "expressDeliveryBillId",                     //每一行的唯一标识，一般为主键列
                showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [{
                    field: 'trakingNo',
                    title: 'Traking No'
                }, {
                    field: '',
                    title: 'Sender Name'
                }, {
                    field: '',
                    title: 'Sender Phone No'
                }, {
                    field: '',
                    title: 'Receiver Name'
                }, {
                    field: '',
                    title: 'Receiver Phone No'
                }, {
                    field: '',
                    title: 'Receiver Address'
                }, {
                    field: '',
                    title: 'Receiver Detailed Address'
                }]
            });
        };
        return oTableInit;
    }
</script>
</html>
