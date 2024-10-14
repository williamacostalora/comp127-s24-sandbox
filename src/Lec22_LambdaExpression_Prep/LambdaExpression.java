package Lec22_LambdaExpression_Prep;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

class Greeter {
    public void greet(ActionEvent ae) {
        System.out.println("Hello COMP127 from Greeter.greet");
    }
}

class TimeGreeter extends Greeter {
    public void greet(ActionEvent ae) {
        System.out.println("Hello COMP127 from TimeGreeter.greet");
    }

    public void timeGreet_lambdaExpressionFullSyntax() {
        Timer t = new Timer(1000, (ActionEvent ae) -> {
            System.out.println("Hello COMP127 from TimeGreeter.timeGreet_lambdaExpressionFullSyntax");
        });
        t.start();
    }
    
    public void timeGreet_lambdaExpressionFullSyntax_StoredFist() {
        ActionListener al = (ActionEvent ae) -> {
            System.out.println("Hello COMP127 from TimeGreeter.timeGreet_lambdaExpressionFullSyntax_StoredFist");
        };
        Timer t = new Timer(1000, al);
        t.start();
    }


    public void timeGreet_lambdaExpressionSyntacticSugar() {
        Timer t = new Timer(1000, ae -> System.out.println("Hello COMP127 from TimeGreeter.timeGreet_lambdaExpressionSyntacticSugar"));
        t.start();
    }
    
    public void timeGreet_lambdaExpressionSyntacticSugar_StoredFirst() {
        ActionListener al = ae -> System.out.println("Hello COMP127 from TimeGreeter.timeGreet_lambdaExpressionSyntacticSugar_StoredFirst");
        Timer t = new Timer(1000, al);
        t.start();
    }

    
    public void timeGreet_methodReferenceClass() {
        Timer t = new Timer(1000, this::greet);
        t.start();
    }

    public void timeGreet_methodReferenceParent() {
        Timer t = new Timer(1000, super::greet);
        t.start();
    }
    

    public void timeGreet_oldApproach() {
        ActionEventImplementer aei = new ActionEventImplementer();
        Timer t = new Timer(1000, aei);   // the timer object will call the implemented 
                                                // method in ActionListener interface
        t.start();
    }

    private class ActionEventImplementer implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hello COMP127 from ActionEventImplementer.actionPerformed");
        }
    }
}

public class LambdaExpression {
    public static void main(String[] args) throws InterruptedException, IOException {
        new TimeGreeter().timeGreet_lambdaExpressionFullSyntax();
        new TimeGreeter().timeGreet_lambdaExpressionFullSyntax_StoredFist();
        new TimeGreeter().timeGreet_lambdaExpressionSyntacticSugar();
        new TimeGreeter().timeGreet_lambdaExpressionSyntacticSugar_StoredFirst();
        new TimeGreeter().timeGreet_methodReferenceClass();
        new TimeGreeter().timeGreet_methodReferenceParent();
        new TimeGreeter().timeGreet_oldApproach();

        while (true) {
            // do nothing
            // this is to allow the threads generated in TimeGreater to run
        }
    }
}