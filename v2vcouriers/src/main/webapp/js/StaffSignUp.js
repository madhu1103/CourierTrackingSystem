function FirstNameValidation() {
     var FirstName = document.getElementById("FirstNametxt").value;
     var FirstNamereq = /^[A-Za-z]+$/
     if (FirstName != "") {
          if (!FirstName.match(FirstNamereq)) {

              document.getElementById("FirstNameError").innerHTML = "Only Alphabets"
          } else {
              document.getElementById("FirstNameError").innerHTML = ""
          }
     } else {
          document.getElementById("FirstNameError").innerHTML = "*"
     }

}
function LastNameValidation() {
     var LastName = document.getElementById("LastNametxt").value;
     var LastNamereq = /^[A-Za-z]+$/
     if (LastName != "") {
          if (!LastName.match(LastNamereq)) {

              document.getElementById("LastNameError").innerHTML = "Only Alphabets"
          } else {
              document.getElementById("LastNameError").innerHTML = ""
          }
     } else {
          document.getElementById("LastNameError").innerHTML = "*"
     }

}

function GenderValidation() {
     var Gender = document.getElementById("Gender").value;

     if (Gender == "select") {
          
          document.getElementById("GenderError").innerHTML = "*"
          
     } else {
          document.getElementById("GenderError").innerHTML = ""
     }

}

function EmailValidation() {
     var Emailname = document.getElementById("Emailtxt").value;

     if (Emailname != "") {

          document.getElementById("EmailError").innerHTML = ""

     } else {
          document.getElementById("EmailError").innerHTML = "*"
     }

}

function ContactNumberValidation() {
     var ContactNumber = document.getElementById("ContactNumbertxt").value;
     var ContactNumberreq = /^[0-9]+$/

     if (ContactNumber != "") {
          if (!ContactNumber.match(ContactNumberreq)) {

               document.getElementById("ContactNumberError").innerHTML = "Only Numbers"
          } else {
               document.getElementById("ContactNumberError").innerHTML = ""
          }
     } else {
          document.getElementById("ContactNumberError").innerHTML = "*"
     }

}

function UserIdValidation() {
     var UserId = document.getElementById("UserIdtxt").value;
     var UserIdreq = /^[A-Za-z0-9]+$/
     if (UserId != "") {
          if (!UserId.match(UserIdreq)) {

              document.getElementById("UserIdError").innerHTML = "Special Characters Not Allowed"
          } else {
              document.getElementById("UserIdError").innerHTML = ""
          }
     } else {
          document.getElementById("UserIdError").innerHTML = "*"
     }

}

function PasswordValidation() {
     var PasswordName = document.getElementById("Passwordtxt").value;

     if (PasswordName != "") {
          document.getElementById("PasswordError").innerHTML = ""

     } else {
          document.getElementById("PasswordError").innerHTML = "*"
     }

}

function ConfirmPasswordValidation() {

     var confirmPasswordName=document.getElementById("Confirmpasswordtxt").value;
     var PasswordName = document.getElementById("Passwordtxt").value;
     if (confirmPasswordName != "") {
          
              if(confirmPasswordName !=PasswordName)
                   {
                   document.getElementById("ConfirmPasswordError").innerHTML = "Both Password and confirm Password Should be same"
                   }
              else
                   {
                   document.getElementById("ConfirmPasswordError").innerHTML = ""
                   }
          
     } else {
          document.getElementById("ConfirmPasswordError").innerHTML = "*"
     }

}

function SalaryValidation() {
     var salary = document.getElementById("Salarytxt").value;

     if (salary != "") {

          document.getElementById("SalaryError").innerHTML = ""

     } else {
          document.getElementById("SalaryError").innerHTML = "*"
     }
     
     

}
function DesignationValidation() {
          var designation = document.getElementById("Designationtxt").value;

          if (designation != "") {

              document.getElementById("DesignationError").innerHTML = ""

          } else {
              document.getElementById("DesignationError").innerHTML = "*"
          }
          
}


function PermanentAddressValidation() {
     var pAddress = document.getElementById("PermanentAddresstxt").value;

     if (pAddress != "") {

          document.getElementById("PermanentAddressError").innerHTML = ""

     } else {
          document.getElementById("PermanentAddressError").innerHTML = "*"
     }
     
}

function CorrespondanceAddressValidation() {
    var cAddress = document.getElementById("CorrespondanceAddresstxt").value;

    if (cAddress != "") {

         document.getElementById("CorrespondanceAddressError").innerHTML = ""

    } else {
         document.getElementById("CorrespondanceAddressError").innerHTML = "*"
    }
    
}



function LoginTypeValidation() {
    var type = document.getElementById("LoginTypetxt").value;

    if (type == "select") {

         document.getElementById("LoginTypeError").innerHTML = "*"

    } else {
         document.getElementById("LoginTypeError").innerHTML = ""
    }
    
}

function SubmitValidation() {
	var status=false;
	var a = document.getElementById("FirstNametxt").value;
	var b = document.getElementById("LastNametxt").value;
	var c = document.getElementById("Gender").value;
	var d = document.getElementById("Emailtxt").value;
	var e = document.getElementById("ContactNumbertxt").value;
	var f = document.getElementById("UserIdtxt").value;
	var g = document.getElementById("Passwordtxt").value;
	var h = document.getElementById("Confirmpasswordtxt").value;
	var i = document.getElementById("Salarytxt").value;
	var j = document.getElementById("Designationtxt").value;
	var k = document.getElementById("PermanentAddresstxt").value;
	var l = document.getElementById("CorrespondanceAddresstxt").value;
	var m = document.getElementById("LoginTypetxt").value;
	if ((a != "") && (b != "") && (c != "") && (d != "") && (e != "")
			&& (f != "") && (g != "") && (h != "") && (i != "") && (j != "") && (k != "") && (l != "") && (m != "")) {
		document.getElementById("SubmitError").innerHTML = ""
			status=true;
	} else {
		document.getElementById("SubmitError").innerHTML = "All Fields are Mandatory"
			status=false;
	}
	return status;

}