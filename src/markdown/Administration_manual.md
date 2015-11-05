##How to set the program up and get it to run on a fresh machine.  
#### 1. You will need to install these programs  
	* Git - Here is a guide https://help.github.com/articles/set-up-git/  
	* Java JDK - Here is a guide http://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html  
	* Gradle - Here is a guide https://docs.gradle.org/current/userguide/installation.html __Attention:__This is not needed because we have Gradle Wrapper already in our project, however you will need to write the following command to make the wrapper executable after cloning: chmod +x gradlew  
#### 2. How to run the program  
	* Use the following command to clone the repository to your computer - git clone https://github.com/T-303-HUGB/TicTacToe.git  
	* To make the scripts executable write the following: cd bin "press enter, then write" chmod +x *  
	* Write this in the command line to install the program: sh ./bin/package  
	* To run the program write sh ./bin/run  