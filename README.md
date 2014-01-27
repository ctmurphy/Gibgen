**Code Challenge: Gibberish Generator**
---------------------------------------

Challenge Overview
------------------

**Your response to this challenge can be used to supplement your SWEAP application.  If you plan to complete this challenge for SWEAP, ensure you meet the other minimum requirements by visiting [here](http://gecapital.com/sweap "SWEAP Home Page").  Whether you apply or not, you are welcome to fork this repository and complete as a personal project challenge.**


We are exticed taht you are intsereted in joiinng the Soawtfre Engreeniing Appsecitnerhip Prargom.  Weoclme to yuor fsrit prommarging chanellge.  Yuor chnellage is to courtsnct a prrgoam taht tekas an Enilgsh txet snirtg as iupnt and rerutns rebadale giirebbsh lkie tihs.  It dseno’t mtaetr in waht oerdr the ltteres in a wrod are, but an iproamtnt tihng is taht the frsit and lsat ltteer be in the rghit pclae. The rset can be a taotl mses and you can sitll raed it whotuit a pboerlm.  Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe.

**The Basics:**
  
  - You may use *almost any* programming language... it's your choice.  See the supported options [here](http://ideone.com/).
  - Your program should leave the first and last letter of each word in place and scramble the rest.
  - Your program should not scamble punctuation (.,-'...etc.), numbers, or upper-case abbreviations.
  - For example gibberish, see the [/textfiles](https://gitlab.cs.uno.edu/sweap/gibgen/tree/master/textfiles) folder.  Two sample output files are provided: `xxx.txt.gib`

**Input/Output:**
 
  - Name your program as follows: `gibgen.xx` (where xx is variable based on the language you choose)
  - Your program should be able to read text input from a string passed into STDIN
      - `gibgen.xx "This is a String"`
      - `cat mystringfile.txt | gibgen.xx`
  - Your program should output to the console.

_Note: This challenge is based on a popular word gibberish meme. You can improve the readability by looking at a [researcher's take](http://www.mrc-cbu.cam.ac.uk/people/matt.davis/cmabridge/) on the truths/myths of this meme, but this is not required._

What to do
----------
1. [Download](http://git-scm.com/downloads) & install Git on your machine

2. <a href="https://gitlab.cs.uno.edu/sweap/gibgen/fork" class="btn grouped" data-method="POST" rel="nofollow" title="Fork">Fork</a> this project - Go [here](https://gitlab.cs.uno.edu/sweap/gibgen) and click the "Fork" button (located on the upper-right side of the screen)

2. Clone your new fork'd repository to your local machine - `git clone https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen.git`
3. Complete the code challenge and fill out the Quick Start & Questions in the the README (see below)
4. `git add` and `git commit` your local repository as you go
4. Push your code and README back to UNO's GitLab occasionally - `git push origin master`
5. Email [serp@ge.com](mailto:serp@ge.com) with the Commit URL to your fork'd repository that you want reviewed. It should include at least 2 files: (1) your updated README with Coding Questions answered, and (2) your program (gibgen.xx)
   - Grant the "SWEAP" user "MASTER"-level access to your repository by going here `https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen/team` and clicking the "New Team Member" button.
   - Then go here: `https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen/commits/master`
   - Find the commit that you'd like us to review.  _The commit date must be on or before 11:59pm (central) on Nov-10!_
       - Click the "Browse Code ->" link for that commit
   - Copy and paste the URL into the email along with your name... it should look something like this:
       - `https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen/tree/73afe0c8fe2...hash.hash...e80afea72b6`

_Note: If you have any questions, email [serp@ge.com](mailto:serp@ge.com).  I will do my best to respond to any questions Saturday & Sunday evening._

Judging Criteria
----------------

Your responses to the **Coding Questions** at the bottom of this README are the *Most Important* part of this challenge. A working, fully fault-tolerant program that we just can't break, albeit awesome, is the least important.  Why is that?  Remember, we don't expect you to be expert programmers (just yet)... We want to see how you think through a problem.  


For completion by applicant
===========================

Quick Start
-----------

* My program is comprised of the GibGen.java class and its corresponding GibGenRunner.java class.  The construction for 
  the GibGen class requires the user to pass in a String.  The user may pass in any String of any length and GibGen will
  return the gibberish version of that String to the console.  It cannot take filepaths at this time.
* My program is written in Java.
* There is not much else to know about my code, other than I was not sure how to incorporate all the code into one class
  which is the reason for the runner class.  My curriculum up to this point has always required me to include a runner 
  class in my programs so I stuck with what I know!


Coding Questions
----------------

Question 1: "How did you approach the problem?" (500 words or less)

I approached this challenge by first stubbing out the process I thought my program would need to take with simple, 
straight forward statements.  Once I got a grasp on some of the concrete variables my GibGen would need 
(such as a Scanner and String[]), I created them, named them (if necessary), and replaced them in the stubbed 
implementation.  Once I practically finished writing out what I wanted in English, I started back at the top and looked 
at what would be the least intricate methods to actually implement.   I decided what my different cases would be for 
scrambling words according to the given specification and wrote out if-then statements with more simple, English text 
inside.  Most of my thought process and actual coding played out in this way, as a kind of outer-to-inner or 
shallow-to-deep process.  I slowly but surely replaced English with Java and eventually had a program to finally 
troubleshoot, which (thankfully) was not that painful!    


Question 2: "What was the most difficult aspect of the solution?" (500 words or less)

For me, the most difficult aspect of the solution to this challenge was figuring out the simplest and most efficient way 
to handle Strings with numbers and/or punctuations.  I knew what needed to happen when given a String of this type but it 
took me some time to figure out how to make it happen.  This is probably what took me the longest to deal with.  I 
eventually decided that creating a temporary char[] comprised of the target characters to be scrambled was my best and 
clearest solution, which ended up working for me.  Also, I originally attempted to use the Random class to scramble the 
temp char[] which seemed to be causing some significant problems so that was replaced with a simple swap method which did 
my scrambling perfect for me.  I tried to keep reminding myself that the simplest solution was probably the best solution!
