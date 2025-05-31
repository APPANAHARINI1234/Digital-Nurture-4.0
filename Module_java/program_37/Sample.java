package program_37;

public class Sample {
    public static void main(String[] args) {
        //javap tool is used to show the compiled bytecode
        System.out.println("welcome...");
        int a =10;
        int b = 20;
        System.out.println("Result is "+(a+b));
//         op:
//         Compiled from "Sample.java"
// public class program_37.Sample {
//   public program_37.Sample();
//     Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return

//   public static void main(java.lang.String[]);
//     Code:
//        0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        3: ldc           #13                 // String welcome... 
//        5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        8: bipush        10
//       10: istore_1
//       11: bipush        20
//       13: istore_2
//       14: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
//       17: iload_1
//       18: iload_2
//       19: iadd
//       20: invokedynamic #21,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
//       25: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       28: return
// }
    }
    
}
