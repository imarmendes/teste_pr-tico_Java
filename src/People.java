import java.time.LocalDate;
//Requisito 1
public abstract class People implements Comparable<People> {
    private String name;
    private LocalDate birthday;

    public People(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    @Override
    public int compareTo(People p) {
        return this.getName().compareTo(p.getName());
    }

}
