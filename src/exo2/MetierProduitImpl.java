package exo2;

import java.util.List;
import java.util.stream.Collectors;

public class MetierProduitImpl implements IMetier<Produit>{
    private List<Produit> produits;

    public MetierProduitImpl(List<Produit> products) {
        this.produits = products;
    }

    @Override
    public void add(Produit p) {
        this.produits.add(p);
    }

    @Override
    public List<Produit> getAll() {
        return this.produits;
    }

    @Override
    public Produit findById(long id) {
        return this.produits.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void delete(long id) {
        boolean removed = this.produits.removeIf(p -> p.getId() == id);

        if (!removed){
            System.out.println("Produit avec id " + id + " n'existe pas");
        }else {
            System.out.println("Produit avec id " + id + " a été supprimé avec succès");
        }
    }
}
