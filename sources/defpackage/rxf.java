package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes3.dex */
public final class rxf {
    public final ny8 a;
    public final ny8 b;

    public rxf(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(String str, Long l, Long l2, nq4 nq4Var) {
        qxf qxfVar;
        rt2 rt2Var;
        ShareData shareData;
        if (nq4Var instanceof qxf) {
            qxfVar = (qxf) nq4Var;
            int i = qxfVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qxfVar.g = i - Integer.MIN_VALUE;
            } else {
                qxfVar = new qxf(this, nq4Var);
            }
        } else {
            qxfVar = new qxf(this, nq4Var);
        }
        qxf qxfVar2 = qxfVar;
        Object objP = qxfVar2.e;
        int i2 = qxfVar2.g;
        if (i2 == 0) {
            ch3.d0(objP);
            ShareData shareData2 = new ShareData(0, null, null, str, null, null, null, null, 246, null);
            if (l == null || l2 == null || (rt2Var = (rt2) ((xn3) this.a.getValue()).l(l.longValue()).a.getValue()) == null) {
                return shareData2;
            }
            long j = rt2Var.a;
            sua suaVar = (sua) this.b.getValue();
            long jLongValue = l2.longValue();
            qxfVar2.d = shareData2;
            qxfVar2.g = 1;
            objP = suaVar.p(j, jLongValue, qxfVar2);
            hu4 hu4Var = hu4.a;
            if (objP == hu4Var) {
                return hu4Var;
            }
            shareData = shareData2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            shareData = qxfVar2.d;
            ch3.d0(objP);
        }
        sfa sfaVar = (sfa) objP;
        if (sfaVar == null) {
            return shareData;
        }
        shareData.type = 6;
        shareData.ids = c0a.s(sfaVar.a);
        return shareData;
    }
}
