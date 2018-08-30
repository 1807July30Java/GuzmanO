/*----------------------------------------------------------------------------------

PART II


Part II will focus on Javascript's ability to manipulate the DOM.

Use the provided HTML page.

Put your Javascript in the provided <script> element at the bottom of the page.

Please put the question itself as a comment above each answer.


-----------------------------------------------------------------------------------
*/

var homework2 = {};

/*1. USA
Define function getUSA()

Find the html element that contains "USA".

Print that element's contents.*/

homework2.getUSA = function () {
    var h1Tag = document.getElementsByTagName("h1");
    console.log(h1Tag[0].textContent);
};

/*
2. Sales

Define function getPeopleInSales()

Print the names of all the people in the sales department.*/

homework2.getPeopleInSales = function () {
    var empList = document.getElementsByClassName("empName");
    for (var i = 0; i < empList.length; ++i) {
        console.log(empList[i].textContent);
    }
};


/*
3. Click Here

Define function getAnchorChildren()

Find all anchor elements with a < span > child.

Print the contents of < span >
*/

homework2.getAnchorChildren = function () {
    var anchorChild = document.getElementsByTagName("a");

    console.log(anchorChild[6].textContent);
    console.log(anchorChild[8].textContent);
    console.log(anchorChild[9].textContent);
    console.log(anchorChild[11].textContent);
};

/*4. Hobbies

Define function getSkills()

Find all checked options in the 'skills' select element.

Print the value and the contents.*/

homework2.getSkills = function () {
    var skills = document.getElementsByName("skills");

    console.log(skills[0].value);
    console.log(skills[0].textContent);

};

/*5. Custom Attribute

Define function getCustomAttribute()

Find all elements with "data-customAttr" attribute

Print the value of the attribute.

Print the element that has the attribute.*/

homework2.getCustomAttribute = function () {
    var custom = document.querySelectorAll("[data-customAttr]");
    for (var i = 0; i < custom.length; ++i) {
        console.log(custom[i].textContent);
        console.log(custom[i]);
    }

};

/*6. Sum Event

NOTE: Write unobtrusive Javascript

Regarding these elements:

<input id="num1" class="nums" type="text" />

    <input id="num2" class="nums" type="text" />

    <h3>Sum: <span id="sum"></span></h3 >


        Define onchange event handler.

            Add < input > element values.

Put the sum in the < span > element.

If values cannot be added, put "Cannot add" in the < span > element*/

//onchange = "sumEvent();" added to inputs
function sumEvent() {
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);

    var result = num1 + num2;
    if (isNaN(result))
        document.getElementById("sum").innerHTML = "Cannot be added";
    else
        document.getElementById("sum").innerHTML = result;
};
/*7. Skills Event

NOTE: Write unobtrusive Javascript

When user selects a skill, create an alert with a message similar to:

"Are you sure CSS is one of your skills?"

NOTE: no alert should appear when user deselects a skill.*/

function skillsEvent(value) {
    alert("Are you sure " + value + " is one of your skills?");

};


/*8. Favorite Color Event

NOTE: Write unobtrusive Javascript

NOTE: This is regarding the favoriteColor radio buttons.

When a user selects a color, create an alert with a message similar to:

"So you like green more than blue now?"

In this example, green is the new value and blue is the old value.

Make the background color(of all favoriteColor radio buttons)
the newly selected favoriteColor*/

function favoriteColorEvent() {
    var color = document.getElementsByName("favoriteColor");

    //if there exists a radio value
    for (var i = 0; i < color.length; ++i) {
        color[i].onchange = function () {
            alert("So you like " + this.value + " more than " + this.style.backgroundColor + " now?");
            for (var t = 0; t < color.length; ++t) {
                color[t].style.backgroundColor = this.value;
            }
        }
    }
};
favoriteColorEvent();

/*9. Show / Hide Event

NOTE: Write unobtrusive Javascript

When user hovers over an employees name:

Hide the name if shown.
	Show the name if hidden.*/

function showHideEvent() {
    

};

/*10. Current Time

Regarding this element:
<h5 id="currentTime"></h5>

Show the current time in this element in this format: 9: 05: 23 AM

The time should be accurate to the second without having to reload the page.*/
function currentTime() {
    var date = new Date();
    var hour = date.getHours();
    var min = date.getMinutes();
    var second = date.getSeconds();
    var time = hour + " : " + min + " : " + second;

    document.getElementById("currentTime").innerHTML = time;
};
setInterval(currentTime, 1000);


/*11. Delay
Regarding this element:

<p id="helloWorld">Hello, World!</p>

Three seconds after a user clicks on this element, change the text to a random color.*/

function delay() {
    var r = Math.floor(Math.random() * 255);
    var g = Math.floor(Math.random() * 255);
    var b = Math.floor(Math.random() * 255);

    document.getElementById("helloWorld").style.color = "rgb("+r+','+g+','+b+')';
};


/*12. Walk the DOM

Define function walkTheDOM(node, func)

This function should traverse every node in the DOM.
Use recursion.

On each node, call func(node).*/
function walkTheDOM(node, func) {
    
};