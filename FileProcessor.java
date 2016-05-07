import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastian Matthias Müller
 * Date: 2/20/14
 * Time: 9:00 PM
 * Plansysteme GmbH, OSZ IMT MTS 31
 */
public class FileProcessor {
    public ArrayList<Triangle> ReadFile(String filename) {
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        String regEx = ".+<(\\S+),(\\S+),(\\S+)>,<(\\S+),(\\S+),(\\S+)>,<(\\S+),(\\S+),(\\S+)>.+";
        Pattern pattern = Pattern.compile(regEx);
        try {
            while ((line = in.readLine()) != null) {
                line = line.replaceAll("\\s", "");
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()) {
                    triangles.add(
                            new Triangle(
                                new Point(
                                        Double.parseDouble(matcher.group(1)),
                                        Double.parseDouble(matcher.group(2)),
                                        Double.parseDouble(matcher.group(3))
                                ),
                                new Point(
                                        Double.parseDouble(matcher.group(4)),
                                        Double.parseDouble(matcher.group(5)),
                                        Double.parseDouble(matcher.group(6))
                                ),
                                new Point(
                                        Double.parseDouble(matcher.group(7)),
                                        Double.parseDouble(matcher.group(8)),
                                        Double.parseDouble(matcher.group(9))
                                )
                            )
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return triangles;
    }
}
