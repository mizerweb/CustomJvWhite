package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rk7 extends kih {
    public final List c;

    public rk7(List list) {
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk7) && this.c.equals(((rk7) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.k(this.c.size(), "{size=", "}");
    }
}
