const expect = require('chai').expect;
const LoginPage = require('../../pageobjects/login.page.js')
//it can also be:  var loginpage = require('../../pageobjects/login.page.js')
var loginpage = new LoginPage();
describe('login form', () => {
    it('should deny access with wrong creds', () => {
        
        loginpage.open();
        loginpage.username.setValue('foo')
        loginpage.password.setValue('bar')
        loginpage.submit()

        const messagge = loginpage.flash.getText();
        expect(messagge).to.contain('Your username is invalid!')
    })

    it('should allow access with correct creds', () => {
        loginpage.open()
        loginpage.username.setValue('tomsmith')
        loginpage.password.setValue('SuperSecretPassword!')
        loginpage.submit()

        const messagge = loginpage.flash.getText();
        expect(messagge).to.contain('You logged into a secure area!')
    })
})