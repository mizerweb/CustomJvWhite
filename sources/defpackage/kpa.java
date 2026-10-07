package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class kpa extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ my8 f;
    public final /* synthetic */ ifh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpa(my8 my8Var, ifh ifhVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = my8Var;
        this.g = ifhVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ifh ifhVar = this.g;
        my8 my8Var = this.f;
        switch (i) {
            case 0:
                return new kpa(my8Var, ifhVar, lq4Var, 0);
            case 1:
                return new kpa(my8Var, ifhVar, lq4Var, 1);
            case 2:
                return new kpa(my8Var, ifhVar, lq4Var, 2);
            default:
                return new kpa(my8Var, ifhVar, lq4Var, 3);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((kpa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((kpa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((kpa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((kpa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ifh ifhVar = this.g;
        my8 my8Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                my8Var.b.c((Layout) ifhVar.getValue());
                break;
            case 1:
                ch3.d0(obj);
                my8Var.a.c((Layout) ifhVar.getValue());
                break;
            case 2:
                ch3.d0(obj);
                my8Var.b.c((Layout) ifhVar.getValue());
                break;
            default:
                ch3.d0(obj);
                my8Var.a.c((Layout) ifhVar.getValue());
                break;
        }
        return sbiVar;
    }
}
