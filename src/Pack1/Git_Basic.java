//Find basic GIT commands at:  https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html


//To tell Git who you are in command prompt
//git config --global user.name "Harmilap Sandhu"
//git config --global user.email "harmilapsandhu@gmail.com"
//Then go the system project folder you want to upload: cd CleanBee

//Create a new local repository: git init

//To add everything in folder to 'staging': git add *

//To check status and view files that are staging: git status  (These files are now ready to be committed)

//To commit files: git commit -m "Your Message"

//To connect local repository to remote connection: git remote add origin https://github.com/harmilapsandhu/CleanBee.git
//Now to push the code from commit to remote repository: git push origin master (master is the default branch)

//To get files from git repository to a local machine (for 1st time): git clone https://github.com/harmilapsandhu/CleanBee.git

//To get files from git repository to a local machine (after 1st time): git pull origin master (only new saved changes will extracted)

//Branches:
//To create new branch: git checkout -b <branchName>
//To get info on the total branches and what branch you are on: git branch
//To switch to another branch: git checkout <branchName>
//To delete a branch: git branch -d <branchName>

//To merge branches into master branch:
//First goto master branch using git checkout master, then pull the latest code using git pull origin master(guess not needed)
//git merge <branchName to be merged>  This will merge the given branch to active branch
//Then git push origin master


//public class Git_Basic {

//}
