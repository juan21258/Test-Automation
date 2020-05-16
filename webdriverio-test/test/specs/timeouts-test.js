const assert = require('assert');

describe('webdriver.io page', ()=>{
    it('should have the right title', ()=>{
        browser.url('https://webdriver.io');
        const title = browser.getTitle();
        var timeout = browser.getTimeouts();
        console.log("time out returned as : " + JSON.stringify(timeout));
        browser.setTimeouts(40000,50000,120000);
        timeout = browser.getTimeouts();
        console.log("time out returned as : " + JSON.stringify(timeout));
        assert.strictEqual(title,'WebdriverIO · Next-gen browser and mobile automation test framework for Node.js')
    })
})