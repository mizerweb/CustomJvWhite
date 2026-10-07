package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w2b implements rui {
    public final List a;
    public final c70 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final long j;
    public final Uri k;
    public final String l;

    public w2b(List list, c70 c70Var, long j, long j2, boolean z, int i, int i2, int i3, String str) {
        this.a = list;
        this.b = c70Var;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = str;
        this.j = j2;
        this.k = list.isEmpty() ? Uri.EMPTY : ((v2b) list.get(0)).e;
        this.l = "video/mp4";
    }

    @Override // defpackage.rui
    public final long a() {
        return this.j;
    }

    @Override // defpackage.rui
    public final long c() {
        return 0L;
    }

    @Override // defpackage.rui
    public final Uri d() {
        return this.k;
    }

    @Override // defpackage.rui
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2b)) {
            return false;
        }
        w2b w2bVar = (w2b) obj;
        return this.a.equals(w2bVar.a) && cqk.d(this.b, w2bVar.b) && this.c == w2bVar.c && this.d == w2bVar.d && this.e == w2bVar.e && this.f == w2bVar.f && this.g == w2bVar.g && this.h == w2bVar.h && cqk.d(this.i, w2bVar.i);
    }

    @Override // defpackage.rui
    public final c70 g() {
        return this.b;
    }

    @Override // defpackage.rui
    public final String getContentType() {
        return this.l;
    }

    @Override // defpackage.rui
    public final long getDuration() {
        return this.d;
    }

    @Override // defpackage.rui
    public final int getHeight() {
        return this.g;
    }

    @Override // defpackage.rui
    public final int getType() {
        return this.h;
    }

    @Override // defpackage.rui
    public final int getWidth() {
        return this.f;
    }

    @Override // defpackage.rui
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        c70 c70Var = this.b;
        int iF = c0a.f(this.h, zo5.c(this.g, zo5.c(this.f, nbh.n(qt4.g(qt4.g((iHashCode + (c70Var == null ? 0 : c70Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
        String str = this.i;
        return iF + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.rui
    public final String i() {
        return this.i;
    }

    @Override // defpackage.rui
    public final long j() {
        return 0L;
    }

    @Override // defpackage.rui
    public final long k() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mp4VideoContent(items=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        qt4.z(this.d, ", duration=", ", isMute=", sb);
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(v0h.r(this.h));
        sb.append(", failoverHost=");
        return zo5.w(sb, this.i, ")");
    }
}
