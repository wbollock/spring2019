// made by William Bollock, CGS 3066 A3

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
    
    // TODO: account for negative numbers

    const numColors = parseInt(document.querySelector("#num_colors").value);
    let new_div= new Array();

    // apply color to first, natural result row
    let colorHex = document.querySelector("#color_sel0").value;
    let colorArray = document.getElementsByClassName("result_row");
    colorArray[0].style.backgroundColor = colorHex;

    let counter=0;

    for(let i=1; i<Math.abs(numColors); i++) // sets colors to row
    {
        let colorHex = document.querySelector("#color_sel" + i).value; // succesfully prints subsequent values
       
        if(numColors > 0)
        {
            new_div[i] = document.createElement('div'); // create div
            new_div[i].className = "result_row"; // assign new div the right class
            document.getElementById("result").appendChild(new_div[i]); // put the div under "result"
            
            new_div[i].style.backgroundColor = colorHex; // set color of new div
            new_div[i].style.display = "block";
            //new_div[i].style.height = (100/(i+1)) + "%";
            console.log(i);

            counter++; // counter variable tells height loop how many times to run
        }
    
        // loop to apply height
       for(let j=0; j<=counter; j++)
        {
            document.querySelectorAll(".result_row")[j].style.height = (100/(counter+1)) + "%";
            console.log("Height loop runing" + j);
        } // end of height loop
 
        
    } // end of main for loop

} // end of color function

// calling functions
document.querySelector('#size_btn').addEventListener("click", size);

document.querySelector('#colors_btn').addEventListener("click", color);

