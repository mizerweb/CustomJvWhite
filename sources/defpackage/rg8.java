package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rg8 {
    public final int a;
    public final int b;
    public final int c;

    public rg8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg8)) {
            return false;
        }
        rg8 rg8Var = (rg8) obj;
        return this.a == rg8Var.a && this.b == rg8Var.b && this.c == rg8Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", format=");
        return qt4.p(sb, this.c, ')');
    }
}
