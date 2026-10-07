package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class qpe extends ohc implements Serializable {
    public static final qpe a = new qpe();

    @Override // defpackage.ohc
    public final ohc a() {
        return lbb.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
