#What is Singleton pattern in Java? 
Singleton pattern in Java is a pattern which allows only one instance of Singleton class available in the whole application. java.lang.Runtime is a good example of Singleton pattern in Java. There are lot's of follow up questions on Singleton pattern see 10 Java singleton interview question answers for those followups

````
public class Singleton 
{ 
    private static Singleton obj; 
    private Singleton() { } 
    
    public static Singleton getInstance() { 
        if (obj == null) 
            obj = new Singleton();
        return obj; 
    } 
} 
````