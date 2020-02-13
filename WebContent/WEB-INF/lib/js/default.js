/**
 * 
 */

var checked="";
var checkedBtn="";

var team1 = ["2020.02.10 과제 - 고재현","2020.02.10 과제 - 강정민","2020.02.10 과제 - 국여주",
	"2020.02.10 과제 - 김강산","2020.02.10 과제 - 정올레그","2020.02.10 과제 - 박지혜"
	,"2020.02.09 과제 - 강정민","2020.02.08 과제 - 김강산"];

var team1Main = ["서론 :  JAVA와 C,C++ 의 입지는 점점 줄어들게 될 것이고","========수업내용 정리=========",
	"Listener ==> 100% interface means 메소드 블럭을 갖지 못해 그래서 생성자를 만들 수 없다",
"협업 소프트웨어, 혹은 그룹웨어(groupware)는 여러 사용자가 각기 별개의 작업 환경에서 통합된 하나의",
"Collection(List-ArrayList) - 배열은 방의 갯수가 정해져 있어 추가할 수 없음","ch5/1  Screenshot_1.jpg"
,"컴포넌트.add~~~Listener(~~~ 이벤트가 발생됐을 때 처리할 문장을 가지고 있는 클래스의 인스턴스=>A)","for(int[] a : array) {"];


var team2 = ["2020.02.10 과제 - 이예나","2020.02.10 과제 - 이중훈","2020.02.10 과제 - 이지윤",
	"2020.02.10 과제 - 김민종","2020.02.10 과제 - 홍정연","2020.02.10 과제 - 이지윤"
	,"2020.02.09 과제 - 이중훈","2020.02.08 과제 - 이예나"];

var team2Main = ["소스 형상관리(Software Configuration Management, SCM) SW개발 및 유지보수 과정에서", 
	"버전 관리 시스템은 상용과 비상용(오픈소스)로 구분 할 수 있다.","구글 드라이브- 팀원 간 또는 고객과 문서를 공유하거나 공동 작업을 ",
		"계산기 -기능은 구현하였으나, 연속적인 연산이 안됩니다","Array(배열) 데이터가 많아지면 그룹 관리의 필요성이 생긴다. 이럴 때",
		"이벤트 핸들러 : 컴포넌트에 감시자를 심어 주는것","배열(Array)의 특징 -같은 자료형을 가진 변수를 하나로 나타낸 것",
		"collection : 서로 다른 자료형을 모아놓은 집합체. 일정크기를 잡아놓고"];



var team3 = ["2020.02.10 과제 - 동송현","2020.02.10 과제 - 김하현","2020.02.10 과제 - 남윤대",
	"2020.02.10 과제 - 김종성","2020.02.10 과제 - 진보형","2020.02.10 과제 - 동송현"
	,"2020.02.09 과제 - 김하현","2020.02.08 과제 - 김종성"];

var team3Main = ["현재 프로젝트의 upload폴더에 저장, d드라이브 java_out폴더에 업로드",
	"객체지향 1. class-member변수(데이터를 기억할 공간)","function f(x,y){ return x+y;",
"문제가 주어지고 이것에 대해 프로그램을 작성해라라고 한다면 ","Application Programming Interace / 라이브러리",
"연습문제(5~8장) 첨부파일 page122_7.java ","문자열을 입력하기 위해 bufferedreader로 변경하였으나 1바이트만 가져오는 read()",
"컴포넌트 사용자가 사용하는 시스템에 대한 조작장치. 통상 Control"];

	
	

var team4 = ["2020.02.10 과제 - 김연수","2020.02.10 과제 - 김혜진","2020.02.10 과제 - 이찬영",
	"2020.02.10 과제 - 박주영","2020.02.10 과제 - 김혜진","2020.02.10 과제 - 임찬영"
	,"2020.02.09 과제 - 황수빈","2020.02.08 과제 - 김연수"];

	var team4Main = ["GET방식 vs POST방식 ▷URL에 변수(테이터)를 포함시켜 요청한다.","String path = /java_data/1234.txt",
		"import java.io.BufferedReader;","public static void main(String[] args) throws IOException {",
		"# 버전 관리 트렌드 각각의 도구는 각각의 뚜렷한 특징","package 배열; public class 원시자료형2차원","# 배열은 다수의 데이터를 그룹핑해서 효율적으로 관리할 수 있는 자료 구조이다."];






var team5 = ["2020.02.10 과제 - 이건호","2020.02.10 과제 - 김로만","2020.02.10 과제 - 정유진",
	"2020.02.10 과제 - 정상구","2020.02.10 과제 - 유현준","2020.02.10 과제 - 이건호"
	,"2020.02.09 과제 - 정상구","2020.02.08 과제 - 정유진"];
	
	var team5Main = ["개념이해가 부족하여,오늘 오후 수업중에 작성했던 코드를 카피해 다시","calculator 첨부파일 main.txt 첨부파일 pane.txt",
		"소프트웨어형(SaaS) 클라우드 서비스를 기반으로 자료 저장, 메신저, 업무 흐름",
		"int[][] Arr = new int[3][]; for (int i = 0; i < Arr.length; i++) {",
		"public class Arr {public static void main(String[] args) {","Difference between Array and ArrayList are following:"
		,"5.배열과 List의 차이 Arrary (배열)","Exception 과제 try { div = num1 / num2; "];

	
	
	
	


	
	
