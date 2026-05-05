# Git Branching Strategy Demo

This project demonstrates:
- Feature branching
- Merging
- Rebasing
- Merge conflicts and resolution

## Steps

### 1. Initialize repository
git init

### 2. Add initial file
git add .
git commit -m "Initial commit"

### 3. Create feature branch
git checkout -b feature-branch

Edit file.txt and commit:
git add file.txt
git commit -m "Feature branch update"

### 4. Switch to main and modify same file
git checkout main
# edit file.txt differently
git add file.txt
git commit -m "Main branch update"

### 5. Merge (will cause conflict)
git merge feature-branch

### 6. Resolve conflict manually in file.txt
Then:
git add file.txt
git commit -m "Resolved merge conflict"

### 7. Rebase example
git checkout feature-branch
git rebase main

### 8. Push to GitHub
git remote add origin https://github.com/your-username/git-branching-demo.git
git push -u origin main

