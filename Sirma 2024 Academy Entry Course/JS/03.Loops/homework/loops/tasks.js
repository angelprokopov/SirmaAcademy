// 1. Numbers from 1 to 100
function printNumbersTo100() {
    for (let i = 1; i <= 100; i++) {
        console.log(i);
    }
}
// 2. Numbers N to 0 in Reverse Order
function printNumbersReverse(n) {
    for (let i = n; i >= 0; i--) {
        console.log(i);
    }
}
// 3. Numbers 1 to N through 2
function printNumbersStep2(n) {
    for (let i = 1; i <= n; i += 2) {
        console.log(i);
    }
}

// 4. Numbers 1 to N through M
function printNumbersStepM(n, m) {
    for (let i = 1; i <= n; i += m) {
        console.log(i);
    }
}

// 5. Letters in a Word
function printLetters(text) {
    for (let i = 0; i < text.length; i++) {
        console.log(text[i]);
    }
}

// 6. Sum of Vowels
function sumVowels(text) {
    const vowelValues = { a: 1, e: 2, i: 3, o: 4, u: 5 };
    let sum = 0;
    for (let i = 0; i < text.length; i++) {
        const char = text[i].toLowerCase();
        if (vowelValues[char]) {
            sum += vowelValues[char];
        }
    }
    console.log(sum);
}

// 7. Clock
function printClock() {
    for (let hour = 0; hour < 24; hour++) {
        for (let minute = 0; minute < 60; minute++) {
            console.log(`${hour}:${minute.toString().padStart(2, '0')}`);
        }
    }
}

// 8. Multiplication Table
function printMultiplicationTable() {
    for (let i = 1; i <= 10; i++) {
        for (let j = 1; j <= 10; j++) {
            console.log(`${i} * ${j} = ${i * j}`);
        }
    }
}
 // 9. Sum of Even Numbers
function sumEvenNumbers(n) {
    let sum = 0;
    for (let i = 2; i <= n * 2; i += 2) {
        sum += i;
    }
    console.log(sum);
}

// 10. Factorial Calculation
function factorial(n) {
    if (n === 0 || n === 1) {
        return 1;
    }
    let result = 1;
    for (let i = 2; i <= n; i++) {
        result *= i;
    }
    console.log(result);
}

// 11, Number Reversal
function reverseNumber(n) {
    const reversed = n.toString().split("").reverse().join("");
    console.log(parseInt(reversed, 10));
}

// 12. Fibonacci Sequence Sum
function fibonacciSum(n) {
    if (n <= 0) return 0;
    if (n === 1) return 1;

    let prev = 0,
        curr = 1,
        sum = 1;
    for (let i = 2; i < n; i++) {
        const next = prev + curr;
        sum += next;
        prev = curr;
        curr = next;
    }
    console.log(sum);
}

// 13. Palindrome Check
function isPalindrome(str) {
    const cleanedStr = str.toLowerCase().replace(/[^a-z0-9]/g, "");
    const reversedStr = cleanedStr.split("").reverse().join("");
    console.log(cleanedStr === reversedStr);
}

// 14. Armstrong Number Check
function isArmstrongNumber(n) {
    const numStr = n.toString();
    const numDigits = numStr.length;
    let sum = 0;
    for (let i = 0; i < numDigits; i++) {
        const digit = parseInt(numStr[i], 10);
        sum += digit ** numDigits;
    }
    console.log(sum === n);
}

// 15. Collatz Conjecture
function collatzSequence(n) {
    let sequence = [n];
    while (n !== 1) {
        n = n % 2 === 0 ? n / 2 : n * 3 + 1;
        sequence.push(n);
    }
    console.log(sequence.join(" "));
}

// 16. Hollow Rectangle Pattern
function printHollowRectangle(n, m) {
    for (let i = 0; i < n; i++) {
        let line = "";
        for (let j = 0; j < m; j++) {
            line += i === 0 || i === n - 1 || j === 0 || j === m - 1 ? "*" : " ";
        }
        console.log(line);
    }
}

// 17. New Building
function printBuilding(floors, rooms) {
    for (let i = floors; i >= 1; i--) {
        for (let j = 0; j < rooms; j++) {
            const type = i === floors ? "L" : i % 2 === 0 ? "O" : "A";
            console.log(`${type}${i}${j} `);
        }
        console.log("\n");
    }
}

