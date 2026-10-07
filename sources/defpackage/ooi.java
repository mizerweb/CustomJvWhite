package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ooi extends mdh implements tf7 {
    public /* synthetic */ List e;
    public /* synthetic */ int f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        ooi ooiVar = new ooi(3, (lq4) obj3);
        ooiVar.e = (List) obj;
        ooiVar.f = iIntValue;
        return ooiVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        List list = this.e;
        int i = this.f;
        ch3.d0(obj);
        return ww3.u1(i, list);
    }
}
