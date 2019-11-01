
function getAllCHS() {

	let request = new XMLHttpRequest();
	request.open("GET", "http://"+location.hostname+":8081/CHS");
	request.onload = function (){
		renderToScreen(JSON.parse(request.response));
	}

	request.send();

}

function renderToScreen(jsData){
	let table = document.getElementById("curryhouses");
	table.innerHTML="";

	// add logic to order jsdata by position

	for (let curryHouse of jsData){
		let row = document.createElement("tr");
		row.className="row";

		//let idCell = document.createElement("td");
		//idCell.className="col-2";
		//let idCenter = document.createElement("center");
		//idCenter.innerText = curryHouse.id;
		//idCell.appendChild(idCenter);
		//row.append(idCell);

		let name = document.createElement("td");
		name.className="col-2";
		let nameCenter = document.createElement("center");
		nameCenter.innerText = curryHouse.name;
		name.appendChild(nameCenter);
		row.appendChild(name);

		let position = document.createElement("td");
		position.className="col-2";
		let positionCenter = document.createElement("center");
		positionCenter.innerText = curryHouse.position;
		position.appendChild(positionCenter);
		row.appendChild(position);

		let imageCell = document.createElement("td");
		imageCell.className="col-2";
		let imageCenter = document.createElement("center");
		let image = document.createElement("img");
		image.className="w-100";
		image.setAttribute("src", curryHouse.url);
		imageCenter.appendChild(image);
		imageCell.appendChild(imageCenter);	
		// img.height = 150;
		// img.width = 150;
		row.appendChild(imageCell);
		

		let postcode = document.createElement("td");
		postcode.className="col-2";
		let postcodeCenter = document.createElement("center");
		postcodeCenter.innerText = curryHouse.postCode;
		postcode.appendChild(postcodeCenter);
		row.appendChild(postcode);

		table.append(row);
	}
}

getAllCHS();

function addCHS(form) {
	let body = {};
	for (let input of form) {
		if(input.id) {
			body[input.id] = input.value;
			input.value = "";
		}
	}
	body =JSON.stringify(body);
	let request = new XMLHttpRequest();
	request.open("POST", "http://"+location.hostname+":8081/CHS/")
	request.setRequestHeader("Content-Type", "application/json");
	request.onload = function ()  {
		getAllCHS();
	}
	request.send(body);
	return false;
}

function deleteCHS() {

	let request = new XMLHttpRequest();
	// request.open("DELETE", "http://localhost:8081/CHS/" + ID);
		request.open("DELETE", "http:"+location.hostname+":8081/CHS/ID");
	request.onload = function (){
		renderToScreen(JSON.parse(request.response));
	}

	request.send();
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



