## Introduction
We will be making a simple edition of the game Tic tac toe where two players can compete against each other. The game will be played on the console and players take turns typing in x or o until either of them win or there will be a tie if neither of them can put three in a row horizontal, vertical or diagonal.

## Environment
The game will be coded using Sublime Text and github will be used as source control to store and share the code between team members. We will be using gradle to make compiling, running tests and deploying easier. Travis will also run tests and display the current status of branches on their website so team members can see easily. The Advania Qstack server will be used to run the program on a clean computer.

## Classes
![alt text](https://github.com/adam-p/markdown-here/raw/master/src/common/images/ "TicTacToe class diagram")

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

#### Class and interface declarations
Open brace appears at the end of the same line as the declaration statement.
Closing brace starts a line by itself, indented to match its opening statement.
example:
public static void printBoard() {
	for(int i = 0; i < 3; i++) {
	}
}

### 4. Statements
#### If-else statements
If-else statements statements should have the following form:
if (condition) { 
statements;
 } 
else { 
statements; 
}

#### for statements
For statements should have the following form:
for (initialization; condition; update) { 
statements; 
}

#### While and do-while statements
While statements should have the following form:
	while (condition) { 
statements; 
}

Do-while statements should have the following form:
do { 
statements; 
} 
while (condition);

#### Try-catch statements
Try-catch statements should have the following form:
	try { 
statements; 
} 
catch (ExceptionClass e) { 
statements; 
}
