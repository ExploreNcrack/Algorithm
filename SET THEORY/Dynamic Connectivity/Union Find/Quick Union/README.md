# Quick Union [Lazy approach]

*Lazy approach*: avoid doing work until we have to

## Data Structure
* Integer array id[] of size **N**
* Interpretation: id[i] is **parent** of i
* **Root** of i is id[id[id[i]..]] *(Keep going until it does not change (**ensure no cycles**))*


## Operation
* **Find**: Check if *p* and *q* have the same root
* **Union**: To merge components containing *p* and *q*, set the id of *p*'s root to the id of *q*'s root


## Advantage
Comparing to the quick find method, quick union has improved in the **Union** operation. In quick find, union operation always costs **O(N)**. In quick union, union operation in the **best case** takes **less** than **O(N)**, only in **worse case** will takes **O(N)** time complexity.  

## Disadvantage
This method is still considered to be slow. Linear time for both operations **Find** and **Union** is not so ideal when the given input size is enormous. Find operation also takes **O(N) in the worse case**.

## Example 
![](https://github.com/ExploreNcrack/Algorithm-and-Data-Structure/blob/master/SET%20THEORY/Dynamic%20Connectivity/Union%20Find/Quick%20Union/quick_union1.png)
![](https://github.com/ExploreNcrack/Algorithm-and-Data-Structure/blob/master/SET%20THEORY/Dynamic%20Connectivity/Union%20Find/Quick%20Union/quick_union2.png)

