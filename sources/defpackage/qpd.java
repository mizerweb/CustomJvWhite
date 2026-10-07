package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qpd extends rpd {
    public final tnh a;
    public final int b;

    public qpd(int i, tnh tnhVar) {
        this.a = tnhVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpd)) {
            return false;
        }
        qpd qpdVar = (qpd) obj;
        return this.a.equals(qpdVar.a) && this.b == qpdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }
}
