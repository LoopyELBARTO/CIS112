package Week3;

public class BasicPair<T> implements  PairInterface<T> {
    private T ob1;
    private T ob2;

    public BasicPair(){

    }

    public BasicPair(T obj1, T obj2){
        ob1 = obj1;
        ob2 = obj2;
    }

    @Override
    public void setOne(T OBJ) {
        this.ob1 = OBJ;

    }

    @Override
    public T getOne() {
        return ob1;
    }

    @Override
    public void setTwo(T OBJ) {
        this.ob2 = OBJ;
    }

    @Override
    public T getTwo() {
        return ob2;
    }
}
