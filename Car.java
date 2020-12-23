public class Car
{
  double Vi; //for the initial velocity of the car
  double Vf; //for the final velocity of the car
  double accel; //for acceleration of the car
  double m; //for the mass of the car
  
  //Constructor
  public Car(double Vi, double Vf, double accel, double m)
  {
    this.Vi = Vi;
    this.Vf = Vf;
    this.accel = accel;
    this.m = m;
  }
  //Method named changeInVelocity
  //Has no parameters
  //Return type is a double
  public void changeInVelocity()
  {
    System.out.println("The change in velocity is --> "+(Vf - Vi)+" <-- metres per seconds");
  }
  
  public void forceOfCar()
  {
    System.out.println("The force of the car is --> "+(m * accel)+" <-- Newtons");
  }
  
  public void normalForce()
  {
    System.out.println("The normal force acting on the car is --> "+(m * 9.81)+" <-- Newtons");
  }
  
  public void changeInTime()
  {
    System.out.println("The change in time is --> "+((Vf - Vi) / accel)+" <-- seconds");
  }
  
  public void distTravelledByCar()
  {
    System.out.println("The car travels --> "+(((Vf * Vf) - (Vi * Vi))/ (2 * accel))+" <-- metres");
  }
}