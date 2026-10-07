package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oh9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai9 b;

    public /* synthetic */ oh9(ai9 ai9Var, int i) {
        this.a = i;
        this.b = ai9Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ai9 ai9Var = this.b;
        switch (i) {
            case 0:
                return new vh9(e9i.R(ai9Var.B(), new c9(2, null, 13)), 0);
            case 1:
                List list = (List) ai9Var.h.take();
                mjg mjgVar = ai9Var.i;
                List listT1 = ww3.T1(list);
                mjgVar.getClass();
                mjgVar.j(null, listT1);
                return sbiVar;
            default:
                List list2 = (List) ai9Var.f.take();
                mjg mjgVar2 = ai9Var.g;
                List listT2 = ww3.T1(list2);
                mjgVar2.getClass();
                mjgVar2.j(null, listT2);
                return sbiVar;
        }
    }
}
