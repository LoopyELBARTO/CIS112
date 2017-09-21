package Week3;

public class ArrayPair<T> implements PairInterface<T> {

    T pair[];

    public ArrayPair(){
        pair =(T[]) new Object[2];
    }

    @Override
    public void setOne(T OBJ) {
        pair[0] = OBJ;

    }

    @Override
    public T getOne() {
        return pair[0];
    }

    @Override
    public void setTwo(T OBJ) {
        pair[1] = OBJ;
    }

    @Override
    public T getTwo() {
        return pair[1];
    }
}
