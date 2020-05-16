describe('get properties',() =>{
    it('should get the property',() =>{
        browser.url('http://newtours.demoaut.com/');
        var attr = $('[name="userName"]').getAttribute("size");
        var cssprop = $('[name="userName"]').getCSSProperty("text-align");
        console.log("Attribute returned: " + attr);
        console.log("CSS property returned: " + JSON.stringify(cssprop.value));
        var html = $('.//form').getHTML();
        console.log("HTML returned as: " + html);
        var prop = $('[name="userName"]').getProperty("name");
        console.log("Property returned: " + prop);
        var value = $('[name="userName"]').getValue();
        console.log("Value returned: " + value);
        var text = $('=SIGN-ON').getText(); //Locator for an <a> element
        console.log("Text returned: " + text);
    })
})