package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class y63 {
    public static final x63 Companion = new x63();
    public static final y63 d = new y63();
    public final int a;
    public final int b;
    public final boolean c;

    public /* synthetic */ y63(int i, int i2, int i3) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y63)) {
            return false;
        }
        y63 y63Var = (y63) obj;
        return this.a == y63Var.a && this.b == y63Var.b && this.c == y63Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return qt4.r(qv1.p("ChatMembersLoadConfig(maxLoadCount=", this.a, ", minInCall=", this.b, ", newLoadingContactsLogicEnabled="), this.c, ")");
    }

    public y63() {
        this.a = 0;
        this.b = 0;
        this.c = false;
    }
}
