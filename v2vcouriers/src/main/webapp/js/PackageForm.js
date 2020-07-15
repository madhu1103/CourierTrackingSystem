function ConsignmentIdValidation() {
     var ConsignmentId = document.getElementById("ConsignmentIdtxt").value;
     var ConsignmentIdreq = /^[0-9]+$/
     if (ConsignmentId != "") {
          if (!ConsignmentId.match(ConsignmentIdreq)) {

               document.getElementById("ConsignmentIdError").innerHTML = "Enter Correct Consignment Id"
          } else {
               document.getElementById("ConsignmentIdError").innerHTML = ""
          }
     } else {
          document.getElementById("ConsignmentIdError").innerHTML = "*"
     }

}


function AcceptDateValidation() {
     var AcceptDate = document.getElementById("AcceptDatetxt").value;
     var today = new Date();
     

     
     if (AcceptDate != "") {
          if ((AcceptDate>today)||(AcceptDate<today)) {
alert("hi");
              document.getElementById("AcceptDateError").innerHTML = "Enter Correct Date"
          } else {
              document.getElementById("AcceptDateError").innerHTML = ""
          }
          
     } else {
          document.getElementById("AcceptDateError").innerHTML = "*"
     }
}




function PackageWeightValidation() {
     var PackageWeight = document.getElementById("PackageWeighttxt").value;
     var PackageWeightreq = /^[0-9]+$/
     if (PackageWeight != "") {
          if (!PackageWeight.match(PackageWeightreq)) {

               document.getElementById("PackageWeightError").innerHTML = "Enter Correct Package Weight"
          } else {
               document.getElementById("PackageWeightError").innerHTML = ""
          }
     } else {
          document.getElementById("PackageWeightError").innerHTML = "*"
     }

}


function CostValidation() {
     var Cost = document.getElementById("Costtxt").value;
     var Costreq = /^[0-9]+$/
     if (Cost != "") {
          if (!Cost.match(Costreq)) {

              document.getElementById("CostError").innerHTML = "Enter Correct Cost"
          } else {
              document.getElementById("CostError").innerHTML = ""
          }
     } else {
          document.getElementById("CostError").innerHTML = "*"
     }

}


function ReceiverAddressValidation() {
     var ReceiverAddress = document.getElementById("ReceiverAddresstxt").value;

     if (ReceiverAddress != "") {

          document.getElementById("ReceiverAddressError").innerHTML = ""

     } else {
          document.getElementById("ReceiverAddressError").innerHTML = "*"
     }
     
}

function EmployeeIdValidation() {
     var EmployeeId = document.getElementById("EmployeeIdtxt").value;
     var EmployeeIdreq = /^[0-9]+$/
     if (EmployeeId != "") {
          if (!EmployeeId.match(EmployeeIdreq)) {

              document.getElementById("EmployeeIdError").innerHTML = "Enter Correct EmployeeId"
          } else {
              document.getElementById("EmployeeIdError").innerHTML = ""
          }
     } else {
          document.getElementById("EmployeeIdError").innerHTML = "*"
     }

}



function CustomerIdValidation() {
     var CustomerId = document.getElementById("CustomerIdtxt").value;
     var CustomerIdreq = /^[0-9]+$/
     if (CustomerId != "") {
          if (!CustomerId.match(CustomerIdreq)) {

              document.getElementById("CustomerIdError").innerHTML = "Enter Correct Customer Id"
          } else {
              document.getElementById("CustomerIdError").innerHTML = ""
          }
     } else {
          document.getElementById("CustomerIdError").innerHTML = "*"
     }

}


function CurrentLocationValidation() {
     var CurrentLocation = document.getElementById("CurrentLocationtxt").value;

     if (CurrentLocation != "") {

          document.getElementById("CurrentLocationError").innerHTML = ""

     } else {
          document.getElementById("CurrentLocationError").innerHTML = "*"
     }
     
}


function PackageStatusValidation() {
     var PackageStatus = document.getElementById("PackageStatustxt").value;

     if (PackageStatus == "select") {
     
          
          document.getElementById("PackageStatusError").innerHTML = "*"
          
     } else {
          document.getElementById("PackageStatusError").innerHTML = ""
     }

}


function SubmitValidation() {
	var status=false;
	var a = document.getElementById("ConsignmentIdtxt").value;
	var b = document.getElementById("PackageWeighttxt").value;
	var c = document.getElementById("Costtxt").value;
	var d = document.getElementById("ReceiverAddresstxt").value;
	var e = document.getElementById("EmployeeIdtxt").value;
	var f = document.getElementById("CustomerIdtxt").value;
	var g = document.getElementById("CurrentLocationtxt").value;
	var h = document.getElementById("PackageStatustxt").value;
	if ((a != "") && (b != "") && (c != "") && (d != "") && (e != "")
			&& (f != "") && (g != "") && (h != "")) {
		document.getElementById("SubmitError").innerHTML = ""
			status=true;
	} else {
		document.getElementById("SubmitError").innerHTML = "* Fields are Mandatory"
			status=false;
	}
	return status;

}


