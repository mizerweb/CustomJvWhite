package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g26 extends mdh implements vf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g26(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g26 g26Var = new g26(4, (lq4) obj4, 0);
                g26Var.f = zBooleanValue;
                g26Var.g = (Long) obj2;
                g26Var.h = (myg) obj3;
                return g26Var.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                g26 g26Var2 = new g26(4, (lq4) obj4, 1);
                g26Var2.g = (List) obj;
                g26Var2.h = (List) obj2;
                g26Var2.f = zBooleanValue2;
                return g26Var2.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                boolean z = this.f;
                Long l = (Long) this.g;
                myg mygVar = (myg) this.h;
                ch3.d0(obj);
                return Boolean.valueOf((z && l == null && !(mygVar instanceof kyg)) ? false : true);
            default:
                List list = (List) this.g;
                List list2 = (List) this.h;
                boolean z2 = this.f;
                ch3.d0(obj);
                return new e5i(list, list2, Boolean.valueOf(z2));
        }
    }
}
