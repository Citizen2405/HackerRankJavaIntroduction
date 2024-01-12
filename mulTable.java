import java.io.*;

public class mulTable {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter any number: ");

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N>=2 && N<=20)
        {
            for(int i=1;i<11;i++)
            {
                System.out.printf("%d x %d = %d %n", N, i, N*i );
            }
        }
        bufferedReader.close();
    }
}
