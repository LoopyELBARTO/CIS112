package Week3;

public class Sample {

    public static void main(String[] args){
        PairInterface<String> myPair = new BasicPair<String>("apple", "peach");

        System.out.print(myPair.getOne() + " ");
        System.out.println(myPair.getTwo());
        myPair.setTwo("orange");
        System.out.print(myPair.getOne() + " ");
        System.out.println(myPair.getTwo());
    }
}
