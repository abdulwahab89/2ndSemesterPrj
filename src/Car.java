import java.util.*;
import java.io.*;

/////////////////////////////////////////////Car class/////////////////////////////////////
public class Car {
    String carType, carModel;
    double carPrice;
    public Car() {
        carType = "";
        carModel = "";
        carPrice = 0;
    }
    public void setCar(String cT, String cM, double cP){
        carType = cT;
        carModel = cM;
        carPrice = cP;
    }
    public String getCar() {
        return carType + "-" + carModel;
    }

public void saveToFile() throws IOException {
		PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Cars_Inventory.txt"), true));
	outFile.println(getCar() + " " + carPrice);
			outFile.close();
  }
}