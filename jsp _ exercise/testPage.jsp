<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>
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
	  
	  /*
	  /* 파라미터 : 2n+1 혹은 odd (홀수), 2n 혹은 even (짝수)
	  tbody tr:nth-child(2n+1) {  
	    background-color: lightgray;
	  }
	  */
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
				alert(response);  // 콜백 함수, response는 응답
			},
			error: function() {
				alert("오류가 발생하였습니다.");
			}
		});
	}
	
	
	/*
	
	/======== Controller ========/
	import java.util.List;
	
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.servlet.ModelAndView;
	
	@RequestMapping(value = "syh/testPage.do")  // 이 페이지 요청
	public ModelAndView testPage() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("testPage");
		return mav;
	}
	
	@RequestMapping(value = "syh/numList.do", produces = "application/json; charset=utf-8"
				, comsumes = "application/json")
	// 응답 데이터의 타입, 요청 데이터의 타입을 Ajax와 맞춰주어야 한다.
	@ResponseBody
	public List<Integer> numList(@RequestBody List<Integer> numList) {
		
		return numList;
	}
	
	*/
	
	
	// 2. 'checkbox' 라는 class명을 가진 input 태그(type='checkbox') 들 중에서 
	//     체크된 모든 값(value)을 아래 배열에 담는 스크립트를 작성하시오.
	function ex2() {
		var checkValueList = [];
		// input 타입이 checkbox인 모든 요소 찾기
		var checkBox = document.querySelectorAll('input[type="checkbox"]');
		
		checkBox.forEach(function(checkbox) {  // 체크된 경우에만 값을 리스트에 추가하기 (push)
	        if (checkbox.checked) {
	            checkValueList.push(checkbox.value);
	        }
	    });
		
		if (checkValueList.length === 0) {  // 배열의 길이 === 0 (체크X)
			alert("값을 선택하세요.");
		} else {
			alert("[" + checkValueList + "] 배열 입니다.");
		}
	}

	// 3. 5*5 형태의 표(table)를 만들고, 버튼을 만든다. 버튼을 클릭하면 5*5 형태의 표에서 
	//    홀수 줄은 홀수 번째 컬럼, 짝수 줄은 짝수 번째 컬럼에 해당하는 td를 파란색으로 색칠한다.
	function ex3(num) {	
		var table = document.getElementById("table");
		var rows = table.getElementsByTagName("tr");  // 행, 태그 이름(tr)으로 요소 찾기
		
		for (var i=0; i<rows.length; i++) {
	        var cell = rows[i].getElementsByTagName("td");  // 각 행에서 모든 셀(td) 찾기
		
	        for (var j=0; j<cell.length; j++) {
	        	if ((num == 0 && j % 2 == 0) ||   // num이 0이고 j가 짝수일때
	        		(num == 1 && j % 2 != 0)) {   // num이 1이고 j가 홀수일떄
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
	// *th값은 이름, 나이, 구사가능언어 이다.
	// 예) 이름   |  나이    | 구사가능언어
	// --------------------------
	// 	       |	   | 자바
	//   박상진   |  29   | 파이썬
	// 	       |	   | C++
	// --------------------------
	//   홍길동   |  20   | 한국어
	// 		   |	   | 영어
	// ---------------------------
	
	function ex4() {
		var dataList = [
			{이름:'박상진', 나이:29, 구사가능언어:['자바', '파이썬', 'C++']}, 
		    {이름:'홍길동', 나이:20, 구사가능언어:['한국어', '영어']},
			{이름:'서윤호', 나이:24, 구사가능언어:['한국어', '프랑스어', '영어', '페르시아어']}
		];
		var tbody = document.getElementById('tbody');
		
		dataList.forEach(function(list) {   // list 반복처리
		    var row = tbody.insertRow();	// 행 추가하기
		    // var col = tbody.insert
		    
		    var cell1 = row.insertCell(0);  // 추가된 행의 셀 추가하기
		    cell1.textContent = list.이름;

		    var cell2 = row.insertCell(1);
		    cell2.textContent = list.나이;
		    
		    list.구사가능언어.forEach(function(language) {
		    	// var lugRow = tbody.insertRow();
	            var lugCell = row.insertCell();
	            lugCell.textContent = language;
	            
	            // var lugRow = row.insertRow();
	        });
		    
		    
		    /*
		    list.구사가능언어.forEach(function(language) {
		    	var lug = row.insertCell(3);
		    	lug.textContent = language;
		    });
		    */
		    
		    /*
		    // var cell3 = row.insertCell(2);
		    list.구사가능언어.forEach(function(language) {
		    	var lug = row.insertCell();
		    	lug.textContent = language;
		    });
		    */
		});
	}
	
	/*
	// jquery 예제
	$(document).ready(function() {
		alert("안녕하세요!");	
	});
	*/
	
	</script>
	
<body>
	<h2>JSP 관련 과제 페이지</h2>
	<button type="button" class="btn btn-info" onclick="ex1()">(1)리스트 비동기통신</button>
	<br>
	<br>
	
	1번 : <input type='checkbox' class='checkbox' value='1'><br>
	2번 : <input type='checkbox' class='checkbox' value='2'><br>
	3번 : <input type='checkbox' class='checkbox' value='3'><br>
	4번 : <input type='checkbox' class='checkbox' value='4'><br>
	5번 : <input type='checkbox' class='checkbox' value='5'><br>
	6번 : <input type='checkbox' class='checkbox' value='6'><br>
	7번 : <input type='checkbox' class='checkbox' value='7'><br>
	8번 : <input type='checkbox' class='checkbox' value='8'><br>
	<br>
	<button type="button" class="btn btn-danger" onclick="ex2()">(2)배열로 전송!</button>
	<br>
	<br>
	
	<table id="table" width="500" height="250">
		<tr>
		    <td>1x1</td>
		    <td>1x2</td>
		    <td>1x3</td>
		    <td>1x4</td>
		    <td>1x5</td>
		</tr>
		<tr>
		    <td>2x1</td>
		    <td>2x2</td>
		    <td>2x3</td>
		    <td>2x4</td>
		    <td>2x5</td>
		</tr>
		<tr>
		    <td>3x1</td>
		    <td>3x2</td>
		    <td>3x3</td>
		    <td>3x4</td>
		    <td>3x5</td>
		</tr>
		<tr>
		    <td>4x1</td>
		    <td>4x2</td>
		    <td>4x3</td>
		    <td>4x4</td>
		    <td>4x5</td>
		</tr>
		<tr>
		    <td>5x1</td>
		    <td>5x2</td>
		    <td>5x3</td>
		    <td>5x4</td>
		    <td>5x5</td>
		</tr>
    </table>
    
	<br>
	<button type="button" class="btn btn-warning" onclick="ex3(0)">(3)홀수 컬럼 색칠</button>
	<button type="button" class="btn btn-primary" onclick="ex3(1)">(3)짝수 컬럼 색칠</button>
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