package FileExample;



import java.io.File;

public class DirectoryExample {

    public static void main(String[] args) {
        try {
            File f = new File("E:\\program core java\\file.txt");
            
            if (f.exists()) {
                System.out.println("Directry Exist of Name = " + f.getName() + " of size = " + f.length() + " Bytes");
            } else {
                f.mkdir();
                System.out.println("Created new Directry of name = " + f.getName() + " of size = " + f.length() + " Bytes");
            }

            System.out.println("we can read the file = " + f.canRead());
            System.out.println("we can write the file = " + f.canWrite());
            System.out.println("Path = " + f.getPath());
            System.out.println("Parent folder = " + f.getParent());
            System.out.println("Delete Successfully = " + f.delete());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
