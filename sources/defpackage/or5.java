package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class or5 implements qr5 {
    public final boolean a;

    public or5(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof or5) && this.a == ((or5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("FileDownloadInterrupted(shouldRetry=", ")", this.a);
    }
}
