package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wsg {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final int d;
    public final int e;

    public wsg(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, int i2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsg)) {
            return false;
        }
        wsg wsgVar = (wsg) obj;
        return this.a.equals(wsgVar.a) && this.b.equals(wsgVar.b) && this.c.equals(wsgVar.c) && this.d == wsgVar.d && this.e == wsgVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zo5.c(this.d, x05.b(this.c, x05.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        int size = this.a.size();
        int size2 = this.b.size();
        int size3 = this.c.size();
        StringBuilder sbP = qv1.p("playlist=", size, ", videos=", size2, ", photos=");
        qt4.x(size3, this.e, ", counts = ", "/", sbP);
        sbP.append(this.d);
        return sbP.toString();
    }
}
