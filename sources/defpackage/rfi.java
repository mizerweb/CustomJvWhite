package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rfi {
    public final long a;
    public final String b;
    public final List c;
    public final wja d;

    public rfi(long j, String str, List list, wja wjaVar) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = wjaVar;
    }

    public final List a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final wja c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfi)) {
            return false;
        }
        rfi rfiVar = (rfi) obj;
        return this.a == rfiVar.a && cqk.d(this.b, rfiVar.b) && cqk.d(this.c, rfiVar.c) && this.d == rfiVar.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + qv1.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "UpdateTextEntity(id=", ", text=", this.b);
        sbT.append(", elements=");
        sbT.append(this.c);
        sbT.append(", status=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
