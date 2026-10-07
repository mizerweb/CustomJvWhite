package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y6d extends a7d {
    public final rnh a;
    public final List b;

    public y6d(rnh rnhVar, List list) {
        this.a = rnhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6d)) {
            return false;
        }
        y6d y6dVar = (y6d) obj;
        return this.a.equals(y6dVar.a) && this.b.equals(y6dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Button(title=" + this.a + ", avatarsInfo=" + this.b + ")";
    }
}
