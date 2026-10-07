package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class y44 extends a54 {
    public static a54 g(int i) {
        if (i < 0) {
            return a54.b;
        }
        return i > 0 ? a54.c : a54.a;
    }

    @Override // defpackage.a54
    public final a54 a(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.a54
    public final a54 b(long j, long j2) {
        return g(Long.compare(j, j2));
    }

    @Override // defpackage.a54
    public final a54 c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.a54
    public final a54 d(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.a54
    public final a54 e(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }

    @Override // defpackage.a54
    public final int f() {
        return 0;
    }
}
