public class MyGenericsClass<T> {
    T obj;

    public MyGenericsClass(T obj) {
        this.obj = obj;
    }

    public void displayObjectDetails() {
        System.out.println("The type of Objects:" + obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}
