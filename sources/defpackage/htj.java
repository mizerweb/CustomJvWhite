package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class htj {
    public final Set a;

    public htj(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htj) && this.a.equals(((htj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebRTCStatConfig(allowedLogItems=" + this.a + ")";
    }
}
