package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h04 implements k04 {
    public final ArrayList a;
    public final boolean b;

    public h04(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h04)) {
            return false;
        }
        h04 h04Var = (h04) obj;
        return this.a.equals(h04Var.a) && this.b == h04Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(items=" + this.a + ", canLoadMore=" + this.b + ")";
    }
}
