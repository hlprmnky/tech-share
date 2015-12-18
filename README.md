# TechShare talk - Sept. 12, 2014 Source and slides

This is a trivial implementation of FizzBuzz which was live-coded during a 
TechShare talk on Clojure given at SPS Commerce on September 12, 2014 and again 
at the Local Variables meetup in South Bend, Indiana on December 17, 2015.
The project uses [Midje](https://github.com/marick/Midje/) for unit testing.

## How to run the project

### Get [Leiningen](https://leiningen.org/)
If you have [Homebrew](https://brew.sh/) already, this is just a `brew install leiningen` away
### Clone this project into a dir
### cd into that dir and type `lein repl`
### win

## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.

From within the REPL you can also `(use 'midje.repl)` and `(autotest)` 
(or `(doc midje-repl) for more options).

The slide deck for the talk is `tech_share.html`, the org-mode file from which
it is made using [org-reveal](https://github.com/yjwen/org-reveal) is also 
provided.
