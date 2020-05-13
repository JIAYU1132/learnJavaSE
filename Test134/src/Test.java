public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙");
        run(frog);
        swim(frog);

        Bat bat = new Bat("蝙蝠");
        fly(bat);

        Bird bird = new Bird("小鸟");
        fly(bird);
        run(bird);

        Cat cat = new Cat("小猫");
        run(cat);

        Fish fish = new Fish("小鱼");
        swim(fish);

        Insect insect = new Insect("小虫");
        fly(insect);
        run(insect);

        Robot robot = new Robot();
        run(robot);
    }

    public static void run(IRunning animal) {
        animal.run();
    }

    public static void swim(ISwimming animal) {
        animal.swim();
    }

    public static void fly(IFlying animal) {
        animal.fly();
    }
}
