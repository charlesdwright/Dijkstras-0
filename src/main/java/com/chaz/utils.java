package com.chaz;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.HashMap;
import java.util.Map;

public class utils{
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static int[][] adjMatrix(HashMap parsedNodes, String[] theEdges) {
        //build the adjacency matrix from the parsed node list and the
        //graph description (the list of edges).

        logger.info("...in adjMatrix");

        int a[][] = new int[parsedNodes.size()][parsedNodes.size()];

        for (int i = 0; i < theEdges.length; i++) {
            logger.info("i: "+i);
            int row = (int)getKeyFromValue(parsedNodes,theEdges[i].split(",")[0].trim());
            int col = (int)getKeyFromValue(parsedNodes,theEdges[i].split(",")[1].trim());
            logger.info("\n"+"Back in adjMatrix @ row " + i);

            a[row][col]=1;
        }
        return a;
    }

    public static String[] theEdges(String theInput) {
        //extract the edges from the input and add to a list

        logger.info("...in parse_0");
        String[] o = theInput.split(";");
        return o;
    }

    public static HashMap<Integer, String> parseNodes(String[] edges) {
        //build a vector of unique nodes from a list of
        //edges (nodes in [source, destination] form).
        //used later to build the adjacency matrix.

        String[] src = new String[edges.length];
        String[] dest = new String[edges.length];

        HashMap<Integer, String> nodes = new HashMap<Integer, String>();
        int key = nodes.size();
        logger.info("...in parseNodes");
        for (int i = 0; i < edges.length; i++) {
            src[i] = edges[i].split(",")[0].trim();
            dest[i] = edges[i].split(",")[1].trim();

            logger.info(src[i] + ", " + dest[i]);

            if (!nodes.containsValue(src[i])) {
                key = nodes.size();
                logger.info("src[i]: key=" + key + " !contains " + src[i] + "; putting " + src[i]);
                nodes.put(key, src[i]);
            }
            if (!nodes.containsValue(dest[i])) {
                key = nodes.size();
                logger.info("dest[i]: key=" + key + " !contains " + dest[i] + "; putting " + dest[i]);
                nodes.put(key, dest[i]);
            }
        }
        return nodes;
    }

    private static void test_adjMatrix(int[][] theMatrix) {
        //check the output of the function
        logger.info("Testing adjMatrix"+"\n");
        for(int i=0;i<theMatrix.length; i++){
            for(int j=0;j<theMatrix.length; j++){
                System.out.print(theMatrix[i][j]+" ");
            }
            logger.info("");
        }
        logger.info("Finished testing adjMatrix"+"\n");
    }

    private static void test_nodeParser(HashMap theMap){
        //check the output of the function
        logger.info("Testing nodeParser"+"\n");
        for(int i=0;i<theMap.size(); i++){
            logger.info(i+": "+theMap.get(i));
        }
        logger.info("Finished testing nodeParser"+"\n");
    }

    private static void test_theEdges(String[] theInput){
        //check the output of the function
        logger.info("Testing test_parse_0"+"\n");
        for(int i=0;i<theInput.length; i++){
            logger.info(i+": "+theInput[i]);

        }
        logger.info("Finished testing test_parse_0"+"\n");
    }

    public static void srcDestMatrix(HashMap<Integer, String> theNodes, int[] pathArray, int srcNode){
        //format and output results to console.

        System.out.println("\n"+"=====================================================");
        System.out.println("Source \t Destination \t Minimum Distance from Source");
        System.out.println("=====================================================");
        for(int i=0;i<pathArray.length; i++){
            String src=theNodes.get(srcNode);
            String dest=theNodes.get(i);
            String minDist=((pathArray[i]==2147483647) ? "Inf": String.valueOf(pathArray[i]));
            System.out.println("\t" + src+ " \t\t " + dest + " \t\t\t\t " +  minDist);
        }
        System.out.println("=====================================================");
        System.out.println("Mmm-buh-dee-- mmm-buh-dee-- That's all, folks!");
    }

    private static Object getKeyFromValue(Map hm, Object value) {
        //https://stackoverflow.com/a/27999980

        logger.info("\n" + "...in getKeyFromValue");
        logger.info("Looking for: "+String.valueOf(value));

        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                logger.info("Found "+String.valueOf(hm.get(o)) + " at index " + o +"!");
                return o;
            }
        }
        return null;
    }
}
