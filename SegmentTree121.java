package Day9IOT;
public class SegmentTree121 {
    static int[] tree;
    static int[] arr;
    static void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        build(node * 2, start, mid);
        build(node * 2 + 1, mid + 1, end);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }
    static int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l)
            return 0;
        if (l <= start && end <= r)
            return tree[node];
        int mid = (start + end) / 2;
        return query(node * 2, start, mid, l, r)
             + query(node * 2 + 1, mid + 1, end, l, r);
    }
    public static void main(String[] args) {
        arr = new int[]{1, 2, 3, 4, 5};
        tree = new int[4 * arr.length];
        build(1, 0, arr.length - 1);
        System.out.println("Range Sum: " +
                query(1, 0, arr.length - 1, 1, 3));
    }
}