package GroupProjectIS147.Print;

public class Main {
    
    //    static String [] pillArray = new String[10];  (maybe global variable for chart )

    public static void main(String[] args) {
        InitialMenu.initialMenu();
        
        ChartPillAmount inputPill = new  ChartPillAmount();     // user pill amount
        inputPill.getPillAmount();

        DisplayMonths monthsInput = new DisplayMonths();    // displays months for user
        monthsInput.monthsOptions();


        StartMonth startMonths = new StartMonth(); // asks user to enter start month
        startMonths.enterMonths();

        EndMonth endMonths = new EndMonth();
        endMonths.askEndMonth();
        endMonths.enterMonths();       // Inherits the swtich, but how to isolate swtich from start month class ?


    }
}
