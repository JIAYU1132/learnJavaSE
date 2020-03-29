public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println("Animal.eat");
        System.out.println(this.name + "正在吃" + food);
    }
}
