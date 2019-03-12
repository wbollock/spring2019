// This is the handler in the backed that will process 
// both types of request (GET, POST)
const resource = 'http://localhost:8081/process';

//Event handler for the form that uses GET request
function get_request(event) {

    //Prevents the browser from doing the normal submission
    event.preventDefault();

    // The form was the one that triggered the even after the user 
    // clicked the submit button (see the evenHandler)
    // at the end of this page. Therefore, event.target returns 
    // the element that triggered the event
    const form = event.target;

    // We use the reference to the form to obtain 
    //the values entered by the user
    const firstname = form.firstname_get.value;
    const lastname = form.lastname_get.value;

    // Here we create the request
    let url = new URL(resource);

    // Data to be included as the query, as a dictionary
    let params = {
        firstname_get: firstname, 
        lastname_get: lastname
    }; 

    // We attach the query (params) to the resource
    url.search = new URLSearchParams(params); 

    // We make the request.
    fetch(url, {method: 'GET'})
    .then(
        function (response) {
            return response.json();
        }
    )
    .then(
        // json is a string. JSON.parse(json) returns an object 
        // that lets us to easily access all the data in such string.
        function (json) {
            const obj = JSON.parse(json); 

            //This paints new HTML in the web page
            const output = document.querySelector("#result-get");
            output.innerHTML = 
                '<h3>Output</h3>' +
                'Firstname ' + obj.first_name + 
                ' - Lastname:' + obj.last_name + 
                ' - Message:' + obj.message;
        }
    )
    .catch(
        function (err) {
            alert(err); //In case something wrong happens
        }
    )
}

//Event handler for the form that uses POST request
function post_request(event) {

    //Prevents the browser from doing the normal submission
    event.preventDefault();
 
    // The form was the one that triggered the even after the
    // user clicked the submit button (see the evenHandler)
    // at the end of this page. Therefore, event.target returns 
    // the element that triggered the event
    const form = event.target;

    //We use the reference to the form to obtain 
    //the values entered by the user
    const firstname = form.firstname_post.value;
    const lastname = form.lastname_post.value;

    //URL for the request to be sent
    let url = new URL(resource);

    // Data to be included in the request
    let params = {
        firstname_post: firstname, 
        lastname_post: lastname
    };

    // Here we create the request
    fetch(url, 
        {
            method: 'POST',
            headers: {
                "Content-Type": 
                "application/json; charset=utf-8",
            },
            body: JSON.stringify(params)
        }
    )
    .then(
        function (response) {
            return response.json();
        }
    )
    .then(
        function (json) {
            // json is a string. JSON.parse(json) returns an object that
            // lets us to easily access all the data in such string.
            const obj = JSON.parse(json); 

            //This paints new HTML in the web page
            const output = document.querySelector("#result-post");
            output.innerHTML = 
                '<h3>Output</h3>' +
                'Firstname ' + obj.first_name + 
                ' - Lastname:' + obj.last_name + 
                ' - Message:' + obj.message;
        }
    )
    .catch(
        function (err) {
            alert(err);
        }
    )

}

//Here que add the event listeners to both forms
const get1 = document.querySelector('#get_form')
get1.addEventListener('submit', get_request);

const post1 = document.querySelector('#post_form')
post1.addEventListener('submit', post_request);















