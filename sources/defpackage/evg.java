package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class evg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ View g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evg(lq4 lq4Var, View view, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = view;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        View view = this.g;
        switch (i) {
            case 0:
                evg evgVar = new evg(lq4Var, view, 0);
                evgVar.f = obj;
                return evgVar;
            default:
                evg evgVar2 = new evg(lq4Var, view, 1);
                evgVar2.f = obj;
                return evgVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((evg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((evg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        View view = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                view.setKeepScreenOn(!((Boolean) obj2).booleanValue());
                return sbiVar;
            default:
                ch3.d0(obj);
                sph sphVar = (sph) obj2;
                if (sphVar instanceof qph) {
                    view.setBackground(new oph(((qph) sphVar).a));
                    return sbiVar;
                }
                if (sphVar instanceof rph) {
                    view.setBackground(((rph) sphVar).a);
                    return sbiVar;
                }
                if (sphVar == null) {
                    return sbiVar;
                }
                ore.o();
                return null;
        }
    }
}
