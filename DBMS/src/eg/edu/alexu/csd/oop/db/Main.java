package eg.edu.alexu.csd.oop.db;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        Parser parser = new Parser();
        String query="";
        while (!query.toLowerCase().equals(".quit")){
            query = scanner.nextLine();
            if(!query.toLowerCase().equals(".quit")) {
                parser.whatCommand(query);
            }
        }
        scanner.close();
        /*Parser a = new Parser();
        a.whatCommand("Create dataBase islam");
        a.whatCommand("Create  table AAS (Name varchar , Age int , weight int )");
        a.whatCommand("insert into AAS (Name , Age , weight) values('Ahmed' , 20 , 79)");
        a.whatCommand("insert into AAS (Name , Age) values('Amira' , 20 )");
        a.whatCommand("insert into AAS (Name , Age , weight) values('Adel' , 50 , 100)");
        a.whatCommand("insert into AAS (Name , Age , weight) values('Wael' , 33 , 90)");
        a.whatCommand("insert into AAS values('Alaa' , 40,70 )");
        a.whatCommand("update aas set age = 45 where name = 'ahmed'");
        a.whatCommand("select * from aas");*/
    }
}