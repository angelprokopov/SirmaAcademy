// 2. Check for an excellent rating
function isExcellent(grade) {
    if (grade >= 5.50) {
        console.log("Excellent!");
    }
}

// 3. Larger number
function printLargerNumber(num1, num2) {
    console.log(Math.max(num1, num2));
}

// 4. Number from 0 to 9 in words
function numberToWord(num) {
    const words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    console.log(num >= 0 && num <= 9 ? words[num] : "too big");
}

// 5. Face of figures
function calculateArea(figure, a, b) {
    let area = 0;
    switch (figure) {
        case "square":
            area = a * a;
            break;
        case "rectangle":
            area = a * b;
            break;
        case "circle":
            area = Math.PI * a * a;
            break;
        case "triangle":
            area = (a * b) / 2;
            break;
    }
    console.log(area.toFixed(2));
}

// 6. Day of the week
function printDayOfWeek(dayNumber) {
    const daysOfWeek = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
    console.log(dayNumber >= 1 && dayNumber <= 7 ? daysOfWeek[dayNumber - 1] : "Error");
}

// 7. Even or odd
function checkEvenOrOdd(num) {
    console.log(num % 2 === 0 ? "even" : "odd");
}

// 8. Speed
function printSpeedInfo(speed) {
    if (speed <= 10) {
        console.log("slow");
    } else if (speed <= 60) {
        console.log("average");
    } else if (speed <= 120) {
        console.log("fast");
    } else if (speed <= 160) {
        console.log("super-fast");
    } else {
        console.log("turbo-fast");
    }
}

// 9. Alarm after 15 minutes
function calculateAlarm(hours, minutes) {
    minutes += 15;
    if (minutes >= 60) {
        hours = (hours + 1) % 24;
        minutes -= 60;
    }
    console.log(`${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}`);
}

// 10. Address by age and gender
function printAddress(age, gender) {
    if (gender === "f") {
        console.log(age >= 16 ? "Ms." : "Miss");
    } else if (gender === "m") {
        console.log(age >= 16 ? "Mr." : "Master");
    }
}

// 11. Grocery
function calculateGroceryCost(product, city, quantity) {
    const prices = {
        Sofia: { tea: 0.5, water: 0.8, juice: 1.2, sweets: 1.45, chips: 1.6 },
        Plovdiv: { tea: 0.4, water: 0.7, juice: 1.15, sweets: 1.3, chips: 1.5 },
        Varna: { tea: 0.45, water: 0.7, juice: 1.1, sweets: 1.35, chips: 1.55 },
    };

    if (prices[city] && prices[city][product]) {
        const cost = prices[city][product] * quantity;
        console.log(cost.toFixed(2));
    } else {
        console.log("Invalid product or city");
    }
}

// 12. Number in the range
function checkNumberInRange(num) {
    console.log(num >= -100 && num <= 100 && num !== 0 ? "Yes" : "No");
}

// 13. Simple Calculator
function simpleCalculator(num1, num2, operation) {
    let result;
    switch (operation) {
        case "add":
            result = num1 + num2;
            break;
        case "subtract":
            result = num1 - num2;
            break;
        case "divide":
            if (num2 === 0) {
                console.log("Division by zero is not allowed");
                return;
            }
            result = num1 / num2;
            break;
        case "multiply":
            result = num1 * num2;
            break;
        default:
            console.log("Invalid operation");
            return;
    }
    console.log(result.toFixed(2));
}
// 14. Vegetable Market
function calculateVegetablePrice(vegetable, day, quantity) {
    const prices = {
        weekday: { tomato: 2.5, onion: 1.2, lettuce: 0.85, cucumber: 1.45, pepper: 5.5 },
        weekend: { tomato: 2.8, onion: 1.3, lettuce: 0.85, cucumber: 1.75, pepper: 3.5 },
    };

    const dayType = ["Saturday", "Sunday"].includes(day) ? "weekend" : "weekday";

    if (prices[dayType][vegetable]) {
        const cost = prices[dayType][vegetable] * quantity;
        console.log(cost.toFixed(2));
    } else {
        console.log("error");
    }
}

