public class Weapon {
    private String type;
    private String name;

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    public Weapon(String type, String name) {
        this.type= type;
        this.name = name;
    }
}
