package Lec17;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.TextField;

public class TextboxDemo {
    public static void main(String[] args) {
        CanvasWindow cw = new CanvasWindow("TextBox Demo", 300, 100);
        TextField tf = new TextField();
        cw.add(tf, 10, 10);
        
        GraphicsText gt = new GraphicsText("helo", 30, 30);
        cw.add(gt, 10,50);

        tf.onChange(t -> {
            gt.setText(t);
        });
        cw.draw();
    }
}
