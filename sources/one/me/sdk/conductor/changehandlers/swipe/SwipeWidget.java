package one.me.sdk.conductor.changehandlers.swipe;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.a4c;
import defpackage.br4;
import defpackage.fz7;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.hr4;
import defpackage.hve;
import defpackage.je9;
import defpackage.kr4;
import defpackage.lve;
import defpackage.occ;
import defpackage.oeh;
import defpackage.ore;
import defpackage.teh;
import defpackage.un0;
import defpackage.veh;
import defpackage.xq4;
import defpackage.xre;
import defpackage.y1;
import defpackage.zv8;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "conductor"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SwipeWidget extends Widget {
    public final String a;
    public boolean b;
    public final int c;

    public SwipeWidget(Bundle bundle) {
        super(bundle);
        this.a = getClass().getName().concat("/SwipeWidget");
        this.c = 2;
    }

    public boolean A1() {
        return true;
    }

    public Long B1() {
        return null;
    }

    public Integer C1() {
        return null;
    }

    @Override // defpackage.br4
    public boolean handleBack() {
        return this.b || super.handleBack();
    }

    public boolean o1() {
        return true;
    }

    @Override // defpackage.br4
    public void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeEnded(gr4Var, hr4Var);
        if (hr4Var.b) {
            z1();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        if (hr4Var.b) {
            return;
        }
        KeyEvent.Callback view = getView();
        teh tehVar = view instanceof teh ? (teh) view : null;
        if (tehVar != null) {
            tehVar.setOnTouch(null);
            tehVar.setOnRequestInterceptTouchEvent(null);
        }
    }

    public final void p1() throws IllegalAccessException, InvocationTargetException {
        lve lveVarA;
        br4 br4VarR1;
        View view;
        je9 je9Var = je9.d;
        if (getRouter().a.a.size() < 2 || (lveVarA = getRouter().a.a()) == null || (view = (br4VarR1 = r1()).getView()) == null) {
            return;
        }
        Iterator<T> it = br4VarR1.getChildRouters().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((hve) it.next()).a.iterator();
            while (true) {
                y1 y1Var = (y1) it2;
                if (y1Var.hasNext()) {
                    br4 br4Var = ((lve) y1Var.next()).a;
                    zv8[] zv8VarArr = kr4.a;
                    br4Var.setNeedsAttach(true);
                    y1(br4Var);
                }
            }
        }
        gr4 gr4VarB = lveVarA.b();
        if (gr4VarB != null && !gr4VarB.d()) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "clearUnderlyingViews: current controller was pushed with 'removesFromViewOnPush'=false, skip clearing", null);
                return;
            }
            return;
        }
        if (view.getParent() != null) {
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "clearUnderlyingViews: detaching underlying view", null);
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (br4VarR1.getRetainViewMode() != xq4.b) {
            String str3 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "clearUnderlyingViews: destroying underlying view", null);
            }
            kr4.b(br4VarR1, getContext());
        }
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public int getC() {
        return this.c;
    }

    public final br4 r1() {
        lve lveVarA;
        hve router = getRouter();
        int size = getRouter().a.a.size() - 2;
        un0 un0Var = router.a;
        int size2 = un0Var.a.size() - 1;
        if (size > size2) {
            lveVarA = null;
            break;
        }
        if (size != size2) {
            Iterator itC = un0Var.c();
            int i = 0;
            while (true) {
                if (!itC.hasNext()) {
                    lveVarA = null;
                    break;
                }
                lve lveVar = (lve) itC.next();
                if (i == size) {
                    lveVarA = lveVar;
                    break;
                }
                i++;
            }
        } else {
            lveVarA = un0Var.a();
        }
        br4 br4Var = lveVarA != null ? lveVarA.a : null;
        if (br4Var != null) {
            return br4Var;
        }
        ore.p("No underlying controller! Swiping won't work properly");
        return null;
    }

    public boolean s1() {
        return true;
    }

    public void t1(float f) {
    }

    public void u1() {
    }

    public void v1() {
    }

    public void w1(float f) {
    }

    public void x1() {
    }

    public final void y1(br4 br4Var) {
        Iterator<T> it = br4Var.getChildRouters().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((hve) it.next()).a.iterator();
            while (true) {
                y1 y1Var = (y1) it2;
                if (y1Var.hasNext()) {
                    br4 br4Var2 = ((lve) y1Var.next()).a;
                    zv8[] zv8VarArr = kr4.a;
                    br4Var2.setNeedsAttach(true);
                    y1(br4Var2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1() {
        je9 je9Var = je9.d;
        if (!s1()) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onChangeEnded: swipe is disabled", null);
                return;
            }
            return;
        }
        View view = getView();
        if (view == 0) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int size = getRouter().a.a.size();
        String str2 = this.a;
        if (size < 2) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "For swipe feature backstack must contains more than 1 widget", null);
                return;
            }
            return;
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str2, "onChangeEnded: setup swipe callbacks on new view", null);
        }
        if (getRouter().a.a.size() <= 1) {
            ore.k("For swipe feature backstack must contains more than 1 widget");
            return;
        }
        xre xreVar = new xre(this, 23, viewGroup);
        boolean z = view instanceof teh;
        if (!z) {
            ore.k("'To' view must realize SwipeTouchHandler for work");
            return;
        }
        oeh oehVar = new oeh(C1(), new veh(this, 0), new veh(this, 1), new veh(this, 2), view, viewGroup, xreVar, getC());
        oehVar.s = this;
        oehVar.t = B1();
        teh tehVar = z ? (teh) view : null;
        if (tehVar != null) {
            int i = 0;
            tehVar.setOnTouch(new fz7(1, oehVar, oeh.class, "onTouchEvent", "onTouchEvent(Landroid/view/MotionEvent;)Z", i, 25));
            tehVar.setOnRequestInterceptTouchEvent(new occ(0, oehVar, oeh.class, "resetDraggingState", "resetDraggingState()V", i, 12));
        }
    }
}
