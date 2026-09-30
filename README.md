# oop-exercises

OOP practice: Student, Item, and Recipe classes

## Run

```bash
javac -d out $(find . -name '*.java')
java -cp out $(find . -name '*.java' | head -1 | xargs -I{} basename {} .java | head -1)
```

Or compile the `src` folder and run the `Test` / `Main` / `basics.Main` class for that project.

## Author

Hardik Rathee ([Hardik-4](https://github.com/Hardik-4))
