## Introduction
This is a manual for new members of the development team. In the manual you will find how you can clone the project to your computer and what you will need to get the program running on your computer. The programs you need and how to install and run them.
	
## What is needed and how to get the program running on a new machine
1. The following programs are needed to run the program
	* Git
	* Java JDK 8
	* Gradle - This is not needed because we have Gradle Wrapper already in our project, however you will need to write the following command to make the wrapper executable after cloning: chmod +x gradlew
2. How to run the program
	* Use the following command to clone the repository to your computer - git clone https://github.com/T-303-HUGB/TicTacToe.git
	* To make the scripts executable write the following: cd bin "press enter, then write" chmod +x *
	* To compile build and run the program write this in the command line: sh ./bin/deploy
	* To explore more gradle commands you can type in the following: ./gradlew task

## Source control client and access to source control
The source control can be found here: https://github.com/T-303-HUGB/TicTacToe, this is a public source but you will need an account on github and to be added to the organization T-303-HUGB to get permission to �push� into the project. Every push will go trough a build on Travis.

## Build environment
1. You will need to install these programs
	* Git - Here is a guide https://help.github.com/articles/set-up-git/
	* Java JDK - Here is a guide http://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html
	* Gradle - Here is a guide https://docs.gradle.org/current/userguide/installation.html

## Other necessary dependecies
Developer should get acquainted with the programming rules and other things in the Designer Report

