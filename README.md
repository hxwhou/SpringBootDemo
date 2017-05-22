# SpringBootDemo
This demo is a Spring boot project for practicing git usage.

## Q&A
Q: what's the difference between git and github ?\
A: It's a stupid question.


## Git push with https need to add username on remote url like this:
```
git remote set-url origin https://hxwhou@github.com/hxwhou/SpringBootDemo.git
```

## The following command will save your password in memory for sometime.
```
$ git config --global credential.helper cache
# Set git to use the credential memory cache

$ git config --global credential.helper 'cache --timeout=3600'
# Set the cache to timeout after 1 hour (setting is in seconds)
```