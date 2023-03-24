package fileLoger.hillel;

class FileLoggerConfiguration {
    private String file;
    private LoggingLevel level;
    private long maxFileSize;
    private String format;

    public FileLoggerConfiguration(String file, LoggingLevel level, long maxFileSize, String format) {
        this.file = file;
        this.level = level;
        this.maxFileSize = maxFileSize;
        this.format = format;
    }

    public String getFile() {
        return file;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public String getFormat() {
        return format;
    }
}
