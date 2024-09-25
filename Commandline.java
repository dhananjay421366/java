class CommandLine {
    public static void main(String[] args) {
        System.out.println("Number of command line Arguments are  :" + args.length);
        System.out.println("Command line argument are :");
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}
  // compilation command javac CommandLine.java
  // exeicuation command java CommandLine PPA Python Java Marvellous