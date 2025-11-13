public class Person {
    private String name;
    private int age;
    private int height; // in centimeters
    private int weight; // in kilograms
    private String eyeColour;
    private String hairColour;
    
    // Constructor
    public Person(String name, int age, int height, int weight, String eyeColour, String hairColour) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getEyeColour() {
        return eyeColour;
    }
    
    public String getHairColour() {
        return hairColour;
    }
}