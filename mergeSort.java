public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {6,1,2,5,3,7,4,0};
        arr = mergesort(arr);
        for (int j : arr) {
            System.out.print(j);
        }
    }
    static int[] merge(int[] L, int[] R, int[] arr){
        int i = 0,j =0,k = 0;
        int nL = L.length;
        int nR = R.length;

        while(i<nL && j<nR){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<nL){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<nR){
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;

    }
    static int[] mergesort(int[] arr){
        if(arr.length<2){
            return arr;
        }
        int mid = (arr.length)/2;
        int right = arr.length-mid;
        int[] L = new int[mid];
        int[] R = new int[right];
        for(int i = 0; i<mid; i++){
            L[i] = arr[i];
        }
        for (int j = mid; j<arr.length; j++){
            R[j-mid] = arr[j];
        }
        mergesort(L);
        mergesort(R);
        merge(L, R, arr);
        return arr;

    }
}