// 18. Magic Number
function findMagicNumber(start, end, magicNumber) {
    let combinationFound = false;
    let combinationCount = 0;

    for (let i = start; i <= end; i++) {
        for (let j = start; j <= end; j++) {
            combinationCount++;
            if (i + j === magicNumber) {
                console.log(
                    `Combination ${combinationCount} - (${i} + ${j} = ${magicNumber})`
                );
                combinationFound = true;
                break;
            }
        }
        if (combinationFound) break;
    }

    if (!combinationFound) {
        console.log(
            `${combinationCount} combinations - neither equals ${magicNumber}`
        );
    }
}

// 19. Padawan Equipment
function calculatePadawanEquipment(money, students, saberPrice, robePrice, beltPrice) {
    const sabersNeeded = Math.ceil(students * 1.1);
    const beltsNeeded = students - Math.floor(students / 6);

    const totalCost =
        sabersNeeded * saberPrice + students * robePrice + beltsNeeded * beltPrice;

    if (totalCost <= money) {
        console.log(`The money is enough - it would cost ${totalCost.toFixed(2)}lv.`);
    } else {
        console.log(`George Lucas will need ${(totalCost - money).toFixed(2)}lv more.`);
    }
}

// 20. Rage Expenses
function calculateRageExpenses(
    lostGames,
    headsetPrice,
    mousePrice,
    keyboardPrice,
    displayPrice
) {
    let expenses = 0;
    let trashedKeyboards = 0;

    for (let i = 1; i <= lostGames; i++) {
        if (i % 2 === 0) expenses += headsetPrice;
        if (i % 3 === 0) expenses += mousePrice;
        if (i % 2 === 0 && i % 3 === 0) {
            expenses += keyboardPrice;
            trashedKeyboards++;
            if (trashedKeyboards % 2 === 0) expenses += displayPrice;
        }
    }

    console.log(`Rage expenses: ${expenses.toFixed(2)} lv.`);
}

// 21. Refactor Sum of Odd Numbers
function sumOddNumbers(n) {
    let sum = 0;
    for (let i = 0; i < n; i++) {
        const oddNumber = 2 * i + 1;
        console.log(oddNumber);
        sum += oddNumber;
    }
    console.log(`Sum: ${sum}`);
}

// 22. Numbers up to 1000, ending in 7
function printNumbersEndingIn7() {
    for (let i = 7; i <= 1000; i += 10) {
        console.log(i);
    }
}

// 23. Numbers up to 1000, ending in n
function printNumbersEndingInN(n) {
    for (let i = n; i <= 1000; i += 10) {
        console.log(i);
    }
}

// 24. Encoding
function encodeNumber(num) {
    const numStr = num.toString().split("").reverse().join("");
    for (let i = 0; i < numStr.length; i++) {
        const digit = parseInt(numStr[i], 10);
        if (digit === 0) {
            console.log("ZERO");
        } else {
            const charCode = 33 + digit;
            const char = String.fromCharCode(charCode);
            console.log(char.repeat(digit));
        }
    }
}

// 25. Coins and Notes
function findPaymentCombinations(coins1, coins2, notes5, sum) {
    for (let i = 0; i <= coins1; i++) {
        for (let j = 0; j <= coins2; j++) {
            for (let k = 0; k <= notes5; k++) {
                if (i + j * 2 + k * 5 === sum) {
                    console.log(
                        `${i} * 1 lv. + ${j} * 2 lv. + ${k} * 5 lv. = ${sum} lv.`
                    );
                }
            }
        }
    }
}

// 26. Even Pairs
function printEvenPrimePairs(start1, start2, diff1, diff2) {
    function isPrime(num) {
        if (num <= 1) return false;
        for (let i = 2; i <= Math.sqrt(num); i++) {
            if (num % i === 0) return false;
        }
        return true;
    }

    for (let i = start1; i <= start1 + diff1; i++) {
        for (let j = start2; j <= start2 + diff2; j++) {
            if (isPrime(i) && isPrime(j)) {
                console.log(`${i}${j}`);
            }
        }
    }
}

