const assert = require('assert')

describe('webdriver.io page', () => {
    it('Should have the right title', () => {
        browser.url('https://webdriver.io')
        const title = browser.getTitle()
        assert.strictEqual(title, 'WebdriverIO · Next-gen browser automation test framework for Node.js')
    })
})

describe('Filtering', () => {
    it('It should work', () => {
        browser.url('https://www.kirupa.com/html5/examples/filtering_list_items.htm')
        const listItems = $$('#itemsToFilter .showItem') //Shows only the elements with class showItem
        //$$ Short way to call the findElements command (WebDriverIO snippets)
        let listItemsText = listItems.map(item => item.getText());
        console.log(listItemsText);
        $('input[name="foodCheckBox"]').click();

        listItemsText = listItems.map(item => item.getText()).filter(Boolean);
        console.log(listItemsText);
    })
})