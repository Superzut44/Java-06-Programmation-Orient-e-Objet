public class Wilder {

    // attributes
    private String firstname;
    private boolean aware;

    // constructors
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = false;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // instance method
    public String whoAmI() {
        if (this.isAware()) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }
        return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
    }
    
    // getters setters
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return this.aware;
    }
   
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}
