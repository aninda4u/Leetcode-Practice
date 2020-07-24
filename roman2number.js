function convertToRoman(num){

    var romanToNum ={
        M:1000,
        CM:900,
        D:500,
        CD:400,
        C:100,
        XC:90,
        L:50,
        XL:40,
        X:10,
        IX:9,
        V:5,
        IV:4,
        I:1
    }

    var roman ="";

    for (var key in romanToNum) {
        // console.log(key);
        // console.log(romanToNum[key]);
        
        while (num>=romanToNum[key]){
            // roman +=key;
            roman = roman + key;
            // console.log(roman);
            // num -=romanToNum[key];
            num = num-romanToNum[key];
            // console.log(num);
        }
    }
    return roman;
}

console.log(convertToRoman(31));