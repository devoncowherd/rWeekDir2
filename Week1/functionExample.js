let myName = "Devon Cowherd";

function print(name){
    console.log(name);
}

let anonymous = function(){
    return "single line"
}

print(myName);
print(anonymous());

let halfFunc = a => a/2;


let items = [2,4,6,8,10,12];

function doubleItems(item){
    return item.map(it => it * 2)
}

print(halfFunc);

print(doubleItems(items));