// 15. Holiday
function planHoliday(budget, season) {
    let destination, accommodation, costPercent;

    if (budget <= 100) {
        destination = "Bulgaria";
        costPercent = season === "summer" ? 30 : 70;
    } else if (budget <= 1000) {
        destination = "Europe";
        costPercent = season === "summer" ? 40 : 80;
    } else {
        destination = "Asia";
        costPercent = 90;
    }

    accommodation = season === "summer" && destination !== "Asia" ? "Camp" : "Hotel";
    const amountSpent = (budget * costPercent) / 100;

    console.log(`Somewhere in ${destination}`);
    console.log(`${accommodation} - ${amountSpent.toFixed(2)}`);
}

// 16. Makeup Shop
function calculateMakeupProfit(renovationCost, powders, lipsticks, spirals, shadows, concealers) {
    const prices = { powder: 2.6, lipstick: 3, spiral: 4.1, shadows: 8.2, concealer: 2 };
    const totalItems = powders + lipsticks + spirals + shadows + concealers;
    let totalPrice = powders * prices.powder + lipsticks * prices.lipstick + spirals * prices.spiral + shadows * prices.shadows + concealers * prices.concealer;

    if (totalItems >= 50) {
        totalPrice *= 0.75; // 25% discount
    }

    const profit = totalPrice * 0.9; // 10% rent deduction

    if (profit >= renovationCost) {
        console.log(`Yes! ${(profit - renovationCost).toFixed(2)} BGN left.`);
    } else {
        console.log(`Not enough money! ${(renovationCost - profit).toFixed(2)} BGN needed.`);
    }
}

// 17: At sea
function calculateVacationCost(days, roomType, feedback) {
    const prices = { "single room": 25, apartment: 50, "president apartment": 100 };
    const nights = days - 1;
    let totalPrice = nights * prices[roomType];

    if (roomType === "apartment") {
        if (nights < 10) {
            totalPrice *= 0.7;
        } else if (nights <= 15) {
            totalPrice *= 0.65;
        } else {
            totalPrice *= 0.5;
        }
    } else if (roomType === "president apartment") {
        if (nights < 10) {
            totalPrice *= 0.9;
        } else if (nights <= 15) {
            totalPrice *= 0.85;
        } else {
            totalPrice *= 0.8;
        }
    }

    totalPrice *= feedback === "positive" ? 1.25 : 0.9;
    console.log(totalPrice.toFixed(2));
}

// 18. Grade Calculator
function calculateGrade(score) {
    if (score >= 90) {
        console.log("A");
    } else if (score >= 80) {
        console.log("B");
    } else if (score >= 70) {
        console.log("C");
    } else if (score >= 60) {
        console.log("D");
    } else {
        console.log("F");
    }
}

