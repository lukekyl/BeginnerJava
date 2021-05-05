/* Hello World Java Program */
class helloworld  {
    public static void main(String[] args) {
        sayGreeting("");
    }

    private static void sayGreeting(String name) {
        if (name != "") {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Hello World");
        }
    }

}