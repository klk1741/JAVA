package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("q")) {
                    break;
                }
                writer.write(input);
                writer.newLine(); // 다음 줄로 넘어가기 위해 개행 문자 추가
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}