
function getAllCHS() {

	let request = new XMLHttpRequest();
	request.open("GET", "http://localhost:8080/CHS");
	//request.open("GET", "http:" +location.host+:"8080"+"/CHS");
	request.onload = function (){
		renderToScreen(JSON.parse(request.response));
	}

	request.send();
	// $.ajax({
	// 	type : "GET",
	// 	url : "http://localhost:8080/CHS",
	// 	success : function(data) {
	// 		var list = $('<ul class="list-group"></ul>');
	// 		$('p').append(list);
	// 		$.each(data, function(index, CHS) {
	// 			list.append('<li class="list-group-item">' + "ID: " + CHS.ID + "Position:" + CHS.Position + "Name:" + CHS.Name + "PostCode:" + CHS.PostCode + "URL:" + CHS.URL +'</li>')
	// 		});
	// 	}
	// });
}

function renderToScreen(jsData){
	console.log(jsData)
}

getAllCHS();

function addCHS() {
	var ID = document.getElementById('ID').value;
	var Position = document.getElementById('Position').value;
	var Name = document.getElementById('Name').value;
	var PostCode= document.getElementById('PostCode').value;
	var URL= document.getElementById('URL').value;
	
	var CHS = new Object();

	CHS.ID = ID;
	CHS.Position= Position;
	CHS.Name= Name;
	CHS.PostCode= PostCode;
	CHS.URL= URL;

	var CHSJSON = JSON.stringify(CHS);

	// $.ajax({
	// 	type : "POST",
	// 	url : "http://localhost:8080/CHS",
	// 	contentType : "application/json",
	// 	data : CHSJSON,
	// 		success : function(data) {
	// 		console.log(data);
	// 	},
	// 	error : function(data) {
	// 		console.log(data);
	// 	},
	// 	dataType : 'json'
	// });
}

function deleteCHS() {

	let request = new XMLHttpRequest();
	request.open("DELETE", "http://localhost:8080/CHS/" + ID);
		//request.open("DELETE", "http:" +location.host+:"8080"+"/CHS"+"ID");
	request.onload = function (){
		renderToScreen(JSON.parse(request.response));
	}

	request.send();
}

function renderToScreen(jsData){
	console.log(jsData)
}

// function updateCHS() {

// 	let request = new XMLHttpRequest();
// 	request.open("POST", "http://localhost:8080/CHS/" + ID + Position+ Name +PostCode +URL);
	
// 	request.onload = function (){
// 		renderToScreen(JSON.parse(request.response));
// 	}

// 	request.send();
// }

// function renderToScreen(jsData){
// 	console.log(jsData)
// }

// function deleteCHS() {
// 	var ID = document.getElementById('ID').value;
	
// 	var CHS = new Object();
	
// 	CHS.ID = ID;
	
// 	var CHSJSON = JSON.stringify(CHS);

	
	// $.ajax({
	// 	type : "DELETE",
	// 	url : "http://localhost:8080/CHS/" + ID,
	// 	contentType : "application/json",
	// 	data : CHSJSON,
	// 		success : function(data) {
	// 		console.log(data);
	// 	},
	// 	error : function(data) {
	// 		console.log(data);
	// 	},
	// 	dataType : 'json'
	// });
}



