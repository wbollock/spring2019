// made by William Bollock, CGS 3066 A3
/*
 If you want to retrieve the value that each one of the <input> or <select> elements capture (i.e.,
the input entered by the user), first get a reference to the element using a querySelector, and
then use the attribute/field value. Remember that such value is always returned as a string.
TODO: DELETE ABOVE
TODO: CHANGE VARS TO LETS/CONSTS
TODO: USE EVENT LISTENERS(?) -> see line 116 of JavaScript5.org
*/

// Change Size function
function size () {
    // get inputs for width and height
    let heightVar = document.querySelector("#height").value;
    let heightInt = parseInt(heightVar);

    let widthVar = document.querySelector("#width").value;
    let widthInt = parseInt(widthVar);
    // if user input height == X
    //then...

    document.getElementById("result").style.height = heightInt + "px";
    document.getElementById("result").style.width = widthInt + "px";

};


//Change Colors, user selects colors, "Change Colors" button will adjust row(s) to select colored
function color () {
    // need to be able to get the colors in an array of sort?
    // maybe a loop could work here
    // id's go from color_sel0 ++
    //maybe a for loop (loop for 5, 1-4, etc)
    // color_sel0 = first color
    // color_sel1 = second color
    // TODO: account for negative numbers

   

    const numColors = parseInt(document.querySelector("#num_colors").value);
    let new_div= new Array();

    let colorHex = document.querySelector("#color_sel0").value;
    let colorArray = document.getElementsByClassName("result_row");
    colorArray[0].style.backgroundColor = colorHex;

    for(let i=1; i<Math.abs(numColors); i++) // sets colors to row
    {
        //may need to subtract 1 from numcolors
        console.log(numColors + "=numColors");
        let colorHex = document.querySelector("#color_sel" + i).value; // succesfully prints subsequent values
        console.log(colorHex); //TODO: DELETE. FOR DEBUG
        //let colorArray = document.getElementsByClassName("result_row");
       
        // TODO:
        /* APPLY COLOR TO FIRST RESULT ROW
            APPLY HEIGHT TO CREATED RESULT ROW(S)
        */
        if(numColors > 0)
        {
            new_div[i] = document.createElement('div'); // create div
            new_div[i].className = "result_row";
            //document.getElementsByClassName("result_row")[i].appendChild(new_div[i]); // put the div in the body
            document.getElementById("result").appendChild(new_div[i]); // put the div in the body
            
            new_div[i].style.backgroundColor = colorHex;
            new_div[i].style.display = "inline-block";
            console.log(i);

            
            var counter=0;
            counter++;
        }

        // depending on number of colors, make more rows
       //new_div += '<div class="result_row style="background-color:' + colorAr
        
    }
    document.querySelector(".result_row").style.height = (100/(counter+1)) + "%";
    //document.querySelectorAll("div.result_row").style.backgroundColor = 'colorHex';
    //good code below
    //let colorArray = document.getElementsByClassName("result_row");
    //colorArray[0].style.backgroundColor = colorHex;
    


    // if colorHex1.value !== null, then create another row and apply the next color?
   
    // might want to use an eventlistener OR innerHTML w/ a loop to add rows and stuff


   

}

// calling functions
document.querySelector('#size_btn').addEventListener("click", size);

document.querySelector('#colors_btn').addEventListener("click", color);

