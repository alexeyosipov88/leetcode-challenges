class DuplicateZeroes {


  // tricky O(1) solution
//   public void duplicateZeros(int[] arr) {
//     int possibleZeroes = 0;
//     int realLength = arr.length;
//     int originalLast = arr.length - 1;

//     for(int i = 0; i < arr.length - possibleZeroes; i++) {
//         if(arr[i] == 0) {
//             realLength--;
//             if(i + 1  == arr.length - possibleZeroes) {
//                 arr[originalLast] = 0;
//                 originalLast--;
//                 break;
//             }
//             possibleZeroes++;
//         }          
//     }
//     for(int last = realLength - 1; last >= 0; last--) {
//         arr[originalLast] = arr[last];
//         if(arr[last] == 0) {
//             originalLast--;
//             arr[originalLast] = 0;
//         }
//         originalLast--;   
//     }

    
// }



      // brute force 

  // public void duplicateZeros(int[] arr) {
        




    // for(int i = 0; i < arr.length; i++) {    
    //     if(arr[i] == 0) {
    //         for(int j = arr.length - 1; j > i + 1; j--) {
    //             arr[j] = arr[j - 1];
    //         }
    //         if(i + 1 < arr.length) {
    //         arr[i + 1] = 0;
    //         i++;    
        
    //         }
            
    //     }
    // }
}




}