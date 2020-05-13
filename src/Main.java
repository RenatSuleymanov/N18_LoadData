import java.io.*;
public class Main {
    public static void main(String args[]){
    String s;
    Integer j=0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/test.txt")))
    {
        System.out.println("Файл содержит текст:");
        while ((s = br.readLine()) != null) {
            System.out.println(s);
            j++;
        }
    } catch (IOException exc) {
        System.out.println("Error IO: " + exc);
    }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите новый текст:");
        try (FileWriter fw = new FileWriter("src/test.txt"))
        {
            for (int i = 1; i <= j; i++) {
                System.out.print(": ");
                s = br.readLine();
                s = s + "\r\n";
                fw.write(s);
            }
        } catch (IOException exc){
            System.out.println("Ошибка ввода вывода: " + exc);
        }
}
}