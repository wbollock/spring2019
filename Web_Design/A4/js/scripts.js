/* made by Will Bollock, for CGS 3066 */

// TODO: get rid of Console.logs()
//if it fails even JUST 1 VALIDATON RULE, cannot pass data to form and change output
/*
2a. EC: tell USer what went wrong as SOON as they enter data (possibly call function when field is in focus?)
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
        failDiv = "<p style=\"color:red\">Your username must be 5 characters long.</p>";
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
        failDiv = "<p style=\"color:red\">Your password must be 6 characters long.</p>";
        let rowArray = document.querySelectorAll(".row");
        rowArray[2].innerHTML += failDiv; 
        return 2; 

    }
}
function isAgeValid() {
    // must be more than 0
    let ageVar = document.getElementById("main-form").age.value;
    let new_output = ""; 
    let ageHTML = "<span style=\"color:black\">" + "Your age is:" + "</span>";
    let ageValue = parseInt(ageVar);
    if(ageVar == "")  // cannot be empty
    { 
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">Your age is empty.</p>";
        let rowArray = document.querySelectorAll(".row"); // age row
        rowArray[3].innerHTML += failDivEmpty; // manipulate the row
        return 2;
    }
    else if(ageValue > 0 && ageVar !== "") 
    // if age is 6 characters long and not empty (good)
    {
        new_output += "<div id=\"output\">" + ageHTML + ageVar + "</div>";
        document.getElementById("output").innerHTML += new_output; // += takes out output and adds new output
        return 1; 
    }
    else // if age is not > 0
    {
        let failDiv = document.createElement("div");
        failDiv = "<p style=\"color:red\">Your age must be more than 0.</p>";
        let rowArray = document.querySelectorAll(".row");
        rowArray[3].innerHTML += failDiv; 
        return 2; 

    }
}

function isBioValid() {
    // must contain "fsu" or "florida state" -> not case sensitive
    let bioVar = document.getElementById("main-form").bio.value;
    let new_output = ""; 
    let bioHTML = "<span style=\"color:black\">" + "Your bio is:" + "</span>";
    if(bioVar == "")  // cannot be empty
    { 
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">Your bio is empty.</p>";
        let rowArray = document.querySelectorAll(".row"); // bio row
        rowArray[4].innerHTML += failDivEmpty; 
        return 2;
    }
    else if( (parseInt(bioVar.search("fsu")) >= 0) || (parseInt(bioVar.search("florida state")) >= 0) && bioVar !== "") 
    // if bio contains fsu ORflorida state and not empty (good)
    {
        new_output += "<div id=\"output\">" + bioHTML + bioVar + "</div>";
        document.getElementById("output").innerHTML += new_output; // += takes out output and adds new output
        return 1; 
    }
    else // if bio doesn't have fsu/florida state
    {
        let failDiv = document.createElement("div");
        failDiv = "<p style=\"color:red\">Your bio must have fsu or florida state.</p>";
        let rowArray = document.querySelectorAll(".row");
        rowArray[4].innerHTML += failDiv; 
        return 2; 

    }
}
function passGender() {
    // pass through gender, no validation
    let genderVar = document.getElementById("main-form").gender.value;
    let new_output = ""; 
    // switch statement to convert value of gender
    switch(genderVar) {
        case "xx":
            genderVar = "Female";
        break;

        case "xy":
            genderVar = "Male";
        break;

        case "oth":
            genderVar = "Other";
        break;

        case "pns":
            genderVar = "Prefer not to say";
        break;

    }
    let genderHTML = "<span style=\"color:black\">" + "Your gender is:" + "</span>";
    new_output += "<div id=\"output\">" + genderHTML + genderVar + "</div>";
    document.getElementById("output").innerHTML += new_output; // += takes out output and adds new output

}

// checkbox
// if user does not check that they like dogs, then user can only select
// that they do not like dogs option
// give error message if they try to select that
function isDogValid() {
    // values are "on" or "off"
    let dogCertVar = document.getElementById("main-form").udogs.checked;
   

    let dogTypeVar = document.getElementById("main-form").topdog.value;
    let new_output = "";
    // if they don't certify they like dogs, user can only select "they dont like dogs"
    if (dogCertVar === false && parseInt(dogTypeVar) > 0) // 0 is any type of dog
    // false validation
    {
        let failDivEmpty = document.createElement("div");
        failDivEmpty = "<p style=\"color:red\">You cannot select that you do not like dogs and have a favorite breed.</p>";
        let rowArray = document.querySelectorAll(".row"); // bio row
        rowArray[7].innerHTML += failDivEmpty; 
        return 2;
    }
    else
    // if validation is good, write both to the result div
    {
        if(dogCertVar === false)
        {
            let dogCertHTML = "<span style=\"color:black\">" + "Certification: " + "</span>";
            new_output += "<div id=\"output\">" + dogCertHTML + "You do not certify that you like dogs." + "</div>";
            document.getElementById("output").innerHTML += new_output;

            new_output = "";
            let dogTypeHTML = "<span style=\"color:black\">" + "Your favorite breed of dog is: " + "</span>";
            // if they did not select that they like dogs, then they shouldnt have a favorite dog breed
            new_output += "<div id=\"output\">" + dogTypeHTML + "I did not say that I like dogs." + "</div>";
            document.getElementById("output").innerHTML += new_output;
        }
        else
            {
            let dogCertHTML = "<span style=\"color:black\">" + "Certification: " + "</span>";
            new_output += "<div id=\"output\">" + dogCertHTML + "You certify that you like dogs." + "</div>";
            document.getElementById("output").innerHTML += new_output;
           
                switch(dogTypeVar) { // convert dog type value
                    case "0":
                        dogTypeVar = "I did not say I like dogs";
                    break;
            
                    case "1":
                        dogTypeVar = "Labrador";
                    break;
            
                    case "2":
                        dogTypeVar = "Golden Retreiver";
                    break;
            
                    case "3":
                        dogTypeVar = "Corgi";
                    break;

                    case "4":
                        dogTypeVar = "Chihuahua";
                    break;

                    case "5":
                        dogTypeVar = "Other";
                    break;
                } // end of switch
                // write dog type to result
                console.log("reaching dogType HTML");
            new_output = "";
            let dogTypeHTML = "<span style=\"color:black\">" + "Your favorite breed of dog is: " + "</span>";
            new_output += "<div id=\"output\">" + dogTypeHTML + dogTypeVar + "</div>";
            document.getElementById("output").innerHTML += new_output;
            }

        // += takes out output and adds new output
        return 1; 
    }
}
   

document.querySelector("#submit-btn").addEventListener("click", function(event){

    event.preventDefault();
    // call functions and assign values of return statements
    let nameValidValue = isNameValid();
    let userNameValue = isUsernameValid();
    let passwordValue = isPasswordValid();
    let ageFuncValue = isAgeValid();
    let bioValue = isBioValid();
    passGender();
    let dogValue = isDogValid();

    if(nameValidValue === 2 || userNameValue === 2 || passwordValue === 2 || ageFuncValue === 2 || bioValue === 2 || dogValue === 2)
    // if one of the values doesn't pass
    {
        // rewrite result to default
       document.getElementById("output").innerHTML = "<div id=\"output\"> Form not submitted yet </div>";
    }
    
        
    
    
}); // prevent page from resetting after submit

