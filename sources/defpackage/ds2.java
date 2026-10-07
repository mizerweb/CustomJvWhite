package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ds2 {
    public static final cs2 b = new cs2();
    public final Object a;

    public /* synthetic */ ds2(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        bs2 bs2Var = obj instanceof bs2 ? (bs2) obj : null;
        if (bs2Var != null) {
            return bs2Var.a;
        }
        return null;
    }

    public static final void b(Object obj) {
        if (obj instanceof cs2) {
            if (!(obj instanceof bs2)) {
                ore.k("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th = ((bs2) obj).a;
            if (th != null) {
                throw th;
            }
            ore.k("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    public static String c(Object obj) {
        if (obj instanceof bs2) {
            return ((bs2) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ds2) {
            return cqk.d(this.a, ((ds2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return c(this.a);
    }
}
