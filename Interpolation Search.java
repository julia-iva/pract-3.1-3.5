public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            int pos = lo + ((hi - lo) * (x - arr[lo])) / (arr[hi] - arr[lo]);
            if (arr[pos] == x) return pos;
            if (arr[pos] < x) lo = pos + 1;
            else hi = pos - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int x = 40;
        int result = interpolationSearch(arr, x);
        System.out.println(result != -1 ? "Элемент найден на позиции: " + result : "Элемент не найден");
    }
}
