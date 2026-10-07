package defpackage;

import android.app.Activity;
import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rni implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserStoriesScreen b;

    public /* synthetic */ rni(UserStoriesScreen userStoriesScreen, int i) {
        this.a = i;
        this.b = userStoriesScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        UserStoriesScreen userStoriesScreen = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((vqg) ((e5d) userStoriesScreen.e.getAccessor().d(26).getValue()).r().i()).c);
            case 1:
                return vd7.o(userStoriesScreen.f, new ifh(new rni(userStoriesScreen, 2)), userStoriesScreen);
            case 2:
                zv8[] zv8VarArr = UserStoriesScreen.x1;
                return userStoriesScreen.getRouter();
            case 3:
                zv8[] zv8VarArr2 = UserStoriesScreen.x1;
                Activity activity = userStoriesScreen.getActivity();
                if (activity != null) {
                    ((gu) userStoriesScreen.i.getValue()).a(activity);
                }
                return sbi.a;
            case 4:
                zv8[] zv8VarArr3 = UserStoriesScreen.x1;
                e3j e3jVar = ((y3d) userStoriesScreen.j.getValue()).get();
                e3jVar.b(((Boolean) userStoriesScreen.C1().h.a.getValue()).booleanValue() ? 0.0f : 1.0f);
                e3jVar.q0(userStoriesScreen.q);
                return e3jVar;
            case 5:
                hpi hpiVar = (hpi) userStoriesScreen.e.getAccessor().c(954);
                azg azgVar = userStoriesScreen.B1().d;
                rni rniVar = new rni(userStoriesScreen, 0);
                Long l = userStoriesScreen.B1().c;
                ha9 ha9VarB = userStoriesScreen.c.b();
                hpiVar.getClass();
                return new gpi(azgVar, rniVar, l, ha9VarB, hpiVar.a, hpiVar.b, hpiVar.c, hpiVar.d, hpiVar.e, hpiVar.f, hpiVar.g, hpiVar.h, hpiVar.i, hpiVar.j, hpiVar.k, hpiVar.l, hpiVar.m, hpiVar.n, hpiVar.o, hpiVar.p, hpiVar.q, hpiVar.r, hpiVar.s, hpiVar.t, hpiVar.u, hpiVar.v, hpiVar.w, hpiVar.x);
            case 6:
                wvg wvgVar = (wvg) userStoriesScreen.e.getAccessor().c(966);
                r8e r8eVar = userStoriesScreen.H1().G;
                azg azgVar2 = userStoriesScreen.B1().d;
                wvgVar.getClass();
                return new vvg(r8eVar, azgVar2, wvgVar.a, wvgVar.b, wvgVar.c, wvgVar.d);
            default:
                zv8[] zv8VarArr4 = UserStoriesScreen.x1;
                gpi gpiVarH1 = userStoriesScreen.H1();
                String str = gpiVarH1.p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "onToolbarTitleClick", null);
                    }
                }
                azg azgVar3 = gpiVarH1.c;
                if (!gpiVarH1.D() && (azgVar3 instanceof zyg)) {
                    a8j.x(gpiVarH1.s1, new vug(((zyg) azgVar3).a));
                }
                return sbi.a;
        }
    }
}
