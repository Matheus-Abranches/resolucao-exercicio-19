public class Tabuadas {
    public void tabuadas(){

    for (int i = 1; i <= 10; i++) {
        System.out.println("Tabuada do " + i + ":");
        for (int j = 1; j <= 10; j++) {
            int resultado = i * j;
            System.out.println(i + " x " + j + " = " + resultado);
        }
        System.out.println();
    }

    }
}


