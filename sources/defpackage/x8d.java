package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x8d {
    public final List a;
    public final boolean b;
    public CharSequence c;

    public x8d(CharSequence charSequence, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = charSequence;
    }

    public static x8d a(x8d x8dVar, ArrayList arrayList, boolean z, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = x8dVar.a;
        }
        if ((i & 2) != 0) {
            z = x8dVar.b;
        }
        return new x8d(x8dVar.c, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8d)) {
            return false;
        }
        x8d x8dVar = (x8d) obj;
        return this.b == x8dVar.b && this.a.equals(x8dVar.a) && cqk.d(this.c, x8dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv1.c(Boolean.hashCode(this.b) * 31, 31, this.a);
    }
}
