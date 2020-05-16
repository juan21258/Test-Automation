const expect = require('chai').expect;
const LoginPage = require('../../pageobjects/login.page.js')
//it can also be:  var loginpage = require('../../pageobjects/login.page.js')
const loginData = require('../../data/logindata');
var loginpage = new LoginPage();
describe('login form', () => {
    it('should deny access with wrong creds', () => {
        
        loginpage.open();
        loginpage.username.setValue(loginData.incorrectUser)
        loginpage.password.setValue(loginData.incorrectPassword)
        loginpage.submit()

        const messagge = loginpage.flash.getText();
        expect(messagge).to.contain('Your username is invalid!')
    })

    it('should allow access with correct creds', () => {
        loginpage.open()
        loginpage.username.setValue(loginData.correctUser)
        loginpage.password.setValue(loginData.correctPassword)
        loginpage.submit()

        const messagge = loginpage.flash.getText();
        expect(messagge).to.contain('You logged into a secure area!')
    })
})