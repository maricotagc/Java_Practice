package mari.moita.com.Exercise8.Model;

import java.util.Objects;

public class Player {

    private String name;
    private int id;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
