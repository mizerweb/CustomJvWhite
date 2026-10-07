package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jdj {
    public final long a;
    public final String b;
    public final bdj c;
    public final tu3 d;

    public jdj(long j, String str, bdj bdjVar, tu3 tu3Var) {
        this.a = j;
        this.b = str;
        this.c = bdjVar;
        this.d = tu3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdj)) {
            return false;
        }
        jdj jdjVar = (jdj) obj;
        return this.a == jdjVar.a && cqk.d(this.b, jdjVar.b) && this.c == jdjVar.c && this.d.equals(jdjVar.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() + ((this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "WebAppAnalyticsParam(botId=", ", webAppName=", this.b);
        sbT.append(", entryPoint=");
        sbT.append(this.c);
        sbT.append(", sourceType=");
        sbT.append(this.d);
        sbT.append(", label=null)");
        return sbT.toString();
    }
}
