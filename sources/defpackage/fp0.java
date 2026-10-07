package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fp0 extends kih {
    public final long c;
    public final List d;
    public final long e;

    public fp0(long j, long j2, List list) {
        this.c = j;
        this.d = list;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp0)) {
            return false;
        }
        fp0 fp0Var = (fp0) obj;
        return ew5.f(this.c, fp0Var.c) && this.d.equals(fp0Var.d) && this.e == fp0Var.e;
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
