package Demo5;

public class Weapon {

    private String nickname;  // 代号

    public Weapon() {
    }

    public Weapon(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
