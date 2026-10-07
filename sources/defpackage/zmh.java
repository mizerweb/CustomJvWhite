package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zmh {
    public final int a;
    public final int b;
    public final int c;

    public zmh(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmh)) {
            return false;
        }
        zmh zmhVar = (zmh) obj;
        return this.a == zmhVar.a && this.b == zmhVar.b && this.c == zmhVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("CacheKey(textHash=", this.a, ", payloadHash=", this.b, ", maxWidth="), this.c, ")");
    }
}
