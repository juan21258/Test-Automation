var times = require('../../lib/timeouts')
var devices = require('../../lib/devices')

describe('First Steps with WebdrverIO', () => {
    it('Load Example Website', () => {
        browser.url('http://www.example.com/')
        browser.pause(times.short)
        expect(browser).toHaveUrl('http://www.example.com/')
        expect(browser).toHaveTitle('Example Domain')
    })
 
    it('H1 should be visible', () => {
        const h1 = $('h1')
        h1.waitForExist()
        expect(h1).toBeVisible()
    })
 
    it('P should be visible', () => {
        const p = $('p')
        p.waitForExist()
        expect(p).toBeVisible()
    })
 
    it('Check Link Value', () => {
        const link = $('a')
        expect(link).toHaveLink('https://www.iana.org/domains/example')
    })
 
    it('Get Element Text', () => {
        const text = $('h1').getText()
        const element = $('h1')
        element.waitForExist()
        expect(element).toHaveText('Example Domain')
    })
 
    it('Assert Attribute', () => {
        browser.url('https://devexpress.github.io/testcafe/example/')
        const button = $('#submit-button')
        button.waitForExist()
        expect(button).toHaveAttrContaining('type', 'submit')
    })
 
    it('Assert Value', () => {
        const button = $('#populate')
        button.waitForExist()
        expect(button).toHaveValue('Populate')
    })
 
    it('Save Screenshot', () => {
        browser.saveScreenshot('your-name.png')
    })
 
    it('Change Browser Viewport', () => {
        browser.setWindowSize(800, 600)
        browser.pause(times.short)
    })
 
    it('Set Mobile View', () => {
        browser.setWindowSize(devices.mobile[0], devices.mobile[1])
        browser.pause(times.short)
    })
 
    it('Set Tablet View', () => {
        browser.setWindowSize(devices.tablet[0], devices.tablet[1])
        browser.pause(times.short)
    })
 
    it('Set Desktop View', () => {
        browser.setWindowSize(devices.desktop[0], devices.desktop[1])
        browser.pause(times.short)
    })
})