package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class nh0 {
    public final long a;
    public final long b;
    public final File c;

    public nh0(long j, long j2, File file) {
        this.a = j;
        this.b = j2;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nh0)) {
            return false;
        }
        nh0 nh0Var = (nh0) obj;
        return this.a == nh0Var.a && this.b == nh0Var.b && this.c.equals(nh0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * (-721379959));
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=null, file=" + this.c + "}";
    }
}
