describe('Wait until sync for the elements',function(){
    it('Wait for the home page', function(){
        browser.url('https://app.hubspot.com/login');
        const email = $('#username');
        const password = $('#password');
        const loginButton = $('#loginBtn');

        browser.waitUntil(function(){
            return email.isDisplayed() === true}, 6000, 
            'Email is not displayed after the given time');
        email.setValue('naveenanimation30@gmail.com');
        password.setValue('Test@1234');
        loginButton.click();

        browser.pause(2000);
    })
})