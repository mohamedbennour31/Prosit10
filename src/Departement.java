public class Departement {
   protected int id,nbreEmp;
   protected String nom;

    public Departement(int id, int nbreEmp, String nom) {
        this.id = id;
        this.nbreEmp = nbreEmp;
        this.nom = nom;
    }
    public Departement() {}
    public int getId() {}
    public int getNbreEmp() {}
    public String getNom() {}
    public void setId(int id) {}
    public void setNbreEmp(int nbreEmp) {}
    public void setNom(String nom) {}
    public String toString() {
        return "Département{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmployes=" + nbreEmp +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Departement other = (Departement) obj;
        return this.getId()==other.getId() &&
                this.getNbreEmp() == other.getNbreEmp() &&
                this.nom.equals(other.nom);
    }
}
