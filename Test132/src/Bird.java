public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        System.out.println("Bird.eat");
        System.out.println(super.name + "正在吃" + food);
    }

}
