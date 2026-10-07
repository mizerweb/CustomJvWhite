package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wf9 extends yf9 {
    public final tnh d;

    public wf9(tnh tnhVar) {
        super(tnhVar, null);
        this.d = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf9) && this.d.equals(((wf9) obj).d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d.c);
    }

    public final String toString() {
        return x05.g("ProfileSuspended(title=", this.d, ")");
    }
}
