Having been asked to solve a boilerplate interview question, and having found the testing site crashed before
I could submit my results (that is, having somehow submitted no results; could have run out of time, 
not sure - who watches the clock during a timed coding challenge?), I have decided to go on and solve the problem,
at least to provide results that satisfy what I recall the requirements to have been before the aforementioned
crash.

To that end, if you copy down and run the .jar file -- and we assume that would be no problem for you else why would you
be hanging out over here, anyway? -- you simply enter some nodes and press return.  What happens next is 
the program takes your input finds the shortest "path" between these imaginary network nodes, or pretend cities,
or what-have-you, measured from the first node in your list. About your list...

...it must  be in very specific format, because we haven't time to build out bullet-proof UI's for mere coding
challenges over here, so please make sure your list looks something like what's below.  Bear in mind that we define
a network (or "graph" if you prefer) as a series of nodes or points on a map, etc, etc.  Your list contains
the network expressed in "edges" (another buzzword) -- an "edge" in graph-lingo being defined as having a start and
end point.  So if you were planning to travel from your house to your grand-mother's, your house would be Node 1 and
Node 2 would be your grandmother's house.  If you then went on to McDonald's for lunch, you would represent your
trip for the graph as follows:

`your house, grandmother's house; grandmother's house, McDonald's;...etc`

It was actually tested on these two "graphs":

`A,B;B,C;A,C;B,D;C,D;D,E;F,G;G,H;F,H`

`apple,pear; apple,orange; orange,egg; orange,banana; apple,grapefruit`

No, I don't know why anyone would want to measure the shortest distance between and apple and an egg either, but
there was something like that given in the challenge...it had to do with animals, I think.  No worries, 
you can imagine any kind of graph  or map or journey or network you wish, as long as you enter in that form. But you should avoid the punctuation as we certainly haven't built the thing to handle that.

A couple of other things to note: the actual shortest-distance-finding-algorithm was adapted from 
https://www.softwaretestinghelp.com/java-graph-tutorial/. Such things are all over the place, and 
in the meager window of time you're given to do your code challenge, nobody - but NOBODY - has a prayer of 
completing it if he's going to spin up an entirely new version of Dijkstra's Algorithm.  Besides, 
if you're on a job interview, you won't impress anyone by being that intelligent.  What they want to see is that
you have enough street-smarts to grab it off the web and somehow wire it up on the spot.

That wiring-up bit, in this case, meant crafting a way to get the input -- the format of which was given as a condition
of the "challenge" -- into the algo and making it work.  And _that_ was no mean feat, not even, I daresay, would it be for people who
bother to play around with theoretical problems in their spare time.  Certainly it isn't likely that even an
exceptional programmer could figure it out in an hour, and would you really want to hire someone who sits around 
playing with obscure theoretical problems all day?

Anyway, it took me a lot longer than that and this thing will only work if the list is entered EXACTLY as shown.
Also, it assumes you're interested in measuring the shortest distance from the first node in your list (ie Your House)
to all the other places on the list.  Error handlers? We'll see about that in the next release. 

One more thing: I think they call this a "directional graph", meaning (if I have this right) that all the roads on your journey are one-way.  If you show it an edge A,B, it will NOT assume you can get back to A from B. So just add another one-way road from B back to A and see if that fixes that, like so:
A,B;B,A. 

Maybe later we'll make a web app out of it as a way of building up those chops but we'll see.

Anyway, thanks for checking in and have fun with this little tool.  
