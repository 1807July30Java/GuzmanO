function sendAjaxGet(url, func) {
	var xhr = new XMLHttpRequest()
			|| new ActiveXObject("Microsoft.HTTPRequest");
	xhr.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			func(this);
		}
	};
	xhr.open("GET", url, true);
	xhr.send();
};

function getUserInfo(xhr) {
	if (xhr.responseText) {
		var res = JSON.parse(xhr.responseText);
		console.log(res);
		
	} else {
		window.location = "http://localhost:8004/Project1/login";
	}
};

function getReimbursements(xhr) {
	if (xhr.responseText) {
		var res = JSON.parse(xhr.responseText);
		console.log(res);
		
		for(var i = 0; i < res.length; i++) {
			var table = document.getElementById("rBody");
			var row = table.insertRow(0);
			var date = row.insertCell(0);
			var amount = row.insertCell(1);
			date.innerHTML = res[i].date;
			amount.innerHTML = res[i].amount;
		}
		
		
	} else {
		window.location = "http://localhost:8004/Project1/login";
	}
}

window.onload = function() {
	sendAjaxGet("http://localhost:8004/Project1/session?entity=user", getUserInfo);
	sendAjaxGet("http://localhost:8004/Project1/session?entity=reimbursements", getReimbursements);
}