/**
 * 
 */

var checked="";
var team2 = ["2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈",
			"2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영"
			,"2020.02.09 과제 - 황수빈","2020.02.08 과제 - 임찬영"];
	
var team2Main = ["aaaaaaaaaa","bbbbbbbbbbb","cccccccccccc",
		"ddddddddddddddd","eeeeeeeeeeeeeeee","fffffffffffffffff"
		,"gggggggggggggggg","hhhhhhhhhhhhhhhhhhhhh"];
	
var team3 = ["2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈",
	"2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영"
	,"2020.02.09 과제 - 황수빈","2020.02.08 과제 - 임찬영"];

var team3Main = ["aaaaaaaaaa","bbbbbbbbbbb","cccccccccccc",
"ddddddddddddddd","eeeeeeeeeeeeeeee","fffffffffffffffff"
,"gggggggggggggggg","hhhhhhhhhhhhhhhhhhhhh"];

var team4 = ["2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈",
	"2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영"
	,"2020.02.09 과제 - 황수빈","2020.02.08 과제 - 임찬영"];

var team4Main = ["aaaaaaaaaa","bbbbbbbbbbb","cccccccccccc",
"ddddddddddddddd","eeeeeeeeeeeeeeee","fffffffffffffffff"
,"gggggggggggggggg","hhhhhhhhhhhhhhhhhhhhh"];

var team5 = ["2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈",
"2020.02.10 과제 - 임찬영","2020.02.10 과제 - 황수빈","2020.02.10 과제 - 임찬영"
,"2020.02.09 과제 - 황수빈","2020.02.08 과제 - 임찬영"];

var team5Main = ["aaaaaaaaaa","bbbbbbbbbbb","cccccccccccc",
"ddddddddddddddd","eeeeeeeeeeeeeeee","fffffffffffffffff"
,"gggggggggggggggg","hhhhhhhhhhhhhhhhhhhhh"];



	
	function aa(target){
	console.log(target.name);
	}
	
function otherBoard(target){
	
	var targetId = target.id;
	var targetMain = target.id+"Main";
	
	console.log(team+"1".length);
	console.log(targetMain);

	for(var i=0; i< team+targetId.length-1; i++){
		console.log(i);
		document.getElementsByName("titles")[i].innerHTML=team+targetId[i];
		document.getElementsByName("mains")[i].innerHTML=team+targetMain[i];
	}
}

function rem(){
	var chkbox = document.getElementsByName("checkBOB");
	for(var i = 0 ; i<chkbox.length; i++){
		if(chkbox[i].checked){
			document.getElementsByName("board")[i].remove();
		}
	}
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
		   lih3.className="sender-name";
		   lih3.setAttribute("name","titles");
		   lip.setAttribute("name","mains");
		   
		   
		   
		   var appendUl=document.getElementById("append-ul");
		   
		   
		   appendUl.insertBefore(newBoard, appendUl.childNodes[0]);			// 맨앞에 갖다붙히기(ul의 첫번째 li)
		   

		   list.unshift(titleText.value);
		   main.unshift(mainText.value);
		   
		   titleText.value="";
		   mainText.value="";
		   
		   titleText.className="titleText";									//혹시나 빨간글씨 남아있을까봐 클래스 바꿔주기
		   mainText.className="mainText";
		   
	   }
	   
	   
//	   document.getElementsByName("board")[0].remove();

	   console.log("이거 실행됬는데 나오냐?");									//디버깅용 
	   
}
