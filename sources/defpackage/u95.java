package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class u95 {
    public final String a;
    public final dq6 b;
    public long c;
    public long d;

    public u95(File file, String str) {
        str.getClass();
        this.a = str;
        this.b = new dq6(file);
        this.c = -1L;
        this.d = -1L;
    }

    public final long a() {
        if (this.d < 0) {
            this.d = this.b.a.lastModified();
        }
        return this.d;
    }
}
