package mari.moita.com.Exercise8.model;

public class Game {
    private int id;
    private String status;
    private int player_id_1;
    private int player_id_2;
    private String result;
    private int winner;

    public Game() {
        this.status = "In Progress";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPlayer_id_1() {
        return player_id_1;
    }

    public void setPlayer_id_1(int player_id_1) {
        this.player_id_1 = player_id_1;
    }

    public int getPlayer_id_2() {
        return player_id_2;
    }

    public void setPlayer_id_2(int player_id_2) {
        this.player_id_2 = player_id_2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }
}