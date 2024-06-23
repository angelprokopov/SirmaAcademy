// 1. Counting Orcs
function countOrcs(n, m, h) {
    let totalOrcs = 0;
    for (let i = 0; i < h; i++) {
        totalOrcs += n + i * m;
    }
    return totalOrcs;
}

console.log(countOrcs(5, 2,3)); // 21


// 2. Council of Elrond Votes
function councilOfElrondVotes(votes) {
    const voteCounts = {
        "Yes": 0,
        "No": 0,
        "Abstain": 0
    };
    votes.forEach(vote => voteCounts[vote]++);

    if (voteCounts["Yes"] > voteCounts["No"] && voteCounts["Yes"] > voteCounts["Abstain"]) {
        return "Yes";
    } else if (voteCounts["No"] > voteCounts["Yes"] && voteCounts["No"] > voteCounts["Abstain"]) {
        return "No";
    } else if (voteCounts["Abstain"] > voteCounts["Yes"] && voteCounts["Abstain"] > voteCounts["No"]) {
        return "Abstain";
    } else {
        return "Tie";
    }
}

console.log(councilOfElrondVotes(["Yes", "No", "Yes", "Abstain", "Yes"])) // 'Yes'

// 3. Elvish Code Cipher
function elvishCodeCipher(s, n) {
    return s.split('').map(char => {
        if (char.match(/[a-zA-Z]/)) {
            const charCode = char.charCodeAt(0);
            const baseCode = charCode >= 97 ? 97 : 65;
            return String.fromCharCode(((charCode - baseCode - n + 26) % 26) + baseCode);
        }
        return char;
    }).join('');
}

console.log(elvishCodeCipher('Uifsf!jt!b!tfdsfu!',1))

// 4. Orthanc Archives Search
function orthancArchivesSearch(records, searchTerm) {
    const firstOccurrence = records.indexOf(searchTerm);
    const lastOccurrence = records.lastIndexOf(searchTerm);

    if (firstOccurrence === -1) {
        return "Record not found";
    } else {
        return `First Occurrence: ${firstOccurrence}\nLast Occurrence: ${lastOccurrence}`;
    }
}

console.log(orthancArchivesSearch(["Frodo", "Sam", "Frodo", "Merry"], "Frodo")) // First Occurrence: 0 Last Occurrence: 2

// 5. Legendary Duels
function legendaryDuels(sequence) {
    const stack = [];
    const matches = { '(': ')', '!': '!', '{': '}' };

    for (const char of sequence) {
        if (char in matches) {
            stack.push(char);
        } else {
            const last = stack.pop();
            if (matches[last] !== char) {
                return "Not Legendary";
            }
        }
    }
    return stack.length === 0 ? "Legendary" : "Not Legendary";
}

console.log(legendaryDuels("()()(()())")) // Legendary

// 6. Rohan Cavalry Formation
function rohanCavalryFormation(formation, commands) {
    for (const command of commands) {
        const parts = command.split(' ');
        const action = parts[0];

        if (action === 'destroy' && parts.length === 2) {
            const index = parseInt(parts[1]);
            if (index >= 0 && index < formation.length) {
                formation.splice(index, 1);
            }
        } else if (action === 'swap' && parts.length === 3) {
            const index1 = parseInt(parts[1]);
            const index2 = parseInt(parts[2]);
            if (index1 >= 0 && index1 < formation.length && index2 >= 0 && index2 < formation.length) {
                [formation[index1], formation[index2]] = [formation[index2], formation[index1]];
            }
        } else if (action === 'add' && parts.length === 2) {
            const id = parseInt(parts[1]);
            formation.push(id);
        } else if (action === 'insert' && parts.length === 3) {
            const id = parseInt(parts[1]);
            const index = parseInt(parts[2]);
            if (index >= 0 && index <= formation.length) {
                formation.splice(index, 0, id);
            }
        } else if (action === 'center') {
            const len = formation.length;
            if (len % 2 === 0) {
                console.log(formation[Math.floor(len / 2) - 1], formation[Math.floor(len / 2)]);
            } else {
                console.log(formation[Math.floor(len / 2)]);
            }
        }
    }
    return formation;
}

console.log(rohanCavalryFormation([1, 2, 3, 4, 5], ["destroy 3", "swap 0 1", "add 6", "center"])) // // [2, 1, 3, 5, 6] and logs "3"