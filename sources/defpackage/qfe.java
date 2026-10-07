package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qfe implements ut4 {
    public final j9b a;

    public qfe(l9b l9bVar) {
        this.a = l9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfe) && cqk.d(this.a, ((qfe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ")";
    }
}
