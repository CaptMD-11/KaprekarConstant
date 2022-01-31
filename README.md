# KaprekarConstant

Kaprekar's constant (6174) is a special number, discovered by Indian mathematician Dattatreya Ramchandra Kaprekar in 1949. 

Let's take 8315 for our example. Subtract the number where the digits are in lowest-to-greatest form (1358) from the number where the digits are in greatest-to-least form (8531). The result is 7173. We need to repeat this calculation until we get 6174. If we apply the same process to 6174, we get 6174, which loops on forever. Therefore, we terminate the computation at 6174. 

There are two rules, however. The number you choose must contain 4 digits and shouldn't contain any repeat digits. 

I learned about this phenomenon through <a href="https://www.youtube.com/watch?v=d8TRcZklX_Q">this</a> Numberphile video. So I thought I might some code that'll calculate the number of iterations you have to go through until you reach 6174. Have fun! 
