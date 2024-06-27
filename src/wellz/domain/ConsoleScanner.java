package wellz.domain;

import java.util.Scanner;

public class ConsoleScanner {
    Scanner scanner = new Scanner(System.in);

    public int inputRows() {
        System.out.println("Digite quantas linhas a grade deve ter:");
        return scanner.nextInt();
    }
    public int inputCols() {
        System.out.println("Digite quantas colunas a grade deve ter:");
        return scanner.nextInt();
    }


}
