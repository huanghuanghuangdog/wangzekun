package cn.bdqn.PropertySource;


import org.springframework.beans.factory.annotation.Value;

public class Pig {
    @Value("${id}")
    private  int id;
    @Value("${name}")
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
