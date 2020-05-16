const assert = require('assert');

describe('Find elements',()=>{
    it('Should find the element',()=>{
        browser.url('https://demoqa.com/automation-practice-table/');
        var tableobj = browser.findElement("xpath","//*[@id='content']/div/table");
        //var tableobj = browser.findElement("css selector","#content > table");
        var firstrowelements = browser.findElements("xpath", "//*[@id='content']/div/table/tbody/tr[1]/td");
        browser.pause(4000);
        var struct = browser.findElementFromElement("//*[@id='content']/div/table","xpath","tbody/tr[1]/td[1]");
        console.log("Text returned: " + struct.toString());
    })
})