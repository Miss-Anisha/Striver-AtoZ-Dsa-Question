public static int getMax(int arr[], int qi, int qj){
        int n=arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(si>qj || sj<qi){
            return Integer.MIN_VALUE;
        }else if(si>=qi && sj<=qj){
            return tree[i];
        }else{
            int mid=(si+sj)/2;
            int left= getMaxUtil(2*i+1, si, mid, qi, qj);
            int right=getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }
//output=17
