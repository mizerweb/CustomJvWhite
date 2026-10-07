package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class kbb implements Comparator {
    public static final kbb a = new kbb();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return rpe.a;
    }
}
