function add(a, b) {
    return a + b;
}
console.log(add(1, 1));
var E1;
(function (E1) {
    E1[E1["A"] = 1] = "A";
    E1[E1["B"] = 2] = "B";
    E1[E1["C"] = 3] = "C";
})(E1 || (E1 = {}));
console.log(E1.A);
console.log(E1.B);
console.log(E1.C);
