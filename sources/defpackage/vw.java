package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class vw implements h36 {
    public final ju5 a;
    public double e;
    public final zv b = new zv();
    public final float[] c = new float[4];
    public long d = qx6.a(0.0f, 0.0f);
    public final int f = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
    public final int g = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);

    public vw(ju5 ju5Var) {
        this.a = ju5Var;
    }

    public final uw a(long j, double d) {
        double d2 = d + 3.141592653589793d;
        double d3 = d2 - 0.5235987755982988d;
        double d4 = d2 + 0.5235987755982988d;
        int i = (int) (j >> 32);
        double dU = oc9.u((float) (this.e * 0.20000000298023224d), yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 36.0f);
        int i2 = (int) (j & 4294967295L);
        return new uw(0, qx6.a(Float.intBitsToFloat(i) + ((float) (Math.cos(d3) * dU)), Float.intBitsToFloat(i2) + ((float) (Math.sin(d3) * dU))), qx6.a(Float.intBitsToFloat(i) + ((float) (Math.cos(d4) * dU)), Float.intBitsToFloat(i2) + ((float) (Math.sin(d4) * dU))));
    }

    public final void b(long j, long j2, boolean z, long j3) {
        int i = (int) (j >> 32);
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        int i4 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4);
        int i5 = (int) (j3 >> 32);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2) - Float.intBitsToFloat(i5);
        int i6 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4) - Float.intBitsToFloat(i6);
        float fIntBitsToFloat5 = (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i)) / 2.0f;
        float fIntBitsToFloat6 = (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3)) / 2.0f;
        float fIntBitsToFloat7 = (Float.intBitsToFloat(i5) + Float.intBitsToFloat(i2)) / 2.0f;
        float fIntBitsToFloat8 = (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i4)) / 2.0f;
        float fSqrt = (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
        float fSqrt2 = (float) Math.sqrt((fIntBitsToFloat4 * fIntBitsToFloat4) + (fIntBitsToFloat3 * fIntBitsToFloat3));
        float f = fIntBitsToFloat5 - fIntBitsToFloat7;
        float f2 = fIntBitsToFloat6 - fIntBitsToFloat8;
        float f3 = fSqrt + fSqrt2;
        float f4 = Math.abs(f3) >= 1.0E-5f ? fSqrt2 / f3 : 0.0f;
        float fIntBitsToFloat9 = Float.intBitsToFloat(i2) - ((f * f4) + fIntBitsToFloat7);
        float fIntBitsToFloat10 = Float.intBitsToFloat(i4) - ((f2 * f4) + fIntBitsToFloat8);
        float[] fArr = this.c;
        if (z) {
            fArr[2] = fIntBitsToFloat7 + fIntBitsToFloat9;
            fArr[3] = fIntBitsToFloat8 + fIntBitsToFloat10;
        } else {
            fArr[0] = fIntBitsToFloat5 + fIntBitsToFloat9;
            fArr[1] = fIntBitsToFloat6 + fIntBitsToFloat10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0168  */
    /* JADX WARN: Code duplicated, block: B:33:0x0171  */
    /* JADX WARN: Code duplicated, block: B:36:0x0176  */
    /* JADX WARN: Code duplicated, block: B:38:0x017a  */
    @Override // defpackage.h36
    public final hb f() {
        int i;
        long j;
        uw uwVarA;
        int i2;
        qx6 qx6Var;
        ju5 ju5Var;
        long j2;
        zv zvVar = this.b;
        if (zvVar.c >= 2) {
            long j3 = ((qx6) zvVar.last()).a;
            int i3 = zvVar.c - 2;
            while (true) {
                i = -1;
                if (-1 >= i3) {
                    i3 = -1;
                    break;
                }
                if (Math.hypot(Float.intBitsToFloat((int) (((qx6) zvVar.get(i3)).a >> 32)) - Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (((qx6) zvVar.get(i3)).a & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L))) >= this.f) {
                    break;
                }
                i3--;
            }
            if (i3 == -1) {
                double dIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (this.d >> 32));
                j = 4294967295L;
                double dIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (this.d & 4294967295L));
                if (Math.hypot(dIntBitsToFloat, dIntBitsToFloat2) >= 9.999999747378752E-6d) {
                    uwVarA = a(j3, Math.atan2(dIntBitsToFloat2, dIntBitsToFloat));
                }
            } else {
                j = 4294967295L;
                int i4 = (int) (j3 >> 32);
                int i5 = (int) (j3 & 4294967295L);
                double dHypot = Math.hypot(Float.intBitsToFloat((int) (((qx6) zvVar.get(i3)).a >> 32)) - Float.intBitsToFloat(i4), Float.intBitsToFloat((int) (((qx6) zvVar.get(i3)).a & 4294967295L)) - Float.intBitsToFloat(i5));
                int i6 = i3;
                int i7 = i3 - 1;
                while (true) {
                    if (i >= i7) {
                        i7 = i6;
                        break;
                    }
                    int i8 = i7 + 1;
                    dHypot = Math.hypot(Float.intBitsToFloat((int) (((qx6) zvVar.get(i8)).a >> 32)) - Float.intBitsToFloat((int) (((qx6) zvVar.get(i7)).a >> 32)), Float.intBitsToFloat((int) (((qx6) zvVar.get(i8)).a & 4294967295L)) - Float.intBitsToFloat((int) (((qx6) zvVar.get(i7)).a & 4294967295L))) + dHypot;
                    if (dHypot >= this.g) {
                        break;
                    }
                    i6 = i7;
                    i7--;
                    i = -1;
                }
                long j4 = ((qx6) zvVar.get(i7)).a;
                double dIntBitsToFloat3 = Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (j4 >> 32));
                double dIntBitsToFloat4 = Float.intBitsToFloat(i5) - Float.intBitsToFloat((int) (j4 & 4294967295L));
                if (Math.hypot(dIntBitsToFloat3, dIntBitsToFloat4) >= 9.999999747378752E-6d) {
                    uwVarA = a(j3, Math.atan2(dIntBitsToFloat4, dIntBitsToFloat3));
                }
            }
            i2 = zvVar.c;
            if (i2 >= 2) {
                qx6Var = (qx6) zvVar.get(i2 - 2);
            } else {
                qx6Var = null;
            }
            ju5Var = this.a;
            if (qx6Var != null) {
                j2 = qx6Var.a;
                if (uwVarA != null) {
                    long j5 = uwVarA.c;
                    long j6 = uwVarA.b;
                    ju5Var.a(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & j)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & j)), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & j)), true);
                }
            }
            return new hb(ju5Var);
        }
        j = 4294967295L;
        uwVarA = null;
        i2 = zvVar.c;
        if (i2 >= 2) {
            qx6Var = (qx6) zvVar.get(i2 - 2);
        } else {
            qx6Var = null;
        }
        ju5Var = this.a;
        if (qx6Var != null) {
            j2 = qx6Var.a;
            if (uwVarA != null) {
                long j7 = uwVarA.c;
                long j8 = uwVarA.b;
                ju5Var.a(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & j)), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & j)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & j)), true);
            }
        }
        return new hb(ju5Var);
    }

    @Override // defpackage.h36
    public final void i(MotionEvent motionEvent) {
        zv zvVar = this.b;
        zvVar.clear();
        this.e = 0.0d;
        long jA = qx6.a(motionEvent.getX(), motionEvent.getY());
        zvVar.addLast(new qx6(jA));
        this.d = jA;
    }

    @Override // defpackage.h36
    public final void l(MotionEvent motionEvent) {
        zv zvVar = this.b;
        if (zvVar.isEmpty()) {
            return;
        }
        long j = ((qx6) zvVar.last()).a;
        long jA = qx6.a(motionEvent.getX(), motionEvent.getY());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        this.e = Math.hypot(Float.intBitsToFloat(i) - Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i2) - Float.intBitsToFloat((int) (j & 4294967295L))) + this.e;
        zvVar.addLast(new qx6(jA));
        int i3 = zvVar.c;
        ju5 ju5Var = this.a;
        if (i3 == 2) {
            long j2 = ((qx6) zvVar.first()).a;
            ju5Var.d(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        }
        int i4 = zvVar.c;
        if (i4 > 3) {
            long j3 = ((qx6) zvVar.get(i4 - 4)).a;
            long j4 = ((qx6) zvVar.get(i4 - 3)).a;
            long j5 = ((qx6) zvVar.get(i4 - 2)).a;
            long j6 = ((qx6) zvVar.get(i4 - 1)).a;
            b(j3, j4, true, j5);
            b(j4, j5, false, j6);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            float[] fArr = this.c;
            ju5Var.c(fIntBitsToFloat, fIntBitsToFloat2, fArr[2], fArr[3], fArr[0], fArr[1], Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
        while (zvVar.c > 64) {
            zvVar.removeFirst();
        }
    }
}
