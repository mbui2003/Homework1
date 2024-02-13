import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<Folder> subfolders;
    private ArrayList<File> files;

    public Folder(String folderName) {
        this.folderName = folderName;
        subfolders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public ArrayList<Folder> getSubfolders() {
        return subfolders;
    }

    public void addSubfolder(Folder subfolder) {
        subfolders.add(subfolder);
    }

    public void removeSubfolder(Folder subfolder) {
        // Remove all files in the subfolder
        for (File file : subfolder.getFiles()) {
            subfolder.removeFile(file);
        }
        // Recursively remove all subfolders and their contents
        for (Folder nestedSubfolder : subfolder.getSubfolders()) {
            removeSubfolder(nestedSubfolder);
        }
        subfolders.remove(subfolder);
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public void print(int level) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indentation.append("\t");
        }
        System.out.println(indentation.toString() + "Folder: " + getFolderName());
        for (Folder subfolder : subfolders) {
            subfolder.print(level + 1);
        }
        for (File file : files) {
            file.print(level + 1);
        }
    }
}
