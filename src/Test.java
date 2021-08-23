public class Test {
    public static void main(String[] args) {

        MyGenericsClass<String> stringMyGenericsClass = new MyGenericsClass<>("raghav");
        stringMyGenericsClass.displayObjectDetails();
        System.out.println(stringMyGenericsClass.getObj());

        MyGenericsClass<Integer> integerMyGenericsClass = new MyGenericsClass<>(123);
        integerMyGenericsClass.displayObjectDetails();
        System.out.println(integerMyGenericsClass.getObj());

        MyGenericsClass<Double> doubleMyGenericsClass = new MyGenericsClass<>(34.56);
        doubleMyGenericsClass.displayObjectDetails();
        System.out.println(doubleMyGenericsClass.getObj());
    }
}
