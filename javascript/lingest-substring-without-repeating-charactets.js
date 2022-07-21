/**
 * @param {string} s
 * @return {number}
 */
 var lengthOfLongestSubstring = function(s) {
    let result = 0;

    for(let i = 0; i < s.length; i++) {
        let currSubString = "";
        for(let j = i; j < s.length; j++) {
            currSubString += s[j];
            if(checkRepetition(currSubString)) {
                currSubString = "";
                break;
            }    
            result = Math.max(currSubString.length - 1, result);
        }
        
    }
    
    
    return result;
    
};


function checkRepetition(str) {
    const hash = [];
    for(let i = 0; i < str.length; i++) {
    
        
        if(!hash[str.charCodeAt(i)]) {
            hash[str.charCodeAt(i)] = 0;
        }

        hash[str.charCodeAt(i)]++;
        
        
        if(hash[str.charCodeAt(i)] > 1) {
            
            return true;
            
        }
        
    }
    
    return false;
    
}