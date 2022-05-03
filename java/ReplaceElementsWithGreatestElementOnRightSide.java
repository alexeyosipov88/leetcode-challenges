class ReplaceElementsWithGreatestElementOnRightSide {


  class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int biggest = arr[i + 1];
            for(int j = i + 2; j < arr.length; j++) {
                if(arr[j] > biggest) {
                    biggest = arr[j];
                }
            }
            arr[i] = biggest;
        
        }
            arr[arr.length - 1] = -1;
        
        return arr;
    }
}

}