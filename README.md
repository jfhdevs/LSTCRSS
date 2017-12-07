# Liste des courses

Réalisation d'une application Web permettant de gérer la liste des courses

# Description

Permettre à l'utilisateur de :
 - gérer une liste catégorisée de courses à faire : nature, quantité avec proposition des magasins possibles, impression;
 - enrégistrer les courses effectuées avec mise à jour des quantités.
 
# Conception
 
Base de donnée Postgresql, hibernate, JPA, AngularJS.
 
3 tables : 
  -    n  produit (nom, quantité),
  -  p 1  catégorie (nom),
  -  n    marchand (nom, ville).
   
L'enrégistrement des courses effectuées se fera comme un log.
   
# Réalisation

 # étape 1 : préparation de l'accès aux données (model, DAO, création table, configuration accès SGBD, ...),
 # étape 2 : affichage de la liste des produits (accès SGBD, configuration web),
 # étape 3 : ajout / modification de données (produits, catégories, marchand),
 # étape 4 : affichage et impression liste des courses à faire,
 # étape 5 : proposition des magasins,
 # étape 6 : validation des achats (mise à jour quantités, log des achats),
 # étape 7 : consultation des achats,
 # étape 8 : suppression de données ?