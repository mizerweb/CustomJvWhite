package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class n84 {
    public final int a;
    public final o84[] b;
    public long c;

    public n84(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new o84[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new o84(threadFactory);
        }
    }

    public final o84 a() {
        int i = this.a;
        if (i == 0) {
            return p84.f;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.b[(int) (j % ((long) i))];
    }
}
