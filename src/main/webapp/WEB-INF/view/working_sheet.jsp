<%--
  Created by IntelliJ IDEA.
  User: 11602
  Date: 2018/6/9
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/view/include.jsp" %>
<%String pagePath = request.getContextPath() + "/workingsheet";%>
<%int employeeId = (int) session.getAttribute("employeeId");%>
<html>
<head>
    <title>Working Sheet Management</title>
</head>
<body>
<table id="tb_working_sheet"></table>
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
            $('#tb_working_sheet').bootstrapTable({
                url: '<%=pagePath%>/search?employeeId=<%=employeeId%>',          //请求后台的URL（*）
                method: 'get',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "desc",                   //排序方式
                queryParams: oTableInit.queryParams,//传递参数（*）
                sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber: 1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [5, 10, 15, 20],        //可供选择的每页的行数（*）
                search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                strictSearch: true,
                showColumns: false,                  //是否显示所有的列
                showRefresh: false,                  //是否显示刷新按钮
                minimumCountColumns: 2,             //最少允许的列数
                clickToSelect: false,                //是否启用点击选中行
                height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "workingSheetId",                     //每一行的唯一标识，一般为主键列
                showToggle: false,                    //是否显示详细视图和列表视图的切换按钮
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                onEditableSave: function (field, row, oldValue, $el) {
                    $.ajax({
                        type: "post",
                        url: "<%=pagePath%>/edit",
                        dataType: "text",
                        data: row,
                        success: function (data) {
                            <%--$('#tb_department').bootstrapTable('refresh', {url: '<%=pagePath%>/search'});--%>
                        }
                    });
                },
                columns: [{
                    field: 'trackingNo',
                    title: 'Traking No'
                }, {
                    field: 'receiverName',
                    title: 'Receiver Name'
                }, {
                    field: 'receiverPhoneNo',
                    title: 'Receiver Phone'
                }, {
                    field: 'receiverAddress',
                    title: 'Receiver Address'
                }, {
                    field: 'receiverDetailedAddress',
                    title: 'Receiver Detailed Address'
                }, {
                    field: 'expressDeliveryPosition',
                    title: 'Express Delivery Position',
                    editable: {
                        type: 'text',
                        validate: function (value) {
                            if ($.trim(value) == '') {
                                return 'This value can not be empty';
                            }
                        }
                    }
                }, {
                    title: 'Operation',
                    align: 'center',
                    events: operateEvents,
                    formatter: operateFormatter
                }]
            });
        };
        return oTableInit;
    };

    function operateFormatter(value, row, index) {
        return '<button id="revoke"  type="button" class="btn btn-primary" style="margin-left: 15px">Revoke</button>';
    }

    window.operateEvents = {
        "click #revoke": function (e, value, row, index) {
            $.ajax({
                type: 'post',//提交方式，，post get...
                dataType: "text",//数据传输格式
                url: "<%=pagePath%>/revoke",//访问服务器后台的url
                data: row,//数据可以写{'age':10,'name':'aaa'}方式
                success: function (result) {//返回成功后执行的函数，result是返回的数据
                    alert("Successfully Revoked!");
                    $('#tb_working_sheet').bootstrapTable('refresh', {url: '<%=pagePath%>/search?employeeId=<%=employeeId%>'});
                }
            });
        }
    };
</script>
</html>
