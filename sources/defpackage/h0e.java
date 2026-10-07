package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h0e implements i0e {
    public final ArrayList a;
    public final boolean b;

    public h0e(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0e)) {
            return false;
        }
        h0e h0eVar = (h0e) obj;
        return this.a.equals(h0eVar.a) && this.b == h0eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(codes=" + this.a + ", fromLocalFile=" + this.b + ")";
    }
}
