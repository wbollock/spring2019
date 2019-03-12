function formSubmitted(event) {

    const myform = event.target;
    let error = false;

    /*
    firstname should be non empty and less than 20 characters long
    lastname should be non empty and less than 30 characters long
    */
    if (!myform.firstname.value || myform.firstname.value.length > 20) {
        document.querySelector("#firstname").classList.add("error");
        document.querySelector("#firstname_label").classList.add("error");
        error = true;
    }
    if (!myform.lastname.value || myform.lastname.value.length > 30) {
        document.querySelector("#lastname").classList.add("error");
        document.querySelector("#lastname_label").classList.add("error");
        error = true;
    }

    /*
    username should be non empty and between 6 - 12 characters long
    username cannot have @ character in it
    */

    if (!myform.username.value || myform.username.value.length > 12 ||
        myform.username.value.length < 6 || myform.username.value.includes("@")) {
        document.querySelector("#username").classList.add("error");
        document.querySelector("#username_label").classList.add("error");
        error = true;
    }

    /*
    Password should be at least 6 characters long
    Password should have at least 1 uppercase letter and 1 lowercase letter
    */
    if (!myform.password.value || myform.password.value.length < 6 ||
        myform.password.value === myform.password.value.toUpperCase()
        || myform.password.value === myform.password.value.toLowerCase()) {
        document.querySelector("#password").classList.add("error");
        document.querySelector("#password_label").classList.add("error");
        error = true;
    }

    /*
    If the user selected "married", add Married to the bio field text
     */
    if (myform.marital_group.value === "mm") {
        document.querySelector("#bio").classList.add("error");
        myform.bio.value += " Married!";
        error = true;
    }

    /*
    user should not have taken CGS-3066 before
    */
    for (let i = 0; i < myform.courses_group.length; i++) {
        if (myform.courses_group[i].checked && myform.courses_group[i].value === "3066") {
            document.querySelector("#course").classList.add("error");
            error = true;
        }
    }

    /*
    if the user selects to receive newsletter, alert them about possible spam!
    User cannot receive newsletter and ice cream at the same time!
     */
    if (myform.news_group.checked) {
        alert("We will spam you!");
        if (myform.icecream_group.checked) {
            myform.news_group.checked = false;
            alert("You can't have ice cream and get our newsletter!");
        }
    }

    if (error) {
        event.preventDefault(); //Stops the form from being submitted
        return false;
    }
    return true;
}


document.querySelector('#main_form').addEventListener('submit', formSubmitted);