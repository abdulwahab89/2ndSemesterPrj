import java.time.LocalDate;
import java.time.Period;
import java.io.*;
public class Transaction {
    final int MONTHS_DAYS = 30, MONTHS = 12;
    private Customer aCustomer;
    private Car aCar;
    private int monthe = 0, days = 0;

    private String CurrentMonth;
    private int CurrentDate, Currentyear;
    private String PickMonth;
    private int PickDate, PickYear;
    private String returnMonth;
    private int returnDate, returnYear;
    private String birthMonth;
    private int birthDate, birthYear, age = 0;

    public Transaction() {
        aCustomer = new Customer();
        aCar = new Car();
        CurrentMonth = "";
        CurrentDate = 0;
        Currentyear = 0;
        PickMonth = "";
        PickDate = 0;
        PickYear = 0;
        returnMonth = "";
        returnDate = 0;
        returnYear = 0;
        birthMonth = "";
        birthDate = 0;
        birthYear = 0;
    }

    public void setTransaction(Customer cU, Car cA, String m, int d, int y, String pM, int pD, int pY, String rM, int rD, int rY, String bM, int bD, int bY) { //constructor
        aCustomer = cU;
        aCar = cA;
        CurrentMonth = m;
        CurrentDate = d;
        Currentyear = y;
        PickMonth = pM;
        PickDate = pD;
        PickYear = pY;
        returnMonth = rM;
        returnDate = rD;
        returnYear = rY;
        birthMonth = bM;
        birthDate = bD;
        birthYear = bY;
    }

    public String getCurrentMonth() {
        return CurrentMonth;
    }

    public int getCurrentDate() {
        return CurrentDate;
    }

    public int getCurrentYear() {
        return Currentyear;
    }
   public int getCurrentMonthValue() {
        if(getCurrentMonth().equals("Jan"))
            monthe = 1;

        else if(getCurrentMonth().equals("Feb"))
            monthe = 2;

        else if(getCurrentMonth().equals("Mar"))
            monthe = 3;

        else if(getCurrentMonth().equals("Apr"))
            monthe = 4;

        else if(getCurrentMonth().equals("May"))
            monthe = 5;

        else if(getCurrentMonth().equals("Jun"))
            monthe = 6;

        else if(getCurrentMonth().equals("Jul"))
            monthe = 7;

        else if(getCurrentMonth().equals("Aug"))
            monthe = 8;

        else if(getCurrentMonth().equals("Sep"))
            monthe = 9;

        else if(getCurrentMonth().equals("Oct"))
            monthe = 10;

        else if(getCurrentMonth().equals("Nov"))
            monthe = 11;

        else if(getCurrentMonth().equals("Dec"))
            monthe = 12;

        return monthe;
    }

    public String getPickMonth() {
        return PickMonth;
    }

    public int  getPickDate() {
        return PickDate;
    }

    public int getPickYear() {
        return PickYear;
    }

    public int getPickMonthValue() {
        if(getPickMonth().equals("Jan"))
            monthe = 1;

        else if(getPickMonth().equals("Feb"))
            monthe = 2;

        else if(getPickMonth().equals("Mar"))
            monthe = 3;

        else if(getPickMonth().equals("Apr"))
            monthe = 4;

        else if(getPickMonth().equals("May"))
            monthe = 5;

        else if(getPickMonth().equals("Jun"))
            monthe = 6;

        else if(getPickMonth().equals("Jul"))
            monthe = 7;

        else if(getPickMonth().equals("Aug"))
            monthe = 8;

        else if(getPickMonth().equals("Sep"))
            monthe = 9;

        else if(getPickMonth().equals("Oct"))
            monthe = 10;

        else if(getPickMonth().equals("Nov"))
            monthe = 11;

        else if(getPickMonth().equals("Dec"))
            monthe = 12;

        return monthe;
    }
    public String getReturnMonth() {
        return returnMonth;
    }

    public int getReturnDate() {
        return returnDate;
    }
    public int getReturnYear() {
        return returnYear;
    }

    public int getReturnMonthValue() {
        if(getReturnMonth().equals("Jan"))
            monthe = 1;

        else if(getReturnMonth().equals("Feb"))
            monthe = 2;

        else if(getReturnMonth().equals("Mar"))
            monthe = 3;

        else if(getReturnMonth().equals("Apr"))
            monthe = 4;

        else if(getReturnMonth().equals("May"))
            monthe = 5;

        else if(getReturnMonth().equals("Jun"))
            monthe = 6;

        else if(getReturnMonth().equals("Jul"))
            monthe = 7;

        else if(getReturnMonth().equals("Aug"))
            monthe = 8;

        else if(getReturnMonth().equals("Sep"))
            monthe = 9;

        else if(getReturnMonth().equals("Oct"))
            monthe = 10;

        else if(getReturnMonth().equals("Nov"))
            monthe = 11;

        else if(getReturnMonth().equals("Dec"))
            monthe = 12;

        return monthe;
    }
    public String getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonthValue() {
        if(getBirthMonth().equals("Jan"))
            monthe = 1;

        else if(getBirthMonth().equals("Feb"))
            monthe = 2;

        else if(getBirthMonth().equals("Mar"))
            monthe = 3;

        else if(getBirthMonth().equals("Apr"))
            monthe = 4;

        else if(getBirthMonth().equals("May"))
            monthe = 5;

        else if(getBirthMonth().equals("Jun"))
            monthe = 6;

        else if(getBirthMonth().equals("Jul"))
            monthe = 7;

        else if(getBirthMonth().equals("Aug"))
            monthe = 8;

        else if(getBirthMonth().equals("Sep"))
            monthe = 9;

        else if(getBirthMonth().equals("Oct"))
            monthe = 10;

        else if(getBirthMonth().equals("Nov"))
            monthe = 11;

        else if(getBirthMonth().equals("Dec"))
            monthe = 12;

        return monthe;
    }
    public int getAge(){
        int age=0;
        LocalDate pdate = LocalDate.of(getBirthYear(), getBirthMonthValue(), getBirthDate());
        // current date
        LocalDate current = LocalDate.of(getCurrentYear(),getCurrentMonthValue(),getCurrentDate());
        // difference between current date and date of birth
        Period diff = Period.between(pdate, current);
        age= diff.getYears();
      return age;
    }

