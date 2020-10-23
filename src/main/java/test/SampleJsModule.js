// goog.declareModuleId('test.SampleJsModule.shim');

class SampleJsModule {
    constructor() {
        var messageElement = document.createElement('p')
        var messageContent = document.createTextNode('ZZZ Hello, World! I’m a JavaScript module!')
        messageElement.appendChild(messageContent)
        document.body.appendChild(messageElement)
        console.log('The helloWorld function has executed.')
    }

    helloWorld() {
        return "Hello from a module"
    }
}

export {SampleJsModule};