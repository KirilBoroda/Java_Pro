package fileLoger.hillel;

class FileMaxSizeReachedException extends Exception {
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}