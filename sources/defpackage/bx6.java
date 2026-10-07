package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class bx6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final xp9 k;
    public final lwa l;

    public bx6(int i, byte[] bArr) {
        mo2 mo2Var = new mo2(bArr.length, bArr);
        mo2Var.q(i * 8);
        this.a = mo2Var.i(16);
        this.b = mo2Var.i(16);
        this.c = mo2Var.i(24);
        this.d = mo2Var.i(24);
        int i2 = mo2Var.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = mo2Var.i(3) + 1;
        int i3 = mo2Var.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        this.j = mo2Var.k(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final b87 c(byte[] bArr, lwa lwaVar) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        lwa lwaVar2 = this.l;
        if (lwaVar2 != null) {
            lwaVar = lwaVar2.b(lwaVar);
        }
        a87 a87Var = new a87();
        a87Var.m = uya.n("audio/flac");
        a87Var.n = i;
        a87Var.E = this.g;
        a87Var.F = this.e;
        String str = vqi.a;
        a87Var.G = vqi.H(this.h, ByteOrder.LITTLE_ENDIAN);
        a87Var.p = Collections.singletonList(bArr);
        a87Var.k = lwaVar;
        return new b87(a87Var);
    }

    public bx6(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, xp9 xp9Var, lwa lwaVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = xp9Var;
        this.l = lwaVar;
    }
}
