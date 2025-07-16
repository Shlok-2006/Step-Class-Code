import java.util.*;
class TravelComputation {
   
   public static void main(String[] args) {
      String name;
          	  Scanner input = new Scanner(System.in);
       System.out.println("name: ");
          	  name = input.nextLine();
      String fromCity ;
          	  System.out.println("fromCity: ");
          	  fromCity = input.nextLine();
          	  String viaCity ;
          	  System.out.println("viaCity: ");
          	  viaCity = input.nextLine();
          	 String toCity ;
          	 System.out.println("toCity: ");
          	  toCity = input.nextLine();
      double distanceFromToVia;
          	  System.out.println("distanceFromToVia: ");
          	  distanceFromToVia = input.nextDouble();
       int timeFromToViahours;
          	   System.out.println("timeFromToViahours: ");
          	  timeFromToViahours = input.nextInt();
          	  int timeFromToViaMinutes;
          	  System.out.println("timeFromToViaMinutes: ");
          	  timeFromToViaMinutes = input.nextInt();
      int timeFromToVia = (timeFromToViahours) * 60 + (timeFromToViaMinutes);
      double distanceViaToFinalCity;
          	  System.out.println("distanceViaToFinalCity: ");
          	  distanceViaToFinalCity = input.nextDouble();
          	  int timeViaToFinalCityHours;
          	  System.out.println("timeViaToFinalCityHours: ");
          	  timeViaToFinalCityHours = input.nextInt();
          	  int timeViaToFinalCityMinutes;
          	  System.out.println("timeViaToFinalCityMinutes: ");
          	  timeViaToFinalCityMinutes = input.nextInt();
      int timeViaToFinalCity = (timeViaToFinalCityHours) * 60 + (timeViaToFinalCityMinutes);
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;
 
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
                                                                                  	 input.close();
   }
}
