

const array = [5, 2, 6, 4, 7, 3, 8];
for (let index = 1; index < array.length; index++) {
    while ((index - 1 >= 0) && (array[index - 1] > array[index])) {
        let temp = array[index];
        array[index] = array[index - 1];
        array[index - 1] = temp;
    }
}
array.forEach(value => console.log(value));
