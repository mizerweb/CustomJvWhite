package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tc0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ vc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc0(vc0 vc0Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = vc0Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        vc0 vc0Var = this.f;
        switch (i) {
            case 0:
                return new tc0(vc0Var, lq4Var, 0);
            default:
                return new tc0(vc0Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((tc0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((tc0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                sgg sggVar = this.f.o;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                this.f.o = null;
                mjg mjgVar = this.f.h;
                oc0 oc0Var = oc0.a;
                mjgVar.getClass();
                mjgVar.j(null, oc0Var);
                this.f.b = null;
                vc0 vc0Var = this.f;
                vc0Var.k = null;
                vc0Var.d.clear();
                zv zvVar = this.f.j;
                if (zvVar != null) {
                    zvVar.clear();
                }
                break;
            default:
                ch3.d0(obj);
                sgg sggVar2 = this.f.o;
                if (sggVar2 != null) {
                    sggVar2.b(null);
                }
                this.f.o = null;
                vc0 vc0Var2 = this.f;
                Integer num = vc0Var2.n;
                if (num != null) {
                    int iIntValue = num.intValue();
                    byte[] bArr = vc0Var2.b;
                    if (bArr != null) {
                        byte[] bArrC = vc0Var2.c(iIntValue, bArr);
                        mjg mjgVar2 = vc0Var2.h;
                        ArrayList arrayList = new ArrayList(bArrC.length);
                        for (byte b : bArrC) {
                            arrayList.add(Float.valueOf(vc0Var2.b(b)));
                        }
                        pc0 pc0Var = new pc0(arrayList);
                        mjgVar2.getClass();
                        mjgVar2.j(null, pc0Var);
                    }
                }
                break;
        }
        return sbi.a;
    }
}
