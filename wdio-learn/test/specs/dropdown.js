describe('Dropdown handling', function(){
    
    beforeEach(function(){
        browser.url("https://www.facebook.com/");
    });

    xit('Select dropdown value by text', function(){
        $('#day').selectByVisibleText('11');
        $('#month').selectByVisibleText('Apr');
        $('#year').selectByVisibleText('1995');
        browser.pause(3000);
    })

    xit('Select dropdown value by index', function(){
        $('#day').selectByIndex(6);
        $('#month').selectByIndex(6);
        $('#year').selectByIndex(6);
        browser.pause(3000);
    })

    xit('Select dropdown value by attribute value', function(){
        $('#day').selectByAttribute('value','25');
        $('#month').selectByAttribute('value','7');
        $('#year').selectByAttribute('value','2000');
        browser.pause(3000);
    })

    it('Get all values from the dropdown', function(){
        let list = $$('#day option');
        console.log('length is ', list.length);

        for (let i = 0; i < list.length; i++) {
            const element = list[i];
            console.log('Element ['+ i + '] value is:', element.getText());
        }
    })
})