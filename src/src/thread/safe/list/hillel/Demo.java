package thread.safe.list.hillel;

public class Demo {
    public static void main(String[] args) {
        ThreadSafeList<Integer> list = new ThreadSafeList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list.get(0));
    }
}
