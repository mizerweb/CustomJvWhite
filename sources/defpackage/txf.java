package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class txf {
    public final ynh a;
    public final ynh b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public txf(ynh ynhVar, ynh ynhVar2, String str, Integer num, Integer num2) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txf)) {
            return false;
        }
        txf txfVar = (txf) obj;
        return cqk.d(this.a, txfVar.a) && cqk.d(this.b, txfVar.b) && cqk.d(this.c, txfVar.c) && cqk.d(this.d, txfVar.d) && cqk.d(this.e, txfVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=" + this.e + ")";
    }

    public /* synthetic */ txf(tnh tnhVar, xnh xnhVar, Integer num) {
        this(tnhVar, xnhVar, null, null, num);
    }
}
