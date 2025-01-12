package FileFolderProblem;

public class Main {

    // A folder can contain files or other folders
    // and we can perform operations like displaying their structure or calculating the total size.
    public static void main(String[] args) {

        // Create files
        File file1 = new File("Document.txt");
        File file2 = new File("Image.png");
        File file3 = new File("Video.mp4");

        // Create folders
        Folder rootFolder = new Folder("Root");
        Folder subFolder1 = new Folder("SubFolder1");
        Folder subFolder2 = new Folder("SubFolder2");

        rootFolder.add(file1);
        subFolder1.add(file2);
        subFolder2.add(file3);
        rootFolder.add(subFolder1);
        rootFolder.add(subFolder2);

        rootFolder.showDetails();

    }
}