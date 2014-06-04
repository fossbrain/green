Green
=====

Is a very simple private application to maintain my finances.


[![Build Status](https://travis-ci.org/fossbrain/green.png?branch=master)](https://travis-ci.org/fossbrain/green)

The name
----------
I've no idea, just green is the color of money, isn't it :)

Requirements
-------------

On my local pc it should have a UI to:
* Parse CSV files (from my bank provider)
* Compare them with existing csv files
* Let me tag those entries
* Removes duplicates
* Make it possible to tag specific bookings for the finance office
* Store everything in a local mysql database on my server

On the server side it should:
* Run with a cronjob
* Uses selenium to automatically download new csv files
* Parses those csv files
* notify me about new entries

Technologies
============

Scala, Gradle, JavaFX, ...

Those technologies had been choosen for various reasons, but mainly because I plan
to use those technologies on different projects soon and I need to evaluate and
learn those in front.
