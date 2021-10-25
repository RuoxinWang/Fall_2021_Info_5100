package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Projector proj = Projector.getInstance();
        Projector proj1 = Projector.getInstance();
        proj.name = "Projector in room 1";


        System.out.println(proj1.name);
    }
}
