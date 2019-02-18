// made by William Bollock, CGS 3066 A3

// Change Size function
document.getElementById('size_btn').onclick = function () {
    // get inputs for width and height
    var heightVar = document.getElementById("height").value;
    var widthVar = document.getElementById("width").value;

    // if user input height == X
    //then...

    document.getElementById("result").style.height = heightVar + "px";
    document.getElementById("result").style.width = widthVar + "px";

};


//Change Colors
// user selects colors, "Change Colors" button will adjust row(s) to select colored
document.getElementById('colors_btn').onclick = function () {
    // need to be able to get the colors in an array of sort?
    // maybe a loop could work here
    // id's go from color_sel0 ++

}