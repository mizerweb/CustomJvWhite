package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bej implements cej {
    public final tnh a;
    public final List b;

    public bej(tnh tnhVar, List list) {
        this.a = tnhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bej)) {
            return false;
        }
        bej bejVar = (bej) obj;
        return this.a.equals(bejVar.a) && this.b.equals(bejVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "RequestOpenSettings(title=" + this.a + ", buttons=" + this.b + ")";
    }
}
