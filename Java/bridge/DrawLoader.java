/**
 * Client
 */
class DrawLoader {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new CircleShape(1, 2, 3, new PencilDrawingAPI());
        shapes[1] = new CircleShape(5, 7, 11, new PenDrawingAPI());

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}