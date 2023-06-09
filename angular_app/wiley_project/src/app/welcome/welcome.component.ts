import { Component } from "@angular/core"
import {STUDENTS} from "./mock-students";
//import {BOOKS} from "./book-list";
import {Student} from "./students";
@Component({
    "selector": "app-welcome",
    templateUrl: 'welcome.component.html',
    styleUrls:["./welcome.component.css"]
})

export class WelcomeComponent{
    message = "Welcome to WILEY EDGE"
    students = STUDENTS;

    selectedStudent?: Student;
    /*msg = "Welcome to Book store"
    books = BOOKS;
*/
    onSelect(student:Student): void{
        this.selectedStudent = student;
    }
}