package beginner;

public class FinalPracticeApp {
    public static void main(String[] args) {
        String name = "Michael Fassbender";
        int yearOfBirth = 1977;
        int currentYear = 2023;

        System.out.println("Name: " + name + " \nAge: " + (currentYear - yearOfBirth));

        String[] movieTitles = {"Shame", "Prometheus", "X-Men: First Class"};
        double[] movieRatings = {7.2, 7.0, 4.7};

        System.out.println("Movies: ");
        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println("Title: " + movieTitles[i] + ", Rating: " + getRating(movieRatings[i]));
        }

//        HomeworkPrimitivesAmazon exampleObject = new HomeworkPrimitivesAmazon("wef", 2.5F,10.6F, (short) 90, (byte) 5, 4000);
//        exampleObject.getOpinion((short)80);
    }

    static String getRating (double rating){
        if (rating <= 5.0){
            return "Bad";
        } else if (rating >5.1 && rating <=8.0) {
            return "Good";
        } else {
            return "Excellent";
        }
    }
}
