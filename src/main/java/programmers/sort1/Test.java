
import java.util.*;

class Test {
    public int[] solution(String s) {
        Map<Integer, List<Integer>> setMap = getSetMap(s);

        int[] answer = new int[setMap.size()];

        System.out.println(setMap.size());
        int answerIndex = 0;
        for (int i = 0; i < setMap.size(); i++) {
            List<Integer> set = setMap.get(i + 1);

            for (int j = 0; j < answerIndex; j++) {
                int finalJ = j;
                set.removeIf(number -> number == answer[finalJ]);
            }

            answer[answerIndex++] = set.get(0);

        }


        return answer;
    }

    public Map<Integer, List<Integer>> getSetMap(String s) {
        s = s.substring(1, s.length() - 1);
        String[] strWithOutRightBrackets = s.split("}");
        Map<Integer, List<Integer>> setMap = new HashMap<>();
        int[][] sets = new int[strWithOutRightBrackets.length][strWithOutRightBrackets.length];

        for (int i = 0; i < strWithOutRightBrackets.length; i++) {
            int setIndex = 0;
            strWithOutRightBrackets[i] = strWithOutRightBrackets[i].replace("{", "").replace(" ", "");

            for (String numberStr : strWithOutRightBrackets[i].split(",")) {
                if (numberStr.length() < 1) {
                    continue;
                }

                int number = Integer.parseInt(numberStr);
                sets[i][setIndex++] = number;
            }
        }

        for (int[] set : sets) {
            List<Integer> setList = new ArrayList<>();

            int length = 0;
            for (int number : set) {
                if (number == 0) {
                    break;
                }

                setList.add(number);
                length++;
            }

            setMap.put(length, setList);
        }


        return setMap;
    }

    public static void main(String[] args) {
        Test test = new Test();
        String[] datas = {
                "{{2},{2,1},{2,1,3},{2,1,3,4}}",
                "{{1,2,3},{2,1},{1,2,4,3},{2}}",
                "{{20,111},{111}}",
                "{{123}}",
                "{{4,2,3},{3},{2,3,4,1},{2,3}}"};
        for (String data : datas) {
            System.out.println(data);
            test.solution(data);

        }
    }
}