// 27. Change
function calculateCoins(amount) {
    const coins = [200, 100, 50, 20, 10, 5, 2, 1];
    let remainingAmount = Math.round(amount * 100); // Convert to stotinki
    let coinCount = 0;

    for (const coin of coins) {
        while (remainingAmount >= coin) {
            remainingAmount -= coin;
            coinCount++;
        }
    }

    console.log(coinCount);
}

// 28. Pyramid of Numbers
function printNumbPyramid(n) {
    let num = 1;
    for (let i = 1; i <= n; i++) {
        let line = "";
        for (let j = 1; j <= i; j++) {
            line += num + " ";
            num++;
        }
        console.log(line.trim());
    }
}

// 29. Unique Codes
function generateUniqueCodes(max1, max2, max3) {
    function isPrime(num) {
        if (num <= 1) return false;
        for (let i = 2; i <= Math.sqrt(num); i++) {
            if (num % i === 0) return false;
        }
        return true;
    }

    for (let i = 2; i <= max1; i += 2) {
        for (let j = 2; j <= max2; j++) {
            if (isPrime(j)) {
                for (let k = 2; k <= max3; k += 2) {
                    console.log(`${i}${j}${k}`);
                }
            }
        }
    }
}

// 30. Square of Asterisks
function drawAsteriskSquare(n) {
    for (let i = 0; i < n; i++) {
        let line = "";
        for (let j = 0; j < n; j++) {
            line += "* ";
        }
        console.log(line.trim());
    }
}

// 31. Half-Rhombus from Asterisks
function printHalfRhombus(n) {
    // Upper part of the rhombus
    for (let i = 1; i <= n; i++) {
        let line = "";
        for (let j = 1; j <= i; j++) {
            line += "*";
        }
        console.log(line);
    }

    // Lower part of the rhombus
    for (let i = n - 1; i >= 1; i--) {
        let line = "";
        for (let j = 1; j <= i; j++) {
            line += "*";
        }
        console.log(line);
    }
}

// 32. Rhombus from Asterisks
function printRhombus(n) {
    // Upper part of the rhombus
    for (let i = 1; i <= n; i++) {
        let line = " ".repeat(n - i);
        for (let j = 1; j <= i; j++) {
            line += "* ";
        }
        console.log(line.trim());
    }

    // Lower part of the rhombus
    for (let i = n - 1; i >= 1; i--) {
        let line = " ".repeat(n - i);
        for (let j = 1; j <= i; j++) {
            line += "* ";
        }
        console.log(line.trim());
    }
}

// 33. Tree Pattern
function printTree(n) {
    for (let i = 1; i <= n; i++) {
        const stars = "*".repeat(2 * i - 1);
        const spaces = " ".repeat(n - i);
        console.log(spaces + stars);
    }
    // Trunk of the tree
    for (let i = 1; i <= 2; i++) {
        const spaces = " ".repeat(n - 1);
        console.log(spaces + "*");
    }
}

// 34. Square Frame
function drawSquareFrame(n) {
    const topBottom = "+ " + "- ".repeat(n - 2) + "+";
    const middle = "| " + "- ".repeat(n - 2) + "|";

    console.log(topBottom);
    for (let i = 1; i <= n - 2; i++) {
        console.log(middle);
    }
    console.log(topBottom);
}


// 35. Christmas Tree
function printChristmasTree(n) {
    for (let i = 0; i < n; i++) {
        const spaces = " ".repeat(n - i - 1);
        const stars = "*".repeat(2 * i + 1);
        console.log(spaces + stars + " | " + stars);
    }
}

// 36. Sunglasses
function printSunglasses(n) {
    const topBottom = "*".repeat(n * 2) + " ".repeat(n) + "*".repeat(n * 2);
    const middleLine =
        "*" +
        "/".repeat(n * 2 - 2) +
        "*" +
        "|".repeat(n) +
        "*" +
        "/".repeat(n * 2 - 2) +
        "*";

    console.log(topBottom);
    for (let i = 1; i <= n - 2; i++) {
        const middle =
            i === Math.floor((n - 1) / 2) ? middleLine : "*".padEnd(n * 5, "/") + "*";
        console.log(middle);
    }
    console.log(topBottom);
}

