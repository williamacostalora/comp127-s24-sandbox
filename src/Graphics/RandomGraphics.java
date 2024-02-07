import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.ui.Button;

public class RandomGraphics {
    public static void main(String[] args) {
        CanvasWindow window = new CanvasWindow("Test", 100, 100);

        Button b = new Button("Click Me!");
        b.onClick(() -> b.moveBy(1, 1));
        window.add(b);
        
    }
}
