package defpackage;

import android.content.Context;
import one.me.location.map.show.ShowLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class q2g extends mdh implements tf7 {
    public /* synthetic */ wf4 e;
    public /* synthetic */ kbc f;
    public final /* synthetic */ rcc g;
    public final /* synthetic */ d4c h;
    public final /* synthetic */ t6g i;
    public final /* synthetic */ ShowLocationScreen j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2g(rcc rccVar, d4c d4cVar, t6g t6gVar, ShowLocationScreen showLocationScreen, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = rccVar;
        this.h = d4cVar;
        this.i = t6gVar;
        this.j = showLocationScreen;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        t6g t6gVar = this.i;
        ShowLocationScreen showLocationScreen = this.j;
        q2g q2gVar = new q2g(this.g, this.h, t6gVar, showLocationScreen, (lq4) obj3);
        q2gVar.e = (wf4) obj;
        q2gVar.f = (kbc) obj2;
        sbi sbiVar = sbi.a;
        q2gVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        wf4 wf4Var = this.e;
        kbc kbcVar = this.f;
        ch3.d0(obj);
        a8g a8gVar = pq3.j;
        this.g.setBackgroundColor(a8gVar.h(wf4Var).k().b);
        this.h.f(a8gVar.h(wf4Var));
        Context context = wf4Var.getContext();
        zv8[] zv8VarArr = ShowLocationScreen.v;
        ShowLocationScreen showLocationScreen = this.j;
        xm9.b(this.i, context, ((g5d) ((gjf) showLocationScreen.u.getValue())).c());
        po7 po7Var = showLocationScreen.r;
        if (po7Var != null) {
            showLocationScreen.q1(a8gVar.h(wf4Var), po7Var);
        }
        a8gVar.e(wf4Var.getContext()).getClass();
        pq3.f(wf4Var, kbcVar);
        return sbi.a;
    }
}
