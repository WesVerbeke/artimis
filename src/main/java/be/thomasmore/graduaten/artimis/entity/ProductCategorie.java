package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;

@Entity
public class ProductCategorie {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productCategorieId;

    //Many to One relations with other entities
    @ManyToOne
    private Product product;

    @ManyToOne
    private Categorie categorie;

    //Constructors
    public ProductCategorie() {
    }

    public ProductCategorie(Long productCategorieId, Product product, Categorie categorie) {
        this.productCategorieId = productCategorieId;
        this.product = product;
        this.categorie = categorie;
    }

    //Getters & Setters

    public Long getProductCategorieId() { return productCategorieId; }

    public void setProductCategorieId(Long productCategorieId) { this.productCategorieId = productCategorieId; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }

    public Categorie getCategorie() { return categorie; }

    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}
