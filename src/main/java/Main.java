public class Main {
    public static void main(String[] args) throws Exception {
        Singleton singletonA = Singleton.getInstance("abc");
        Singleton singletonB = Singleton.getInstance("xyz");

        System.out.println(singletonA.value);
        System.out.println(singletonB.value);
    }
}
