
describe('webdriver.io page', () =>{
    it('should manage new windows',()=>{
        browser.url('https://demoqa.com/automation-practice-switch-windows-2/');
        console.log("Title of the page is: " + browser.getTitle());
        console.log("Browser session id " + browser.getWindowHandle());
        $('#button1').click();
        browser.getWindowHandles();
        console.log("Multiple windows present ? " + browser.getWindowHandles());
        var handles = browser.getWindowHandles();
        //browser.switchToWindow(handles[1]);
        console.log("Browser session id after switch: " + browser.getWindowHandle());
        browser.createWindow("tab"); //Type of window that we are going to create
        browser.pause(3000);
        browser.closeWindow();
        browser.pause(3000);
        //console.log("Window closed");
        //console.log("Browser session id afert closing the window: " + browser.getWindowHandle());
    })
})