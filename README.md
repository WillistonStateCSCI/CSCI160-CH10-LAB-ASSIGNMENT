# CSCI160-CH10-LAB
Programming Exercises From Java Illuminated Book by Anderson and Franceschi  
**Note:  Do NOT change the Store.java file or the respective client files for these exercises.  Doing so will flag your account and then I will reset the code back to the original before running the auto grader again.**  
## Q10_44 Instructions  
For this problem, the *Store.java* class and the *GroceryStoreClient.java* client are included to test your code.  
Within the *GroceryStore.java* class, write a class encapsulating a grocery store, which inherits from *Store*.  A grocery store has the following additional attributes: annual revenues and whether it is an independent store or part of a chain.  Code the constructor and the *toString* method of the new class; also code a method returning the annual taxes paid by the store.  
### Q10_44 Test  
**Input:**  
*none*  
**Output:**  
```
Generating gs1 Grocery Store named Eddie's, annual revenue of 3523450.45, not a chain
Generating gs2 Grocery Store named Giant 43, annual revenue of 4321090.65, chain

Printing both grocery stores: 
name: Eddie's; annual revenues: 3523450.45; is part of a chain: false
name: Giant 43; annual revenues: 4321090.65; is part of a chain: true

Setting gs2 annual revenue to 3523450.45 and chain to false
Checking to see if the two stores are equal...
gs1 and gs2 are not equal

Setting gs2 name to Eddie's
Checking to see if the two stores are equal...
gs1 and gs2 are now equal

Printing out annual taxes for gs1...
Annual taxes for Eddie's are $211,407.03
```
## Q10_45 Instructions  
For this problem, the *Store.java* class and the *RestaurantClient.java* client are included to test your code.  
Within the *Restaurant.java* class, write a class encapsulating a restaurant, which inherits from *Store*.  A restaurant has the following additional attributes: how many people are served every year and the average price per person.  Code the constructor and the *toString* method of the new class; also code a method returning the average taxes per year.  
### Q10_45 Test  
**Input:**  
*none*  
**Output:**  
```
Generating new restraurant r1 named Bistro 120, 12000 people served, meals costing approx $25.60
Generating new restaurant r2 named Chez Louis, 9800 people served, meals costing approx $39.85

Printing both restaurants...
name: Bistro 123; number of people served: 12000; average price per person: 25.6
name: Chez Louis; number of people served: 9800; average price per person: 39.85

Setting r2 people served to 1200 and average price per meal to 25.599999
Checking to see if the two restaurants are equal...
r1 and r2 are not equal

Setting the name of r2 to Bistro 123...
Checking to see if the two restaurants are equal...
r1 and r2 are now equal

Calculating the average taxes for r1...
Average annual taxes for Bistro 123 are $18,432.00
```