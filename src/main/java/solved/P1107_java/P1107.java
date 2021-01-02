package solved.P1107_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch = 100;

        // 원하는 채널 (0 ≤ N ≤ 500,000)
        String N = br.readLine();
        int intN = Integer.parseInt(N);

        int justPush;
        if (intN >= ch)
            justPush = intN - ch;
        else
            justPush = ch - intN;

        // 고장난 리모큰 버튼 갯수
        int M = Integer.parseInt(br.readLine());
        if (M == 10) {
            System.out.println(justPush);
            return;
        } else if (M == 0) {
            int answer;
            answer = N.length();
            if (answer < justPush)
                System.out.println(answer);
            else
                System.out.println(justPush);
        } else {

            String[] brokenButtonString = br.readLine().split(" ");
            char[] brokenButton = new char[M];

            for (int i = 0; i < M; i++) {
                brokenButton[i] = brokenButtonString[i].toCharArray()[0];
            }

            // System.out.println("N : " + N);
            // System.out.println("M : " + M);
            // for (String string : brokenButtonString) {
            // System.out.print(string + " ");
            // }
            // System.out.println();

            String checkUpString = N;
            String checkDownString = N;

            int checkUpInteger = intN;
            int checkDownInteger = intN;

            int pushCheck = 0;

            boolean checkUpFlag = true;
            boolean checkDownFlag = true;

            while (true) {
                checkUpFlag = true;
                checkDownFlag = true;

                for (int i = 0; i < checkUpString.length(); i++) {
                    for (int j = 0; j < M; j++) {
                        // System.out.println("up check [" + checkUpString.charAt(i) + "] == [" +
                        // brokenButtonString[j] + "]");
                        if (checkUpString.charAt(i) == brokenButton[j]) {

                            checkUpFlag = false;
                            break;
                        }

                    }

                    if (!checkUpFlag)
                        break;
                }

                for (int i = 0; i < checkDownString.length(); i++) {
                    for (int j = 0; j < M; j++) {
                        if (checkDownString.charAt(i) == brokenButton[j]) {
                            checkDownFlag = false;
                            break;
                        }

                    }

                    if (!checkDownFlag)
                        break;
                }

                // System.out.println(checkUpFlag);
                // System.out.println(checkDownFlag);
                if (checkUpFlag || checkDownFlag)
                    break;

                checkUpInteger++;
                
                checkDownInteger--;
                checkUpString = String.valueOf(checkUpInteger);
                checkDownString = String.valueOf(checkDownInteger);
                pushCheck++;

            }
            int upPushCount = (pushCheck + checkUpString.length());
            int downPushCount = (pushCheck + checkDownString.length());

            int answer;

            if(checkUpFlag && checkDownFlag) {
                answer = upPushCount < downPushCount ? upPushCount : downPushCount;
            } else if (checkUpFlag) {
                answer = upPushCount;
            } else {
                answer = downPushCount;
            }
                

            // System.out.println(checkUpString);
            // System.out.println(checkDownString);

            if (answer < justPush)
                System.out.println(answer);
            else
                System.out.println(justPush);

        }
    }

}