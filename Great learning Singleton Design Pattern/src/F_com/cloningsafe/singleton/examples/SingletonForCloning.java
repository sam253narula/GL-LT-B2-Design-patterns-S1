package F_com.cloningsafe.singleton.examples;

/**
*
* @author Samarth Narula
*/

class SingletonForCloning extends SuperClass 
{ 
  // public instance initialized when loading the class 
  public static SingletonForCloning instance = new SingletonForCloning(); 
  
  private SingletonForCloning()  
  { 
    // private constructor 
  } 
}  