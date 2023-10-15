import java.util.LinkedList;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        serializeHelper(root, str);
        return str.toString();
    }

    private void serializeHelper(TreeNode root, StringBuilder str) {
        if (root == null) {
            str.append("null,");
            return;
        }
        str.append(root.val).append(",");
        serializeHelper(root.left, str);
        serializeHelper(root.right, str);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        LinkedList<String> queue = new LinkedList<>();
        for (String token : tokens) {
            queue.offer(token);
        }
        return deserializeHelper(queue);
    }

    private TreeNode deserializeHelper(LinkedList<String> queue) {
        String val = queue.poll();
        if (val.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deserializeHelper(queue);
        root.right = deserializeHelper(queue);
        return root;
    }
}
