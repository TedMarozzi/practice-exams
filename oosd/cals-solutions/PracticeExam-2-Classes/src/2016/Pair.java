public class Pair<T,S> {
    T data1;
    S data2;

    public Pair(T data1, S data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public void setData2(S data2) {
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public S getData2() {
        return data2;
    }
}
