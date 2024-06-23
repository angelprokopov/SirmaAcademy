// Task 1: Sum First and Last Array Element
function sumFirstAndLast(arr) {
    if (arr.length === 0) return 0; // Handle empty arrays
    const first = Number(arr[0]);
    const last = Number(arr[arr.length - 1]);
    return first + last;
}

// Task 2: Day of Week
function getDayOfWeek(num) {
    const days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'];
    return (num >= 1 && num <= 7) ? days[num - 1] : 'Invalid day!';
}

// Task 3: Reverse an Array of Numbers
function reverseArray(n, arr) {
    return arr.slice(0, n).reverse();
}

// Task 4: Reverse an Array of Strings
function reverseArrayInPlace(arr) {
    for (let i = 0; i < arr.length / 2; i++) {
        [arr[i], arr[arr.length - 1 - i]] = [arr[arr.length - 1 - i], arr[i]];
    }
}

// Task 5: Sum Even Numbers
function sumEvenNumbers(arr) {
    return arr.reduce((sum, num) => sum + (Number(num) % 2 === 0 ? Number(num) : 0), 0);
}

// Task 6: Even and Odd Subtraction
function evenOddSubtraction(arr) {
    const evenSum = arr.reduce((sum, num) => sum + (num % 2 === 0 ? num : 0), 0);
    const oddSum = arr.reduce((sum, num) => sum + (num % 2 !== 0 ? num : 0), 0);
    return evenSum - oddSum;
}

// Task 7: Equal Arrays
function compareArrays(arr1, arr2) {
    if (arr1.length !== arr2.length) {
        return `Arrays are not identical. Found difference at 0 index`;
    }

    for (let i = 0; i < arr1.length; i++) {
        if (arr1[i] !== arr2[i]) {
            return `Arrays are not identical. Found difference at ${i} index`;
        }
    }

    const sum = arr1.reduce((acc, num) => acc + Number(num), 0);
    return `Arrays are identical. Sum: ${sum}`;
}

// Task 8: Condense Array to Number
function condenseArrayToNumber(nums) {
    while (nums.length > 1) {
        const condensed = [];
        for (let i = 0; i < nums.length - 1; i++) {
            condensed.push(nums[i] + nums[i + 1]);
        }
        nums = condensed;
    }
    return nums[0];
}

// Task 9: Print every N-th Element from an Array
function printEveryNthElement(arr, n) {
    const result = [];
    for (let i = 0; i < arr.length; i += n) {
        result.push(arr[i]);
    }
    return result.join(' ');
}

// Task 10: Add and Remove Elements from Array
function addAndRemove(commands) {
    const arr = [];
    let num = 1;

    for (const command of commands) {
        if (command === 'add') {
            arr.push(num);
        } else if (command === 'remove' && arr.length > 0) {
            arr.pop();
        }
        num++;
    }

    return arr.length > 0 ? arr.join(' ') : 'Empty';
}

// Task 11: Rotate Array
function rotateArray(arr, rotations) {
    const effectiveRotations = rotations % arr.length;
    return arr.slice(-effectiveRotations).concat(arr.slice(0, -effectiveRotations));
}

// Task 12: Extract a Non-Decreasing Subsequence from an Array
function extractNonDecreasingSubsequence(arr) {
    let currentBiggest = -Infinity;
    return arr.filter(num => {
        if (num >= currentBiggest) {
            currentBiggest = num;
            return true;
        }
        return false;
    });
}

// Task 13: Negative / Positive Numbers
function separateNegativePositive(arr) {
    const result = [];
    for (const num of arr) {
        if (num < 0) {
            result.unshift(num);
        } else {
            result.push(num);
        }
    }
    return result;
}

// Task 14: First and Last K Numbers
function printFirstAndLastK(k, arr) {
    console.log(arr.slice(0, k).join(' '));
    console.log(arr.slice(-k).join(' '));
}

// Task 15: Last K Numbers Sequence
function lastKNumbersSequence(n, k) {
    const sequence = [1];
    for (let i = 1; i < n; i++) {
        const start = Math.max(0, i - k);
        const sum = sequence.slice(start, i).reduce((a, b) => a + b, 0);
        sequence.push(sum);
    }
    return sequence;
}

// Task 16: Process Odd Numbers
function processOddNumbers(arr) {
    return arr.filter((_, index) => index % 2 !== 0)
        .map(num => num * 2)
        .reverse();
}

// Task 17: Smallest Two Numbers
function smallestTwoNumbers(arr) {
    return arr.sort((a, b) => a - b).slice(0, 2);
}

// Task 18: List of Products
function listProducts(products) {
    return products.sort()
        .map((product, index) => `${index + 1}.${product}`)
        .join('\n');
}

// Task 19: Array Manipulations
function arrayManipulations(commands) {
    let arr = commands.shift().split(' ').map(Number);

    for (const command of commands) {
        const [action, ...args] = command.split(' ');
        const num = Number(args[0]);
        const index = Number(args[1]);

        switch (action) {
            case 'Add':
                arr.push(num);
                break;
            case 'Remove':
                arr = arr.filter(n => n !== num);
                break;
            case 'RemoveAt':
                arr.splice(index, 1);
                break;
            case 'Insert':
                arr.splice(index, 0, num);
                break;
        }
    }

    return arr.join(' ');
}
