// Task 1: Smallest of Three Numbers
function findSmallest(num1, num2, num3) {
    return Math.min(num1, num2, num3)
}

// Task 2: Add and Subtract
function addAndSubtract(num1, num2, num3) {
    const sum = num1 + num2;
    return sum - num3;
}

// Task 3: Characters in Range
function charactersInRange(char1, char2) {
    let result = "";
    for (let i = char1.charCodeAt(0) + 1; i < char2.charCodeAt(0); i++) {
        result += String.fromCharCode(i) + " ";
    }
    return result.trim(); // Remove trailing space
}

// Task 4: Odd and Even Sum
function oddAndEvenSum(number) {
    const numStr = number.toString();
    let oddSum = 0;
    let evenSum = 0;
    for (const digit of numStr) {
        if (parseInt(digit) % 2 === 0) {
            evenSum += parseInt(digit);
        } else {
            oddSum += parseInt(digit);
        }
    }
    return `Odd sum = ${oddSum}, Even sum = ${evenSum}`;
}

// Task 5: Palindrome Integers
function isPalindrome(number) {
    const numStr = number.toString();
    return numStr === numStr.split("").reverse().join("");
}

function checkPalindromes(numbers) {
    return numbers.map(isPalindrome);
}

// Task 6: Password Validator
function isValidLength(password) {
    return password.length >= 6 && password.length <= 10;
}

function containsOnlyLettersAndDigits(password) {
    return /^[A-Za-z0-9]+$/.test(password);
}

function hasAtLeastTwoDigits(password) {
    let digitCount = 0;
    for (const char of password) {
        if (/\d/.test(char)) {
            digitCount++;
        }
    }
    return digitCount >= 2;
}

function validatePassword(password) {
    const isValid =
        isValidLength(password) &&
        containsOnlyLettersAndDigits(password) &&
        hasAtLeastTwoDigits(password);

    if (isValid) {
        console.log("Password is valid");
    } else {
        if (!isValidLength(password)) {
            console.log("Password must be between 6 and 10 characters");
        }
        if (!containsOnlyLettersAndDigits(password)) {
            console.log("Password must consist only of letters and digits");
        }
        if (!hasAtLeastTwoDigits(password)) {
            console.log("Password must have at least 2 digits");
        }
    }
}

// Task 7: Shortest and Longest Word
function findShortestAndLongestWord(sentence) {
    const words = sentence.split(" ");
    let shortest = words[0];
    let longest = words[0];

    for (const word of words) {
        if (word.length < shortest.length) {
            shortest = word;
        }
        if (word.length > longest.length) {
            longest = word;
        }
    }
    return `Longest -> ${longest}\nShortest -> ${shortest}`;
}

// Task 8: Perfect Number
function isPerfectNumber(number) {
    if (number <= 1) {
        return "It's not so perfect.";
    }

    let sum = 1; // Start with 1 as a divisor
    for (let i = 2; i * i <= number; i++) {
        if (number % i === 0) {
            sum += i;
            if (i * i !== number) {
                sum += number / i;
            }
        }
    }

    return sum === number
        ? `Perfect number!\n1 + ${[...Array(number - 1).keys()]
            .map((i) => i + 1)
            .filter((i) => number % i === 0)
            .join(" + ")}`
        : "It's not so perfect.";
}

// Task 9: Progress Bar
function visualizeProgressBar(percentage) {
    const filledBlocks = Math.floor(percentage / 10);
    const emptyBlocks = 10 - filledBlocks;
    const bar = `[${"%".repeat(filledBlocks)}${".".repeat(emptyBlocks)}]`;
    const message = percentage === 100 ? "Complete!" : "Loading...";
    return `${percentage}% ${bar}\n${message}`;
}

// Task 10: Factorial Division
function factorial(n) {
    if (n === 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

function factorialDivision(num1, num2) {
    const result = factorial(num1) / factorial(num2);
    return result.toFixed(2);
}
