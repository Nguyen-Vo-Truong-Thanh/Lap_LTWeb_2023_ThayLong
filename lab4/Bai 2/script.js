var a = prompt('Nhập a: ')
var b = prompt('Nhập b: ')
var c = prompt('Nhập c: ')

if(a == 0){
    alert('Phương trình bậc 1');
}
else{
    var delta = (Math.pow(b ,2)) - (4 * a * c)

    if(delta == 0){
        var x = -b / (2*a)
        alert(`Phương trình có nghiệm kép: x = ${x}`)
    }
    else if (delta < 0){
        alert('Phương trình vô nghiệm')
    }
    else{
        alert('Phương trình có 2 nghiệm phân biệt ');
        var x1 = ((-b + Math.sqrt(delta))/ (2 *a));
        var x22 = ((-b - Math.sqrt(delta))/ (2 *a));

        alert(`Phương trình có nghiệm x1 = ${x1}`);
        alert(`Phương trình có nghiệm x2 = ${x2}`);
    }
}