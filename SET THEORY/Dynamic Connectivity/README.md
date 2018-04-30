# Dynamic Connectivity

## [From the course by Princeton University](https://www.youtube.com/channel/UCirCLaGiw_zT6vJNI_At6ag)

A dynamic connectivity structure is a data structure that dynamically maintains information about the connected components of a graph ([from wiki](https://en.wikipedia.org/wiki/Dynamic_connectivity)). 
</br>
</br>
**Given a set of N objects:**
* Union command: connect two objects
* Find/connected query: is there a path connecting the two objects?

**"is Connected to"** is an **equivalent relation**:
</br>
* **Reflexive**:  *p* is connected to *p*.
* **Symmetric**:  if *p* is connected to *q*, then *q* is connected to *p*.
* **Transitive**: if *p* is connected to *q* and *q* is connected to r, then *p* is connected to r.

![](https://github.com/ExploreNcrack/Algorithm/blob/master/SET%20THEORY/Dynamic%20Connectivity/p1.png)
</br>
**Connected Component:**: Maximal set of objects that are mutually connected
</br>Any two objects in the set are connected to each other.
</br>There is no objects outside that is conencted to those objects
</br>
![](https://github.com/ExploreNcrack/Algorithm/blob/master/SET%20THEORY/Dynamic%20Connectivity/p2.png)
</br>
**By using such set property, it will gain efficiency by maintaining connected component and using the property to efficiently answer the query.**
