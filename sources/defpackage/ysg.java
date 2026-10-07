package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ysg {
    public final wyg a;
    public final long b;
    public final short c;
    public final short d;
    public final long e;

    public ysg(wyg wygVar, long j, short s, short s2, long j2) {
        this.a = wygVar;
        this.b = j;
        this.c = s;
        this.d = s2;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysg)) {
            return false;
        }
        ysg ysgVar = (ysg) obj;
        return this.a.equals(ysgVar.a) && this.b == ysgVar.b && this.c == ysgVar.c && this.d == ysgVar.d && this.e == ysgVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Short.hashCode(this.d) + ((Short.hashCode(this.c) + qt4.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesPreviewApi(owner=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        zo5.C(this.c, this.d, ", totalCount=", ", readCount=", sb);
        return zo5.k(this.e, ", lastStoryExpirationTime=", ")", sb);
    }
}
