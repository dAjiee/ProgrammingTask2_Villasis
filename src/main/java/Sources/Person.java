/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sources;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Alexander
 */
public class Person {
    public final static int MAN = 1;
    public final static int WOMAN = 2;
    public final static int PREGNANT = 3;
    public final static int OLDMAN = 4;
    public final static int OLDWOMAN = 5;
    public final static int PWD = 6;

    private int type;
    private String pathToIcon;
    private String name;

    public Person(int type, String name) {
        this.type = type;
        this.name = name;
        this.pathToIcon = generatePathToIcon(type);
    }

    public Person(int type) {
        this.type = type;
        this.name = "";
        this.pathToIcon = generatePathToIcon(type);
    }

    private String generatePathToIcon(int type) {
        String[] images;
        Random random = new Random();
        int index;
        
        switch (type) {
            case 1:
                images = new String[]{"man1.png", "man2.png"};
                break;
            case 2:
                images = new String[]{"woman1.png", "woman2.png"};
                break;
            case 3:
                return "/images/pregnant.png";
            case 4:
                images = new String[]{"oldman1.png", "oldman2.png"};
                break;
            case 5:
                images = new String[]{"oldwoman1.png", "oldwoman2.png"};
                break;
            case 6:
                return "/images/pwd.png";
            default:
                return "";
        }
        
        // This line is now outside the switch statement, because it's common to cases 1, 2, 4, and 5.
        index = random.nextInt(images.length);
        return "/images/" + images[index];
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPathToIcon() {
        return pathToIcon;
    }

    public void setPathToIcon(String pathToIcon) {
        this.pathToIcon = pathToIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.type;
        hash = 67 * hash + Objects.hashCode(this.pathToIcon);
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.pathToIcon, other.pathToIcon)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Person{" + "type=" + type + ", pathToIcon=" + pathToIcon + ", name=" + name + '}';
    }
    
    
}
