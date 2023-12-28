import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();
        Logger logger = new Logger();

        List<String> directories = List.of("c://Games/src", "c://Games/res", "c://Games/savegames", "c://Games/temp",
                "c://Games/src/main", "c://Games/src/test", "c://Games/res/drawables", "c://Games/res/vectors", "c://Games/res/icons");

        List<String> files = List.of("c://Games/src/main/Main.java", "c://Games/src/main/Utils.java", "c://Games/temp/temp.txt");
        log.append("------------------------------------------------------------ \n");

        for (String dir : directories) {
            createFolder(new File(dir), log);
        }

        for (String file : files) {
            File newFile = new File(file);
            createFiles(newFile, log);
            logger.loggerWrite(newFile, log);
        }
    }

    static SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public static void createFiles(File nameFiles, StringBuilder log) {
        try {
            if (nameFiles.createNewFile()) {
                log.append(date.format(new Date()) + " создан файл " + nameFiles.getName() + "\n");
            } else {
                log.append(date.format(new Date()) + " ошибка создания файла!!! " + nameFiles.getName() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createFolder(File nameFolder, StringBuilder log) {
        if (nameFolder.mkdir()) {
            log.append(date.format(new Date()) + " создан каталог " + nameFolder.getName() + "\n");
        } else {
            log.append(date.format(new Date()) + " ошибка создания каталога!!! " + nameFolder.getName() + "\n");
        }
    }
}

