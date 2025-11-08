// This is an example of anonymous class

    class AnonymousInner {
        void show() {
            System.out.println("This is an anonymous inner class example.");
        }
    }

public class Annonymous {
    public static void main(String[] args) {
        AnonymousInner inner = new AnonymousInner() {
            void show() {
                System.out.println("This is an anonymous inner class instance.");
            }
        };
        inner.show();
    }
}
