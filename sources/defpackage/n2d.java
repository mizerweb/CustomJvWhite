package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class n2d extends e3 {
    @Override // defpackage.i4e
    public final int e(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // defpackage.i4e
    public final long g(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // defpackage.i4e
    public final long h(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.e3
    public final Random i() {
        return ThreadLocalRandom.current();
    }
}
