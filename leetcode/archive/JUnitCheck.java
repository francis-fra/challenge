
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import org.junit.runner.JUnitCore;

public class JUnitCheck {

    public static void main(String[] argv) throws Exception {
        System.out.println(new File(JUnitCore.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath());
    }
}