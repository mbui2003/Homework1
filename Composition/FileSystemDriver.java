public class FileSystemDriver {
    public static void main(String[] args) {
        // Topmost folder
        Folder php_demo1 = new Folder("php_demo1");

        // Subfolders within php_demo1
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        php_demo1.addSubfolder(sourceFiles);
        php_demo1.addSubfolder(includePath);
        php_demo1.addSubfolder(remoteFiles);

        // Subfolders within Source Files
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        sourceFiles.addSubfolder(phalcon);
        sourceFiles.addSubfolder(app);
        sourceFiles.addSubfolder(cache);
        sourceFiles.addSubfolder(publicFolder);

        // Files within Source Files
        File htAccess = new File(".htaccess");
        File htRouterPhp = new File(".htrouter.php");
        File indexHtml = new File("index.html");

        sourceFiles.addFile(htAccess);
        sourceFiles.addFile(htRouterPhp);
        sourceFiles.addFile(indexHtml);

        // Subfolders within app
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        app.addSubfolder(config);
        app.addSubfolder(controllers);
        app.addSubfolder(library);
        app.addSubfolder(migrations);
        app.addSubfolder(models);
        app.addSubfolder(views);

        System.out.println("Original File System Structure:");
        php_demo1.print(0);

        sourceFiles.removeSubfolder(app);
        System.out.println("File System Structure After Deleting app Folder");
        php_demo1.print(0);

        sourceFiles.removeSubfolder(publicFolder);
        System.out.println("File System Structure After Deleting app Folder and public Folder");
        php_demo1.print(0);
    }
}
