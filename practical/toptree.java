class toptree
{
        DoublyNode root=new DoublyNode();
        DoublyNode rootl=new DoublyNode();
        DoublyNode rootr=new DoublyNode();
        DoublyNode rootlr=new DoublyNode();
        DoublyNode root=new DoublyNode();
        rootl.data=2;
        rootr.data=3;
        rootlr.data=4;
        root.left=rootl;
        root.data=1;
        root.right=rootr;
        rootl.left=null;
        rootl.right=rootlr;
        DoublyNode rootrl=new DoublyNode();
        DoublyNode rootrr=new DoublyNode();
        DoublyNode rootrll=new DoublyNode();
        DoublyNode rootrlr=new DoublyNode();
        rootrl.data=5;
        rootrr.data=6;
        rootrll=7;
        rootrlr=8;
        rootr.right=rootrr;
        rootr.left=rootrl;
        rootrl.left=rootrll;
        rootrl.right=rootrlr;
        DoublyNode head=root;
        DoublyNode temp=root;



        while(head.left != null)
            System.out.print(head.left.data);
            head=head.left;
        while(temp.right != null)
            System.out.print(temp.right.data);
            root=temp.right;      
}