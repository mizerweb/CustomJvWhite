package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q32 {
    public static final q32 e = new q32(2, null, null, null);
    public final int a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;

    public q32(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q32)) {
            return false;
        }
        q32 q32Var = (q32) obj;
        return this.a == q32Var.a && cqk.d(this.b, q32Var.b) && cqk.d(this.c, q32Var.c) && cqk.d(this.d, q32Var.d);
    }

    public final int hashCode() {
        int iD = qt4.D(this.a) * 31;
        CharSequence charSequence = this.b;
        int iHashCode = (iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.d;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CallTimeData(place=");
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "null" : "SPEAKER";
        } else {
            str = "HEADER";
        }
        sb.append(str);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", organization=");
        sb.append((Object) this.c);
        sb.append(", status=");
        sb.append((Object) this.d);
        sb.append(")");
        return sb.toString();
    }
}
