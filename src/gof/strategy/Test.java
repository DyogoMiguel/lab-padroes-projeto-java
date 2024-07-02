package gof.strategy;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo ();

    Robo robo = new Robo();
    System.out.println("Digite o comportamento do robô: normal, defensivo ou agressivo");
    String comportamento = scan.nextLine();

    if (comportamento.equalsIgnoreCase("normal")){
        robo.setComportamento(normal);
    } else if (comportamento.equalsIgnoreCase("agressivo")){
        robo.setComportamento(agressivo);
    } else if (comportamento.equalsIgnoreCase("defensivo")){
        robo.setComportamento(defensivo);
    } else {
        throw new IllegalArgumentException("Escolha uma das três opções: normal, defensivo ou agressivo");
    }
    robo.mover();


    scan.close();
}
}
