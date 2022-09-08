class Customer {
    firstName : string;
    lastName : string;

    constructor(firstName, lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    printFullName(){
        console.log(this.firstName + " " + this.lastName);
    }
}


const customer1 = new Customer("Devon", "Cowherd");

customer1.printFullName();