package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;

@Entity
public class ProductCategorie {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productcategorieid;

    //Many to One relations with other entities
    @ManyToOne
    private Product product;

    @ManyToOne
    private Categorie categorie;

    //Constructors
    public ProductCategorie() {
    }

    public ProductCategorie(Long productcategorieid, Product product, Categorie categorie) {
        this.productcategorieid = productcategorieid;
        this.product = product;
        this.categorie = categorie;
    }

    //Getters & Setters

    public Long getProductcategorieid() { return productcategorieid; }

    public void setProductcategorieid(Long productcategorieid) { this.productcategorieid = productcategorieid; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }

    public Categorie getCategorie() { return categorie; }

    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}
