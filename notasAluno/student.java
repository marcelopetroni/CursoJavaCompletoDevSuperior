public class student {
    public double grade1;
    public double grade2;
    public double grade3;

    public String result() {
        double media = grade1 + grade2 + grade3;
        if(media < 60) {
            media = 60 - media;
            return "Failed.\nMissing " + media + " points.";
        }
        else {
            return "Passed.";
        }
    }
}
