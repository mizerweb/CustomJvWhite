package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ju3 implements mu3 {
    public final boolean a;

    public ju3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju3) && this.a == ((ju3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("AttemptKeepAsInput(keepHdr=", ")", this.a);
    }
}
