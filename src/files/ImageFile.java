package files;

public class ImageFile extends MyFile implements FileOperation {
    public ImageFile(String fileName, double fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public void open() {
        System.out.println("Open Image File " + fileName + " with size " + fileSize);
    }

    @Override
    public void close() {
        System.out.println("close Image File " + fileName + " with size " + fileSize);

    }

    @Override
    public void read() {
        System.out.println("read Image File " + fileName + " with size " + fileSize);

    }

    @Override
    public void write() {
        System.out.println("write Image File " + fileName + " with size " + fileSize);

    }
}
