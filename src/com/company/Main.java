package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] Rosomaha = {new Magic(50000,
                1000000, " Regeneration ",
                " Wolverine "),
                new Warrior(2000, 400,
                        " Card fire ", " Gambit "),
                new Medic(450, 586,
                        " Heal ", " Storm ")};

        String[] massiv = {" Power blade "," Besstrashnyi ", " Kindly "};

        for (int i = 0; i < Rosomaha.length; i++) {
            Rosomaha[i].SuperAbility(
                    massiv[i]);
        }
    }
}
