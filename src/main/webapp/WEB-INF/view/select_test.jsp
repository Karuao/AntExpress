<%--
  Created by IntelliJ IDEA.
  User: 11602
  Date: 2018/6/4
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/view/include.jsp" %>
<html>
<html>
<head>
    <title>Title</title>
    <script>
        var data = [];
    </script>
</head>
<body>
<button id="getallselection" class="btn btn-primary" type="button">
    getallselection
</button>
<br>
<br>
<table id="table"></table>
</body>
<script>
    $('#table').bootstrapTable({
        editable: true,
        columns: [{
            field: 'if',
            title: 'check',
            checkbox: true
        }, {
            field: 'id',
            title: 'Item ID'
        }, {
            field: 'select',
            title: 'select',
            editable: {
                type: 'select',
                source: combobox
            }
        }, {
            field: 'name',
            title: 'Item Name',
            formatter: setSelect,
            events: {
                'change .ss': function (e, value, row, index) {
                    var valueSelected = $(this).children('option:selected').val();
                    $('#table').bootstrapTable('updateCell', {
                        index: index,
                        field: 'name',
                        value: valueSelected
                    })
                }
            }
        }],
        data: [{
            id: 1,
            select: 1,
            name: 'Item 1',
        }, {
            id: 2,
            select: 2,
            name: 'Item 2',
        }]
    });

    function setSelect(value, row, index) {
        var strHtml = "";
        if (value == "Item 1") {
            strHtml = "<select class='ss'><option value='Item 1' selected='selected'>Item 1</option><option value='Item 2'>Item 2</option></select>";
        }
        else {
            strHtml = "<select class='ss'><option value='Item 1' >Item 1</option><option value='Item 2' selected='selected'>Item 2</option></select>";
        }
        return strHtml;
    }

    function combobox() {
        if (data.length != 0) {
            return data;
        }
        var result1;
        $.ajax({
            type: 'post',//提交方式，，post get...
            async: false,
            dataType: "json",//数据传输格式
            url: "<%=contextPath%>/combobox",//访问服务器后台的url
            success: function (result) {
//                data = result;
//                return result;
                result1 = result;
            }
        });
        return result1;
    }
    
    <%--function combobox() {--%>
        <%--var result = [];--%>
        <%--$.ajax({--%>
            <%--url: '<%=contextPath%>/combobox',--%>
            <%--async: false,--%>
            <%--type: "get",--%>
            <%--data: {},--%>
            <%--success: function (data, status) {--%>
                <%--$.each(data, function (key, value) {--%>
                    <%--result.push({ value: value.value, text: value.text });--%>
                <%--});--%>
            <%--}--%>
        <%--});--%>
        <%--return result;--%>
    <%--}--%>

    $("#getallselection").click(function () {
        var result = $('#table').bootstrapTable('getAllSelections');
        alert(result[0].name);
    });
</script>
</html>
