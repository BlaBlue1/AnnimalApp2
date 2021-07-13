/*
*All Horses are Animals but all animals are not Horses
*/
public class Horse extends Animal {
    public Horse() {
        super();
        System.out.println("Now I am a Horse!");
    }
    @Override
    public String sleep() {
        return "A horse sleeps well...";
    }
    @Override
    public String eat() {
        return "a horse eats...";
    }
    public String neigh() {
        return "a horse neigh....";
    }

}


