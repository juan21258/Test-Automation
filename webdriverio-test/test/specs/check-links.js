const expect = require('chai').expect;
const fetch = require('node-fetch');
//For this example we use the node-fetch library
describe('Check broken links', function(){
    it('Check wep page for broken links', function(){
        browser.url('http://the-internet.herokuapp.com/status_codes/200');
        //get all links and filters the urls
        const urls = $$('a').map(link => link.getAttribute('href'));
        //With , in the console log, a blank space is added
        console.log("Evaluated urls:", urls);
        //Gets each url and applies the fetch method
        const requests = urls.map(url => browser.call(() => fetch(url)));
        const statusCodes = requests.map(response => response.status);
        statusCodes.forEach(async function(statusCode) {
            expect(statusCode).not.toBe(404);
        });
    })
})