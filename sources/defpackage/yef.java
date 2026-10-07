package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yef extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hff f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yef(hff hffVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = hffVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hff hffVar = this.f;
        switch (i) {
            case 0:
                return new yef(hffVar, lq4Var, 0);
            default:
                return new yef(hffVar, lq4Var, 1);
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
                ((yef) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((yef) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.e;
        sbi sbiVar = sbi.a;
        hff hffVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = hff.C;
                ArrayList arrayListA = srh.a(hffVar.F());
                mjg mjgVar = hffVar.v;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, arrayListA));
                break;
            default:
                ch3.d0(obj);
                hffVar.e.B(srh.a(hffVar.F()));
                break;
        }
        return sbiVar;
    }
}
