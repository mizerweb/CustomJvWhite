package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3 extends i4e {
    @Override // defpackage.i4e
    public final int a(int i) {
        return (i().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.i4e
    public final float b() {
        return i().nextFloat();
    }

    @Override // defpackage.i4e
    public final int c() {
        return i().nextInt();
    }

    @Override // defpackage.i4e
    public final int d(int i) {
        return i().nextInt(i);
    }

    @Override // defpackage.i4e
    public final long f() {
        return i().nextLong();
    }

    public abstract Random i();

    public final boolean j() {
        return i().nextBoolean();
    }

    public final double k() {
        return i().nextDouble();
    }
}
