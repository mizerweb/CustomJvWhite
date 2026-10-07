package defpackage;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class gwd implements TypeEvaluator {
    public qoc[] a = null;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        qoc[] qocVarArr = (qoc[]) obj;
        qoc[] qocVarArr2 = (qoc[]) obj2;
        if (!qyj.d(qocVarArr, qocVarArr2)) {
            ore.p("Can't interpolate between two incompatible pathData");
            return null;
        }
        if (!qyj.d(this.a, qocVarArr)) {
            this.a = qocVarArr != null ? qyj.v(qocVarArr) : null;
        }
        qoc[] qocVarArr3 = this.a;
        if (qocVarArr3 == null) {
            ore.p("Required value was null.");
            return null;
        }
        if (qocVarArr == null) {
            ore.p("Required value was null.");
            return null;
        }
        int length = qocVarArr.length;
        for (int i = 0; i < length; i++) {
            if (qocVarArr2 != null) {
                qoc qocVar = qocVarArr3[i];
                qoc qocVar2 = qocVarArr[i];
                qoc qocVar3 = qocVarArr2[i];
                qocVar.getClass();
                qocVar.a = qocVar2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = qocVar2.b;
                    if (i2 < fArr.length) {
                        qocVar.b[i2] = (qocVar3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
        }
        return qocVarArr3;
    }
}
