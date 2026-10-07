package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a21 implements d21 {
    public final Integer a;
    public final Integer b;
    public final String c;

    public a21(Integer num, Integer num2, String str) {
        this.a = num;
        this.b = num2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a21)) {
            return false;
        }
        a21 a21Var = (a21) obj;
        return cqk.d(this.a, a21Var.a) && cqk.d(this.b, a21Var.b) && cqk.d(this.c, a21Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(views=");
        sb.append(this.a);
        sb.append(", reactions=");
        sb.append(this.b);
        sb.append(", timeLeft=");
        return zo5.w(sb, this.c, ")");
    }
}
