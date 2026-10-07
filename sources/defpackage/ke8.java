package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ke8 extends me8 {
    public final long a;
    public final File b;

    public ke8(File file, long j) {
        this.a = j;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke8)) {
            return false;
        }
        ke8 ke8Var = (ke8) obj;
        return this.a == ke8Var.a && cqk.d(this.b, ke8Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        File file = this.b;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "Completed(requestId=" + this.a + ", file=" + this.b + ")";
    }
}
