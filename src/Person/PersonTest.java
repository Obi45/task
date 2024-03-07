package Person;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class PersonTest{
    @Test
    public void testThatProblemCanBeAddedToAPerson(){
        Person myPerson = new Person();
        Problem problemType = new Problem("houseRent", Types.FINANCIAL);
        myPerson.addProblem(problemType);
        assertEquals(1,myPerson.getProblem().size());
    }
    @Test
    public void testThatProblemCanBeSolved(){
        Person myPerson = new Person();
        Problem problemType = new Problem("houseRent", Types.FINANCIAL);
        myPerson.solvedProblem(problemType);
        assertEquals(0, myPerson.getProblem().size());

    }
   @Test
    public void testThatProblemLeftCanBeRecountedAfterBeingSolved(){
       Person myPerson = new Person();
       Problem problemType = new Problem("houseRent", Types.FINANCIAL);
       myPerson.addProblem(problemType);
       Problem problemType1 = new Problem("failure", Types.EDUCATION);
       myPerson.addProblem(problemType1);
       Problem problemType2 = new Problem("attack", Types.SPIRITUAL);
       myPerson.addProblem(problemType2);
       assertEquals(3, myPerson.getProblem().size());

       myPerson.solvedProblem(problemType);

       myPerson.solvedProblem(problemType1);
       assertEquals(1, myPerson.getProblem().size());
   }

}
