package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class kqh implements Comparator {
    public final /* synthetic */ long a;

    public kqh(long j) {
        this.a = j;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = this.a;
        return e9i.D(new ew5(((mcj) obj2).a(j)), new ew5(((mcj) obj).a(j)));
    }
}
