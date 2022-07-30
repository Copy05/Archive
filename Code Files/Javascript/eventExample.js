const { EventEmitter } = require('events')
const event = new EventEmitter()

event.on('init', () =>{
    console.log("Hello");
})

event.emit('init')