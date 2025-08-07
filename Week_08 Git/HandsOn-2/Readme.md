# Step 1: Check Git Version

```
$ git --version
```

Output: `git version 2.42.0.windows.1`


# Step 2: Set Global Git Config

```
$ git config --global user.name "Manjusri"
$ git config --global user.email "manjusri@example.com"
$ git config --list
```
Output:
`user.name=NivedhaJM`

`user.email=nivedhajm@example.com`

`core.editor='C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin`


# Step 3: Open Notepad++ from Git Bash

```
$ notepad++
```
Output:`Notepad++ opens in a separate window`

# Step 4: Create Project and Initialize Git

```
$ mkdir GitDemo
$ cd GitDemo
$ git init
```

Output:`Initialized empty Git repository in C:/Users/Nive/GitDemo/.git/`

# Step 5: Create a File and Add Content

```
$ echo welcome.txt
$ ls
```
Output:
`Welcome`
`Hello World`

# Step 6: Track and Commit the File

```
$ git commit -m "Added welcome.txt file"
```

Output:
`Welcome`
`Hello World`
 
#Step 7: Check Status 

```
$ git status
```

Output: `On branch master nothing to commit, working tree clean`

# Step 8: Link and Push to Remote Repo

```
$ git remote add origin https://gitlab.com/Nive/GitDemo.git
$ git pull origin master
$ git push -u origin master
```