import java.io.File;

public class Main {

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();
        Logger logger = new Logger();
        Logger newFiles = new Logger();
        Logger newFolder = new Logger();


        File src = new File("c://Games/src");
        newFolder.createFolder(src, log);

        File res = new File("c://Games/res");
        newFolder.createFolder(res, log);

        File savegames = new File("c://Games/savegames");
        newFolder.createFolder(savegames, log);

        File temp = new File("c://Games/temp");
        newFolder.createFolder(temp, log);

        File main = new File("c://Games/src/main");
        newFolder.createFolder(main, log);

        File test = new File("c://Games/src/test");
        newFolder.createFolder(test, log);

        File drawables = new File("c://Games/res/drawables");
        newFolder.createFolder(drawables, log);

        File vectors = new File("c://Games/res/vectors");
        newFolder.createFolder(vectors, log);

        File icons = new File("c://Games/res/icons");
        newFolder.createFolder(icons, log);

        File mainFiles = new File(main, "Main.java");
        newFiles.createFiles(mainFiles, log);

        File utilsFiles = new File(main, "Utils.java");
        newFiles.createFiles(utilsFiles, log);

        File tempFiles = new File(temp, "temp.txt");
        newFiles.createFiles(tempFiles, log);
        logger.loggerWrite(tempFiles,log);
    }
}

