"use strict";
let id = 123;
let company = "Wiley";
let isPublished = true;
let x;
let studentIds = [1, 2, 3, 4, 5, 6];
studentIds.push(19);
console.log(studentIds);
let person = [1, "Praveen", true];
let employees;
employees = [
    [1, "Praveen"],
    [2, "Anonymous"]
];
let empId;
empId = "venkat";
var Directions;
(function (Directions) {
    Directions[Directions["Up"] = 0] = "Up";
    Directions[Directions["Down"] = 1] = "Down";
    Directions[Directions["Left"] = 2] = "Left";
    Directions[Directions["Right"] = 3] = "Right";
})(Directions || (Directions = {}));
let CurrentDirection = Directions.Up;
const studentOne = {
    id: 1,
    name: "Muskan"
};
let sid = 1;
let eid = sid;
console.log(eid);
//Function
function calcTotal(x, y) {
    return x + y;
}
function sendMessage(message) {
    console.log("My Message");
}
const student1 = {
    id: 1,
    name: "Muskan"
};
const add = (x, y) => x + y;
const sub = (x, y) => x - y;
class Person {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    register() {
        return `$(this.name) is now registerd with wiley`;
    }
}
const muskan = new Person(1, "Muskan");
const venkatSir = new Person(1, "Muskan");
class Employee extends Person {
    constructor(id, name, position) {
        super(id, name);
        this.position = position;
    }
}
const emp1 = new Employee(3, "Janhavi", "Developer");
function getData(items) {
    return new Array().concat(items);
}
let numberData = getData([1, 2, 3, 4, 5]);
let skills = getData(["Java", "JS"]);
numberData.push(1);
