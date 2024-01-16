import java.util.*;

public class endofFile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int i = 0;
        do {
            System.out.println(++i + " " + sc.nextLine());
        }while(i<10 && (sc.hasNextLine()) );
        sc.close();
    }
}