public class AnimalApp {
    public static void main(String [] args) {
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());

        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Horse h = new Horse();
        print(h.eat());
        print(h.sleep());
        print(h.neigh());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.woof());

    }
    private static void print(String s) {
        System.out.println(s);
    }


}
