/**
 * @param {string} s
 * @return {string}
 */


// const isPalindrome = (str) => {
//     let first = 0;
//     let last = str.length - 1;
    
//     while(last > first) {
//         if(str[first] !== str[last]) {
//             return false;
//         }
//         first++;
//         last--;
//     }
//     return true;    
    
// } 

const reverseString = (str) => {
    
    let arrFromStr = str.split("");
    let last = str.length - 1;
    for(let i = 0; i < arrFromStr.length / 2; i++) {
        let tmp = arrFromStr[i];
        arrFromStr[i] = arrFromStr[last];
        arrFromStr[last] = tmp; 
        last--;
    }
    
    
    return arrFromStr.join("");
    
    
}

const isSubString = (string, subString) => {
    
    
    for(let i = 0; i <= string.length - subString.length; i++) {
        let j;
        
        for(j = 0; j < subString.length; j++) {
            if(string[j + i] !== subString[j]) {
                break;
            }
        
        }    
        
        if(j === subString.length) {
            return true;            
        } 
        
    }
    
    return false;
    
    
}



var longestPalindrome = function(s) {
  
    const reversedString = reverseString(s);
    let result = "";
    let subString = "";
    
   for(let i = 0; i < s.length; i++) {
       for(let j = i; j < s.length; j++) {
        
           subString = s.slice(i, j + 1);
           if(isSubString(reversedString, subString) && subString.length > result.length) {
              result = subString;
           }
       }
   }
    
    

    return result;
    
};

