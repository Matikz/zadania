public class Powna1os {
        public static void main(String[] args){
            int r1, r2, r3, r4, Powcałkowita;
            r1 = 3*4;//3*4
            r2 = 3*4;//3*4
            r3 = 2*3;//2*3
            Powcałkowita = r1 + r2 + r3;

            System.out.println("Wymiary:");
            System.out.println("r1 = 3x4, r2 = 3x4, r3 = 2x3");
            System.out.println("Powierzchnia pokoju nr1:" +  r1 + "m2");
            System.out.println("Powierzchnia pokoju nr2:" +  r2 + "m2");
            System.out.println("Powierzchnia pokoju nr3:" +  r3 + "m2");


            System.out.println("Powierzchnia całowita:");
            System.out.println(r1 + r2 + r3 + "m2");
            System.out.println("Powierzchnia na 1 os.:");
            System.out.println(Powcałkowita/4 + "m2");
        }
    }
