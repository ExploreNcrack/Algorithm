# Dynamic Connectivity

## [From the course by Princeton University](https://www.youtube.com/channel/UCirCLaGiw_zT6vJNI_At6ag)

A dynamic connectivity structure is a data structure that dynamically maintains information about the connected components of a graph ([from wiki](https://en.wikipedia.org/wiki/Dynamic_connectivity)). 
</br>
</br>
**Given a set of N objects:**
* Union command: connect two objects
* Find/connected query: is there a path connecting the two objects?
</br>
</br>
**"is Connected to"** is an equivalent relation:
</br>
* **Reflexive**:  *p* is connected to *p*.
* **Symmetric**:  if *p* is connected to *q*, then *q* is connected to *p*.
* **Transitive**: if *p* is connected to *q* and *q* is connected to r, then *p* is connected to r.

