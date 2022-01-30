package alla.jobmanagerserver.model;

public class User {
    private Integer id;
    private String login;
    private String name;

    public User() {
    }

    public User(Integer id, String login, String name) {
        this.id = id;
        this.login = login;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        if (id != null) sb.append(", id=").append(id);
        if (login != null) sb.append(", login='").append(login).append('\'');
        if (name != null) sb.append(", name='").append(name).append('\'');
        if (sb.length() < 2) sb.append("  ");
        sb.append('}');
        return "User{" + sb.substring(2);
    }
}
