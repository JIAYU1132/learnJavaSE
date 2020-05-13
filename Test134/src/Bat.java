public class Bat extends Animal implements IFlying {
    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在使用翅膀飞");
    }
}
