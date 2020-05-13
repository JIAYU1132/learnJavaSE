public class Test {
    public static void main(String[] args) {
        drawShapes();
    }

    public static void drawShapes() {
        Shape[] shapes = {new Circle(), new Flower(), new Rect(), new Flower(), new Circle()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

