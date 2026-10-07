package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mhl {
    public static c32 a(String str) {
        Object next;
        y1 y1Var = new y1(0, c32.d);
        while (y1Var.hasNext()) {
            next = y1Var.next();
            if (((c32) next).a.equals(str)) {
                return (c32) next;
            }
        }
        next = null;
        return (c32) next;
    }
}
