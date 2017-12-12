package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import org.junit.Ignore;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CATEGORIES")
@NamedQueries({
		@NamedQuery(name = "Categorie.findAll", query = " SELECT c FROM Categorie c ORDER BY c.nom ")
}) // NamedQueries

public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOM", unique = true, nullable = false)
	private String nom;

	@JsonIgnore
	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<Produit> produits;
	
	@ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Marchand> marchands;

//	Constructeurs	
	public Categorie () {}
	public Categorie (String nom) { this.nom = nom; }
	
//	Getteurs
	public Long getId()					{ return id; }
	public String getNom()				{ return nom; }
	public Set<Produit> getProduits()	{ return produits; }
	public Set<Marchand> getMarchands()	{ return marchands; }
	
//	Setteurs	
	public void setNom(String nom)						{ this.nom = nom; }
	public void setMarchands(Set<Marchand> marchands)	{ this.marchands = marchands; }
	public void setProduits(Set<Produit> produits)		{ this.produits = produits; }

//	Autres
	@Override
	public String toString() { return "Categorie [id=" + id + ", nom=" + nom + ", produits=" + produits + ", marchands=" + marchands + "]"; }
	
} // class Categorie
