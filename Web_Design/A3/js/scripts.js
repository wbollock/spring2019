// made by William Bollock, CGS 3066 A3
// Change Size function
function size() {
    // get inputs for width and height
    let heightVar = document.querySelector("#height").value;
    let heightInt = parseInt(heightVar);

    let widthVar = document.querySelector("#width").value;
    let widthInt = parseInt(widthVar);
    // if user input height == X
    //then...

    document.getElementById("result").style.height = heightInt + "px";
    document.getElementById("result").style.width = widthInt + "px";

}


//Change Colors, user selects colors
//"Change Colors" button will adjust row(s) to select colored
function color() {
        const numColors = parseInt(document.querySelector("#num_colors").value);
        let new_div = new Array();

        // apply color to first, natural result row
        let colorHex = document.querySelector("#color_sel0").value;
        let colorArray = document.getElementsByClassName("result_row");
        colorArray[0].style.backgroundColor = colorHex;

        let counter = 0;

        for (let i = 1; i < Math.abs(numColors); i++)
        // sets colors to row (abs for negative)
        {

            let colorHex = document.querySelector("#color_sel" + i).value;
            // succesfully prints subsequent values

            new_div[i] = document.createElement("div"); // create div
            new_div[i].className = "result_row";
            // assign new div the right class
            document.getElementById("result").appendChild(new_div[i]);
            // put the div under "result"

            new_div[i].style.backgroundColor = colorHex; // set color of new div
            new_div[i].style.display = "block";

            counter++;
            // counter variable tells height loop how many times to run

            // loops to apply height

            if (numColors > 0) { // positive numbers
                for (let j = 0; j <= counter; j++) {
                    let resultArray = document.querySelectorAll(".result_row");
                    resultArray[j].style.height = (100 / (counter + 1)) + "%";
                    // set height depending on number of elements
                } // end of height loop
            }


            if (numColors < 0) { // negative numbers
                for (let j = 0; j <= counter; j++) {
                    let resultArray = document.querySelectorAll(".result_row");
                    resultArray[j].style.width = (100 / (counter + 1)) + "%";
                    resultArray[j].style.float = "left";
                    // float left to keep them in order, only vertical rows
                } // end of height loop
            }



        } // end of main for loop

    } // end of color function


function border() {
        //need to apply border to result div
        // get inputs
        let borderType = document.querySelector("#border_type").value;
        let borderColor = document.querySelector("#border_color").value;
        let brdrWidth = document.querySelector("#border_width").value;

        document.getElementById("result").style.border = borderType;
        document.getElementById("result").style.borderColor = borderColor;
        document.getElementById("result").style.borderWidth = brdrWidth + "px";

    } // end of border function

//extra credit -> making buttons
{ // image needs to display in  "result" and stay in the borders
// creating buttons
    let buttonDisplay = document.createElement("button");
    document.body.appendChild(buttonDisplay);
    // append button to bottom of document
    buttonDisplay.id = "display_btn";
    buttonDisplay.innerHTML = "Display Image";

    let buttonDisplayHide = document.createElement("button");
    document.body.appendChild(buttonDisplayHide);
    // append button to bottom of document
    buttonDisplayHide.id = "hide_btn";
    buttonDisplayHide.innerHTML = "Hide Image";
}

function displayImage() {
    // append div to result
    // easier to just rewrite html and shove row under result
    let imgDiv = '<div class="result_row"> <img src="js/example.png" id="userImage" style="height: 170px; width: 170px; margin: 10px;"</img> </div>'
    document.getElementById('result').innerHTML=imgDiv;     
}

function hideImage() { // hide previously created image
    document.getElementById("userImage").style.visibility = "hidden";
}



// calling functions
document.querySelector("#size_btn").addEventListener("click", size);

document.querySelector("#colors_btn").addEventListener("click", color);

document.querySelector("#border_btn").addEventListener("click", border);

document.querySelector("#display_btn").addEventListener("click", displayImage);

document.querySelector("#hide_btn").addEventListener("click", hideImage);;