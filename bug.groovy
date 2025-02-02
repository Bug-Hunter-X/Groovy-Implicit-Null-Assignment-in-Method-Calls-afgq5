```groovy
class MyClass {
    def myMethod(a, b) {
        println a + b
    }
}

MyClass myObject = new MyClass()
myObject.myMethod(1, 2) //This works fine
myObject.myMethod(1) //This will NOT throw an exception, it will print 1null
```