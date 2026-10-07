package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fdc {
    public final Uri a;
    public final String b;
    public final Map c;
    public final long d;
    public final long e;
    public final int f;

    public fdc(Uri uri, String str, Map map, long j, long j2, int i) {
        this.a = uri;
        this.b = str;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdc)) {
            return false;
        }
        fdc fdcVar = (fdc) obj;
        return cqk.d(this.a, fdcVar.a) && this.b.equals(fdcVar.b) && cqk.d(this.c, fdcVar.c) && this.d == fdcVar.d && this.e == fdcVar.e && this.f == fdcVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qt4.g(qt4.g(v0h.c(this.c, zo5.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneVideoDataSpec(uri=");
        sb.append(this.a);
        sb.append(", httpMethod=");
        sb.append(this.b);
        sb.append(", httpRequestHeaders=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        qt4.z(this.e, ", length=", ", flags=", sb);
        return zo5.t(sb, this.f, ")");
    }
}
