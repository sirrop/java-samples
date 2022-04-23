/*
 * Copyright 2022-2022 shiro
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package blog.shiro_tech.java_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int times = 0;
        do {
            System.out.print("数字を入力してください > ");
            try {
                times = s.nextInt();
            } catch (InputMismatchException ignored) {
            }
            if (times <= 0) {
                System.out.println("0以上の数字を入力してください");
            }
        } while (times <= 0);

        for (int i = 0; i < times; i++) {
            System.out.println("こんにちは");
        }
    }
}
