package model;

public class User {

    private int id;
    private String mail;
    private String prenom;
    private String nom;
    private String password;

    public User(int id, String mail, String prenom, String nom,String password) {
        this.id = id;
        this.mail = mail;
        this.prenom = prenom;
        this.nom = nom;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
