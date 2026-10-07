package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class lx8 extends Random {
    public final h4e a = i4e.a;
    public boolean b;

    @Override // java.util.Random
    public final int next(int i) {
        this.a.getClass();
        return i4e.b.a(i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        this.a.getClass();
        return i4e.b.j();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        this.a.getClass();
        i4e.b.i().nextBytes(bArr);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        this.a.getClass();
        return i4e.b.k();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        this.a.getClass();
        return i4e.b.b();
    }

    @Override // java.util.Random
    public final int nextInt() {
        this.a.getClass();
        return i4e.b.c();
    }

    @Override // java.util.Random
    public final long nextLong() {
        this.a.getClass();
        return i4e.b.f();
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.b) {
            c.i("Setting seed is not supported.");
        } else {
            this.b = true;
        }
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        this.a.getClass();
        return i4e.b.d(i);
    }
}
