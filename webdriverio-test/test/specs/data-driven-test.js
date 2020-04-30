const expect = require('chai').expect;

const inputs = [
    {
        value: 'Sh0rt',
        expectedError: 'Must be at least 8 characters long.'
    },
    {
        value: 'NOLOWERCAS3',
        expectedError: 'Must contain a lowercase letter.'
    },
    {
        value: 'nouppercase4',
        expectedError: 'Must contain an uppercase letter.'
    },
    {
        value: 'Nonumbers',
        expectedError: 'Must contain a number or special character.'
    },
    {
        value: 'Requiredpassw0rd'
    },
    {
        value: 'Anotherv4lid'
    }
];


describe('Password input validation', () => {
    inputs.forEach(function (input) {
        let testName = input.value;

        if(input.expectedError){
            testName += ` should show error: ${input.expectedError}`;
        }else{
            testName += ` should pass validation`;
        }

        it(testName, () => {
            browser.url('https://codepen.io/klamping/full/RMmqvq/');
            browser.switchToFrame($('#result')); //Switchs to the specified frame (Look by id)
            $('[name="password"]').setValue(input.value);
            const errorMessages = $('.helper-text').getText(); //Look by class
            if(input.expectedError){
                expect(errorMessages).to.contain(input.expectedError);
            }
            else{
                expect(errorMessages).to.equal('');
            }
            console.log(typeof(inputs));
        })
    })
    // With browser.debug() we can stop the test at any given point
})