# Partie 1:
1. Créer l'interface IDao avec une méthode getDate
    ![img.png](pics/img.png)
2. Créer une implémentation de cette interface 
    ![img_1.png](pics/img_1.png)
3. Créer l'interface IMetier avec une méthode calcul

   ![img_2.png](pics/img_2.png)
4. Créer une implémentation de cette interface en utilisant le couplage faible
    ![img_3.png](pics/img_3.png)
5. Faire l'injection des dépendances :
   1. Par instanciation statique
       ![img_4.png](pics/img_4.png)
   2. Par instanciation dynamique
        ![img_5.png](pics/img_5.png)
   3. En utilisant le Framework Spring
       1. Version XML
        - `applicationContext.xml`:
      
            ![img_6.png](pics/img_6.png)
        - `Presentation.java` :
      
            ![img_7.png](pics/img_7.png) 
      2. Version annotations
         - `presentation.java`
           ![img_8.png](pics/img_8.png)
         - `DaoImpl.java`
           ![img_9.png](pics/img_9.png)
         - `MetierImpl.java`
            ![img_10.png](pics/img_10.png)

---

# 