public class Fibonachi {

    public static void main(String[] args){
        Fibonachi fibonachi = new Fibonachi();
        fibonachi.getFibonacciSeq(10);
    }
    //0,1,1,2,3,5,8,13,21,34
    public void getFibonacciSeq(int n){
       int n1 = 1;
       int n2 = 0;
        System.out.print("0, 1");
       for(int i=2; i<n ; i++){
           int newNum = n1 + n2;
           System.out.print(", " + newNum );
           n2 = n1;
           n1 = newNum;
       }
    }

}
