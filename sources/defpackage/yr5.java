package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yr5 implements as5 {
    public final boolean a;

    public yr5(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr5) && this.a == ((yr5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("FileDownloadInterrupted(shouldRetry=", ")", this.a);
    }
}
