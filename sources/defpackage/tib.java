package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tib extends kih {
    public final long c;
    public final List d;
    public final long e;

    public tib(long j, long j2, List list) {
        this.c = j;
        this.d = list;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tib)) {
            return false;
        }
        tib tibVar = (tib) obj;
        return ew5.f(this.c, tibVar.c) && this.d.equals(tibVar.d) && this.e == tibVar.e;
    }

    public final int hashCode() {
        ghb ghbVar = ew5.b;
        return Long.hashCode(this.e) + qv1.c(Long.hashCode(this.c) * 31, 31, this.d);
    }

    @Override // defpackage.sq0
    public final String toString() {
        String strT = ew5.t(this.c);
        StringBuilder sb = new StringBuilder("Response(showTime=");
        sb.append(strT);
        sb.append(", banners=");
        sb.append(this.d);
        sb.append(", updateTime=");
        return c0a.m(this.e, ")", sb);
    }
}
