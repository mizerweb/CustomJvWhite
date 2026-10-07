package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bqc implements dqc {
    public final tnh a;

    public bqc(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqc) && this.a.equals(((bqc) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return x05.g("Content(title=", this.a, ", canClose=true)");
    }
}
