package commonUtils;

import java.util.Random;

public class JavaUtil {

	public int getRandomNumber() {
		Random r = new Random();
		int random = r.nextInt(500);
		return random;
	}
}
