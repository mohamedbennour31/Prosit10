import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    private HashSet<Departement> departements;
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement)
    {
        departements.add(departement);
    }
    @Override
    public boolean rechercherDepartement(String nom)
    {
        for (Departement departement: departements)
        {
            if(departement.getNom().equals(nom))
            {
                return true;
            }
        }
        return false;

    }
    @Override
    public boolean rechercherDepartement(Departement departement)
    {
        return departements.contains(departement);
    }
    @Override
    public void supprimerDepartement(Departement departement)
    {
        departements.remove(departement);
    }
    @Override
    public void displayDepartement()
    {
        for (Departement departement: departements)
        {
            System.out.println(departement);
        }
    }
    @Override
    public TreeSet<Departement> trierDepartementById()
    {
        TreeSet<Departement> sortedSet = new TreeSet<>((d1,d2)->Integer.compare(d1.getId(), d2.getId()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
