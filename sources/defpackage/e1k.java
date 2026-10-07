package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e1k extends i4e implements Serializable {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    @Override // defpackage.i4e
    public final int a(int i) {
        return (c() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.i4e
    public final int c() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.g;
        this.f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.g = i4;
        int i5 = this.h + 362437;
        this.h = i5;
        return i4 + i5;
    }
}
