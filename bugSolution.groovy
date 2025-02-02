```groovy
class MyClass {
    def myMethod(a, b = 0) { // Solution 1: Optional parameter
        println a + b
    }
    //Solution 2: Named parameters
    def myMethod2(Map params) { 
        def a = params.a ?: 0; //null coalescing operator
        def b = params.b ?: 0; 
        println a + b 
    }
    //Solution 3: Input validation
    def myMethod3(a,b){
        if(a == null || b == null){
            println "Error: Method parameters cannot be null"
            return
        }
        println a + b
    }
}

MyClass myObject = new MyClass()
myObject.myMethod(1) // Output: 1
myObject.myMethod2([a: 1]) //Output: 1 
myObject.myMethod2([a: 1, b:2]) //Output: 3
myObject.myMethod3(1,2) //Output: 3
myObject.myMethod3(1,null) //Output: Error
```