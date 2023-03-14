# Arnoldizer

This encryption application generates random ID and encrypts it using a special arithmetic operation.

This app has 3 options which are to generate a new Arnold ID which is done by the generateID method, view all of the generated Arnold IDs 
and their respective encryption keys, and exit.

In the first option, after the new Arnold ID is created, it directly calls the method arnoldEncrypt which contains a special arithmetic operation in order to
generate its (Arnold ID) encryption key. Thus, not only does the program create a random Arnold ID, it also generates the encryption key for it.

Arnold ID is created in the generateID method, this function basically concatenates the string "JA" with a random number from the range of 100 to 900.

The special arithmetic operation used to generate is multiplying the number formed by the 3 last digits of the Arnold ID by 15 and divide it by 6. 
It is done in the arnoldEncrypt method which takes the Arnold ID as its input.  

Example: the randomly generated Arnold ID is "JA521"
therefore the number obtained from the ID is 521.
521*15/6=1302.5

Since the encryption key is a long int, therefore the result of this operation is rounded down (if its decimal). Thus, the encryption key obtained from that ID is 1302.
