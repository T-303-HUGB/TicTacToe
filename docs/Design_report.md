## Introduction
We will be making a simple edition of the game Tic tac toe where two players can compete against each other or against the computer. The game will be played on the console and players take turns typing in x or o until either of them win or there will be a tie if neither of them can put three in a row horizontal, vertical or diagonal.

## Environment
The game will be coded using Sublime Text and Github will be used as source control to store and share the code between team members. We will be using Gradle to make compiling, running tests and deploying easier. Travis is used as automated continuous integration server. The Advania Qstack server will be used to run the program on a clean computer.

## Class diagram
![alt text](https://github.com/T-303-HUGB/TicTacToe/blob/master/docs/ClassDiagramTicTacToe.png "TicTacToe class diagram")

## Programming Rules
### 1. Indentation
A single tab should be used as the unit of indentation.

### 2. Comments
Block comments should be preceded by a single blank space and follow the following syntax:  
	/* Some very important  
	comment here */  

Single-line comments should have the following form:  
	//this is a single-line comment  

### 3. Declarations
Single line declarations are preferred but variables declared in the same line can also be used example:  
int variable1;  
int variable2;  
or  
int variable1, variable2;  

Declarations should also be put at the beginning of blocks.  

##### 3.1. Class and interface declarations
Open brace appears at the end of the same line as the declaration statement.  
Closing brace starts a line by itself, indented to match its opening statement.  
Example:  
public static void printBoard() {  
&nbsp;&nbsp;&nbsp;&nbsp;for(int i = 0; i < 3; i++) {  
&nbsp;&nbsp;&nbsp;&nbsp;}  
}

### 4. Statements
##### 4.1. If-else statements
If-else statements statements should have the following form:  
if (condition) {  
&nbsp;&nbsp;&nbsp;&nbsp;statements;  
}  
else {  
&nbsp;&nbsp;&nbsp;&nbsp;statements;  
}

##### 4.2. for statements
For statements should have the following form:  
for (initialization; condition; update) {  
&nbsp;&nbsp;&nbsp;&nbsp;statements;  
}  

##### 4.3. While and do-while statements
While statements should have the following form:  
while (condition) {   
&nbsp;&nbsp;&nbsp;&nbsp;statements;   
}  

Do-while statements should have the following form:  
do {  
&nbsp;&nbsp;&nbsp;&nbsp;statements;  
}  
while (condition);  

##### 4.4. Try-catch statements  
Try-catch statements should have the following form:  
try {  
&nbsp;&nbsp;&nbsp;&nbsp;statements;  
}  
catch (ExceptionClass e) {  
&nbsp;&nbsp;&nbsp;&nbsp;statements;  
}  
