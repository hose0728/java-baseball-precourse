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

    public static String getInput() {
        System.out.print("숫자를 입력해주세요 : ");
        return readLine();
    }

    public static void checkInput(String input) {
        if (checkLength(input) || checkDigit(input)) {
            throw new IllegalArgumentException("입력값이 유효하지 않습니다.");
        }
    }

    private static boolean checkLength(String input) {
        return input.length() != 3;
    }

    private static boolean checkDigit(String input) {
        for (int i = 0; i < 3; i++) {
            char now = input.charAt(i);
            if (!Character.isDigit(now) || Character.getNumericValue(now) <= 0) {
                return true;
            }
        }
        return false;
    }
}
