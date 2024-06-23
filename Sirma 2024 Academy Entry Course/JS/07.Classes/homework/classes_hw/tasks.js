// Task 1: Cats
function cats(input) {
    class Cat {
        constructor(name, age) {
            this.name = name;
            this.age = age;
        }

        meow() {
            console.log(`${this.name}, age ${this.age} says meow`);
        }
    }

    for (const catStr of input) {
        const [name, age] = catStr.split(" ");
        const cat = new Cat(name, age);
        cat.meow();
    }
}

// Task 2: Person
class Person {
    constructor(firstName, lastName, age, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    toString() {
        return `${this.firstName} ${this.lastName} (age: ${this.age}, email: ${this.email})`;
    }
}

// Task 3: Circle
class Circle {
    constructor(radius) {
        this._radius = radius;
    }

    get radius() {
        return this._radius;
    }

    get diameter() {
        return this._radius * 2;
    }

    set diameter(diameter) {
        this._radius = diameter / 2;
    }

    get area() {
        return Math.PI * this._radius ** 2;
    }
}

// Task 4: Point Distance
class Point {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }

    static distance(p1, p2) {
        const dx = p2.x - p1.x;
        const dy = p2.y - p1.y;
        return Math.sqrt(dx ** 2 + dy ** 2);
    }
}

// Task 5: Class Laptop
class Laptop {
    constructor(info, quality) {
        this.info = info;
        this.quality = quality;
        this.isOn = false;
    }

    turnOn() {
        this.isOn = true;
        this.quality--;
    }

    turnOff() {
        this.isOn = false;
        this.quality--;
    }

    showInfo() {
        return JSON.stringify(this.info);
    }

    get price() {
        return 800 - this.info.age * 2 + this.quality * 0.5;
    }
}

// Task 6: School Book
class SchoolBook {
    constructor(title, author, price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    toString() {
        return `Title: ${this.title}, Author: ${this.author}, Price: ${this.price}`;
    }
}

// Task 7: Rectangle
class Rectangle {
    constructor(width, height, color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    calcArea() {
        return this.width * this.height;
    }
}

// Task 8: Data Class
class Request {
    constructor(method, uri, version, message) {
        this.method = method;
        this.uri = uri;
        this.version = version;
        this.message = message;
        this.response = undefined;
        this.fulfilled = false;
    }
}

// Task 9: Tickets
class Ticket {
    constructor(destination, price, status) {
        this.destination = destination;
        this.price = price;
        this.status = status;
    }
}

function tickets(ticketDescriptions, sortingCriterion) {
    const ticketObjects = ticketDescriptions.map((description) => {
        const [destination, price, status] = description.split("|");
        return new Ticket(destination, Number(price), status);
    });

    ticketObjects.sort((a, b) => {
        if (a[sortingCriterion] < b[sortingCriterion]) return -1;
        if (a[sortingCriterion] > b[sortingCriterion]) return 1;
        return 0; // Maintain original order for ties
    });

    return ticketObjects;
}

// Task 10: Sorted List
class SortedList {
    constructor() {
        this.list = [];
    }

    add(element) {
        this.list.push(element);
        this.list.sort((a, b) => a - b);
    }

    remove(index) {
        if (index >= 0 && index < this.list.length) {
            this.list.splice(index, 1);
        }
    }

    get(index) {
        if (index >= 0 && index < this.list.length) {
            return this.list[index];
        }
    }

    get size() {
        return this.list.length;
    }
}

// Task 11: String Container
class StringContainer {
    constructor() {
        this.strings = [];
    }

    append(string) {
        this.strings.push(string);
    }

    removeAt(index) {
        if (index >= 0 && index < this.strings.length) {
            this.strings.splice(index, 1);
        }
    }

    get(index) {
        if (index >= 0 && index < this.strings.length) {
            return this.strings[index];
        }
    }

    get size() {
        return this.strings.length;
    }
}

// Task 12: Company
class Company {
    constructor() {
        this.departments = {};
    }

    addEmployee(name, salary, position, department) {
        if (!name || !salary || !position || !department || salary < 0) {
            throw new Error("Invalid input!");
        }
        if (!this.departments[department]) {
            this.departments[department] = [];
        }
        this.departments[department].push({ name, salary, position });

        return `New employee is hired. Name: ${name}. Position: ${position}`;
    }

    bestDepartment() {
        let bestDepartment = null;
        let highestAvgSalary = 0;

        for (const department in this.departments) {
            const employees = this.departments[department];
            const avgSalary =
                employees.reduce((sum, emp) => sum + emp.salary, 0) / employees.length;

            if (avgSalary > highestAvgSalary) {
                highestAvgSalary = avgSalary;
                bestDepartment = department;
            }
        }
        let output = `Best Department is: ${bestDepartment}\n`;
        output += `Average salary: ${highestAvgSalary.toFixed(2)}\n`;

        this.departments[bestDepartment]
            .sort((a, b) => b.salary - a.salary || a.name.localeCompare(b.name))
            .forEach((emp) => {
                output += `${emp.name} ${emp.salary} ${emp.position}\n`;
            });

        return output;
    }
}

// Task 13: Car Company
class CarCompany {
    constructor() {
        this.production = {};
    }

    addCar(brand, model, producedCars) {
        if (!this.production[brand]) {
            this.production[brand] = {};
        }
        this.production[brand][model] =
            (this.production[brand][model] || 0) + producedCars;
    }

    getReport() {
        let report = "";
        for (const brand in this.production) {
            report += `${brand}\n`;
            for (const model in this.production[brand]) {
                report += `###${model} -> ${this.production[brand][model]}\n`;
            }
        }
        return report;
    }
}
