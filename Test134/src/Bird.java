public class Bird extends Animal implements IFlying, IRunning {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在使用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在使用两条腿跑");
    }
}
