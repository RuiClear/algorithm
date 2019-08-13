package com.ruiclear.demo.btreesort;

public class BtsOperation {

    //直接第归创建
    public static void buildTree(int a, BtsTree btsTree, BtsTree preBtsTree, boolean right){
        if(btsTree == null && preBtsTree !=null){
            btsTree = new BtsTree(a);
            if(right){
                preBtsTree.setrChild(btsTree);
            }else {
                preBtsTree.setlChild(btsTree);
            }
            return;
        }

        if(a > btsTree.getData()){
            buildTree(a, btsTree.getrChild(), btsTree,true);
        }else if(a < btsTree.getData()){
            buildTree(a, btsTree.getlChild(), btsTree,false);
        }
    }
    //先第归查找，找不到再创建节点并设置到树上面
    public static BtsTree buildTree(int a, BtsTree btsTree){
        BtsTree tree = null;
        if((tree=search(btsTree,null,a)) == null){
            return new BtsTree(a);
        }else {
            BtsTree nTree = new BtsTree(a);
            nTree.setpChild(tree);
            if(a < tree.getData()){
                tree.setlChild(nTree);
            }else if(a > tree.getData()){
                tree.setrChild(nTree);
            }
        }
        return btsTree;
    }

    //第归查询
    public static BtsTree search(BtsTree btsTree, BtsTree preBtsTree, int s){
        if(btsTree == null){
            return preBtsTree;
        }
        if(s == btsTree.getData()){
            return btsTree;
        }

        if(s > btsTree.getData()){
            return  search(btsTree.getrChild(), btsTree,s);
        }
        if(s < btsTree.getData()){
            return  search(btsTree.getlChild(), btsTree,s);
        }

        return null;
    }

    //删除节点
    public static void deleteNode(int d, BtsTree btsTree){
        BtsTree search = search(btsTree, null, d);
        if(search == null){
            System.out.println("查询不到要删除的节点！");
            return;
        }
        //1，要删除的节点是叶子节点
        if(search.getrChild() == null && search.getlChild() == null){
            search.getpChild().setrChild(null);
            search.getpChild().setlChild(null);
        }

        //2，要删除的节点只有右子节点
        if(search.getlChild() == null && search.getrChild() != null){
            search.getpChild().setrChild(search.getrChild());
        }

        //3.要删除的节点只有左子节点
        if(search.getlChild() != null && search.getrChild() == null){
            search.getpChild().setlChild(search.getlChild());
        }

        //4，要删除的节点同时有左右子节点
        if(search.getlChild() != null && search.getrChild() != null){
            BtsTree q = search.getlChild();
            BtsTree s = q;
            while ( s.getrChild() != null ){
                s = s.getrChild();
            }
            //删除节点左子节点没有右节点
            if(q == s){
                search.setData(search.getlChild().getData());
                search.setlChild(null);
            //删除节点左子节点有右节点
            }else {
                search.setData(s.getData());
                q.setrChild(s.getlChild());
            }

        }
    }

    public static void main(String[] args) {
        int[] tree = new int[]{11,7,3,9,7,18,15,26,14,16};
        BtsTree btsTree =  null;//new BtsTree(tree[0]);
        for(int i=0;i<tree.length;i++){
//            buildTree(tree[i],btsTree,null,false);
            btsTree = buildTree(tree[i], btsTree);
        }

        deleteNode(7, btsTree);
        System.out.println(btsTree);
    }
}
