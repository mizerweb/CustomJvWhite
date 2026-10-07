package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class roe implements Serializable {
    public final Object a;

    public /* synthetic */ roe(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof poe) {
            return ((poe) obj).a;
        }
        return null;
    }

    public static String b(Object obj) {
        if (obj instanceof poe) {
            return ((poe) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof roe) {
            return cqk.d(this.a, ((roe) obj).a);
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
        return b(this.a);
    }
}
