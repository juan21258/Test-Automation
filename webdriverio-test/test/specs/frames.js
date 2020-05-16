const assert = require('assert');

describe('frame cases', () =>{
    it('should switch to the frame', () =>{
        browser.url('https://demoqa.com/iframe-practice-page/');
        browser.switchToFrame($('iframe[id="IF1"]'));
        browser.pause(5000);
        $('//*[@id="page"]/a[1]').click();
        console.log("Text returned: " + $('//*[@id="page"]/a[1]').getText());
        browser.pause(8000);
        browser.switchToParentFrame();
        $('//*[@id="menu-top"]/li[1]/a').click();
    })
})