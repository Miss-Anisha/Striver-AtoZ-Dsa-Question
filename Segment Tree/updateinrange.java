  public static void update(int arr[], int idx, int newValue){
        arr[idx]=newValue;
        int n =arr.length;
        updateUtil(0, 0, n-1, idx, newValue);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newValue){
        if(idx<si || idx>sj){
            return;
        }
        tree[i]=Math.max(tree[i], newValue);
        if(si!=sj){
        int mid=(si+sj)/2;
        updateUtil(2*i+1, si, mid, idx, newValue);
        updateUtil(2*i+2, mid+1, sj, idx, newValue);
        }
    }
