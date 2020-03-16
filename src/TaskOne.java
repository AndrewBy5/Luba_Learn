public class TaskOne{

    /*public void methodWhileOne() {
        int a = 1000;
        //? int i = 0;
        while (a < 10000) {
            System.out.println(a);
            a += 3;
        }
        System.out.println();
    }*/

    public void methodWhileTwo(){
        int b = 1;
        int z = 0;
        while (z < 55){
            System.out.print(b +" ");
            b +=2;
            z++;
        }
        System.out.println();
    }

    public void methodWhileThree(){
        int c = 90;
        while (c >= 0){
            System.out.print(c + " ");
            c -= 5;
        }
        System.out.println();
    }
    public void methodWhileFour(){
        int d = 2;
        int x = 0;
        while (x < 20){
            System.out.print(d + " ");
            d = d * 2;
            x++;
        }
        System.out.println();
    }

    public void methodForOne(){
        System.out.println(" From 10000 to 100000");
        for (int a = 1000; a < 10000; a+=3){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public void methodForTwo(){
        System.out.println("55 циклов");
        for (int b =1, z = 0; z < 55; z ++, b +=2 ){
            System.out.print(b + " " );
        }
        System.out.println();
    }
    public void methodForThree(){
        System.out.println("Name");
        for(int c=90; c > -1; c-=5){
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public void methodForFour(){
        System.out.println("Name");
        for (int d = 2, x = 0; x < 20 ; d *= 2, x++){
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
