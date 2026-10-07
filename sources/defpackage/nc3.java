package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nc3 implements pc3 {
    public final boolean a;
    public final boolean b;

    public nc3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc3)) {
            return false;
        }
        nc3 nc3Var = (nc3) obj;
        return this.a == nc3Var.a && this.b == nc3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("ShowVpnNotification(shouldShow=", this.a, ", isChatWarning=", this.b, ")");
    }
}
