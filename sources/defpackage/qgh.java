package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qgh {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public qgh(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgh)) {
            return false;
        }
        qgh qghVar = (qgh) obj;
        return this.a == qghVar.a && this.b == qghVar.b && this.c == qghVar.c && this.d == qghVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("StateConfig(startIconColor=", this.a, ", titleTextColor=", this.b, ", endIconColor=");
        sbP.append(this.c);
        sbP.append(", isEndIconVisible=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
