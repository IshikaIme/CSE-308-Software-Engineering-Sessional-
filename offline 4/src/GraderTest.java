import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class GraderTest {

    //test for three credit negative marks
    @Test
    void negativeShouldReturnIllegalThree()
    {
        var threeCreditGrader= new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                threeCreditGrader.determiningGradeForThreeCredits("-1");
                }
        );
    }
    //test for four credit negative marks
    @Test
    void negativeShouldReturnIllegalFour()
    {
        var fourCreditGrader= new Grader();

        assertThrows(IllegalArgumentException.class,
                ()->{
                    fourCreditGrader.determiningGradeForFourCredits("-1");
                }
        );

    }

    //Test for non numeric in threecredit
    @Test
    void nonNumShouldReturnIllegalThree()
    {
        var threeCreditGrader= new Grader();
        assertThrows(NumberFormatException.class,
                ()->{
                    threeCreditGrader.determiningGradeForThreeCredits("a");
                }
        );
    }

    @Test
    void nonNumShouldReturnIllegalThree2()
    {
        var threeCreditGrader= new Grader();
        assertThrows(NumberFormatException.class,
                ()->{
                    threeCreditGrader.determiningGradeForThreeCredits("#");
                }
        );
    }

    @Test
    void nonNumShouldReturnIllegalThree3()
    {
        var threeCreditGrader= new Grader();
        assertThrows(NumberFormatException.class,
                ()->{
                    threeCreditGrader.determiningGradeForThreeCredits("+");
                }
        );
    }

    //Test for non numeric in fourcredit
    @Test
    void nonNumShouldReturnIllegalFour()
    {
        var FourCreditGrader= new Grader();
        assertThrows(NumberFormatException.class,
                ()->{
                    FourCreditGrader.determiningGradeForFourCredits("A");
                }
        );
    }

    @Test
    void nonNumShouldReturnIllegalFour2()
    {
        var FourCreditGrader= new Grader();
        assertThrows(NumberFormatException.class,
                ()->{
                    FourCreditGrader.determiningGradeForFourCredits("+");
                }
        );
    }

    @Test
    void nonNumShouldReturnIllegalFour3()
    {
        var FourCreditGrader= new Grader();
        assertThrows(NumberFormatException.class,
                ()->{
                    FourCreditGrader.determiningGradeForFourCredits("%");
                }
        );
    }


    //test for more than 300 marks in three credit
    @Test
    void ThreeHundredCantExceedInCreditThree()
    {
        var threeCreditGrader= new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    threeCreditGrader.determiningGradeForThreeCredits("300.01");
                }
        );
    }
    @Test
    void ThreeHundredCantExceedInCreditThree2()
    {
        var threeCreditGrader= new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    threeCreditGrader.determiningGradeForThreeCredits("400");
                }
        );
    }

    //test for more than 400 marks in four credit
    @Test
    void FourHundredCantExceedInCreditFour()
    {
        var fourCreditGrader= new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    fourCreditGrader.determiningGradeForFourCredits("400.01");
                }
        );
    }

    @Test
    void FourHundredCantExceedInCreditFour2()
    {
        var fourCreditGrader= new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    fourCreditGrader.determiningGradeForFourCredits("500");
                }
        );
    }






    //test for three credit A

    @Test
    void TwoHundredNinetyNineBoundaryIsAnAInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('A', threeCreditGrader.determiningGradeForThreeCredits("239.99"));
    }
    @Test
    void TwoFortyIsAnAInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('A', threeCreditGrader.determiningGradeForThreeCredits("240"));
    }


    @Test
    void TwoSixtyIsAnAInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('A', threeCreditGrader.determiningGradeForThreeCredits("260"));
    }


    @Test
    void TwoEightyIsAnAInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('A', threeCreditGrader.determiningGradeForThreeCredits("280"));
    }


    @Test
    void ThreeHundredIsAnAInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('A', threeCreditGrader.determiningGradeForThreeCredits("300"));
    }


    //test for three credit B

    @Test
    void TwoNineBoundaryIsBInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('B', threeCreditGrader.determiningGradeForThreeCredits("209.99"));
    }

    @Test
    void TwoTenIsABInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('B', threeCreditGrader.determiningGradeForThreeCredits("210"));
    }
    @Test
    void TwoFifteenIsABInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('B', threeCreditGrader.determiningGradeForThreeCredits("215"));
    }


    @Test
    void TwoTwentyIsABInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('B', threeCreditGrader.determiningGradeForThreeCredits("220"));
    }
    @Test
    void TwoThirtyIsABInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('B', threeCreditGrader.determiningGradeForThreeCredits("230"));
    }




    //test for three credit C

    @Test
    void OneSeventyNineBoundaryIsCInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('C', threeCreditGrader.determiningGradeForThreeCredits("179.99"));
    }

    @Test
    void OneEIghtyIsCInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('C', threeCreditGrader.determiningGradeForThreeCredits("180"));
    }
    @Test
    void OneNintetyTwoIsCInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('C', threeCreditGrader.determiningGradeForThreeCredits("192"));
    }


    @Test
    void TwoHundredIsCInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('C', threeCreditGrader.determiningGradeForThreeCredits("200"));
    }
    @Test
    void TwoHundredNineCInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('C', threeCreditGrader.determiningGradeForThreeCredits("209"));
    }



    //test for three credit F

    @Test
    void ZeroIsFInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('F', threeCreditGrader.determiningGradeForThreeCredits("0"));
    }

    @Test
    void FiftyIsFInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('F', threeCreditGrader.determiningGradeForThreeCredits("50"));
    }

    @Test
    void NintetyTwoIsFInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('F', threeCreditGrader.determiningGradeForThreeCredits("92"));
    }


    @Test
    void OneHundredFiftyIsFInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('F', threeCreditGrader.determiningGradeForThreeCredits("150"));
    }


    @Test
    void OneHundredSeventyNineIsCInThreeCredit()
    {
        var threeCreditGrader= new Grader();
        assertEquals('F', threeCreditGrader.determiningGradeForThreeCredits("179"));
    }








    //test for four credit A

    @Test
    void ThreeNineteenBoundaryIsAnAInFourCredit()
    {
        var FourCreditGrader= new Grader();
        assertEquals('A', FourCreditGrader.determiningGradeForFourCredits("319.99"));
    }
    @Test
    void ThreeTwentyIsAnAInFourCredit()
    {
        var FourCreditGrader= new Grader();
        assertEquals('A', FourCreditGrader.determiningGradeForFourCredits("320"));
    }


    @Test
    void ThreeFortyIsAnAInFourCredit()
    {
        var FourCreditGrader= new Grader();
        assertEquals('A', FourCreditGrader.determiningGradeForFourCredits("340"));
    }


    @Test
    void ThreeFiftyIsAnAInFourCredit()
    {
        var FourCreditGrader= new Grader();
        assertEquals('A', FourCreditGrader.determiningGradeForFourCredits("350"));
    }

    @Test
    void ThreeEightyIsAnAInFourCredit()
    {
        var FourCreditGrader= new Grader();
        assertEquals('A', FourCreditGrader.determiningGradeForFourCredits("380"));
    }
    @Test
    void FourHundredIsAnAInFourCredit()
    {
        var FourCreditGrader= new Grader();
        assertEquals('A', FourCreditGrader.determiningGradeForFourCredits("400"));
    }


    //test for four credit B

    @Test
    void TwoSeventyNineBoundaryIsABInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('B', fourCreditGrader.determiningGradeForFourCredits("279.99"));
    }
    @Test
    void TwoEightyIsABInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('B', fourCreditGrader.determiningGradeForFourCredits("280"));
    }
    @Test
    void TwoNintyIsABInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('B', fourCreditGrader.determiningGradeForFourCredits("290"));
    }


    @Test
    void ThreeHundredIsABInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('B', fourCreditGrader.determiningGradeForFourCredits("300"));
    }
    @Test
    void ThreeNinteenIsABInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('B', fourCreditGrader.determiningGradeForFourCredits("319"));
    }





    //test for four credit C
    @Test
    void TwoThirtyNineBoundaryIsCInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('C', fourCreditGrader.determiningGradeForFourCredits("239.99"));
    }


    @Test
    void TwoFortyIsCInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('C', fourCreditGrader.determiningGradeForFourCredits("240"));
    }
    @Test
    void TwoFiftyIsCInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('C', fourCreditGrader.determiningGradeForFourCredits("250"));
    }


    @Test
    void TwoSeventyIsCInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('C', fourCreditGrader.determiningGradeForFourCredits("270"));
    }

    @Test
    void TwoSeventyNineIsCInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('C', fourCreditGrader.determiningGradeForFourCredits("279"));
    }



    //test for four credit F

    @Test
    void ZeroIsFInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('F', fourCreditGrader.determiningGradeForFourCredits("0"));
    }

    @Test
    void OnehundredIsFInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('F', fourCreditGrader.determiningGradeForFourCredits("100"));
    }

    @Test
    void OnehundredFiftyIsFInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('F', fourCreditGrader.determiningGradeForFourCredits("150"));
    }


    @Test
    void TwohundredIsFInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('F', fourCreditGrader.determiningGradeForFourCredits("200"));
    }


    @Test
    void OnehundredThityNineBoundaryIsFInFourCredit()
    {
        var fourCreditGrader= new Grader();
        assertEquals('F', fourCreditGrader.determiningGradeForFourCredits("239"));
    }



}