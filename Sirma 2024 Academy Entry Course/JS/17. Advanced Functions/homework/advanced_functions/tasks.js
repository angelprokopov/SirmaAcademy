// 1. Using bind to Set this
const obj1 = {
    name: 'Alice',
    greet: function () {
        console.log(`Hello, my name is ${this.name}`);
    }
}

const obj2 = {
    name: 'Bob',
}

const boundGreet = obj1.greet.bind(obj2)
boundGreet()

// 2. Using call to Chain Constructors
function Person(name) {
    this.name = name
}

function Employee(name, job) {
    Person.call(this, name)
    this.job = job
}

const emp = new Employee('Alice', 'Engineer')
console.log(emp)

// 3. Using bind for Partial Application
function multiply(a,b) {
    return a * b;
}

const multiplyByFive = multiply.bind(null, 5)
console.log(multiplyByFive(3))

// 4. Function Composition
function double(num) {
    return num * 2
}

function square(num) {
    return num * num
}

function compose(f, g) {
    return function (x) {
        return g(f(x))
    }
}

const doubleTheSquare = compose(double, square)
console.log(doubleTheSquare(3))

// 5. Closure for Data Privacy
function createPrivateCounter() {
    let count = 0
    return {
        increment: function() {
            count++
        },
        getCount: function() {
            return count
        }
    }
}

const counter = createPrivateCounter()
counter.increment()
console.log(counter.getCount())

// 6. Curry a Function
function _multiply(a) {
    return function(b) {
        return function(c) {
            return a * b * c
        }
    }
}

console.log(_multiply(2)(3)(4))

// 7. Partial Application with Closures
function partialSum(a) {
    return function(b, c, d) {
        return a + b + c + d
    }
}

const addFive = partialSum(5)
console.log(addFive(1, 2, 3))

// 8. Function Chaining
const stringManipulator = {
    value: '',
    setValue: function(str) {
        this.value = str
        return this
    },
    toUpperCase: function() {
        this.value = this.value.toUpperCase()
        return this
    },
    toLowerCase: function() {
        this.value = this.value.toLowerCase()
        return this
    },
    print: function() {
        console.log(this.value)
        return this
    }
}

stringManipulator.setValue('Hello')
    .toUpperCase()
    .print()
    .toLowerCase()
    .print()


// 9. Fibonacci
function getFibonacci() {
    let a = 0, b = 1
    return function() {
        const temp = a
        a = b
        b = temp + b
        return temp
    }
}

let fibonacci = getFibonacci()
console.log(fibonacci())
console.log(fibonacci())
console.log(fibonacci())
console.log(fibonacci())
console.log(fibonacci())
console.log(fibonacci())
console.log(fibonacci())
console.log(fibonacci())