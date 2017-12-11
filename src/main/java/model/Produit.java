package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "PRODUITS")
@NamedQueries({
		@NamedQuery(name = "Produit.findAll", query = " SELECT p FROM Produit p ORDER BY p.nom ")
}) // NamedQueries

public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "QUANTITE")
	private String quantite;

	@ManyToOne
	private Categorie categorie;

//	Constructeur	
	
	public Produit	() {};
	public Produit	(String nom, String quantite, Categorie categorie) {
		this.nom = nom;
		this.quantite = quantite;
		this.categorie = categorie;
	} // Produit

//	Getteurs
	public Long getId()				{ return id; }
	public String getNom()			{ return nom; }
	public String getQuantite()		{ return quantite; }
	public Categorie getCategorie()	{ return categorie; }
	
//	Setteurs
	public void setNom(String nom)					{ this.nom = nom; }
	public void setQuantite(String quantite)		{ this.quantite = quantite; }
	public void setCategorie(Categorie categorie)	{ this.categorie = categorie; }

//	Autres
	@Override
	public String toString() { return "Produit [id=" + id + ", nom=" + nom + ", quantite=" + quantite + ", categorie=" + categorie + "]"; }
	
} // class Produit
