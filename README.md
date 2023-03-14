# Arnoldizer

This encryption application generates random ID and encrypts it using a special arithmetic operation. It uses an ArrayList which contains an object called ArnoldID. The object ArnoldID contains properties as id and arnold_encrypted which is the encryption key for that Arnold ID. 

The methods utilized in this project are in the Encrypt class, those methods are:
* generateID = generates Arnold ID by concatenating random number from 100 to 999 with the string "JA".

* arnoldEncrypt = does the special arithmetic operation to the number formed by the last 3 digits of the Arnold ID by multiplying it with 15 then dividing it by 6.

This app has 3 options which are to generate a new Arnold ID which is done by the generateID method, view all of the generated Arnold IDs 
and their respective encryption keys, and exit.

Welcome screen of the Arnold's encryption app:

![1](https://user-images.githubusercontent.com/89509753/224959154-29c34068-d98c-4e6a-a027-d238b9915034.png)

The first option is used to generate a random Arnold ID and encrypt it:

![2](https://user-images.githubusercontent.com/89509753/224959198-b1b02fb4-9a9b-403c-9af5-639332f4c417.png)

The second option is used to view all of the created Arnold IDs with their respective encryption keys:

![3](https://user-images.githubusercontent.com/89509753/224959432-ab4824f7-5ba6-422c-81c8-0e8233cb40e6.png)

![4](https://user-images.githubusercontent.com/89509753/224959477-68b4876f-a5d4-4f74-b79e-a76e074b8653.png)

The third option is used to exit the app:

![5](https://user-images.githubusercontent.com/89509753/224959588-495b7c15-1140-4b6b-936c-3644ca574441.png)

The special arithmetic operation used to generate is multiplying the number formed by the 3 last digits of the Arnold ID by 15 and divide it by 6. It is done in the arnoldEncrypt method which takes the Arnold ID as its input.  

Example: the randomly generated Arnold ID is "JA521"
therefore the number obtained from the ID is 521.
521*15/6=1302.5

Since the encryption key is a long int, therefore the result of this operation is rounded down (if its decimal). Thus, the encryption key obtained from that ID is 1302.
