package day08_terneries_switch;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 3;
        String location = "Unkonw";
        int numOfGroup = 0;
        String teacher = "Unknown";

        if ( grade >= 1 && grade <= 6){

            if (grade == 1){
                location = "Aplle orchard";
                numOfGroup = 3;
                teacher = "Me. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numOfGroup = 7;
                teacher = "Ms. lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numOfGroup = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numOfGroup = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numOfGroup = 5;
                teacher = "Ms. Lela";
            } else if (grade == 6) {
                location = "Six flags";
                numOfGroup = 8;
                teacher = "Mr. Watt";
            }
        }

        System.out.println("Location - "+ location);
        System.out.println("Number of groups - "+ numOfGroup);
        System.out.println("Name of teacher - "+teacher);


    }
}
/*
	 2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown
 */