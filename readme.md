Having been asked to solve a boilerplate interview question, and having found the testing site crashed before
I could submit my results (that is, having somehow submitted no results; could have run out of time, 
not sure - who watches the clock during a timed coding challenge?  Come to think of it, what is the 
point of timed coding challenges? But more on this later...) I have decided to go on and solve the problem,
at least provide results that satisfy what I recall the requirements to have been before the aforementioned
crash.

To that end, if you copy down and run the .jar file -- and we assume that no problem for you else why would you
be hanging out over here, anyway? -- you simply enter some nodes and press return.  What happens next is 
the program takes your input finds the shortest "path" between these imaginary network nodes, or pretend cities,
or what-have-you, measured from the first node in your list. About your list...

...it must  be in very specific format, because we haven't time to build out bullet-proof UI's for mere coding
challenges over here, so please make sure your list looks something like what's below.  Bear in mind that we define
a network (or graph for the youngsters) as a series of nodes or points on a map, etc, etc.  Your list contains
the network expressed in "edges" (another buzzword) -- an "edge" in graph-lingo being defined as having a start and
end point.  So if you were planning to travel from your house to your grand-mother's, your house would be Node 1 and
Node 2 would be your grandmother's house.  If you then went on to McDonald's for lunch, you would represent your
trip for the graph as follows:

your house, grandmother's house; grandmother's house, McDonald's;...etc

It was actually tested on these two "graphs":
A,B;B,C;A,C;B,D;C,D;D,E;F,G;G,H;F,H
apple,pear; apple,orange; orange,egg; orange,banana; apple,grapefruit

No, I don't know why anyone would want to measure the shortest distance between and apple and an egg either, but
there was something like that given in the challenge...it had to do with animals, I think.  No worries, 
you can imagine any kind of graph  or map or journey or network you wish, as long as you enter in that form.

But you should avoid the punctuation as we certainly haven't built the thing to handle that.

A couple of other things to note: the actual shortest-distance-finding-algorithm was lifted from the web at 
the link below.  These things are all over the place, and in the meager window of time you're given to 
do your code challenge, nobody - but NOBODY - has a prayer of completing it if he's going to spin up an entirely 
new version of Dijkstra's Shortest Distance Gizmo.  Besides, if you're on job interview, you won't impress anyone
by being that intelligent.  What they want to see is that you have enough street-smarts to grab it off the web
and somehow wire it up on the spot.

That wiring-up bit, in this case, meant crafting a way to get the input -- which was given to you as a condition
of the "challenge," into the algo and making it work.  And even that was no mean feat, even for people who
bother to play around with theoretical problems in their spare time.  Certainly it isn't likely that even an
exceptional programmer could figure it out in an hour, and would you really want to hire someone who sits around 
playing with obscure theoretical problems all day?

Anyway, it took me a lot longer than that and this thing will only work if the list is entered EXACTLY as shown.
Also, it assumes your interested in measuring the shortest distance from the first node in your list (ie Your House)
to all the other places on the list.  As I said, it's an academic problem and have a dozen more of those I'm
working on now and a few dozen real-world ones that need my attention so sue me.

One more thing: I think they call this a "directional graph", in that, if you show it an edge A,B but don't 
also show it another edge B,A, it will NOT assume you can get back to A from B.  You have to tell it that, like so:
A,B;B,A.  What do you want for nothing?

Maybe later we'll make a web app out of it but honestly it's probably not worth the time considering
all the other things on the table and really, these tests pretty much weed out anyone but idiot-savants and
with all due respect to those wonderful folks a team full of them might be a little hard to manage...

Anyway, thanks for checking in and have fun with this little tool.  