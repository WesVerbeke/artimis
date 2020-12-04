package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;

@Entity
public class ProductCategorie {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productCategorieId;
    private Integer productId;
    private Integer categorieId;

    //Many to One relations with other entities
    @ManyToOne
    private Product product;

    @ManyToOne
    private Categorie categorie;

    //Constructors
    public ProductCategorie() {
    }

    public ProductCategorie(Long productCategorieId, Integer productId, Integer categorieId, Product product, Categorie categorie) {
        this.productCategorieId = productCategorieId;
        this.productId = productId;
        this.categorieId = categorieId;
        this.product = product;
        this.categorie = categorie;
    }

    //Getters & Setters

    public Long getProductCategorieId() { return productCategorieId; }

    public void setProductCategorieId(Long productCategorieId) { this.productCategorieId = productCategorieId; }

    public Integer getProductId() { return productId; }

    public void setProductId(Integer productId) { this.productId = productId; }

    public Integer getCategorieId() { return categorieId; }

    public void setCategorieId(Integer categorieId) { this.categorieId = categorieId; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }

    public Categorie getCategorie() { return categorie; }

    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}
