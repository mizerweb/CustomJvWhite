package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oq5 implements rq5 {
    public final boolean a;

    public oq5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq5) && this.a == ((oq5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("FileDownloadInterrupted(shouldRetry=", ")", this.a);
    }
}
