/* made by Will Bollock, for CGS 3066 */

// TODO: get rid of Console.logs()
//if it fails even JUST 1 VALIDATON RULE, cannot pass data to form and change output
/*
2a. EC: tell USer what went wrong as SOON as they enter data (possibly call function when field is in focus?)
3. Fix bug in code allowing user to select Maloe and other gender at the same time
*/

function isNameValid() {
    // name must have first letter in uppercase
    // name must also be filled out
    let nameVar = document.getElementById("main-form").name.value;
    let new_output = "";
    let userNameHTML = "<span style=\"color:black\">" + "Your name is:" + "</span>";
    if(nameVar == "") 
    {
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">Your string is empty.</p>";
        let rowArray = document.querySelectorAll(".row"); // first row, which is name
        rowArray[0].innerHTML += failDivEmpty; // manipulate the first row
        return 2; // meaning validation failed, don't pass anything to result
    }
    else if(nameVar[0] == nameVar[0].toUpperCase() && nameVar !== "") 
    // if first char uppercase and not empty (good)
    {
        new_output += "<div id=\"output\">" + userNameHTML + nameVar + "</div>";
        document.getElementById("output").innerHTML = new_output;
    }
    else // if first letter of word is not capital
    {
        let failDiv = document.createElement("div");
        failDiv = "<p style=\"color:red\">The first letter of your name must be capitalized.</p>"; // for uer
        let rowArray = document.querySelectorAll(".row"); 
        rowArray[0].innerHTML += failDiv; 
        return 2; // meaning validation failed, don't pass anything to result
    }
} // end of functon

function isUsernameValid() {
    // must be 5 characters long
    let usernameVar = document.getElementById("main-form").username.value;
    let new_output = ""; 
    let usernameHTML = "<span style=\"color:black\">" + "Your username is:" + "</span>";
    if(usernameVar == "")  // cannot be empty
    { 
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">Your username is empty.</p>";
        let rowArray = document.querySelectorAll(".row"); // username row
        rowArray[1].innerHTML += failDivEmpty; // manipulate the row
        //return false; // meaning validation failed, don't pass anything to result
        return 2;
    }
    else if(usernameVar.length > 4 && usernameVar !== "") 
    // if username is  5 characters long and not empty (good)
    {
        new_output += "<div id=\"output\">" + usernameHTML + usernameVar + "</div>";
        document.getElementById("output").innerHTML += new_output; // += takes out output and adds new output
        return 1; 
    }
    else // if username is not 5 characters
    {
        let failDiv = document.createElement("div");
        failDiv = "<p style=\"color:red\">Your username must be 5 characters long</p>";
        let rowArray = document.querySelectorAll(".row");
        rowArray[1].innerHTML += failDiv; // manipulate the first row
        return 2; // meaning validation failed, don't pass anything to result

    }
}
function isPasswordValid() {
    // must be 6 characters long
    let passwordVar = document.getElementById("main-form").password.value;
    let new_output = ""; 
    let passwordHTML = "<span style=\"color:black\">" + "Your password has:" + "</span>";
    if(passwordVar == "")  // cannot be empty
    { 
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">Your password is empty.</p>";
        let rowArray = document.querySelectorAll(".row"); // password row
        rowArray[2].innerHTML += failDivEmpty; // manipulate the row
        //return false; // meaning validation failed, don't pass anything to result
        return 2;
    }
    else if(passwordVar.length > 5 && passwordVar !== "") 
    // if password is 6 characters long and not empty (good)
    {
        // replace password contents with password length
        passwordLen = passwordVar.length;
        new_output += "<div id=\"output\">" + passwordHTML + passwordLen + " characters" + "</div>";
        document.getElementById("output").innerHTML += new_output; // += takes out output and adds new output
        return 1; 
    }
    else // if password is not 6 characters
    {
        let failDiv = document.createElement("div");
        failDiv = "<p style=\"color:red\">Your password must be 6 characters long</p>";
        let rowArray = document.querySelectorAll(".row");
        rowArray[2].innerHTML += failDiv; 
        return 2; 

    }
}

   

document.querySelector("#submit-btn").addEventListener("click", function(event){

    event.preventDefault();

    let nameValidValue = isNameValid();
    let userNameValue = isUsernameValid();
    let passwordValue = isPasswordValid();

    if(nameValidValue === 2 || userNameValue === 2 || passwordValue == 2)
    {
        // rewrite result to default
       document.getElementById("output").innerHTML = "<div id=\"output\"> Form not submitted yet </div>";
    }

        
    
    
}); // prevent page from resetting after submit

