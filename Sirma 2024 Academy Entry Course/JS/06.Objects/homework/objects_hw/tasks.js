// Task 1: Person Data
function createPerson(name, surname, age) {
    return {
        firstName: name,
        lastName: surname,
        age: age
    };
}

// Task 2: Town
function printTownProperties(town) {
    for (const key in town) {
        console.log(`${key} -> ${town[key]}`);
    }
}

// Task 3: Convert to Object
function convertToJson(jsonText) {
    const obj = JSON.parse(jsonText);
    for (const key in obj) {
        console.log(`${key}: ${obj[key]}`);
    }
}

// Task 4: Convert to JSON
function convertToJSON(name, lastName, eyeColor) {
    const person = {
        name: name,
        lastName: lastName,
        eyeColor: eyeColor
    };
    console.log(JSON.stringify(person));
}

// Task 5: Phonebook
function updatePhonebook(entries) {
    const phonebook = {};
    for (const entry of entries) {
        const [name, number] = entry.split(" ");
        phonebook[name] = number;
    }
    for (const name in phonebook) {
        console.log(`${name} -> ${phonebook[name]}`);
    }
}

// Task 6: Movies
function manageMovies(commands) {
    const movies = [];
    for (const command of commands) {
        const parts = command.split(" ");
        if (parts[0] === "addMovie") {
            movies.push({ name: parts[1] });
        } else {
            const movie = movies.find((m) => m.name === parts[0]);
            if (movie) {
                if (parts[1] === "directedBy") {
                    movie.director = parts.slice(2).join(" ");
                } else if (parts[1] === "onDate") {
                    movie.date = parts[2];
                }
            }
        }
    }
    for (const movie of movies) {
        if (movie.director && movie.date) {
            console.log(JSON.stringify(movie));
        }
    }
}
