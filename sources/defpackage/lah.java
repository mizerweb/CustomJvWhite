package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lah {
    public static final lah g = new lah(0, 0, null, r66.a);
    public final String a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final boolean f;

    public lah(int i, int i2, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list.size();
        this.f = list.size() < i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lah)) {
            return false;
        }
        lah lahVar = (lah) obj;
        return cqk.d(this.a, lahVar.a) && this.b == lahVar.b && this.c == lahVar.c && this.d.equals(lahVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + zo5.c(this.c, zo5.c(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "SuggestsResult(query=", this.a, ", cursorPosition=", ", totalCount=");
        sbR.append(this.c);
        sbR.append(", result=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
