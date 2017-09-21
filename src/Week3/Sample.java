package Week3;

public class Sample {

    public static void main(String[] args){
        /*PairInterface<String> myPair = new BasicPair<String>("apple", "peach");

        System.out.print(myPair.getOne() + " ");
        System.out.println(myPair.getTwo());
        myPair.setTwo("orange");
        System.out.print(myPair.getOne() + " ");
        System.out.println(myPair.getTwo());*/

        PairInterface<String> myPair = new ArrayPair<String>();
        myPair.setOne("Apple");
        myPair.setTwo("Orange");
        System.out.println(myPair.getOne() + " " + myPair.getTwo());
    }
}
