package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class dq6 {
    public final File a;

    public dq6(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dq6)) {
            return false;
        }
        return this.a.equals(((dq6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
