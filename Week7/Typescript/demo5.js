var Customer = /** @class */ (function () {
    function Customer(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Customer.prototype.printFullName = function () {
        console.log(this.firstName + " " + this.lastName);
    };
    return Customer;
}());
var customer1 = new Customer("Devon", "Cowherd");
customer1.printFullName();
