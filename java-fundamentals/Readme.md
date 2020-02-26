# Data structures and Java fundamentals

## LinkedList

### There are pretty good real examples to show the usage and importance of linkedlist.

* Consider the history section of web browsers, where it creates a linked list of web-pages visited, so that when you check history (traversal of a list) or press back button, the previous node's data is fetched.
* One common sighted example is low level memory management (i.e. the heap as managed by malloc in C or new in Java, etc) is often implemented as a linked list, with each node representing a used or available (free) block of memory. These blocks may be of any size, change size (combine and split), be freed or assigned in any order, and reordered. A linked list means you can keep track of all of these "nodes" and manipulate them fairly easily.
* Also, Hashtables that use chaining to resolve hash collisions typically have one linked list per bucket for the elements in that bucket.
* A simple real life example is a Train, here each coach is connected to its previous and next coach (Except first and last). In terms of programming consider coach body as node value and connectors as links to previous and next nodes.
* Our brain is also a good example of linked list. In the initial stages of learning something by heart, the natural process is to link one item to next. It's a subconscious act. Also, when we forget something and try to remember, than our brain follows association and tries to link one memory with another and so on and we finally recall the lost memory.
E.g. Consider the thinking process when you placed your bike key somewhere and couldn't remember.
* Another real life example could a be queue/line of persons standing for food in mess, insertion is done at one end and deletion at other. And these operations happen frequent. dynamic queues / stacks are efficiently implemented using linked lists.