function getTeam(target){
	switch(target.id){
	case "team1":  team= team1; 
					teamMain = team1Main; 
					
				   break;
	case "team2":  team= team2;
					teamMain = team2Main;
				   break; 
	case "team3": this. team= team3;
	this. teamMain = team3Main;
				   break; 
	case "team4":  team= team4;
				   teamMain = team4Main;
				   break; 
	   
	case "team5":  team= team5;
				   teamMain = team5Main;
				   break; 
	}
}
	
function otherBoard(target){
	var team="";
	var teamMain="";
	 var ulId = document.getElementsByClassName("message-list")[0];
	switch(target.id){
	case "team1":   team= team1; 
					teamMain = team1Main; 
					ulId.setAttribute("id","append-ul-1");
				    break;
	case "team2":   team= team2;
					teamMain = team2Main;
					ulId.setAttribute("id","append-ul-2");
				    break; 
	case "team3":	team= team3;
					teamMain = team3Main;
					ulId.setAttribute("id","append-ul-3");
				    break; 
	case "team4":   team= team4;
				    teamMain = team4Main;
				    ulId.setAttribute("id","append-ul-4");
				    break; 
	   
	case "team5":   team= team5;
				    teamMain = team5Main;
				    ulId.setAttribute("id","append-ul-5");
				    break; 
	}
	for(var i=0; i< team.length-1; i++){
		document.getElementsByName("titles")[i].innerHTML=team[i];
		document.getElementsByName("mains")[i].innerHTML=teamMain[i];
		
	}	
}



function btnRemove(){
	var chkbox = document.getElementsByName("checkBOB");
	for(var i = 0 ; i < chkbox.length; i++){
		if(chkbox[i].checked){
			document.getElementsByName("board")[i].remove();
		}
	}
}


function signUpRemove(){
	document.getElementsByName("signup")[0].remove();
}


function btnClick(){
	
	var isNull = "";
	var newBoard = document.createElement( "LI" );  //li태그 추가
	var lih3=document.createElement( "h3" );		//h3태그추가
	var lip = document.createElement( "p" );		//p태그추가
	var liCheckBox = document.createElement( "input" );  //input태그 추가
	var titleText=document.getElementById("titleText");			//제목
	var mainText=document.getElementById("mainText");			//본문
	
	   
		newBoard.appendChild(liCheckBox);					//li에 태그 넣기
		newBoard.appendChild(lih3);
		newBoard.appendChild(lip);
		
		   if(! titleText.value == isNull)
			    var lih3text=document.createTextNode(titleText.value);			// 제목을 입력안하면 빨간글씨로
		   else
			   titleText.className="replaceText";
		   
		   
		   if(! mainText.value == isNull)
			   var liptext=document.createTextNode(mainText.value);				// 본문을 입력안하면 빨간글씨로
		   else
			   mainText.className="replaceText";
		
		
	   if( ! mainText.value == isNull|| ! titleText.value == isNull){
	   		
		   lih3.appendChild(lih3text);										//둘다 입력시 ul에 붙히기.  클래스,네임 정해주는거
		   lip.appendChild(liptext);
		   		
		   newBoard.className="unread";
		   newBoard.setAttribute("name","board");
		   liCheckBox.className="select-message";
		   liCheckBox.type="checkbox";
		   liCheckBox.setAttribute("name","checkBOB");
		   lih3.className="sender-name";
		   lih3.setAttribute("name","titles");
		   lip.setAttribute("name","mains");
		   
		   
		// 맨앞에 갖다붙히기(ul의 첫번째 li)
		   var append = document.getElementsByClassName("message-list");
		   var ulId = document.getElementsByClassName("message-list")[0];
		   
			switch(ulId.id){
			case "append-ul-1":   
							team= team1; 
							teamMain = team1Main; 
							ulId.setAttribute("id","append-ul-1");
						    break;
			case "append-ul-2":   
							team= team2;
							teamMain = team2Main;
							ulId.setAttribute("id","append-ul-2");
						    break; 
			case "append-ul-3":	team= team3;
							teamMain = team3Main;
							ulId.setAttribute("id","append-ul-3");
						    break; 
			case "append-ul-4":   
							team= team4;
						    teamMain = team4Main;
						    ulId.setAttribute("id","append-ul-4");
						    break; 
			case "append-ul-5":   team= team5;
						    teamMain = team5Main;
						    ulId.setAttribute("id","append-ul-5");
						    break; 
			}
		   
			   
		
			
		   ulId.insertBefore(newBoard, ulId.childNodes[0]);	
			   
		   team.unshift(titleText.value);
		   teamMain.unshift(mainText.value);
		   
		   titleText.value="";
		   mainText.value="";
		   
		   titleText.className="titleText";									//혹시나 빨간글씨 남아있을까봐 클래스 바꿔주기
		   mainText.className="mainText";
		   
	   }
	   
	   
//	   document.getElementsByName("board")[0].remove();

	   
}

