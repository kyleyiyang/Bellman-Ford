BELLMAN-FORD(G,w,s)
1 INITIALIZE-SINGLE-SOURCE.G; s/
2 for i D 1 to jG:Vj  1
3 for each edge .u; / 2 G:E
4 RELAX.u; ;w/
5 for each edge .u; / 2 G:E
6 if :d > u:d C w.u; /
7 return FALSE
8 return TRUE
