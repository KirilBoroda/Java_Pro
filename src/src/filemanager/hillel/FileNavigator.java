package filemanager.hillel;

import java.io.FileNotFoundException;
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
            throw new RuntimeException("Different path: " + path + " " + file.getPath());
        }
    }

    public List<FileData> find(String path) {
        List<FileData> fileList = fileMap.get(path);
        return fileList;
    }

    public List<FileData> filterBySize(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize must be greater than zero");
        }
        List<FileData> filteredList = new ArrayList<>();
        for (List<FileData> pathList : fileMap.values()) {
            for (FileData file : pathList) {
                if (file.getSize() <= maxSize) {
                    filteredList.add(file);
                }
            }
        }
        return filteredList;
    }


    public void remove(String path) {
        fileMap.remove(path);
    }

    public Map<String, List<FileData>> sortBySize() {
        for (List<FileData> fileList : fileMap.values()) {
            if (fileList != null) {
                fileList.sort(Comparator.comparingInt(FileData::getSize));
            }
        }
        return fileMap;
    }

}
