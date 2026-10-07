package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n3k {
    public final vxa a;
    public final long b;
    public long c = SystemClock.elapsedRealtime();

    public n3k(long j, vxa vxaVar) {
        this.a = vxaVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((n3k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