// 19. Leap Year Checker
function checkLeapYear(year) {
    const isLeap = (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0;
    console.log(isLeap ? "It's a leap year!" : "It's not a leap year.");
}

// 20. Movie Ticket Price
function calculateTicketPrice(age) {
    if (age <= 12) {
        console.log("$5");
    } else if (age <= 19) {
        console.log("$8");
    } else {
        console.log("$10");
    }
}

// 21. Days in a Month
function getDaysInMonth(month) {
    const daysInMonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    if (month >= 1 && month <= 12) {
        console.log(daysInMonth[month - 1]);
    } else {
        console.log("Invalid month");
    }
}

// 22. University Admissions
function checkAdmission(score, extracurriculars) {
    if (score >= 90) {
        console.log("Admitted");
    } else if (score >= 80 && extracurriculars >= 2) {
        console.log("Admitted");
    } else {
        console.log("Not admitted");
    }
}

// 23. Discount Calculator
function calculateDiscount(age, hasMembership) {
    let discount = 0;
    if (age < 18) {
        discount = 10;
    } else if (age <= 64) {
        discount = hasMembership === "Yes" ? 20 : 10;
    } else {
        discount = 30;
    }
    console.log(`${discount}% discount`);
}

// 24. Movie Classification
function getMovieCategory(age) {
    if (age < 13) {
        console.log("U-rated movies");
    } else if (age <= 17) {
        console.log("U and PG-13 rated movies");
    } else {
        console.log("All movies");
    }
}

// 25. Airline Luggage Charges
function calculateLuggageCharges(weight, dimensions) {
    const totalDimensions = dimensions.reduce((sum, dim) => sum + dim, 0);
    let charges = 0;

    if (weight > 50) {
        charges += 100;
    }

    if (totalDimensions > 158) {
        const excess = totalDimensions - 158;
        if (excess <= 20) {
            charges += 50;
        } else if (excess <= 50) {
            charges += 100;
        } else {
            charges += 200;
        }
    }
    if (weight > 50 && totalDimensions > 158) {
        charges += 50;
    }
    console.log(`$${charges}`);
}

// 26. Adventure Game: Path Decision
function choosePath(rightHand, leftHand) {
    if (rightHand === "sword" || leftHand === "sword") {
        console.log((rightHand === "shield" || leftHand === "shield") ? "Path to the castle" : "Path to the forest");
    } else if (rightHand === "map" || leftHand === "map") {
        console.log((rightHand === "coins" || leftHand === "coins") ? "Go to the town" : "Camp at the current spot and prepare for the next day");
    } else {
        console.log("Wander aimlessly");
    }
}

// 27. Potion Brewing Decision
function brewPotion(ingredient1, ingredient2) {
    if (ingredient1 === "herbs" || ingredient2 === "herbs") {
        if (ingredient1 === "water" || ingredient2 === "water") {
            console.log("Health potion");
        } else if (ingredient1 === "oil" || ingredient2 === "oil") {
            console.log("Stealth potion");
        } else {
            console.log("Minor stamina potion");
        }
    } else if (ingredient1 === "berries" || ingredient2 === "berries") {
        console.log((ingredient1 === "sugar" || ingredient2 === "sugar") ? "Speed potion" : "Minor energy potion");
    } else {
        console.log("Can't brew any potion");
    }
}

// 28. Survival in the Wilderness
function wildernessSurvival(timeOfDay, environment, item) {
    if (timeOfDay === "day") {
        if (environment === "forest") {
            if (item === "knife") {
                console.log("Hunt for food");
            } else if (item === "container") {
                console.log("Collect berries");
            } else {
                console.log("Explore");
            }
        } else if (environment === "desert") {
            console.log(item === "hat" ? "Search for water" : "Find shade");
        }
    } else if (timeOfDay === "night") {
        if (environment === "forest") {
            console.log(item === "firestarter" ? "Make a campfire" : "Climb a tree for safety");
        } else if (environment === "desert") {
            console.log(item === "blanket" ? "Sleep" : "Keep moving to stay warm");
        }
    }
}

// 29. Climate Zone Identifier
function identifyClimateZone(latitude, hemisphere) {
    const absLatitude = Math.abs(latitude);
    if (absLatitude > 66.5) {
        console.log("Arctic Zone");
    } else if (absLatitude >= 23.5) {
        console.log("Temperate Zone");
    } else if (absLatitude > 0) {
        console.log("Tropic Zone");
    } else {
        console.log("Equator");
    }
}

// 30. Architectural Era Identifier
function identifyArchitecturalEra(year, material) {
    if (year < 500 && material === "stone") {
        console.log("Ancient");
    } else if (year >= 500 && year <= 1500 && material === "stone") {
        console.log("Medieval");
    } else if (year > 1500 && year <= 1800 && material === "wood") {
        console.log("Colonial");
    } else if (year > 1800 && year <= 1900 && material === "steel") {
        console.log("Industrial");
    } else if (year > 1900 && material === "steel") {
        console.log("Modern");
    } else {
        console.log("Uncertain");
    }
}

