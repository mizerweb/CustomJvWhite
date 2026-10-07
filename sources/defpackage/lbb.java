package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class lbb extends ohc implements Serializable {
    public static final lbb a = new lbb();

    @Override // defpackage.ohc
    public final ohc a() {
        return qpe.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
