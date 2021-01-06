# Selenium_AutomationPractice
> This is a project that provides main E2E tests performed on a website: http://automationpractice.com.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Tests](#tests)
* [Running](#running)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
This is a project that was created to learn Selenium Webdriver and Cucumber tool. It consolidates the scope of material from the Automation Tester course. You can find here 3 features that has been tested, tests summary report and the screenshots. Page Object Model pattern has been used.

## Technologies
* Java - version 11.0.8
* JUnit - version 4.13
* Selenium Java - version 3.141.59
* Cucumber Java - version 6.8.2
* ChromeDriver - version 87.0.4280.88
* GeckoDriver - version 0.28.0

## Tests
List of tested features and scenarios included:
* Registration process (Authentication page visibility, Registration process - invalid data)
* Sign in to the shop (Authentication - positive flow, Authentication - negative flow)
* Ordering process (Ordering a T-shirt - positive flow)

## Running
The project is designed to support Google Chrome or Mozilla Firefox browsers. The first one is set by default.
You can run a single feature or scenario but if you want to get the summary report you need to run TestRunner class.
The report will be located in "target/cucumber/cucumber-html-reports".
If the scenario finishes with failed status - the screenshot will be taken and saved in screenshots catalog.

## Status
Project is ready and no more actions are planned currently.

## Inspiration
Project inspired by Selenium class in Software Development Academy, prepared based on the knowledge gained during the course and later improved.
The report plugin is taken from https://gitlab.com/monochromata-de/cucumber-reporting-plugin.

## Contact
Created by mmartyna.piotrowskaa@gmail.com - feel free to contact me!
