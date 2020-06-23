public abstract class Sensor {
    int id;

    public Sensor(int id){
        this.id = id;
    }

    public abstract int measure();
    
    public String toString(){
        return String.valueOf(id);
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
