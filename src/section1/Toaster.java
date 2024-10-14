package section1;

public class Toaster {
    private boolean onstatus;
    private int maxNumOfToasts;
    private int numOfToastsIn;

    public Toaster(int maxNumOfToasts) {
        this.maxNumOfToasts = maxNumOfToasts;
        this.onstatus = false;
        this.numOfToastsIn = 0;
    }

    public void setNumOfToastsIn(int numOfToastsIn) {
        if(numOfToastsIn <= this.maxNumOfToasts)
            this.numOfToastsIn = numOfToastsIn;
    }

    public String toString() {
        return this.onstatus + " " + this.numOfToastsIn;
    }

}

class ToasterTest {
    public static void main(String[] args) {
        Toaster t = new Toaster(2);
        System.out.println(t);
        t.setNumOfToastsIn(2);
        System.out.println(t);
        // t.numOfToastsIn = 1000;
        System.out.println(t);

    }
}