// 37. House Patterns
function printHouse(n) {
    const middle = Math.floor(n / 2);
    for (let i = 0; i < n; i++) {
        const stars =
            i <= middle ? "*".repeat(2 * i + 1) : "*".repeat(n - 2 * (i - middle));
        const spaces = " ".repeat((n - stars.length) / 2);
        console.log(spaces + stars);
    }
}

// 38. Pyramid with Increasing Digits
function printDigitPyramid(n) {
    let num = 1;
    for (let i = 1; i <= n; i++) {
        let line = "";
        for (let j = 1; j <= i; j++) {
            line += num;
            num++;
        }
        for (let k = i - 1; k >= 1; k--) {
            num--;
            line += num;
        }
        console.log(line);
    }
}

// 39. Arrow Pattern
function printArrowPattern(n) {
    // Upper part of the arrow
    for (let i = 1; i <= n; i++) {
        const stars = "*".repeat(i);
        console.log(stars);
    }

    // Lower part of the arrow
    for (let i = n - 1; i >= 1; i--) {
        const stars = "*".repeat(i);
        console.log(stars);
    }
}

// 40. Staircase Pattern
function printStaircase(n) {
    for (let i = 1; i <= n; i++) {
        const hashes = "#".repeat(i);
        console.log(hashes);
    }
}

// 41. Hourglass Pattern
function printHourglass(n) {
    const middle = Math.floor(n / 2);
    for (let i = 0; i <= middle; i++) {
        const hashes = "#".repeat(n - 2 * i);
        const spaces = " ".repeat(i);
        console.log(spaces + hashes + spaces);
    }

    for (let i = middle - 1; i >= 0; i--) {
        const hashes = "#".repeat(n - 2 * i);
        const spaces = " ".repeat(i);
        console.log(spaces + hashes + spaces);
    }
}

// 42. Left Arrow Pattern
function printLeftArrow(n) {
    for (let i = 1; i <= n; i++) {
        const stars = "*".repeat(i);
        console.log(stars);
    }
    for (let i = n - 1; i >= 1; i--) {
        const stars = "*".repeat(i);
        console.log(stars);
    }
}

// 43. Pyramid of Numbers
function printNumPyramid(n) {
    let number = 1;
    for (let i = 1; i <= n; i++) {
        let line = "";
        for (let j = 1; j <= i; j++) {
            line += number + " ";
            number++;
            if (number > n) break;
        }
        console.log(line.trim());
        if (number > n) break;
    }
}

// 44. Alternative Conditions
function printNumberPyramid(n) {
    let num = 1;
    for (let i = 1; i <= n; i++) {
        let line = "";
        for (let j = 1; j <= i; j++) {
            line += num + " ";
            num++;
            if (num > n) break;
        }
        console.log(line.trim());
        if (num > n) break;
    }
}

// 45. Equal Sum of Odd and Even Positions
function printEqualSumNumbers(start, end) {
    let found = false;
    for (let num = start; num <= end; num++) {
        const numStr = num.toString();
        let oddSum = 0;
        let evenSum = 0;
        for (let i = 0; i < numStr.length; i++) {
            const digit = parseInt(numStr[i], 10);
            if (i % 2 === 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        if (oddSum === evenSum) {
            console.log(num);
            found = true;
        }
    }
    if (!found) {
        console.log("None");
    }
}

// 46. Password Generator
function generatePasswords(n, l) {
    const digits = Array.from({ length: n }, (_, i) => i + 1);
    const letters = Array.from({ length: l }, (_, i) =>
        String.fromCharCode(97 + i)
    ); // 'a' to 'a' + l - 1

    for (const d1 of digits) {
        for (const d2 of digits) {
            for (const l1 of letters) {
                for (const l2 of letters) {
                    for (const d3 of digits) {
                        if (d3 > d1 && d3 > d2) {
                            console.log(`${d1}${d2}${l1}${l2}${d3}`);
                        }
                    }
                }
            }
        }
    }
}

// 47. Special Numbers
function generateSpecialNumbers(n) {
    for (let num = 1111; num <= 9999; num++) {
        const numStr = num.toString();
        let isSpecial = true;
        for (const digit of numStr) {
            if (num % parseInt(digit, 10) !== 0) {
                isSpecial = false;
                break;
            }
        }
        if (isSpecial) {
            console.log(num);
        }
    }
}
