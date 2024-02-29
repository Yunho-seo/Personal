<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>

	<style>
	  table, th, td {  /* 테이블 구분선 */
	    border: 2px solid;
	    font-size : 17px;
	    text-align: center;
	  }
	  
	</style>
	
	<script>
	// 1. numList 타입을 임의의 url의 post 방식으로 비동기 통신하시오.
	function ex1() {
		var numList = [1, 2, 3, 4, 5];
		$.ajax ({
			url : "<c:url value='numList.do'/>",
			type: 'POST',
			data: JSON.stringify(numList),    // 데이터 JSON 형식으로 변환 (배열 -> json)
			contentType: 'application/json',  // 전송하는 데이터 Type
			success: function(response) {
				alert("[" + response + "]");  // 콜백 함수, response는 응답
			},
			error: function() {
				alert("오류가 발생하였습니다.");
			}
		});
	}
	
	// 2. 'checkbox' 라는 class명을 가진 input 태그(type='checkbox') 들 중에서 
	//     체크된 모든 값(value)을 아래 배열에 담는 스크립트를 작성하시오.
	function ex2() {
		var checkValueList = [];
		var checkBox = document.querySelectorAll('input[type="checkbox"]');
		
		checkBox.forEach(function(checkbox) {  // 체크된 경우에만 값을 리스트에 추가하기 (push)-
			if (checkbox.checked) {
	            checkValueList.push(checkbox.value);
	        }
	    });
		
		if (checkValueList.length === 0) {  // 배열의 길이 === 0 (체크X)
	        alert("값을 선택하세요.");
	        return;
		}
		
		$.ajax ({  // 비동기 통신 -> checkValueList의 값 전달 후 JSON 형식으로 반환받기
			url : "<c:url value='checkValueList.do'/>",
			type: 'POST',
			data: JSON.stringify(checkValueList),
			contentType: 'application/json',
			success: function(response) {
				alert("[" + response + "]");
			},
			error: function() {
				alert("오류가 발생하였습니다.");
			}
		});
	}

	// 3. 5*5 형태의 표(table)를 만들고, 버튼을 만든다. 버튼을 클릭하면 5*5 형태의 표에서 
	//    홀수 줄은 홀수 번째 컬럼, 짝수 줄은 짝수 번째 컬럼에 해당하는 td를 파란색으로 색칠한다.
	function ex3() {	
		var table = document.getElementById("table");
		var rows = table.getElementsByTagName("tr");  // 행, 태그 이름(tr)으로 요소 찾기
		
		for (var i=0; i<rows.length; i++) {
	        var cell = rows[i].getElementsByTagName("td");  // 각 행에서 모든 셀(td) 찾기
		
	        for (var j=0; j<cell.length; j++) {
	        	if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
	        		cell[j].style.backgroundColor = "blue";
	        	} else {
	        		cell[j].style.backgroundColor = "";
	        	}
	        }
		}
	}
	
	// 4. 아래의 배열은 데이터 베이스에서 조회한 결과값이다. 해당 결과값으로 동적인 테이블을 생성하시오.
	// var dataList = [
	//	  {이름=박상진, 나이=29, 구사가능언어=[자바, 파이썬, C++]}, 
	//    {이름=홍길동, 나이=20, 구사가능언어=[한국어, 영어]}
	// ]
	function ex4() {
		var dataList = [
			{이름:'박상진', 나이:29, 구사가능언어:['자바', '파이썬', 'C++']}, 
		    {이름:'홍길동', 나이:20, 구사가능언어:['한국어', '영어']},
			{이름:'서윤호', 나이:24, 구사가능언어:['한국어', '프랑스어', '러시아어']},
		    {이름:'김철수', 나이:25, 구사가능언어:['독일어']}
		];
		var tbody = document.getElementById('tbody');
		
		dataList.forEach(function(data) {   // list 반복처리
		    var row = tbody.insertRow();	// 행 추가하기
		    
		    var cell1 = row.insertCell(0);  // 추가된 행의 셀 추가하기
		    cell1.textContent = data.이름;

		    var cell2 = row.insertCell(1);
		    cell2.textContent = data.나이;
		    
		    var cell3 = row.insertCell(2);
		    
		    if(data.구사가능언어.length > 1) {  // 구사가능언어 2개이상이면..
		    	cell1.setAttribute('rowspan', data.구사가능언어.length);  // 이름 열
		    	cell2.setAttribute('rowspan', data.구사가능언어.length);  // 나이 열 병합
		    	
		    	cell3.textContent = data.구사가능언어[0];  		// 첫번째 요소 넣기
		    	
		    	for (var i=1; i<data.구사가능언어.length; i++){    // 두번째 요소 있다면 반복문
		    		var nRow = tbody.insertRow();
		    		var nCell = nRow.insertCell();
		    		nCell.textContent = data.구사가능언어[i];
		    	}
		    } else {
		    	cell3.textContent = data.구사가능언어[0];  // 구사가능언어 1개일때
		    }
		});  
	}
	</script>
<body>
	<h2>JSP JSTL 적용 과제 페이지</h2>
	<button type="button" class="btn btn-info" onclick="ex1()">(1)리스트 비동기통신</button>
	<br>
	<br>
	
	<c:forEach var="i" begin="1" end="8">
    	${i}번 : <input type="checkbox" class="checkbox" value='${i}'><br>
	</c:forEach>
	
	<br>
	<button type="button" class="btn btn-danger" onclick="ex2()">(2)배열로 전송!</button>
	<br>
	<br>
	
	<table id="table" width="500" height="250">
	<c:forEach begin="1" end="5" varStatus="loop">  <!-- column -->
	<tr>
		<c:forEach begin="1" end="5" varStatus="loop2">  <!-- row -->
		<td>${loop.count}x${loop2.count}</td>
		</c:forEach>
	</tr>
	</c:forEach>
	</table>
    
	<br>
	<button type="button" class="btn btn-primary" onclick="ex3()">(3)컬럼 색칠</button>
	<br>
	<br>
	
	<table width="500" height="250">
		<thead>
			<tr>
				<th>이름</th>
				<th>나이</th>
				<th>구사가능언어</th>
			</tr>
		</thead>
		<tbody id="tbody">
		</tbody>
	</table>
	<button type="button" class="btn btn-success" onclick="ex4()">(4)동적 테이블</button>
</body>
</html>