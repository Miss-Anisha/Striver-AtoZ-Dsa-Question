 //update function
    public static void updateUtil(int i, int si, int sj, int idx, int diff){
        if(idx>sj || idx<si){
            return;
        }

        tree[i]+= diff;
        if(si!=sj){
            int mid=(si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff);
            updateUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }
    public static void  update(int arr[], int idx, int newVal){
        int n=arr.length;
        int diff =newVal - arr[idx];
        arr[idx] = newVal;

        updateUtil(0, 0, n-1, idx, diff);
    }
