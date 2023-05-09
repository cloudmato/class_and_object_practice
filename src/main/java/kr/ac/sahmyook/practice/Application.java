package kr.ac.sahmyook.practice;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        int no = -1;

        do {
            System.out.println("============= 식물 키우기 =============");
            System.out.println("1. 씨 뿌리기");
            System.out.println("2. 식물상태 확인하기");
            System.out.println("3. 물 주기");
            System.out.println("4. 비료 주기");
            System.out.println("5. 수확하기");
            System.out.println("0. 종료하기");
            System.out.print("번호를 입력하세요 : ");
            no = sc.nextInt();


            switch (no) {
                case 1 : person.sowSeed(); break;
                case 2 : person.infoPlants(); break;
                case 3 : person.giveWater(); break;
                case 4 : person.giveCompost(); break;
                case 5 : person.harvest(); break;
                case 0 :
                    System.out.println("[알림] : 식물 키우기를 종료합니다.");
                    return;
                default:
                    System.out.println("[알림] : 0~5 사이값만 입력하세요.");
                    System.out.println();
                    break;
            }

        } while (true);
    }
}
