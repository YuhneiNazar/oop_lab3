import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      System.out.println("Використання типу string: ");
        zav1();
        System.out.println("Використання типу StringBuilder: ");
        zav2();
    }

    public static void zav1() {
        int sizerad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перший рядок");
        String rad1 = sc.nextLine();
        System.out.println("Введіть другий рядок");
        String rad2 = sc.nextLine();
        sizerad = rad1.compareTo(rad2);
        if (sizerad == 1) {
            System.out.println("Перший рядок більший");
        } else if (sizerad == -1) {
            System.out.println("Другий рядок більший");
        } else if (sizerad == 0) {
            System.out.println("Рядки рівні");
        }
        String con = rad1.concat(rad2);
        System.out.println("результат конкатенації = " + con);
        int index = rad1.indexOf("aa");
        if (index > -1) System.out.println("В рядку є  aa");
        index = rad1.indexOf("bb");
        if (index > -1) System.out.println("В рядку є  bb");
        index = rad1.indexOf("cc");
        if (index > -1) {
            System.out.println("В рядку є  cc");
        }
        String rad1_1 = rad1.replaceAll("aa|bb|cc", "**");
        System.out.println(rad1_1);
       String rad2_2 = rad2.replaceAll(" ", "");
       System.out.println(rad2_2);
    }

    public static void zav2 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перший рядок:");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.print("Введіть другий рядок:");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());
        sb2.append(sb2);
        System.out.println("Метод append = "+sb2);
        StringBuilder sb3 = sb1.insert(1, "-");
        System.out.println("Метод insert = "+sb3);
        StringBuilder sb4 = sb1.delete(1,5);
        System.out.println("Метод Delete = "+sb4);
        int indexst = sb1.indexOf("aa");
        int indexen = indexst+1;
        StringBuilder sb5 = sb2.replace(indexst,indexen,"**");
        System.out.println("Метод Replace = "+sb5);
    }
}

