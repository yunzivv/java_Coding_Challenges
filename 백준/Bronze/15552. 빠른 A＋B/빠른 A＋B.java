import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        // 버퍼는
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 활용한 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 버퍼를 활용한 출력

        // 문자열을 공백 단위로 구분하여 순서대로 호출한다.
        StringTokenizer str;

        // readLine() 메서드는 단 한 줄만 읽을 수 있고 개행문자만을 종료로 인지한다.
        int testcase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testcase; i++) {
            str = new StringTokenizer(bf.readLine());
            bw.write((Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken())) + "\n");
        }
        bw.close();
    }
}