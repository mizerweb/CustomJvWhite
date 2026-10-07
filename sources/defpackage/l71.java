package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class l71 {
    public final File a;
    public final long b;
    public final long c;
    public final b81 d;

    public l71(File file, b81 b81Var) {
        this.a = file;
        this.b = file.length();
        this.c = file.lastModified();
        this.d = b81Var;
    }

    public final String toString() {
        return "CacheEntry{file=" + this.a + ", length=" + this.b + ", lastModified=" + this.c + ", cacheType=" + this.d + '}';
    }
}
