package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class a82 {
    public static final z72 Companion = new z72();
    public final boolean a;
    public final boolean b;

    public /* synthetic */ a82(int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a82)) {
            return false;
        }
        a82 a82Var = (a82) obj;
        return this.a == a82Var.a && this.b == a82Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("CallsAudioFormatConfig(isEnabled=", this.a, ", reportWeirdConfig=", this.b, ")");
    }

    public a82() {
        this.a = false;
        this.b = false;
    }
}
