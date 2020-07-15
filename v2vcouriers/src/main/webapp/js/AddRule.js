function AddValidation() {
	var status=false;
	var a = document.getElementById("NewRuletxt").value;
	
	if (a != "") {
		document.getElementById("AddError").innerHTML = ""
			status=true;
	} else {
		document.getElementById("AddError").innerHTML = "It cannot be empty"
			status=false;
	}
	return status;

}