
# Question 4

### My Approach
When I read the question I realized that only a single loop would be needed as the target row of the provided 2D array I needed to loop through was given to me through the method’s parameter. I knew that if one Space object's color was different from another in the row then I would not multiply the final point count by 2. Using this I created the condition for the if statement by checking for a difference between the current Space object’s color and the first Space object’s color and setting a boolean variable created outside the loop to false if they are not equal. Using this variable I know if all the colors are the same and can multiply the final point count when needed. 

### Course Connections
In class there are multiple times we need to loop through both all rows and columns of a 2D array but because I am given the target row I only need a single loop.

### What Gave Me Trouble
My main issue was finding a way to check if all the colors of each Space object are the same. I wasn’t sure what I could compare each Space object’s color to until I realized that the getColor method returns a string so I created a string variable to hold the color of the first Space object’s color so I could compare all the other Space object’s colors to it.

### What I Would Do Differently
If I had more time I would have removed the or statement in the if statement as there is no way for the outside boolean variable to become true again if it had become false.
