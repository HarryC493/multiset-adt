import java.util.List;
public class Tree <T extends Comparable<T>> {
    private T root;
    private List<Tree> subtrees;

    public Tree(T root, List<Tree> subtrees) {
        this.root = root;
        if (subtrees == null) {
            this.subtrees = null;
        }
        else {
            this.subtrees = subtrees;
        }
    }

    public Tree() {
        this.root = null;
        this.subtrees = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int getLength() {
        if (this.isEmpty()) {
            return 0;
        }
        else {
            int size = 1;
            for (Tree subtree : this.subtrees) {
                size += subtree.getLength();
            }
            return size;
        }
    }

    public int count(T item) {
        if (this.isEmpty()) {
            return 0;
        }
        else {
            int num = 0;
            if (this.root.equals(item)) {
                num += 1;
            }
            for (Tree subtree : this.subtrees) {
                num += subtree.count(item);
            }
            return num;
        }
    }


    public static void main(String[] args) {
        System.out.println("This is a tree!");
    }
}
