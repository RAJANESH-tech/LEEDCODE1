class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
    int x=m;
    for(int i=0;i<n;i++)
    {
        a[x]=b[i];
        x++;
    }
    Arrays.sort(a);
    }
}