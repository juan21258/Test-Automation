class ElementUtil{

    doClick(element){
        element.waitForDisplayed();
        element.click();
    }

    doSetValue(element,value){
        element.waitForDisplayed();
        element.setValue(value);
    }

    doGetText(element){
        element.waitForDisplayed();
        return element.getText();
    }

    doIsDisplayed(element){
        element.waitForDisplayed();
        return element.isDisplayed();
    }

    doGetPageTitle(pageTitle){
        //Wait until the title equals the given string
        browser.waitUntil(function(){
            return (browser.getTitle() === pageTitle);
        }, 10000, 'Title is not displayed after the given time')
        return browser.getTitle();
    }
}

module.exports = new ElementUtil();