package chapter_4;

import java.time.LocalDate;

public class FinalFieldTest {
    private  final StringBuilder evaluations;
    FinalFieldTest() {
        evaluations = new StringBuilder();
    }
    public void giveGoldStar() {
        evaluations.append(LocalDate.now() + ":Gold Star!\n");
    }
    public static void main(String[] args) {
        FinalFieldTest finalFieldTest = new FinalFieldTest();
        System.out.println(finalFieldTest.evaluations);
        finalFieldTest.giveGoldStar();
        System.out.println(finalFieldTest.evaluations);


    }
}
