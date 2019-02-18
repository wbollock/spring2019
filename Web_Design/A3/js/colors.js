// ############## READ ONLY  ##############

function updateColorChoosers() {
    const str = document.querySelector("#num_colors").value;
    const new_num = Math.abs(parseInt(str));
    const container = document.querySelector("#colors_container");

    let newHtml = "";
    for (let i = 0; i < new_num; i++) {
        newHtml += "<div class=\"subrow\">\n"
        newHtml += "\t<label for=\"color_sel" + i + "\">Color #"
        newHtml += (i + 1) + "</label>\n"
        newHtml += "\t<input id=\"color_sel" + i + "\" type=\"color\"/>\n"
        newHtml += "</div>";

    }

    container.innerHTML = newHtml;
}
let sel = document.querySelector("#num_colors");
sel.addEventListener("input", updateColorChoosers);