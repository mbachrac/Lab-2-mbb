**Answers:**
============

**1.**
> - The complexity for FindTeamPossition for an Array is O(n) because if the team that you are looking for is at the end it has to go through the whole thing.

> - The complexity for FindTeamPossition for an ArrayList is also O(n) because like the array, if the team that you are looking for is at the end, it has to search through the whole list.

> - The complexity for FindTeamMinFunding is also O(n) because in the worst case, the desired team is at the end of the array.

> - The complexity for FindTeamMinFundingFast is O(log n) because in the worst case, it will have to keep dividing in half, and therefore only go through .

**2.**         If the array is not sorted, the binary search doesn&#39;t help at all unless by chance, because the number could be in the part that you cut out.

**3.**         The constructor argument validity checking helps make sure that the right arguments are given when constructing an object. If the arguments are not valid, the object will not be created.

**4.**         By making variables final, one can ensure that they will not be switched by accident, and they will keep the same value to make sure that the program runs the same way.

**5.**         Instead of using Optional I could have returned the integer itself and a negative number if it wasn&#39;t valid. If there was no number at all, it would be null. Optional is better because it can cover either one and the person writing the code doesn’t have to worry about null objects.