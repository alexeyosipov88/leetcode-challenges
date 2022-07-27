/**
 * @param {string} s
 * @return {number}
 */

// SLIDING WINDOW

/**
 * @param {string} s
 * @return {number}
 */


 var lengthOfLongestSubstring = function(s) {
    
    let hash = [];
    let result = 0;
    let left = 0;
    let right = 0;
    
    while(right < s.length) {                
        if(!hash[s.charCodeAt(right)]) {
            hash[s.charCodeAt(right)] = 0;
        }
        
        hash[s.charCodeAt(right)]++;

        while(hash[s.charCodeAt(right)] > 1) {
            hash[s.charCodeAt(left)]--;
            left++;
        }
        
        result = Math.max(result, (right - left) + 1);
        right++;
               
    }
    
    return result;
    
};





// BRUTAL FORCE

//  var lengthOfLongestSubstring = function(s) {
//     let result = 0;

//     for(let i = 0; i < s.length; i++) {
//         for(let j = i; j < s.length; j++) {
//             if(!checkRepetition(s, i, j)) {
//                 result = Math.max((j - i) + 1, result);
//             }    
//         }
//     }
//     return result;
// };


// function checkRepetition(str, first, last) {
//     const hash = [];
//     for(let i = first; i <= last; i++) {        
//         if(!hash[str.charCodeAt(i)]) {
//             hash[str.charCodeAt(i)] = 0;
//         }
//         hash[str.charCodeAt(i)]++;
//         if(hash[str.charCodeAt(i)] > 1) {
//             return true;
//         }
//     }
//     return false;
// }