package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fcc {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final zvb d;
    public final int e;

    public fcc(String str, CharSequence charSequence, long j, xvb xvbVar, int i, int i2) {
        xvbVar = (i2 & 16) != 0 ? null : xvbVar;
        i = (i2 & 32) != 0 ? 50 : i;
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = xvbVar;
        this.e = i;
    }

    public final CharSequence a() {
        return this.b;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        return this.c;
    }

    public final zvb d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcc)) {
            return false;
        }
        fcc fccVar = (fcc) obj;
        return cqk.d(this.a, fccVar.a) && cqk.d(this.b, fccVar.b) && this.c == fccVar.c && cqk.d(this.d, fccVar.d) && this.e == fccVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = qt4.g(mw7.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 961, this.c);
        zvb zvbVar = this.d;
        return Integer.hashCode(this.e) + ((iG + (zvbVar != null ? zvbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarParams(url=");
        sb.append(this.a);
        sb.append(", abbreviationName=");
        sb.append((Object) this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", placeholder=null, overlay=");
        sb.append(this.d);
        return qv1.o(sb, ", fadeDuration=", this.e, ")");
    }
}
