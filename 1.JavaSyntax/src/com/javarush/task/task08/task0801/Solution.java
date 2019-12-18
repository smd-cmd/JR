package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> st = new HashSet<String>();
        st.add("арбуз");
        st.add("банан");
        st.add("вишня");
        st.add("груша");
        st.add("дыня");
        st.add("ежевика");
        st.add("женьшень");
        st.add("земляника");
        st.add("ирис");
        st.add("картофель");

        for (String x : st)
            System.out.println(x);

    }
}
