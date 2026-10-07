package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class wqa extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jsa f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqa(jsa jsaVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = jsaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        jsa jsaVar = this.f;
        switch (i) {
            case 0:
                return new wqa(jsaVar, lq4Var, 0);
            case 1:
                return new wqa(jsaVar, lq4Var, 1);
            case 2:
                return new wqa(jsaVar, lq4Var, 2);
            default:
                return new wqa(jsaVar, lq4Var, 3);
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
                ((wqa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wqa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((wqa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wqa) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        jsa jsaVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                o50 o50Var = jsaVar.t;
                o50Var.e.B(o50Var, o50.g[0], e9i.j0(new fz6(new jz(o50Var.a.c, 13), new sfd(o50Var, (lq4) null, 13), 3), o50Var.d));
                break;
            case 1:
                ch3.d0(obj);
                ia8 ia8Var = (ia8) jsaVar.R1.getValue();
                if (ia8Var != null) {
                    ia8Var.f(Collections.singleton(new ha8(fa8.ADD_2_REACTIONS, 1)), y3f.CHAT);
                }
                break;
            case 2:
                ch3.d0(obj);
                jsa.O(jsaVar);
                break;
            default:
                ch3.d0(obj);
                jsa.O(jsaVar);
                break;
        }
        return sbiVar;
    }
}
