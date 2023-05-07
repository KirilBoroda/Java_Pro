package filemanager.hillel;

import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();


        navigator.add("/path/to/files1", new FileData("file1.txt", 5000, "/path/to/files1"));
        navigator.add("/path/to/files1", new FileData("file2.txt", 2048, "/path/to/files1"));
        navigator.add("/path/to/files2", new FileData("file3.txt", 72, "/path/to/files2"));
        navigator.add("/path/to/files2", new FileData("file5.txt", 2072, "/path/to/files2"));
        navigator.add("/path/to/files2", new FileData("file6.txt", 1072, "/path/to/files2"));
        navigator.add("/path/to/files2", new FileData("file7.txt", 9072, "/path/to/files2"));


        System.out.println(navigator.find("/path/to/files1"));

        System.out.println(navigator.filterBySize(23210));
        System.out.println(navigator.sortBySize());

    }
}
