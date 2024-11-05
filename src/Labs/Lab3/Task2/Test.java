package Labs.Lab3.Task2;

public class Test {
    public static void main(String[] args) {
        Zoo zooPark = new Zoo();

        Wolf grayWolf = new Wolf();
        Fish goldenFish = new Fish();
        Bird crow = new Bird();

        zooPark.makeItMove(grayWolf);
        zooPark.makeItSwim(goldenFish);
        zooPark.makeItFly(crow);
    }
}
