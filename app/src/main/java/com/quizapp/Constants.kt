package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Care afirmație este corectă?",
            "o clasă poate implementa mai multe interfețe, însă poate extinde o singură clasă abstractă", "o clasă abstractă are cel puțin o metodă abstractă",
            "membrii unei clase abstracte sunt considerați \\texttt{static final}", "în interfețe și clase abstracte nu pot fi definite metode statice\n", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, " Care variantă reprezintă supraîncărcarea corectă a metodei: String getMessage()",
            "public String getMessage()", "StringBuffer getMessage()",
            "public String getMessage(String from)", "public String getMessage() throws Exception\n", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Care dintre urmatoarele variante nu defineste încapsularea?",
            "expunerea unei interfețe high-level de lucru cu obiectul", "accesul la membri private folosind metode de tip getter și setter",
            "posibilitatea suprascrierii (overriding) metodelor", "construirea de obiecte complexe și ascunderea modului lor de funcționare", 3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Care combinație reprezintă, într-o clasă pe nume Test, o suprascriere, respectiv o supraîncărcare validă (overriding și overloading) pentru metoda equals din java.lang.Object?",
            "public Boolean equals (Object o) \\ protected Integer equals (Object b)", "boolean equals(Object o) \\ public boolean equals(Test t)",
            "public Boolean equals (Object t) \\ public int equals (Object b)", "public boolean equals(Object t) \\ public int equals(Test t)", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Care din următoarele afirmații este adevarată despre clasele interne statice în Java:",
            "Este nevoie de o referință la un obiect din clasa externă pentru a putea instanția un obiect al clasei interne", "Nu are acces la membrii non-statici ai clasei externe",
            "Atributele și metodele conținute de aceasta trebuie să fie statice", "Trebuie neapărat să moștenească clasa externă", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Care declarație este corectă?",
            "List<Integer> list = new List<Integer>();", "ArrayList<Integer> list = new List<Integer>();",
            "ArrayList<Object> list = new ArrayList<Integer>();", "List<Integer> list = new ArrayList<Integer>();", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "5. Care dintre următoarele clase sunt imutabile?",
            "public class Test { private final int x = 3 };", "Object, String",
            "Integer, String", "public final class Test { public int y; Test(int y) { this.y = y;} }", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Care afirmație este falsă?",
            "interfața Comparable<T> conține o metodă int compareTo(T o);", "interfața Comparator<T> conține o metodă int compare(T o1, T o2);",
            "interfața Comparator<T> conține o metodă int compareTo(T o);", "interfața Comparator<T> conține o metodă boolean equals(Object obj) ce face override metodei din Object;", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Ce design pattern ar fi util de folosit în cazul în care avem o colecție de date și dorim să facem o statistică relevantă în funcție de un anumit criteriu?",
            "Visitor", "Command",
            "Factory", "Strategy", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Ce design pattern folosim dacă vrem să simulăm pasarea și procesarea de “pointeri la funcții” încapsulați în obiecte?",
            "Command", "Factory",
            "Singleton", "Observer", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}