package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class poe implements Serializable {
    public final Throwable a;

    public poe(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof poe) {
            return cqk.d(this.a, ((poe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
