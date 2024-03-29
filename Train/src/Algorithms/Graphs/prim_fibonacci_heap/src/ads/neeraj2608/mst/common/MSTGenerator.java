package ads.neeraj2608.mst.common;

import ads.neeraj2608.types.common.Edge;
import ads.neeraj2608.types.common.Graph;

import java.util.List;

public class MSTGenerator{
  private static long runtime;
  
  public static List<Edge> generateMST(MSTGeneratorInterface mstGenerator, Graph graph){
    long start = System.currentTimeMillis();
    List<Edge> generatedMST = mstGenerator.generateMST(graph);
    long end = System.currentTimeMillis();
    runtime = end - start;
    return generatedMST;
  }

  public static long getRuntime(){
    return runtime;
  }
}
