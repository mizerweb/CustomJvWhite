package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gpb {
    public final boolean a;
    public final int b;

    public gpb(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpb)) {
            return false;
        }
        gpb gpbVar = (gpb) obj;
        return this.a == gpbVar.a && this.b == gpbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NsConfig(enabled=" + this.a + ", version=" + this.b + ")";
    }
}
