package auxiliar;

import java.io.File;
import java.io.IOException;

public class Utils {

    private Utils(){}

    private static Utils instance;

    public static Utils getInstance() {
        if(instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    /**
     *
     * @param root
     * @return String app path
     */
    public String getAppPath(String root) {

        String result = null;

        try {
            String path = new File(root + "/").getCanonicalPath();
            result = path;
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return result;
    }

}
