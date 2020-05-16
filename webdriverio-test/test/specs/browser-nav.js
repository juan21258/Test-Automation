const assert = require('assert');

describe('webdriver.io page', ()=>{
    it('should have the right title', ()=>{
        browser.url('https://webdriver.io');
        console.log("My current url is: " + browser.getUrl());
        browser.navigateTo('https://google.com/')
        console.log("My current url is: " + browser.getUrl());
        browser.back();
        console.log("My current url after back() is: " + browser.getUrl());
        browser.forward();
        console.log("My current url after forward() is: " + browser.getUrl());
        browser.refresh();
        console.log("Page refreshed successfully ...");
        browser.pause(3000);
    })
})