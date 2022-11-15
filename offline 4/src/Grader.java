public class Grader {
    public char determiningGradeForThreeCredits(String marks)
    {
        try{
        Double totalMarks= Double.parseDouble(marks);

         if(totalMarks<0)
            throw new IllegalArgumentException("Marks can't be negative");
        else {
            Double ceilMarks = Math.ceil(totalMarks);

            if (ceilMarks < 180.00)
                return 'F';
            else if (ceilMarks < 210.00)
                return 'C';
            else if (ceilMarks < 240.00)
                return 'B';
            else if(ceilMarks> 300.00)
                throw new IllegalArgumentException("Marks can't be more than 300 in three credit");
                else return 'A';

        }}
        catch(Exception e)
        {
            throw new NumberFormatException("Not a number");
        }
    }
    public char determiningGradeForFourCredits(String marks) {
        try {
            Double totalMarks = Double.parseDouble(marks);
            if (totalMarks < 0)
                throw new IllegalArgumentException("Marks can't be negative");
            else {
                Double ceilMarks = Math.ceil(totalMarks);

                if (ceilMarks < 240.00)
                    return 'F';
                else if (ceilMarks < 280.00)
                    return 'C';
                else if (ceilMarks < 320.00)
                    return 'B';
                else if (ceilMarks > 400.00)
                    throw new IllegalArgumentException("Marks can't be more than 400 in four credit");
                else return 'A';

            }

        }

        catch(Exception e)
        {
            throw new NumberFormatException("Not a number");
        }
    }


}
