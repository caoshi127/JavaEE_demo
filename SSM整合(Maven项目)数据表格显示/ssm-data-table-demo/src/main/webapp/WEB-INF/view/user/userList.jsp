<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
  <title>用户列表</title>
  <link rel="stylesheet" href="/plugin/layui/css/layui.css"  media="all">
  <script type="text/javascript" src="/js/jquery-1.9.1.js"></script>
  <script type="text/javascript" src="/plugin/layui/layui.js" charset="utf-8"></script>

  <style type="text/css">
    tr td {
      text-align: center;
    }

    #test-tb td {
      height: 30px;
    }
  </style>

</head>
<body>

  <h3>用户信息列表1: 使用jstl</h3>

  <table cellpadding="0" cellspacing="0" width="500px" border="1 red solid">
    <thead>
      <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>地址</th>
        <th>出生年月日</th>
      </tr>
    </thead>

    <tbody>
      <c:forEach items="${userList}" var="user">
        <tr>
          <td>${user.id}</td>
          <td>${user.name}</td>
          <td>${user.age}</td>
          <td>${user.address}</td>
          <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd" /></td>
        </tr>
      </c:forEach>
    </tbody>
    <tfoot></tfoot>
  </table>

  <br/>

  <h3>用户信息列表2: 利用js生成</h3>  <br/>
  <button id="test-btn">测试按钮-1</button>
  <br/>
  <table cellpadding="0" cellspacing="0" width="500px" border="1 red solid">
    <thead>
    <tr>
      <th>ID</th>
      <th>姓名</th>
      <th>年龄</th>
      <th>地址</th>
      <th>出生年月日</th>
    </tr>
    </thead>

    <tbody id="test-tb">
      <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
    </tbody>
    <tfoot></tfoot>
  </table>
  <br/>
  <h3>用户信息列表3: 利用layui生成</h3>  <br/>
  <button id="test-tb2">测试按钮-2</button>
  <table class="layui-hide" id="userInfoTab"></table>

</body>

<script type="text/javascript">

  function datefmt(fmt,date) {
    var o = {
      "M+" : date.getMonth()+1,     //月份
      "d+" : date.getDate(),        //日
      "h+" : date.getHours(),       //小时
      "m+" : date.getMinutes(),     //分
      "s+" : date.getSeconds(),     //秒
      "q+" : Math.floor((date.getMonth()+3)/3), //季度
      "S" : date.getMilliseconds()    //毫秒
    };
    if(/(y+)/.test(fmt))
      fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
    for(var k in o)
      if(new RegExp("("+ k +")").test(fmt))
        fmt = fmt.replace(RegExp.$1, (RegExp.$1.length===1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
    return fmt;
  }

  // 测试按钮1单击事件
  $('#test-btn').on('click', function () {
    // 从后台model中获取用户列表的json串
    var userList = '${jsonUserList}';
    // 将json串转换成JS数组
    var users = JSON.parse(userList);
    var tb = $('#test-tb');
    var cont = "";
    users.forEach(function (user) {
      // console.log(user);
      cont += "<tr>";
      cont += "<td>" + user['id'] + "</td>";
      cont += "<td>" + user['name'] + "</td>";
      cont += "<td>" + user['age'] + "</td>";
      cont += "<td>" + user['address'] + "</td>";
      cont += "<td>" + datefmt('yyyy-MM-dd', new Date(user['birthday'])) + "</td>";
    });
    tb.html(cont);
  });


  layui.use('table', function () {
    var table = layui.table;
    // 测试按钮2点击事件
    $('#test-tb2').on('click', function () {
      table.render({
         elem: '#userInfoTab'
        ,width: 700
        ,url: '/user/layui'
        ,method: "post"
        ,parseData: function (res) {
          return {
            "code": 0
            ,"msg" : ""
            ,"count":1000
            ,"data" : res
          }
        }
        ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        ,cols: [[
          {field:'id', title: 'ID', sort: true, align:'center'}
          ,{field:'name', title: '用户名', align:'center'} //width 支持：数字、百分比和不填写。你还可以通过 minWidth 参数局部定义当前单元格的最小宽度，layui 2.2.1 新增
          ,{field:'age', title: '年龄', sort: true, align:'center'}
          ,{field:'address', title: '地址', align:'center'}
          ,{field:'birthday', title: '出生年月日', sort: true, align:'center', templet : "<div>{{layui.util.toDateString(d.birthday, 'yyyy年MM月dd日')}}</div>"}
        ]]
      });
    });
  });

</script>
</html>
