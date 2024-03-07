package Person;

import java.util.ArrayList;
public class Person {
    private ArrayList<Problem> problems = new ArrayList<>();

    public void addProblem(Problem problem) {
        problems.add(problem);

    }

    public ArrayList<Problem> getProblem() {

        return problems;
    }

    public void solvedProblem(Problem problem) {
        problems.remove(problem);

    }
    
}