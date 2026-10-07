package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hja implements Serializable {
    public final ArrayList a;
    public final int b;
    public final dja c;

    public hja(ArrayList arrayList, int i, dja djaVar) {
        this.a = arrayList;
        this.b = i;
        this.c = djaVar;
    }

    public final List a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final dja c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hja)) {
            return false;
        }
        hja hjaVar = (hja) obj;
        return this.a.equals(hjaVar.a) && this.b == hjaVar.b && cqk.d(this.c, hjaVar.c);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, this.a.hashCode() * 31, 31);
        dja djaVar = this.c;
        return iC + (djaVar == null ? 0 : djaVar.hashCode());
    }

    public final String toString() {
        return "MsgReactInfo{your=" + this.c + ",counters=[" + ww3.z1(this.a, null, null, null, null, 63) + "]}";
    }
}
