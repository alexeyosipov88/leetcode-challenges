/**
 * @param {string} s
 * @return {number}
 */



// BRUTAL FORCE

 var lengthOfLongestSubstring = function(s) {
    let result = 0;

    for(let i = 0; i < s.length; i++) {
        for(let j = i; j < s.length; j++) {
            if(!checkRepetition(s, i, j)) {
                result = Math.max((j - i) + 1, result);
            }    
        }
    }
    return result;
};


function checkRepetition(str, first, last) {
    const hash = [];
    for(let i = first; i <= last; i++) {        
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