package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat catGrandDad = new Cat(grandDadName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandDad, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandDad);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
            private String name;
            private Cat parentM;
            private Cat parentW;

            Cat(String name)
            {
                this.name = name;
            }

            Cat(String name, Cat parentM, Cat parentW)
            {
                this.name = name;
                this.parentM = parentM;
                this.parentW = parentW;
            }


            @Override
            public String toString()
            {
                if (parentM == null & parentW == null)
                    return "The cat's name is " + name + ", no mother " + ", no father";
                else
                if (parentM != null & parentW == null)
                    return "The cat's name is " + name + ", no mother, " + "father is " + parentM.name;
                else
                if (parentW != null & parentM == null)
                    return "The cat's name is " + name + ", mother is " + parentW.name + ", no father";
                else
                    return "The cat's name is " + name + ", mother is " + parentW.name + ", father is " + parentM.name;
            }
    }

}
