export class A{
    constructor(){
        console.log("Class A");
    }
}

export class B extends class A{
    constructor(){
        console.log("class B");
    }
}