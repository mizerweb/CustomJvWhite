package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ph9 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ List f;
    public /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph9(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        List list = (List) obj;
        List list2 = (List) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                ph9 ph9Var = new ph9(3, lq4Var, 0);
                ph9Var.f = list;
                ph9Var.g = list2;
                return ph9Var.invokeSuspend(sbiVar);
            case 1:
                ph9 ph9Var2 = new ph9(3, lq4Var, 1);
                ph9Var2.f = list;
                ph9Var2.g = list2;
                return ph9Var2.invokeSuspend(sbiVar);
            case 2:
                ph9 ph9Var3 = new ph9(3, lq4Var, 2);
                ph9Var3.f = list;
                ph9Var3.g = list2;
                return ph9Var3.invokeSuspend(sbiVar);
            default:
                ph9 ph9Var4 = new ph9(3, lq4Var, 3);
                ph9Var4.f = list;
                ph9Var4.g = list2;
                return ph9Var4.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                List list = this.f;
                List list2 = this.g;
                ch3.d0(obj);
                list.addAll(list2);
                return list;
            case 1:
                List list3 = this.f;
                List list4 = this.g;
                ch3.d0(obj);
                list3.addAll(list4);
                return list3;
            case 2:
                List list5 = this.f;
                List list6 = this.g;
                ch3.d0(obj);
                List list7 = list5;
                return list7.isEmpty() ? list6 : list7;
            default:
                List list8 = this.f;
                List list9 = this.g;
                ch3.d0(obj);
                return ww3.G1(list9, list8);
        }
    }
}
