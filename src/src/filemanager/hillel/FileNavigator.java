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

    public List<FileData> find(String path) throws FileNotFoundException {
        List<FileData> fileList = fileMap.get(path);
        if (fileList == null) {
            throw new FileNotFoundException("No files found at path " + path);
        }
        return fileList;
    }

    public List<FileData> filterBySize(int maxSize) {
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

    public List<FileData> sortBySize() {
        List<FileData> files = new ArrayList<>();
        fileMap.values().forEach(files::addAll);
        files.sort(Comparator.comparingInt(FileData::getSize));
        return files;
    }
}
