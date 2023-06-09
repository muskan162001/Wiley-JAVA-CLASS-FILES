let id: number = 123;
let company: String = "Wiley"
let isPublished: boolean = true
let x: any;

let studentIds: number[] = [1,2,3,4,5,6]
studentIds.push(19)
console.log(studentIds)

let person: [number, String, boolean] = [1, "Praveen", true]

let employees: [number, String][]
employees = [
    [1,"Praveen"],
    [2,"Anonymous"]
] 
let empId: string | number
empId="venkat"

enum Directions{
    Up, Down, Left, Right
}

let CurrentDirection = Directions.Up;

type Student = {
    id: number,
    name: String,
    age?:number
}

const studentOne: Student ={
    id: 1,
    name: "Muskan"
}

let sid: any = 1;
let eid = sid;

console.log(eid)

//Function

function calcTotal(x: number, y: number): number{
    return x + y;
}

function sendMessage(message: string | number) : void{
    console.log("My Message")
}

interface StudentInterface {
    readonly id : number,
    name : string,
    age?: number
}

const student1: StudentInterface = {
    id: 1,
    name: "Muskan"
}

interface CalcFunc{
    (x : number, y : number) : number
}

const add: CalcFunc =  (x : number, y : number): number => x + y
const sub: CalcFunc =  (x : number, y : number): number => x - y


interface PersonInterface{
    id: number
    name : string
    register(): string
}

class Person implements PersonInterface{
    id: number
    name: string

    constructor(id: number, name: string){
        this.id = id;
        this.name = name;
    }

    register(): string{
        return `$(this.name) is now registerd with wiley`
    }
 
}
    const muskan = new Person(1, "Muskan");
    const venkatSir = new Person(1, "Muskan");


class Employee extends Person{
    position: string

    constructor(id: number, name: string, position: string){
        super(id, name);
        this.position = position
    }
}

const emp1 = new Employee(3, "Janhavi", "Developer");

function getData<T>(items: T[]) : T[]{
    return new Array().concat(items);
}

let numberData = getData<number>([1, 2, 3,4, 5]);
let skills = getData<String>(["Java", "JS"]);
numberData.push(1);