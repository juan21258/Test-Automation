class AlertPage{
    get result(){
        return $('#result');
    }
    get resultText(){
        return this.result.getText();
    }

    alertButton(index){
        return $(`ul li:nth-child(${index}) button`);
    }

    clickOnAlertButton(index){
        this.alertButton(index).waitForDisplayed();
        this.alertButton(index).click();
    }

}

module.exports = new AlertPage();