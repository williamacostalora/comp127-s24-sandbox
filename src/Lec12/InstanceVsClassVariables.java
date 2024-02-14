package Lec12;

class Ha {
    private int iv;
    private static int cv;

    private final int CIV;
    static final int CCV = 40;

    public Ha() {
        this.CIV = 10;
    }

    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }

    public static int getCv() {
        return cv;
    }

    public static void setCv(int cv) {
        Ha.cv = cv;
    }

    public int getCIV() {
        return CIV;
    }

    public static int getCcv() {
        return CCV;
    }
    
}

public class InstanceVsClassVariables {
    public static void main(String[] args) {
        Ha ha = new Ha();
    }
}
