package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rqh implements ut4 {
    public final ThreadLocal a;

    public rqh(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqh) && cqk.d(this.a, ((rqh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
