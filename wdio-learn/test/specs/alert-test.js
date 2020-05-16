const alertPage = require('../../pages/alertpage');
const assert = require('assert');

describe('Handle alert pop ups', function(){

    beforeEach(function(){
        browser.url("http://the-internet.herokuapp.com/javascript_alerts");
    });

    xit('Accept alert', function(){
        alertPage.clickOnAlertButton(1);
        const alertText = browser.getAlertText();
        console.log(alertText);
        assert.equal('I am a JS Alert',alertText);
        browser.acceptAlert();
        console.log('This is the result text:',alertPage.resultText);        assert.equal('You successfuly clicked an alert',alertPage.resultText);
        browser.pause(3000);
    })

    xit('Dismiss alert', function(){
        alertPage.clickOnAlertButton(2);
        const alertText = browser.getAlertText();
        console.log(alertText);
        assert.equal('I am a JS Confirm',alertText);
        browser.dismissAlert();
        console.log('This is the result text:',alertPage.resultText);        assert.equal('You clicked: Cancel',alertPage.resultText);
        browser.pause(3000);
    })

    it('Enter text alert and accept', function(){
        alertPage.clickOnAlertButton(3);
        browser.sendAlertText('This is an alert text');
        browser.acceptAlert();
        console.log('This is the result text:',alertPage.resultText);
        assert.equal('You entered: This is an alert text',alertPage.resultText);
        browser.pause(3000);
    })
})