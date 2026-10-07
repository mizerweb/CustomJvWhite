package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class txg implements vxg {
    public final File a;

    public txg(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txg) && cqk.d(this.a, ((txg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PreviewReady(file=" + this.a + ")";
    }
}
