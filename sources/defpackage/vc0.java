package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vc0 {
    public final ny8 a;
    public volatile byte[] b;
    public volatile int c;
    public final ArrayList d = new ArrayList();
    public final IntEvaluator e = new IntEvaluator();
    public final FloatEvaluator f = new FloatEvaluator();
    public final dq4 g;
    public final mjg h;
    public final r8e i;
    public zv j;
    public Byte k;
    public volatile Float l;
    public volatile Float m;
    public volatile Integer n;
    public volatile sgg o;

    public vc0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        xt4 xt4VarR0 = ((n0c) ((xhh) ny8Var2.getValue())).a().R0(1, "audiowave_delegate");
        vt4 vt4Var = (vt4) ny8Var3.getValue();
        xt4VarR0.getClass();
        this.g = cqk.a(lvb.x0(xt4VarR0, vt4Var));
        mjg mjgVarA = p90.a(oc0.a);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
    }

    public final void a() {
        Integer num;
        float fFloatValue;
        Float fValueOf = Float.valueOf(0.0f);
        zv zvVar = this.j;
        if (zvVar == null || (num = this.n) == null) {
            return;
        }
        int iIntValue = num.intValue();
        byte[] bArr = this.b;
        if (bArr == null) {
            return;
        }
        Byte b = this.k;
        int i = 0;
        if (b == null) {
            this.k = (byte) 0;
            return;
        }
        float fByteValue = b.byteValue();
        if (bArr.length == 0) {
            ore.f("Array is empty.");
            return;
        }
        byte bFloatValue = (byte) this.f.evaluate(0.5f, (Number) Float.valueOf(fByteValue), (Number) Float.valueOf(bArr[bArr.length - 1])).floatValue();
        this.k = Byte.valueOf(bFloatValue);
        float fB = b(bFloatValue);
        sc0 sc0Var = zvVar.c == iIntValue ? (sc0) zvVar.removeFirst() : null;
        if (sc0Var == null) {
            sc0Var = new sc0();
            sc0Var.a = 0.0f;
            sc0Var.b = 0.0f;
        }
        Float f = this.m;
        sc0Var.a = f != null ? f.floatValue() : 0.0f;
        sc0Var.b = fB;
        zvVar.addLast(sc0Var);
        int i2 = zvVar.c;
        if (8 <= i2) {
            i2 = 8;
        }
        int iCeil = (int) Math.ceil(i2 / 2.0f);
        int i3 = zvVar.c - iCeil;
        mjg mjgVar = this.h;
        ArrayList arrayList = new ArrayList(yw3.W0(zvVar, 10));
        for (Object obj : zvVar) {
            int i4 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            sc0 sc0Var2 = (sc0) obj;
            if (i < iCeil && zvVar.c >= (iIntValue - iCeil) + i) {
                fFloatValue = this.f.evaluate(oc9.u((iCeil - i) / iCeil, 0.0f, 1.0f), (Number) Float.valueOf(sc0Var2.b), (Number) fValueOf).floatValue();
            } else if (i >= i3) {
                float f2 = i - i3;
                float f3 = iCeil - 1.0f;
                if (f3 < 1.0f) {
                    f3 = 1.0f;
                }
                fFloatValue = this.f.evaluate(oc9.u(f2 / f3, 0.0f, 1.0f), (Number) Float.valueOf(sc0Var2.b), (Number) fValueOf).floatValue();
            } else {
                fFloatValue = sc0Var2.a;
            }
            sc0Var2.a = fFloatValue;
            arrayList.add(Float.valueOf(fFloatValue));
            i = i4;
        }
        qc0 qc0Var = new qc0(arrayList);
        mjgVar.getClass();
        mjgVar.j(null, qc0Var);
    }

    public final float b(byte b) {
        Float f = this.l;
        if (f != null) {
            float fFloatValue = f.floatValue();
            Float f2 = this.m;
            if (f2 != null) {
                float fFloatValue2 = f2.floatValue();
                float f3 = (fFloatValue / 127.0f) * b;
                return f3 < fFloatValue2 ? fFloatValue2 : f3;
            }
        }
        return 0.0f;
    }

    public final byte[] c(int i, byte[] bArr) {
        int iIntValue;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 || bArr.length == 1) {
                iIntValue = bArr[0];
            } else if (i2 == i - 1) {
                iIntValue = bArr[bArr.length - 1];
            } else {
                float length = (i2 / i) * (bArr.length - 1);
                int i3 = (int) length;
                int i4 = i3 + 1;
                iIntValue = (i3 >= bArr.length - 1 || i4 >= bArr.length - 1) ? 0 : this.e.evaluate(length - i3, Integer.valueOf(bArr[i3]), Integer.valueOf(bArr[i4])).intValue();
            }
            bArr2[i2] = (byte) iIntValue;
        }
        return bArr2;
    }
}
