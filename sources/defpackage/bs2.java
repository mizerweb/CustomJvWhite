package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bs2 extends cs2 {
    public final Throwable a;

    public bs2(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bs2) {
            return cqk.d(this.a, ((bs2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.cs2
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
