public class TreeTest {
    public static void main(String[] args) {

        Tree tree1 = new Tree();
        tree1.getİnfo();
        System.out.println();

        Tree tree2 = new Tree("Pine");
        tree2.getİnfo();
        System.out.println();

        Tree tree3 = new Tree(10);
        tree3.getİnfo();

        Tree copyTree = tree1.copy();
        copyTree.getİnfo();
        if(tree1 == copyTree){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
        Tree GrownTree = tree3.Grow().Grow().Grow().Grow();
        if(tree3 == GrownTree){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }



    }
}