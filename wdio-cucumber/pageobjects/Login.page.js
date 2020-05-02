class Loginpage {
    get username() { return $('input[name="userName"]');}
    get password() { return $('input[name="password"]');}
    get submitBtn() { return $('input[name="login"]');}

    openBrowser(){
        browser.url('/');
    }

    login(){
        this.username.setValue("mercury");
        this.password.setValue("mercury");
        this.submitBtn.click();
    }
}
export default new Loginpage();