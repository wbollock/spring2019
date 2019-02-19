// made by William Bollock, CGS 3066 A3
/*
 If you want to retrieve the value that each one of the <input> or <select> elements capture (i.e.,
the input entered by the user), first get a reference to the element using a querySelector, and
then use the attribute/field value. Remember that such value is always returned as a string.
TODO: DELETE ABOVE
*/

// Change Size function
document.getElementById('size_btn').onclick = function () { // may want to switch htis to an event listener
    // get inputs for width and height
    var heightVar = document.querySelector("#height").value;
    var heightInt = parseInt(heightVar);
    var widthVar = document.getElementById("width").value;
    var widthInt = parseInt(widthVar);
    // if user input height == X
    //then...

    document.getElementById("result").style.height = heightInt + "px";
    document.getElementById("result").style.width = widthInt + "px";

};


//Change Colors
// user selects colors, "Change Colors" button will adjust row(s) to select colored
document.getElementById('colors_btn').onclick = function () {
    // need to be able to get the colors in an array of sort?
    // maybe a loop could work here
    // id's go from color_sel0 ++
    //maybe a for loop (loop for 5, 1-4, etc)


}