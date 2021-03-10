package Generice;

public class GenericBox<T, KEY> {
    private T data;

    private KEY keyData;

    public  void add(T dataToBeAdded) {
        this.data = dataToBeAdded;
    }

    public T getData() {
        return data;
    }

    public void addKey(KEY keyData){
        this.keyData = keyData;
    }

    public void setData(T data) {
        this.data = data;
    }

    public KEY getKeyData() {
        return keyData;
    }

    public void setKeyData(KEY keyData) {
        this.keyData = keyData;
    }
}
