'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function (inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function () {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'encryption' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function encryption(s) {
    const size = s.length;
    const num = Math.sqrt(size)
    const upNum = Math.ceil(num)
    let result = []
    for (let i = 0; i < upNum; i++) {
        let item = s[i];
        let k = i
        while (k < size) {
            let nextIndex = k + upNum
            if (nextIndex <= (size - 1)) {
                item += s[nextIndex]
            }
            k = nextIndex
        }
        result.push(item + " ")
    }
    return result.join("")
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const s = readLine();

    const result = encryption(s);

    ws.write(result + '\n');

    ws.end();
}
