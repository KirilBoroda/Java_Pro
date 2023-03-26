package fileLoger.hillel;

class FileMaxSizeReachedException extends RuntimeException {
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}