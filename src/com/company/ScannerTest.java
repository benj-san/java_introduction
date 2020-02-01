package com.company;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        int life = 10;
        int max_life = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select a hero name :");
        String name = sc.nextLine();
        System.out.println("Your hero name is : " + name + " Your life points are at the maximum, " + life + "/" + max_life + " , feel so fresh!");
        System.out.println("You're front of a long corridor, at the end of this long lane two ways are opening to your journey which one do you choose? left or right ?");
        String direction = sc.nextLine();
        switch(direction){
            case "left" :
                System.out.println("Unlucky you! you just fell in a dark void.... now you're in 2020 in the middle of the white house, you have to put up with Trump, the coronavirus and even worst... your snapchat account... This world is too much for your knight brain, you die instantly...");
                System.out.println("Game over!");
            break;
            case "right" :
                System.out.println("You got the good decision, you're getting out this cave... alive!");
                System.out.println("But Suddenly a Dragon just step front of your iron helmet, adventure is not done yet, what are you doing?");
                System.out.println("attack");
                System.out.println("runaway");
                String action = sc.nextLine();
                switch(action){
                    case "runaway" :
                        System.out.println("The legendary coward sleeping inside your heart wakes up,");
                        System.out.println("You decide to run, run, run as fast as you can to escape this gigantic (but so ugly) Dragon...");
                        System.out.println("In vain... you die... you die bro'.... that's what coward get in most case.... I mean... Common... you should have known");
                        System.out.println("GAME OVER");
                        break;
                    case"attack" :
                        System.out.println("You attack the Dragon makin'him loose 5 LP out of 10.000");
                        while (life > 0){
                        System.out.println("Draggy attacks you and rip away 2 life points out of your" + max_life);
                        life -= 2;
                        System.out.println(life + " / " + max_life + " LP remaining");
                        System.out.println("Aouch, it hurts but still you can survive");
                        }
                        System.out.println("well.... In fact no, your arms and legs are missing from your body, you realize that those parts were quite important in the end...");
                        System.out.println("You're ridiculously giving up, your head is cracking under draggy's tooth");
                        System.out.println("GAME OVER");
                        break;
                    case"fus ro dah":
                        System.out.println("LOUDER mate! the dragon did not even heard ya! but he actually saw your stoopid opened mouth...");
                        System.out.println("and took this oportunity to stick his sharpened toe inside it... you dead mate...");
                        System.out.println("GAME OVER");
                        break;
                    case"FUS RO DAH!":
                        System.out.println("YOU DID IT MATE! The dragon is now dead, and you find now an ocean of treasure behind its body");
                        System.out.println("You can now benefit of all of it, you see treasure safes over there, hydromel containers and distressed maids over here");
                        System.out.println("And as a good barbarian you dispossess'em respectively from their gold, their liquid... and at least one reason of their distress");
                        System.out.println("YOU HERO !");
                        break;
                    default:
                        System.out.println("You panic mate, you don't even know what to do, you got 2 arms, 2 legs... well now only one remaining, the impact also taken you off the ground");
                        System.out.println("You've just been dumped off like a vulgar SQL script, your head is inside your ass preventing any distress cry to spread, you regret this hot chili sauce you experienced last night");
                        System.out.println("Eventually death is now the best gift life could offer you...");
                        System.out.println("GAME OVER");
                        break;
                }
                break;
            default:
                System.out.println("Common! You had two choices! why did you crushed your head against this pike! you did not even succeed to kill yourself, now you are slowly dying, with this long and hurting sharped bone inside your brain... how lovely!");
        }
    }
}
