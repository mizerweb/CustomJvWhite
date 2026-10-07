package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class omb implements Serializable {
    public final Throwable a;

    public omb(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof omb) {
            return Objects.equals(this.a, ((omb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.a + "]";
    }
}
