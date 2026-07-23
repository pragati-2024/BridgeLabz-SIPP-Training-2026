import java.util.ArrayList;

public class EmployeeSkillAssignment {

    public static void findTeams(
            int[] skills,
            int target,
            int index,
            ArrayList<Integer> team,
            int currentSum) {

        if (currentSum == target) {

            System.out.println(team);
            return;
        }

        if (index == skills.length
                || currentSum > target) {
            return;
        }

        team.add(skills[index]);

        findTeams(
                skills,
                target,
                index + 1,
                team,
                currentSum + skills[index]);

        team.remove(team.size() - 1);

        findTeams(
                skills,
                target,
                index + 1,
                team,
                currentSum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};

        int target = 10;

        findTeams(
                skills,
                target,
                0,
                new ArrayList<>(),
                0);
    }
}