package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class re8 implements se8 {
    public final String a;
    public final File b;

    public re8(File file, String str) {
        this.a = str;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re8)) {
            return false;
        }
        re8 re8Var = (re8) obj;
        return cqk.d(this.a, re8Var.a) && cqk.d(this.b, re8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        File file = this.b;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "Update(url=" + this.a + ", file=" + this.b + ")";
    }
}
