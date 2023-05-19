
import java.io.FileInputStream;

public class Compiladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("---------TUDO CERTO---------");
        FileInputStream in = null;
        try {
            //fileIn = new FileInputStream("teste.txt");
            //Scanner scanner = new Scanner(fileIn);

            Scanner scanner = new Scanner(System.in);
            parser p = new parser(scanner);
            p.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
