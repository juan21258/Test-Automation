const loginPage = require('../pages/login.page');
const configData = require('../config');
const constants = require('../constants');

describe('Login page feature test',function(){
    it('Verify login page title',function(){
        //this.retries(2); It means that failed tests will be retried n times
        browser.url('/');
        browser.maximizeWindow();
        const title = loginPage.getPageTitle();
        console.log('Login page title is:',title);
        assert.equal(constants.LOGIN_PAGE_TITLE,title, 'Title is not found');
    })

    it('Verify sign up link', function(){
        assert.equal(true, loginPage.isSignUpLinkExist(),'Sign up link is missing');
    })

    it('Verify login',function(){
        loginPage.doLogin(configData.username,configData.password);
    })
})