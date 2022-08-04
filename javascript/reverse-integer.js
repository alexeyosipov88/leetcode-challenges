/**
 * @param {number} x
 * @return {number}
 */
 var reverse = function(x) {
    
    let res = 0;
    
    
    
    let remainder;

    while(x >= 1) {
        remainder = x % 10;
        res = res * 10 + remainder;
        x = x / 10;
        }
    
    console.log(res);
    
    return res;
    
    
    
};