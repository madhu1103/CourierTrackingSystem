function UpdateValidation() {
	var status=false;
	var a = document.getElementById("RuleNumbertxt").value;
	var b = document.getElementById("Ruletxt").value;
	if ((a != "") && (b != "")) {
		document.getElementById("UpdateError").innerHTML = ""
			status=true;
	} else {
		document.getElementById("UpdateError").innerHTML = "Please fill both the fields..."
			status=false;
	}
	return status;

}