var Book = /** @class */ (function () {
    function Book() {
    }
    Book.prototype.printInfo = function () {
        console.log("Title: " + this.title);
        console.log("Author: " + this.author);
        console.log("Price: " + this.price);
    };
    return Book;
}());
var book1 = new Book();
book1.title = "BlerpityBloop";
book1.author = "Marlin Excalibur";
book1.price = 9420.69;
book1.printInfo();
