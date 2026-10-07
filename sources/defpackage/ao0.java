package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ao0 {
    public final boolean a;
    public final boolean b;

    public ao0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static void a(boolean z, y3e y3eVar, String str, String str2) {
        if (z) {
            y3eVar.log("BadNetworkIndicatorConfig", qv1.l("[", str, "]: ", str2));
        }
    }

    public final void b(y3e y3eVar, String str, String str2) {
        y3eVar.getClass();
        str2.getClass();
        a(this.a, y3eVar, str, str2);
    }

    public final void c(y3e y3eVar, String str, String str2) {
        y3eVar.getClass();
        a(this.b, y3eVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao0)) {
            return false;
        }
        ao0 ao0Var = (ao0) obj;
        return this.a == ao0Var.a && this.b == ao0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("DebugLoggingConfig(debugLogging=", this.a, ", debugVerboseLogging=", this.b, ")");
    }
}
