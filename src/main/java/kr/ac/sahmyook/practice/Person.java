package kr.ac.sahmyook.practice;

import java.util.Scanner;

public class Person {

    private boolean isGrow;
    Plant plant1 = new Plant();

    public void sowSeed() {
        if(isGrow){
            System.out.println("이미 키우는 식물이 있어 새로운 씨를 심을 수 없어요");
        } else {
            this.isGrow = true;                                     //키우고 있는지에 대한 상태 변경

            Scanner sc = new Scanner(System.in);

            System.out.print("당신이 심을 식물의 종을 입력하세요. : ");
            plant1.setSpecies(sc.nextLine());                       //식물의 종 입력

            System.out.print("당신의 식물의 이름을 입력하세요. : ");
            plant1.setName((sc.nextLine()));                        //식물의 이름 입력

            System.out.println("씨 심기에 성공하였습니다.");
        }

    }

    public void infoPlants() {
    }

    public void giveWater() {
    }

    public void giveCompost() {
    }

    public void harvest() {
    }
}
