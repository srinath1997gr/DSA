class BinarySearchRec {
    public static void main(String args[]) {

        int[] a = { 2, 5, 10, 11, 13 };

        System.out.println(binarySearch(a, 0, a.length - 1, 2));

    }

    public static int binarySearch(int[] a, int start, int end, int target) {

        int mid = start + (end - start) / 2;

        if (a[mid] == target)
            return mid;

        if (a[mid] < target)
            return binarySearch(a, mid + 1, end, target);

        if (a[mid] > target)
            return binarySearch(a, start, mid - 1, target);

        return -1;
    }
}