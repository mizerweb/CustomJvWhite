package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class reg implements fb0 {
    public final Object b;
    public final l6m c;
    public final jfh d;
    public final c70 e;
    public final ArrayDeque f;
    public float g;
    public long h;
    public boolean i;
    public cb0 j;
    public cb0 k;
    public cb0 l;
    public boolean m;

    public reg(l6m l6mVar) {
        cb0 cb0Var = cb0.e;
        this.k = cb0Var;
        this.l = cb0Var;
        this.j = cb0Var;
        this.c = l6mVar;
        Object obj = new Object();
        this.b = obj;
        this.d = new jfh(obj);
        this.e = new c70();
        this.f = new ArrayDeque();
        this.g = 1.0f;
    }

    public static long a(int i, long j, l6m l6mVar) {
        long jLongValueExact;
        l6m l6mVar2 = l6mVar;
        long j2 = i;
        long jI0 = vqi.i0(j, j2, 1000000L, RoundingMode.HALF_EVEN);
        lvb.R(l6mVar2 != null);
        lvb.R(i > 0);
        long j3 = 0;
        lvb.R(jI0 >= 0);
        long j4 = 0;
        long j5 = 0;
        while (j4 < jI0) {
            long jB = erl.b(i, j4, l6mVar2);
            if (jB == -1 || jB > jI0) {
                jB = jI0;
            }
            lvb.R(j4 >= j3);
            lvb.R(i > 0);
            float fR = l6mVar2.r(vqi.g0(i, j4));
            float f = i;
            float f2 = (f / f) * fR;
            double d = fR / fR;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(f2));
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(jB - j4);
            if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
                bigDecimalValueOf = bigDecimalValueOf.divide(BigDecimal.valueOf(d), RoundingMode.HALF_EVEN);
            }
            if (f2 == 1.0f) {
                jLongValueExact = bigDecimalValueOf.longValueExact();
            } else {
                RoundingMode roundingMode = RoundingMode.HALF_EVEN;
                long jLongValueExact2 = bigDecimalValueOf.divide(bigDecimal, roundingMode).longValueExact();
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j2);
                BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, 20, roundingMode);
                BigDecimal bigDecimalDivide2 = bigDecimalValueOf2.divide(bigDecimal, 20, roundingMode);
                RoundingMode roundingMode2 = RoundingMode.FLOOR;
                jLongValueExact = jLongValueExact2 - bigDecimalDivide.multiply(bigDecimalDivide2.subtract(bigDecimalDivide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
            }
            j5 += jLongValueExact;
            l6mVar2 = l6mVar;
            j4 = jB;
            j3 = 0;
        }
        return vqi.g0(i, j5);
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (this.j.a == -1) {
                    return;
                }
                while (!this.f.isEmpty()) {
                    long jF = this.e.f();
                    ((gth) this.f.remove()).a(a(this.j.a, jF, this.c));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fb0
    public final boolean c() {
        return this.m && this.d.c();
    }

    @Override // defpackage.fb0
    public final ByteBuffer d() {
        return this.d.d();
    }

    @Override // defpackage.fb0
    public final void e(db0 db0Var) {
        this.m = false;
        this.h = 0L;
        this.i = false;
        synchronized (this.b) {
            this.j = this.k;
            this.d.e(db0Var);
            b();
            this.h = vqi.r(this.j.a, db0Var.a);
        }
    }

    @Override // defpackage.fb0
    public final void f(ByteBuffer byteBuffer) {
        cb0 cb0Var;
        int i;
        synchronized (this.b) {
            cb0Var = this.j;
        }
        l6m l6mVar = this.c;
        long j = this.h;
        int i2 = cb0Var.a;
        lvb.R(j >= 0);
        lvb.R(i2 > 0);
        float fR = l6mVar.r(vqi.g0(i2, j));
        long jB = erl.b(cb0Var.a, this.h, this.c);
        if (fR != this.g) {
            this.g = fR;
            jfh jfhVar = this.d;
            synchronized (jfhVar.b) {
                fdg fdgVar = jfhVar.c;
                fdgVar.getClass();
                lvb.R(fR > 0.0f);
                if (fdgVar.d != fR) {
                    fdgVar.d = fR;
                    fdgVar.j = true;
                }
            }
            jfh jfhVar2 = this.d;
            synchronized (jfhVar2.b) {
                fdg fdgVar2 = jfhVar2.c;
                fdgVar2.getClass();
                lvb.R(fR > 0.0f);
                if (fdgVar2.e != fR) {
                    fdgVar2.e = fR;
                    fdgVar2.j = true;
                }
            }
            this.d.e(db0.b);
            this.i = false;
        }
        int iLimit = byteBuffer.limit();
        if (jB != -1) {
            i = (int) ((jB - this.h) * ((long) cb0Var.d));
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long jPosition = byteBuffer.position();
        this.d.f(byteBuffer);
        if (i != -1 && ((long) byteBuffer.position()) - jPosition == i) {
            this.d.h();
            this.i = true;
        }
        long jPosition2 = ((long) byteBuffer.position()) - jPosition;
        lvb.Z("A frame was not queued completely.", jPosition2 % ((long) cb0Var.d) == 0);
        this.h = (jPosition2 / ((long) cb0Var.d)) + this.h;
        byteBuffer.limit(iLimit);
    }

    @Override // defpackage.fb0
    public final cb0 g(cb0 cb0Var) {
        this.k = cb0Var;
        cb0 cb0VarG = this.d.g(cb0Var);
        this.l = cb0VarG;
        return cb0VarG;
    }

    @Override // defpackage.fb0
    public final void h() {
        this.m = true;
        if (this.i) {
            return;
        }
        this.d.h();
        this.i = true;
    }

    @Override // defpackage.fb0
    public final long i(long j) {
        return erl.a(this.c, j);
    }

    @Override // defpackage.fb0
    public final boolean isActive() {
        return !this.l.equals(cb0.e);
    }

    @Override // defpackage.fb0
    public final void reset() {
        e(db0.b);
        cb0 cb0Var = cb0.e;
        this.k = cb0Var;
        this.l = cb0Var;
        synchronized (this.b) {
            this.j = cb0Var;
            c70 c70Var = this.e;
            c70Var.a = 0;
            c70Var.b = -1;
            c70Var.c = 0;
            this.f.clear();
        }
        this.g = 1.0f;
        this.h = 0L;
        this.i = false;
        this.d.reset();
    }
}
