package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jl {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jl(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        jl jlVar = (jl) obj;
        return this.a == jlVar.a && cqk.d(this.b, jlVar.b) && cqk.d(this.c, jlVar.c) && cqk.d(this.d, jlVar.d) && cqk.d(this.e, jlVar.e);
    }

    public final int hashCode() {
        int iD = zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "Animoji(id=", ", emoji=", this.b);
        nbh.G(sbT, ", lottieUrl=", this.c, ", effectLottieUrl=", this.d);
        return qt4.q(sbT, ", iconUrl=", this.e, ")");
    }
}
