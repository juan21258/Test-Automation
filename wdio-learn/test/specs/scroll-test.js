const crmPage = require('../../pages/crm.page.js');

describe('Scroll to element', function(){

    it('Should scroll to forgot pwd link', function(){
        browser.url("https://classic.crmpro.com/");
        crmPage.forgotpwdLink.scrollIntoView();
        console.log("in view port", crmPage.forgotpwdLink.isDisplayedInViewport());
        crmPage.moveToElement(crmPage.forgotpwdLink);
        crmPage.forgotpwdLink.click();
    })
})