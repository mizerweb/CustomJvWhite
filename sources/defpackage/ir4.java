package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ir4 extends hve {
    public br4 j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;

    public ir4() {
        this.e = 2;
    }

    @Override // defpackage.hve
    public final void J(lve lveVar) {
        if (this.m) {
            lveVar.a.setDetachFrozen(true);
        }
        super.J(lveVar);
    }

    @Override // defpackage.hve
    public final void L(int i, String str) {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().L(i, str);
    }

    @Override // defpackage.hve
    public final void O(String str, String[] strArr, int i) {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().O(str, strArr, i);
    }

    @Override // defpackage.hve
    public final void P(Bundle bundle) {
        super.P(bundle);
        this.k = bundle.getInt("ControllerHostedRouter.hostId");
        this.n = bundle.getBoolean("ControllerHostedRouter.boundToContainer");
        this.l = bundle.getString("ControllerHostedRouter.tag");
    }

    @Override // defpackage.hve
    public final void Q(Bundle bundle) {
        super.Q(bundle);
        bundle.putInt("ControllerHostedRouter.hostId", this.k);
        bundle.putBoolean("ControllerHostedRouter.boundToContainer", this.n);
        bundle.putString("ControllerHostedRouter.tag", this.l);
    }

    @Override // defpackage.hve
    public final void R(List list, gr4 gr4Var) {
        if (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((lve) it.next()).a.setDetachFrozen(true);
            }
        }
        super.R(list, gr4Var);
    }

    @Override // defpackage.hve
    public final void U(br4 br4Var) {
        br4Var.setParentController(this.j);
        br4Var.setRouter(this);
        br4Var.onContextAvailable();
    }

    @Override // defpackage.hve
    public final void V(Intent intent) {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().V(intent);
    }

    @Override // defpackage.hve
    public final void W(String str, Intent intent, int i) {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().W(str, intent, i);
    }

    @Override // defpackage.hve
    public final void X(String str, Intent intent, int i, Bundle bundle) {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().X(str, intent, i, bundle);
    }

    @Override // defpackage.hve
    public final void Y(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().Y(str, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // defpackage.hve
    public final void a0(String str) {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().a0(str);
    }

    public final void b0() {
        ViewParent viewParent = this.i;
        if (viewParent != null && (viewParent instanceof fr4)) {
            M((fr4) viewParent);
        }
        for (br4 br4Var : new ArrayList(this.d)) {
            if (br4Var.getView() != null) {
                br4Var.detach(br4Var.getView(), true, false);
            }
        }
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                break;
            }
            lve lveVar = (lve) y1Var.next();
            if (lveVar.a.getView() != null) {
                br4 br4Var2 = lveVar.a;
                br4Var2.detach(br4Var2.getView(), true, false);
            }
        }
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.i = null;
    }

    @Override // defpackage.hve
    public final void c(boolean z) {
        c0(false);
        super.c(z);
    }

    public final void c0(boolean z) {
        this.m = z;
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            } else {
                ((lve) y1Var.next()).a.setDetachFrozen(z);
            }
        }
    }

    @Override // defpackage.hve
    public final Activity d() {
        br4 br4Var = this.j;
        if (br4Var != null) {
            return br4Var.getActivity();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(br4 br4Var, ViewGroup viewGroup) {
        if (this.j == br4Var && this.i == viewGroup) {
            return;
        }
        b0();
        if (viewGroup instanceof fr4) {
            a((fr4) viewGroup);
        }
        this.j = br4Var;
        this.i = viewGroup;
        S(br4Var.onBackPressedDispatcherEnabled);
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                this.i.post(new zn(12, this));
                return;
            }
            ((lve) y1Var.next()).a.setParentController(br4Var);
        }
    }

    @Override // defpackage.hve
    public final hve i() {
        br4 br4Var = this.j;
        return (br4Var == null || br4Var.getRouter() == null) ? this : this.j.getRouter().i();
    }

    @Override // defpackage.hve
    public final List j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.j.getChildRouters());
        arrayList.addAll(this.j.getRouter().j());
        return arrayList;
    }

    @Override // defpackage.hve
    public final x3f k() {
        if (i() != this) {
            return i().k();
        }
        br4 br4Var = this.j;
        ore.k("Unable to retrieve TransactionIndexer from ".concat(br4Var != null ? String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", br4Var.getClass().getSimpleName(), Boolean.valueOf(this.j.isAttached()), Boolean.valueOf(this.j.isBeingDestroyed), this.j.getParentController()) : "null host controller"));
        return null;
    }

    @Override // defpackage.hve
    public final boolean n() {
        return (this.j == null || this.i == null) ? false : true;
    }

    @Override // defpackage.hve
    public final void p() {
        br4 br4Var = this.j;
        if (br4Var == null || br4Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().p();
    }

    @Override // defpackage.hve
    public final void q(Activity activity, boolean z) {
        super.q(activity, z);
        b0();
    }

    @Override // defpackage.hve
    public final void z(lve lveVar, lve lveVar2, boolean z) {
        super.z(lveVar, lveVar2, z);
        if (lveVar == null || this.j.isAttached()) {
            return;
        }
        if (lveVar.b() != null && !lveVar.b().d()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            } else {
                ((lve) y1Var.next()).a.setNeedsAttach(false);
            }
        }
    }
}
