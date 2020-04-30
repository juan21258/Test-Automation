//Non functional test due to web page
const expect = require('chai').expect;

browser.addCommand('isVideoPaused', function(){
    var isPaused = browser.execute(function(){
        //Run something inside of the browser
        var video = document.querySelector('#somevideo');
        return video.paused;    
    })
    return isPaused.value;
})

describe("Check a video", function(){
    this.beforeEach(function(){
        browser.url('/');
        browser.elementClick('video section');
    })

    it('should open a paused video', function(){
        var isPaused = browser.isVideoPaused();
        expect(isPaused).to.be.true;
    })

    it('play video on click', function(){
        browser.elementClick('playbutton');
        var isPaused = browser.isVideoPaused();
        expect(isPaused).to.be.false;
    })
})