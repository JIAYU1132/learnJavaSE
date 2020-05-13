 public class Insect extends Animal implements IRunning, IFlying {
     public Insect(String name) {
         super(name);
     }

     @Override
     public void run() {
         System.out.println(this.name + "正在使用六条腿跑");
     }

     @Override
     public void fly() {
         System.out.println(this.name + "正在使用翅膀飞");
     }
 }
