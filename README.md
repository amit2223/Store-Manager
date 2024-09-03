Problem - There is a store manager having a store space of fixed size (Taking input from the user), and the customers give their boxes of x*b dimentions to manager to keep them. Store manager has two choices.
a). Either take them and yied the profit of x ruppees b). Or reject them. 

To tackle this problem, I am using strategy design pattern having two strategies - 
1). Default strategy - Where i am taking every box if store space is capable to take it. 
2). Optimised strategy - In this, i am taking only those boxes which x dimnesion is greater or equal to y dimension.

Drawbacks 
1). In the first one, if the customers whose boxes' x dimension is lesser than y(Let say 1*10) dimension come in the starting, then our space will be filled with these boxes only and our profit will be very less.
And if after that Customers with higher x dimension come, we will have to reject them.

2). In the second one, What if no customer having x>=y comes, at the end of the day we will earn no profit.

Advantages
Both the strategies are tackling each others' drawbacks. 
