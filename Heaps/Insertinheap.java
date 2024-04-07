//only function
public class Insertinheap {
    static class Heap{//final complexity is o(logn)
        ArrayList<Integer> arr= new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);//o(1)

            int x=arr.size()-1;//x is child idx
            int par=(x-1)/2;//parent idx

            while(arr.get(x)<arr.get(par)){//logn
                //swap
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);
            }
        }
    }
