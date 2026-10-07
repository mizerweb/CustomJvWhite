package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xx4 implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ xx4(int i, Serializable serializable, Serializable serializable2, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = serializable2;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Serializable serializable = this.d;
        Serializable serializable2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                tfe tfeVar = (tfe) serializable2;
                tfe tfeVar2 = (tfe) serializable;
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                float[] fArr = ((ay4) obj3).H;
                float f = fArr[num.intValue()] - tfeVar.a;
                return Integer.valueOf(Float.compare((float) Math.atan2(fArr[num.intValue() + 1] - tfeVar2.a, f), (float) Math.atan2(fArr[num2.intValue() + 1] - tfeVar2.a, fArr[num2.intValue()] - tfeVar.a)));
            default:
                vt4 vt4Var = (vt4) obj3;
                ohi ohiVar = (ohi) serializable2;
                String str = (String) serializable;
                vo8 vo8Var = (vo8) obj2;
                lq4 lq4Var = null;
                if (vo8Var != null) {
                    vo8Var.b(null);
                }
                sgg sggVarH0 = yab.h0(ehi.a, vt4Var, 2, new fpf(ohiVar, lq4Var, 14));
                sggVarH0.Y(new bad(str, 23, sggVarH0));
                sggVarH0.start();
                return sggVarH0;
        }
    }
}
