package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ntg {
    public final azg a;
    public final long b;
    public final String c;
    public final long d;

    public ntg(azg azgVar, long j, String str, long j2) {
        this.a = azgVar;
        this.b = j;
        this.c = str;
        this.d = j2;
    }

    public final long a() {
        return this.d;
    }

    public final azg b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntg)) {
            return false;
        }
        ntg ntgVar = (ntg) obj;
        return cqk.d(this.a, ntgVar.a) && this.b == ntgVar.b && cqk.d(this.c, ntgVar.c) && this.d == ntgVar.d;
    }

    public final int hashCode() {
        int iG = qt4.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.d) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesReply(owner=");
        sb.append(this.a);
        sb.append(", storyId=");
        sb.append(this.b);
        p.j(sb, ", previewUrl=", this.c, ", expirationTime=");
        return c0a.m(this.d, ")", sb);
    }
}
