private static void merge(int[] array, int left, int middle, int right) {
    int i = left;   // index for the left subarray
    int j = middle; // index for the right subarray
    int k = 0;      // index for the temp subarray
        
    int[] temp = new int[right - left]; // temporary array for merging

    /* get the next lesser element from one of two subarrays 
       and then insert it in the array until one of the subarrays is empty */
    while (i < middle && j < right) {
        if (array[i] <= array[j]) {
            temp[k] = array[i];
            i++;
        } else {
            temp[k] = array[j];
            j++;
        }
        k++;
    }

    /* insert all the remaining elements of the left subarray in the array */
    for (;i < middle; i++, k++) {
        temp[k] = array[i];
    }

    /* insert all the remaining elements of the right subarray in the array */
    for (;j < right; j++, k++) {
        temp[k] = array[j];
    }

    /* effective copying elements from temp to array */
    System.arraycopy(temp, 0, array, left, temp.length);
}
