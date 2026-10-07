package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o62 implements q62 {
    public final long a;
    public final int b = 1;

    public o62(long j) {
        this.a = j;
    }

    @Override // defpackage.q62
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o62)) {
            return false;
        }
        o62 o62Var = (o62) obj;
        return this.a == o62Var.a && this.b == o62Var.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "None(lastUpdate=", ", titleEllipsizeMode=");
        sbS.append(bc1.v(this.b));
        sbS.append(")");
        return sbS.toString();
    }
}
