/* made by Will Bollock, for CGS 3066 */
// TODO: get rid of Console.logs()
// TODO: if it fails even JUST 1 VALIDATON RULE, cannot pass data to form and change output
function isNameValid() {
    // name must have first letter in uppercase
    // name must also be filled out
    //let nameVar = document.forms["main-form"]["name"].value;
    let nameVar = document.getElementById("main-form").name.value;
    let new_output = "";
    let userNameHTML = "<span style=\"color:black\">" + "Your name is:" + "</span>";
    if(nameVar == "") 
    {
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">Your string is empty.</p>";
        let rowArray = document.querySelectorAll(".row"); // first row, which is name
        rowArray[0].innerHTML += failDivEmpty; // manipulate the first row
        return false; // meaning validation failed, don't pass anything to result
    }
    else if(nameVar[0] == nameVar[0].toUpperCase() && nameVar !== "") // if first char uppercase and not empty
    {
        new_output += "<div id=\"output\">" + userNameHTML + nameVar + "</div>";
        document.getElementById("output").innerHTML = new_output;
        
    }
    else // if first letter of word is not capital
    {
        let failDiv = document.createElement("div");
        failDiv = "<p style=\"color:red\">The first letter of your name must be capitalized.</p>";
        let rowArray = document.querySelectorAll(".row"); // first row, which is name
        rowArray[0].innerHTML += failDiv; // manipulate the first row
        return false; // meaning validation failed, don't pass anything to result
    }
} // end of functon

function isUsernameValid() {
    // must be 5 characters long
    let usernameVar = document.getElementById("main-form").username.value;
    let new_output = ""; 
    // TODO: usernameHTML needs to be added below previous outputs
    let usernameHTML = "<span style=\"color:black\">" + "Your username is:" + "</span>";
    console.log("usernameVar is: " + usernameVar);
    if(usernameVar == "")  // cannot be empty
    { 
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">Your username is empty.</p>";
        let rowArray = document.querySelectorAll(".row"); // username row
        rowArray[1].innerHTML += failDivEmpty; // manipulate the row
        console.log("Username empty");
        //return false; // meaning validation failed, don't pass anything to result
    }
    else if(usernameVar.length > 4 && usernameVar !== "") 
    // if username is  5 characters long and not empty
    {
        new_output += "<div id=\"output\">" + usernameHTML + usernameVar + "</div>";
        document.getElementById("output").innerHTML += new_output; // += takes out output and adds new output
        console.log("Username good");
    }
    else // if username is not 5 characters
    {
        let failDiv = document.createElement("div");
        failDiv = "<p style=\"color:red\">Your username must be 5 characters long</p>";
        let rowArray = document.querySelectorAll(".row"); 
        console.log("Username not 5 chars");
        rowArray[1].innerHTML += failDiv; // manipulate the first row
        return false; // meaning validation failed, don't pass anything to result

    }
}



    

// 1. Result column needs to display information PASSED BY USER if data is VALID
// need to get rid of "form not submitted yet " id=output

// 2. Perform data validation on info passed by USER, inform user of what went wrong - on the very field that's wrong
// (use innerHTML to create a row underneath the form line)
// 2a. EC: tell USer what went wrong as SOON as they enter data (possibly call function when field is in focus?)


// 3. Fix bug in code allowing user to select Maloe and other gender at the same time



// maybe want functions for valid submission, e.g isValidName() == true? if true, pass values









document.querySelector("#submit-btn").addEventListener("click", isNameValid);
document.querySelector("#submit-btn").addEventListener("click", isUsernameValid);




document.querySelector("#submit-btn").addEventListener("click", function(e){
    if(isNameValid() === false || isUsernameValid() === false)
        console.log("Both functions passed false");
        
    e.preventDefault();
    
}); // prevent page from resetting after submit

