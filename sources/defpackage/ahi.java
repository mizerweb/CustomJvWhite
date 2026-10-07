package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahi {
    public final String a;
    public final long b;
    public final oji c;
    public final String d;

    public ahi(String str, long j, oji ojiVar, String str2) {
        this.a = str;
        this.b = j;
        this.c = ojiVar;
        this.d = str2;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final oji c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahi)) {
            return false;
        }
        ahi ahiVar = (ahi) obj;
        return cqk.d(this.a, ahiVar.a) && this.b == ahiVar.b && this.c == ahiVar.c && cqk.d(this.d, ahiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + qt4.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("UploadData{path='", gm0.c() ? this.a : "*****", "', attachLocalId='", this.d, "', lastModified=");
        sbQ.append(this.b);
        sbQ.append(", uploadType=");
        sbQ.append(this.c);
        sbQ.append("}");
        return sbQ.toString();
    }
}
