

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int lentthOfArr1AndArr2 = arr1Length + arr2Length;

        int theCombinationOfArrays[] = new int[lentthOfArr1AndArr2];

        int isEmpty[] = new int[0];

        for(int i = 0; i < arr1Length; i ++ ) {

            if (arr1Length == isEmpty.length){
                return isEmpty;
            }
            else
            theCombinationOfArrays[i] = arr1[i];
        }

       for (int j = 0; j < arr2Length; j++){
            if(arr2Length == isEmpty.length){
                return isEmpty;
            }
            theCombinationOfArrays[j + arr1Length] = arr2[j];
       }

        return theCombinationOfArrays;
    }
}
