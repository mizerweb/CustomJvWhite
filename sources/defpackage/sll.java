package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sll {
    public static final hz2 a(t51 t51Var, xhh xhhVar) {
        return new hz2(t51Var, xhhVar);
    }

    public static tsd b(int i) {
        Object next;
        y1 y1Var = new y1(0, tsd.e);
        while (y1Var.hasNext()) {
            next = y1Var.next();
            if (((tsd) next).a == i) {
                return (tsd) next;
            }
        }
        next = null;
        return (tsd) next;
    }
}
