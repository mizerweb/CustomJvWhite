package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class h6b extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6b(lq4 lq4Var, WebAppRootScreen webAppRootScreen, q6f q6fVar, FrameLayout frameLayout, r1c r1cVar, r6c r6cVar) {
        super(2, lq4Var);
        this.g = webAppRootScreen;
        this.h = q6fVar;
        this.i = frameLayout;
        this.j = r1cVar;
        this.k = r6cVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                h6b h6bVar = new h6b((rcc) obj6, (rl1) obj5, (xk1) obj4, (p5b) obj3, (s81) obj2, lq4Var);
                h6bVar.f = obj;
                return h6bVar;
            default:
                h6b h6bVar2 = new h6b(lq4Var, (WebAppRootScreen) obj6, (q6f) obj5, (FrameLayout) obj4, (r1c) obj3, (r6c) obj2);
                h6bVar2.f = obj;
                return h6bVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((h6b) create((o5b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((h6b) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                o5b o5bVar = (o5b) this.f;
                ch3.d0(obj);
                boolean z = o5bVar.a;
                rcc rccVar = (rcc) this.g;
                if (z) {
                    String str = (String) ((rl1) this.h).invoke(new Integer(o5bVar.b.size()));
                    List list = (List) ((xk1) this.i).invoke(o5bVar);
                    p5b p5bVar = (p5b) this.j;
                    rccVar.c(str, list, new g6b(0, p5bVar, p5b.class, "exitMultiselect", "exitMultiselect(Z)V", 0, 0), new iaa((s81) this.k, 15, p5bVar));
                } else if (rccVar.b()) {
                    rccVar.a();
                }
                return sbiVar;
            default:
                Object obj2 = this.f;
                ch3.d0(obj);
                ztj ztjVar = (ztj) obj2;
                String str2 = ((WebAppRootScreen) this.g).p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "collect view state: " + ztjVar, null);
                    }
                }
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.g;
                q6f q6fVar = (q6f) this.h;
                FrameLayout frameLayout = (FrameLayout) this.i;
                r1c r1cVar = (r1c) this.j;
                r6c r6cVar = (r6c) this.k;
                rcc rccVarI1 = webAppRootScreen.I1();
                ks6 ks6Var = webAppRootScreen.u;
                rccVarI1.setTitle(ztjVar.a);
                WebAppRootScreen.N1(webAppRootScreen.I1(), ztjVar.b);
                koj kojVar = ztjVar.c;
                if (kojVar.equals(loj.a)) {
                    ks6Var.b();
                    q6fVar.setVisibility(8);
                    if (frameLayout.getChildCount() <= 1 || frameLayout.getChildAt(1) != r1cVar) {
                        if (frameLayout.getChildCount() > 1) {
                            frameLayout.removeViewAt(1);
                        }
                        frameLayout.addView(r1cVar, 1);
                    }
                    webAppRootScreen.O1(false);
                } else if (kojVar.equals(moj.a)) {
                    q6fVar.setVisibility(8);
                    if (frameLayout.getChildCount() <= 1 || frameLayout.getChildAt(1) != r6cVar) {
                        if (frameLayout.getChildCount() > 1) {
                            frameLayout.removeViewAt(1);
                        }
                        frameLayout.addView(r6cVar, 1);
                    }
                    webAppRootScreen.O1(false);
                } else {
                    if (!(kojVar instanceof noj)) {
                        ore.o();
                        return null;
                    }
                    ks6Var.b();
                    q6fVar.setVisibility(0);
                    if (frameLayout.getChildCount() > 1) {
                        frameLayout.removeViewAt(1);
                    }
                    webAppRootScreen.O1(((noj) kojVar).a);
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6b(rcc rccVar, rl1 rl1Var, xk1 xk1Var, p5b p5bVar, s81 s81Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = rccVar;
        this.h = rl1Var;
        this.i = xk1Var;
        this.j = p5bVar;
        this.k = s81Var;
    }
}
