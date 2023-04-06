package filemanager.hillel;

import java.util.*;

public class FileNavigator {

    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(String path, FileData file) {
        if (path.equals(file.getPath())) {
            List<FileData> fileList = fileMap.get(path);
            if (fileList == null) {

                fileList = new ArrayList<>();
                fileMap.put(path, fileList);
            }
            fileList.add(file);
        } else {
            throw new RuntimeException("Different path: " + path +" "+file.getPath());
        }


    }

    public List<FileData> find(String path) {
        List<FileData> fileList = fileMap.get(path);
        if (fileList == null) {
            System.out.println("No files found at path " + path);
            return Collections.emptyList();
        }
        return fileList;
    }

    public List<FileData> filterBySize(String path, int maxSize) {
        List<FileData> fileList = fileMap.get(path);
        List<FileData> filteredList = new ArrayList<>();
        for (FileData file : fileList) {
            if (file.getSize() <= maxSize) {
                filteredList.add(file);
            }
        }
        return filteredList;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> fileList = new ArrayList<>();
        for (List<FileData> pathList : fileMap.values()) {

            fileList.addAll(pathList);
        }
        Collections.sort(fileList, new Comparator<FileData>() {

            public int compare(FileData f1, FileData f2) {
                return Integer.compare(f1.getSize(), f2.getSize());
            }
        });
        return fileList;
    }
}
