package Graphics.SizableButton;

import edu.macalester.graphics.CanvasWindow;

public class Example {
    public static void main(String[] args) {
        CanvasWindow window = new CanvasWindow("Big Button", 100, 100);
        Button jb = new Button("Test", 50, 50);
        jb.onClick(() -> jb.setPosition(jb.getX() + 2, jb.getY() + 2));

        window.add(jb);
    }
}