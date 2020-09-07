package app.p1fs;

/**
 * Demo
 *
 * @author roy
 * @version 1.0.0
 *
 */

public class Demo {
    public static void main(String[] args) {
        /**
         * /
         * /wz/
         * /wz/a.txt
         * /wz/b.txt
         * /wz/movies/
         * /wz/movies/c.avi
         * /xzg/
         * /xzg/docs/
         * /xzg/docs/d.txt
         */
        Directory fileSystemTree = new Directory("/");
        Directory nodeWz = new Directory("/wz/");
        Directory nodeXzg = new Directory("/xzg/");
        fileSystemTree.addSubNode(nodeWz);
        fileSystemTree.addSubNode(nodeXzg);

        File nodeWzA = new File("/wz/a.txt");
        File nodeWzB = new File("/wz/b.txt");
        Directory nodeWzMovies = new Directory("/wz/movies/");
        nodeWz.addSubNode(nodeWzA);
        nodeWz.addSubNode(nodeWzB);
        nodeWz.addSubNode(nodeWzMovies);

        File nodeWzMoviesC = new File("/wz/movies/c.avi");
        nodeWzMovies.addSubNode(nodeWzMoviesC);

        Directory nodeXzgDocs = new Directory("/xzg/docs/");
        nodeXzg.addSubNode(nodeXzgDocs);

        File nodeXzgDocsD = new File("/xzg/docs/d.txt");
        nodeXzgDocs.addSubNode(nodeXzgDocsD);

        System.out.println("/ files num:" + fileSystemTree.countNumOfFiles());
        System.out.println("/wz/ files num:" + nodeWz.countNumOfFiles());
    }
}
