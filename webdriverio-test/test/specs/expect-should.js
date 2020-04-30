var expect = require('chai').expect;
var should = require('chai').should();

describe("Should and expect", function(){
    it("Should have the correct title", function(){
        browser.url('https://ultimateqa.com/dummy-automation-websites/');
        var title = browser.getTitle();
        console.log('This is the title: ',title);
        expect(title).to.equal("Complete List of Awesome Websites to Practice Automation Testing");
        /*Amount in miliseconds, is to make a pause before
        continuing
        */
        browser.pause(500);
        var url = browser.getUrl();
        should.equal(url, 'https://ultimateqa.com/dummy-automation-websites/');
    })
    it("Should be visible",function(){
        browser.url('https://ultimateqa.com/complicated-page/');
        let element = $('#Section_of_Buttons');
        var hasSection = element.isExisting();
        expect(hasSection, "Text section exists").to.be.true;
        browser.debug();
    })
})