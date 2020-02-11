/**
 * 
 */
function btnClick(){
	   var newBoard = document.createElement( "LI" );  //li태그 추가
	    
	   var lih3=document.createElement( "h3" );		//h3태그추가
	   
	   
	   var lip = document.createElement( "p" );		//p태그추가
	   
	   
	   var liCheckBox = document.createElement( "input" );  //input태그 추가
	   
	   
	   var titleText=document.getElementById("titleText");
	   var mainText=document.getElementById("mainText");
	   
   	   
  		newBoard.appendChild(liCheckBox);
  		newBoard.appendChild(lih3);
  		newBoard.appendChild(lip);
	   
	   var isNull = "";
	   
	   if(! titleText.value == isNull)
		    var lih3text=document.createTextNode(titleText.value);
	   else
		   titleText.className="replaceText";
	   
	   
	   if(! mainText.value == isNull)
		   var liptext=document.createTextNode(mainText.value);
	   else
		   mainText.className="replaceText";
	   
	   
	   		
	   if( ! mainText.value == isNull|| ! titleText.value == isNull){
	   		
	   		lih3.appendChild(lih3text);
		   lip.appendChild(liptext);
		   
		 
		   liCheckBox.class="select-message";
		   liCheckBox.type="checkbox";
		   lih3.className="sender-name";
		   
		   
		   
		   var appendUl=document.getElementById("append-ul");
		   
		   
		   appendUl.insertBefore(newBoard, appendUl.childNodes[0]);
		   
		   titleText.value="";
		   mainText.value="";
		   
		   titleText.className="titleText";
		   mainText.className="mainText";
		   
	   }
	 

	   
//	   var textnode = document.createTextNode("class='unread'");
	   //var messageList = document.getElementById("message-list");
	 
	  // document.getElementById("append-ul").appendChild(newBoard);
	   console.log("이거 실행됬는데 나오냐?");
	   
	  
	   
	   
	   
}


function myFunction() {

    var node = document.createElement("LI");        // LI 엘리먼트를 생성한다. 

    var textnode = document.createTextNode("Water");    //  Text 노드를 생성한다.

    node.appendChild(textnode);    // LI 엘리먼트의 자식으로 text 노드를 등록한다. 

    document.getElementById("myList").appendChild(node);

}




function alert(){
	
	alert('하악');
}
