package DSA.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HuffmanCoding {

    HashMap<Character, String> encoder = new HashMap<>();
    HashMap<String, Character> decoder= new HashMap<>();

    private static class Node implements Comparable<Node>{
        Character data;
        int cost;// frequency
        Node left;
        Node right;

        public Node(Character data, int cost){
            this.data=data;
            this.cost=cost;
            this.left=null;
            this.right= null;
        }
        @Override
        public int compareTo(Node other) {
            return this.cost- other.cost;
        }
    }
    public HuffmanCoding(String feeder) throws Exception {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            if (freqMap.containsKey(cc)) {
                int originalValue = freqMap.get(cc);
                originalValue += 1;
                freqMap.put(cc, originalValue);
            } else {
                freqMap.put(cc, 1);
            }
        }


      PriorityQueue<Node> heap= new PriorityQueue<>();
        Set<Map.Entry<Character, Integer>> entrySet= freqMap.entrySet();
        for(Map.Entry<Character, Integer> entry: entrySet){
            Node node = new Node(entry.getKey(), entry.getValue());
            heap.add(node);
        }
        while(heap.size()!=1){
            Node first= heap.remove();
            Node second=heap.remove();

            Node newNode= new Node('\0', first.cost+ second.cost);
            newNode.left=first;
            newNode.right=second;
            heap.add(newNode);
        }
        Node fullTree= heap.remove();
        this.encoder= new HashMap<>();
        this.decoder= new HashMap<>();
        this.fillEncoderDecoder(fullTree,"");


    }
    private void fillEncoderDecoder(Node node, String osf){
        if(node==null){
            return;
        }
        if(node.left== null && node.right==null){
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data );

        }
        fillEncoderDecoder(node.left,osf+"0");
        fillEncoderDecoder(node.right,osf+"1");


    }
    public String encode(String source){
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<source.length(); i++) {
            ans.append(encoder.get(source.charAt(i)));
        }

        return ans.toString();

    }
    public String decode(String destination){
        String key = "";
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<destination.length(); i++) {
            key = key + destination.charAt(i);
            if(decoder.containsKey(key)) {
                ans.append(decoder.get(key));
                key = "";
            }
        }
        return ans.toString();


    }

    public static void main(String[] args) throws Exception {
        String str="abbccda";
        HuffmanCoding hf= new HuffmanCoding(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String dc = hf.decode(cs);
        System.out.println(dc);

    }




}
