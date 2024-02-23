// package Lec12;

// public class InhDecmoSec2 {
//     public static void main(String[] args) {
//         P[] ps = new P[3];
//         ps[0] = new P();
//         ps[1] = new C();
//         ps[2] = new CC();

//         for (int i = 0; i < ps.length; i++) {
//             ps[i].prt();
//         }

//         // P p = new P();
//         // p.prt();

//         // P c = new C();
//         // c.prt();

//         // P cc = new CC();
//         // cc.prt();
//     }
// }

// class P {
//     int p;

//     void prt() {
//         System.out.println("P");
//     }
// }

// class C extends P {
//     int c;

//     void prt() {
//         super.prt();
//         System.out.println("C");
//     }
// }

// class CC extends C {
//     int cc;
// }