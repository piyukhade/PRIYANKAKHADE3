import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

public class employee 
{
   public static Date StringToDate(String dob) throws ParseException
   {                                                                //Instantiating the SimpleDateFormat class
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                                                                     //Parsing the given String to Date object
      Date date = formatter.parse(dob);
      System.out.println("Date object value: "+date);
      return date;
   }
   public static void main(String args[]) throws ParseException 
   {
	  String name;
	  String dob; 
	  double salary, ysalary;
	  double tax;
                                                                      //Reading name and date of birth from the user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      name = sc.next();
      System.out.println("Enter your date of birth (dd-MM-yyyy): ");
      dob = sc.next();
	  System.out.println("Enter your monthly salary (lakhs):");
	  salary=sc.nextInt();
	  
                                                                      //Converting String to Date
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      Date date = formatter.parse(dob);
                                                                      //Converting obtained Date object to LocalDate object
      Instant instant = date.toInstant();
      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
      LocalDate givenDate = zone.toLocalDate();
                                                                      //Calculating the difference between given date to current date.
      Period period = Period.between(givenDate, LocalDate.now());
      System.out.print("Hello "+name+" your current age is: ");
      System.out.print(period.getYears()+" years "+period.getMonths()+" months and "+period.getDays()+" days");
	  
	  ysalary=salary*12;
	  if(ysalary>=500000)
	  {
		  tax=ysalary*0.2;
		  System.out.println(" and according to your annual salary "+ysalary+"Rs you have to pay 20% of your salary as tax amount that is "+tax+"Rs");
	  }
	  else if(ysalary>=400000)
	  {
		  tax=ysalary*0.15;
		  System.out.println(" and according to your annual salary "+ysalary+"Rs you have to pay 15% of your salary as tax amount that is "+tax+"Rs");
	  }
	  else if(ysalary>=300000)
	  {
		  tax=ysalary*0.1;
		  System.out.println(" and according to your annual salary "+ysalary+"Rs you have to pay 10% of your salary as tax amount that is "+tax+"Rs");
	  }
	  else if(ysalary>=200000)
	  {
		  tax=ysalary*0.05;
		  System.out.println(" and according to your annual salary "+ysalary+"Rs you have to pay 5% of your salary as tax amount that is "+tax+"Rs");
	  }
	  else
	  {
		  System.out.println(" and according to your annual salary "+ysalary+"Rs you don't have to pay any tax");
	  }
		  
   }
}
