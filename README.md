Problem - There is a store manager having a store space of fixed size (Taking input from the user), and the customers give their boxes of A * B dimentions and to manager to keep them, also the rent will be given by cusomer only. 
Store manager has two choices.
a). Either take accept the boxes and yied the profit of rent ruppees b). Or reject them. 

To tackle this problem, I am using strategy design pattern having two strategies - 

1). Default strategy - Where i am taking every box if store space is capable to take it. 

2). Optimised strategy - Taking median of last 30 days boxes and if the median per unit square of store is lesser than or equal to rent per unit square of box, then only we will accept it.
