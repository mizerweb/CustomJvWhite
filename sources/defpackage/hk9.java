package defpackage;

import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

/* JADX INFO: loaded from: classes.dex */
public final class hk9 implements fr4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(br4 br4Var, br4 br4Var2, boolean z) {
    }

    private final void b(br4 br4Var, br4 br4Var2, boolean z) {
    }

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                if (!z) {
                    gm0.n("RootController", "pop to " + (br4Var != null ? br4Var.getClass().getName() : null));
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) throws IllegalAccessException, InvocationTargetException {
        lve lveVar;
        switch (this.a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.b;
                int i = MainActivity.o1;
                mainActivity.B(null);
                break;
            case 1:
                MainActivity mainActivity2 = (MainActivity) this.b;
                ym1 ym1Var = mainActivity2.C;
                boolean z2 = false;
                if (ym1Var != null && ym1Var.f()) {
                    z2 = true;
                }
                if (br4Var2 == 0) {
                    mainActivity2.v().a(mainActivity2.getWindow(), br4Var2, br4Var, z2);
                } else {
                    if (br4Var instanceof z4f) {
                        ((z4f) br4Var).d(mainActivity2.getWindow());
                    } else {
                        z4f z4fVar = br4Var2 instanceof z4f ? (z4f) br4Var2 : null;
                        if (z4fVar != null) {
                            z4fVar.j(mainActivity2.getWindow());
                        }
                        cc1 cc1VarV = mainActivity2.v();
                        Window window = mainActivity2.getWindow();
                        s6 s6Var = cc1VarV.a;
                        if (z2) {
                            RootController rootController = (RootController) s6Var.get();
                            br4 br4VarX1 = (rootController == null || (lveVar = (lve) ww3.D1(rootController.y1().e())) == null) ? null : lveVar.a;
                            if (br4VarX1 == null) {
                                RootController rootController2 = (RootController) s6Var.get();
                                br4VarX1 = rootController2 != null ? rootController2.x1() : null;
                            }
                            z4f z4fVar2 = br4VarX1 instanceof z4f ? (z4f) br4VarX1 : null;
                            if (z4fVar2 != null) {
                                z4fVar2.d(window);
                            }
                        }
                    }
                    if (br4Var == 0) {
                        mainActivity2.v().a(mainActivity2.getWindow(), br4Var2, br4Var, z2);
                    } else {
                        mainActivity2.v().a(mainActivity2.getWindow(), br4Var2, br4Var, z2);
                    }
                }
                mainActivity2.X.m(br4Var, mainActivity2.getWindow(), br4Var2, mainActivity2.x());
                break;
            default:
                je9 je9Var = je9.d;
                if (br4Var2 != 0 && ((RootController) this.b).u1().a.a.size() > 0 && (br4Var instanceof Widget) && !((Widget) br4Var).getF()) {
                    br4 br4VarC = rx8.C(((RootController) this.b).u1());
                    if (br4VarC != null && (br4VarC instanceof BaseBottomSheetWidget) && ((BaseBottomSheetWidget) br4VarC).getW()) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "RootController", "fullScreenControllerChangeListener: untouch untouchable ", null);
                        }
                    } else {
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, "RootController", "fullScreenControllerChangeListener: dialogsRouter.popCurrentController", null);
                        }
                        ((RootController) this.b).u1().D();
                    }
                    break;
                }
                break;
        }
    }
}
