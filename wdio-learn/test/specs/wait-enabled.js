const assert = require('assert');

describe('Waiting cases',function(){
    
    beforeEach(function(){
        browser.reloadSession();
        browser.url("http://classic.crmpro.com/register/");
    });

    it('Should wait for button to be enabled', function(){
        const checkBox = $('//input[@name="agreeTerms"]');
        const submitBtn = $('#submitButton');
        checkBox.click();
        browser.pause(3000);
        submitBtn.waitForEnabled(4000);
        assert.equal(true,submitBtn.isEnabled());
    })

    it('Should wait for button to be disabled', function(){
        const checkBox = $('//input[@name="agreeTerms"]');
        const submitBtn = $('#submitButton');
        checkBox.click();
        submitBtn.waitForEnabled(4000);
        browser.pause(1500);
        checkBox.click();
        submitBtn.waitForEnabled({reverse: true}); //true means the reverse(disabled) is the one in use
        browser.pause(2000);
        assert.equal(false, submitBtn.isEnabled());
    })
})