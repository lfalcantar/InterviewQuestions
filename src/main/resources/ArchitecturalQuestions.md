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

#  factory pattern
##### Classes
- Phone
- Iphone extends Phone
- Android extends Phone
- Windows extends Phone
- PhoneType Enum of phone types
- PhoneFactory

### Dont use new.
- The creation of an object precludes its reuse without significant duplication of code.
- The creation of an object requires access to information or resources that should not be contained within the composing class.
- The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.
- Factory pattern is most suitable where there is some complex object creation steps are involved



````
public class PhoneFactory {
    public static phone buildPhone(PhoneType model) {
        Phone phone = null;
        switch (model) {
        case iphone:
            phone = new IPhone();
            break;
 
        case Android:
            phone = new Android();
            break;
 
        case Windows:
            phone = new Windows();
            break;
 
        default:
            // throw some exception model not supported
            break;
        }
        return phone;
    }
    
    
    class Employee {
      static Employee create(int type) {
        employee = new Employee(type);
        // do some heavy lifting.
        return employee;
      }
      //...
    }

````
Resources 
> https://sourcemaking.com/refactoring/replace-constructor-with-factory-method