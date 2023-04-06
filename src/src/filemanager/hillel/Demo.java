package filemanager.hillel;

public class Demo {
    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();


        navigator.add("/path/to/files1", new FileData("file1.txt", 5000, "/path/to/files1"));
        navigator.add("/path/to/files1", new FileData("file2.txt", 2048, "/path/to/files1"));
        navigator.add("/path/to/files2", new FileData("file3.txt", 3072, "/path/to/files2"));


        System.out.println(navigator.find("/path/to/files1"));

        System.out.println(navigator.filterBySize("/path/to/files1", 2321));

    }
}
