
class mains{
    public static void main(String[] args) {

        int a[] = {14,2,5,6,2};
        for(int i=0;i<=a.length-1;i++) {
            for(int j=1;j<=a.length-1;j++){
                if(i!=j & a[i]==a[j]) {

                    System.out.println("In array a[]={14,2,5,6,2} element in position "+i+" and element in position "+j+" has same value "+a[i]);
                }
                
            }
                
        }
    }
}
