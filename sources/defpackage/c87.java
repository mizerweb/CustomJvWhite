package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c87 {
    public final int a;
    public final String b;
    public final String c;

    public c87(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        if (str == null && str2 == null) {
            ore.p("FormatCombo must have at least one valid track. Both videoMime and audioMime cannot be null.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c87)) {
            return false;
        }
        c87 c87Var = (c87) obj;
        return this.a == c87Var.a && cqk.d(this.b, c87Var.b) && cqk.d(this.c, c87Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormatCombo(container=");
        sb.append(this.a);
        sb.append(", videoMime=");
        sb.append(this.b);
        sb.append(", audioMime=");
        return x05.i(sb, this.c, ')');
    }
}