    public int getDays(){
        int totalMonth = 0, totalYear = 0;

        if((getPickYear() == getReturnYear()) && (getPickMonthValue() == getReturnMonthValue())) {
            if(getPickDate() == getReturnDate())
                days = 0;
            else if(getPickDate() < getReturnDate())
                days = getReturnDate() - getPickDate();
        }

        else if((getPickYear() == getReturnYear()) && (getPickMonthValue() < getReturnMonthValue())) {
            if(getPickDate() == getReturnDate()) {
                totalMonth = getReturnMonthValue() - getPickMonthValue();
                days = totalMonth * MONTHS_DAYS;
            }
            else if(getPickDate() < getReturnDate()) {
                totalMonth = getReturnMonthValue() - getPickMonthValue();
                days = (totalMonth * MONTHS_DAYS) + (getReturnDate() - getPickDate());
            }
        }

        else if(getPickYear() < getReturnYear()) {
            if(getPickMonthValue() == getReturnMonthValue()) {
                totalYear = getReturnYear() - getPickYear();
                days = ((totalYear * MONTHS) * MONTHS_DAYS) + (getReturnDate() - getPickDate());
            }

            else if(getPickMonthValue() < getReturnMonthValue()) {
                totalMonth = getReturnMonthValue() - getPickMonthValue();
                days = ((totalMonth + MONTHS) * MONTHS_DAYS) + (getReturnDate() - getPickDate());
            }

            else if(getPickMonthValue() > getReturnMonthValue()) { //kani mali
                totalMonth = MONTHS - (getPickMonthValue() - getReturnMonthValue());
                days = (totalMonth * 30) + (getReturnDate() - getPickDate());
            }
        }

        return days;
    }

    public double getRentalPrice() {
        return getDays() * aCar.carPrice;
    }
    public String toStringDateChecker() {
        String outpot = "";
        if((getPickMonthValue() > getReturnMonthValue()) && (getPickYear() == getReturnYear()))
            outpot += String.format("FALSE");

        if((getPickMonthValue() == getReturnMonthValue()) && (getPickDate() > getReturnDate()) && (getPickYear() == getReturnYear()))
            outpot += String.format("FALSE");

        if(getPickYear() > getReturnYear())
            outpot += String.format("FALSE");

        else
            outpot += String.format("TRUE");

        return outpot;
    }

    public String toStringAgeChecker() {
        String output = "";

        if(getAge() >= 18)
            output +="TRUE";

        else if(getAge() < 18)
            output += String.format("FALSE");

        return output;
    }
    //////////////////////////////(int)age to (String)age to print in GUI/////////////////////
    public String toStringAge() {
        String output = "";
        output += String.format("%d", getAge());
        return output;
    }

    /////////////////////////////////Status and Gender cheking , "mr/mrs"///////////////////////////////////
    public String toStringMrMrs() {
        String output = "";

        if(aCustomer.getGender().equals("M") || aCustomer.getGender().equals("m"))
            output += String.format("Mr.");

        else if((aCustomer.getStatus().equals("S") || aCustomer.getStatus().equals("s")) && aCustomer.getGender().equals("F") || aCustomer.getGender().equals("f"))
            output += String.format("Ms.");

        else if((aCustomer.getStatus().equals("Ma") || aCustomer.getStatus().equals("ma")) && aCustomer.getGender().equals("F") || aCustomer.getGender().equals("f"))
            output += String.format("Mrs.");

        return output;
    }

    //////////////////////////////////////////show all for customer///////////////////////////////////
    public String toStringReceipt() {
        String output = "";
        output += String.format("               	             Wahab's Car Rental\n");
        output += String.format("                              Owned & Operated By:\n");
        output += String.format("                                      AWAHAB\n");
        output += String.format("                             RENTAL TRANSACTION\n");
        output += String.format("-----------------------------------------------------------------------------------------------------\n");
        output += String.format("Car                                                        %s\n", aCar.getCar());
        output += String.format("Rental Days                                                %d\n", getDays());
        output += String.format("Rental Price                                               %.2f\n", aCar.carPrice);
        output += String.format("                                                           --------------\n");
        output += String.format("Total Payment                                              %.2f\n",getRentalPrice());
        output += String.format(toStringMrMrs() + aCustomer.getFullName());
        return output;
    }

   public void saveToFile() throws IOException {
        PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Transactions_Inventory.txt"), true));
        outFile.println("Current Date: " + getCurrentMonth() + " " + getCurrentDate() + ", " + getCurrentYear());
        outFile.println(" ");
        outFile.println("Pick up Date: " + getPickMonth() + " " + getPickDate() + ", " + getPickYear());
        outFile.println("Return Date: " + getReturnMonth() + " " + getReturnDate() + ", " + getReturnYear()  + " = Days: " + getDays());
        outFile.println("Full Name: " + aCustomer.getFullName());
        outFile.println("Age: " + getAge());
        outFile.println("Location: " + aCustomer.getLocation());
        outFile.println("Contact: " + aCustomer.getContact());
        outFile.println("Car: " + aCar.getCar());
        outFile.printf("Total Rent Price: %.2f", + getRentalPrice());
        outFile.println(" ");
        outFile.println("--------------------------------------------------");
        outFile.close();
    }
}