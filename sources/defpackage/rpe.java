package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class rpe implements Comparator {
    public static final rpe a = new rpe();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj2).compareTo((Comparable) obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return kbb.a;
    }
}
