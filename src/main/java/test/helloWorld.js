/*goog.declareModuleId('test.HelloWorld');*/

goog.module('test.HelloWorld');



class HelloWorld {
    constructor() {
        var messageElement = document.createElement('p')
        var messageContent = document.createTextNode('ZZZ Hello, World! I’m a JavaScript module!')
        messageElement.appendChild(messageContent)
        document.body.appendChild(messageElement)
        console.log('The helloWorld function has executed.')
    }
}

exports = HelloWorld;

/*
export { HelloWorld };
*/

/*export { HelloWorld };*/
