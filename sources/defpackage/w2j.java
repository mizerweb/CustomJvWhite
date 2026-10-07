package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w2j {
    public final long a;
    public final int b;
    public final long c;
    public final Float d;
    public final Float e;
    public final Float f;
    public final Integer g;
    public final Integer h;

    public w2j(long j, int i, long j2, Float f, Float f2, Float f3, Integer num, Integer num2) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = num;
        this.h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2j)) {
            return false;
        }
        w2j w2jVar = (w2j) obj;
        return bj8.b(this.a, w2jVar.a) && this.b == w2jVar.b && this.c == w2jVar.c && cqk.d(this.d, w2jVar.d) && cqk.d(this.e, w2jVar.e) && cqk.d(this.f, w2jVar.f) && cqk.d(this.g, w2jVar.g) && this.h.equals(w2jVar.h);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        Float f = this.d;
        int iHashCode = (iG + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num = this.g;
        return this.h.hashCode() + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VideoParams(" + new b1e(this.a) + '|' + this.b + '|' + this.c + "B|" + this.e + "s|" + this.d + "fps|iFrame->" + this.f + "|reorder->" + this.g + "|source->" + this.h + ')';
    }
}
