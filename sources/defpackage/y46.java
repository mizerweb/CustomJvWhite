package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y46 {
    public final int a;
    public final int b;
    public final int c;

    public y46(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y46)) {
            return false;
        }
        y46 y46Var = (y46) obj;
        return this.a == y46Var.a && this.b == y46Var.b && this.c == y46Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("EmojiLocation(spriteIndex=", this.a, ", x=", this.b, ", y="), this.c, ")");
    }
}
