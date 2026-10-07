package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ts0 implements Comparable {
    public final rs0 a;
    public final int b;
    public final int c;
    public final String d;

    public ts0(rs0 rs0Var, int i, int i2) {
        String string;
        this.a = rs0Var;
        this.b = i;
        this.c = i2;
        int i3 = ss0.$EnumSwitchMapping$0[rs0Var.ordinal()];
        if (i3 == 1) {
            StringBuilder sb = new StringBuilder("sqr_");
            sb.append(i);
            if (i2 == 2) {
                sb.append("_2x");
            }
            string = sb.toString();
        } else {
            if (i3 != 2) {
                ore.o();
                throw null;
            }
            string = zo5.h(i, "w_");
        }
        this.d = string;
    }

    public final int a() {
        return this.b * this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return cqk.i(a(), ((ts0) obj).a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts0)) {
            return false;
        }
        ts0 ts0Var = (ts0) obj;
        return this.a == ts0Var.a && this.b == ts0Var.b && this.c == ts0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(shapeType=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", scale=");
        return zo5.t(sb, this.c, ")");
    }
}
