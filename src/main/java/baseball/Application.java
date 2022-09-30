package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

    }

    public static String getRandomNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 3; index++) {
            stringBuilder.append(pickNumberInRange(1, 9));
        }
        return stringBuilder.toString();
    }
}
