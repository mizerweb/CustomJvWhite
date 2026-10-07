package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wmd {
    public final boolean a;
    public final boolean b;

    public wmd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmd)) {
            return false;
        }
        wmd wmdVar = (wmd) obj;
        return this.a == wmdVar.a && this.b == wmdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("State(isChecked=", this.a, ", isEnabled=", this.b, ")");
    }
}
