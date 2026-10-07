package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.me.chats.tab.ChatsTabWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class vq4 extends dtb {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq4(Widget widget) {
        super(true);
        this.d = 0;
        this.e = widget;
    }

    @Override // defpackage.dtb
    public void a() {
        switch (this.d) {
            case 3:
                c cVar = (c) this.e;
                if (c.K(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                tl0 tl0Var = cVar.h;
                if (tl0Var != null) {
                    tl0Var.r = false;
                    k36 k36Var = new k36(13, cVar);
                    if (tl0Var.p == null) {
                        tl0Var.p = new ArrayList();
                    }
                    tl0Var.p.add(k36Var);
                    cVar.h.d(false);
                    cVar.A(true);
                    Iterator it = cVar.e().iterator();
                    while (it.hasNext()) {
                        ((vd5) it.next()).f();
                    }
                }
                cVar.h = null;
                break;
        }
    }

    @Override // defpackage.dtb
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Widget widget = (Widget) obj;
                if (widget.router.i().m()) {
                    return;
                }
                f(false);
                widget.getOnBackPressedDispatcher().d();
                if (widget.isBeingDestroyed) {
                    return;
                }
                f(true);
                return;
            case 1:
                ((ym1) obj).z(false);
                return;
            case 2:
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                a8j.x(((ChatsTabWidget) obj).s1().e, si3.a);
                return;
            default:
                c cVar = (c) obj;
                if (c.K(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                vq4 vq4Var = cVar.i;
                ArrayList arrayList = cVar.m;
                cVar.A(true);
                if (cVar.h == null) {
                    if (vq4Var.a) {
                        if (c.K(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        cVar.S();
                        return;
                    } else {
                        if (c.K(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        cVar.g.d();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(c.F(cVar.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        qt4.A(it.next());
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = cVar.h.a.iterator();
                while (it3.hasNext()) {
                    a aVar = ((nb7) it3.next()).b;
                    if (aVar != null) {
                        aVar.m = false;
                    }
                }
                Iterator it4 = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                while (it4.hasNext()) {
                    ((vd5) it4.next()).c();
                }
                Iterator it5 = cVar.h.a.iterator();
                while (it5.hasNext()) {
                    a aVar2 = ((nb7) it5.next()).b;
                    if (aVar2 != null && aVar2.H == null) {
                        cVar.g(aVar2).j();
                    }
                }
                cVar.h = null;
                cVar.h0();
                if (c.K(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + vq4Var.a + " for  FragmentManager " + cVar);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.dtb
    public void c(sl0 sl0Var) {
        switch (this.d) {
            case 3:
                c cVar = (c) this.e;
                if (c.K(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                if (cVar.h != null) {
                    Iterator it = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        ((vd5) it.next()).k(sl0Var);
                    }
                    Iterator it2 = cVar.m.iterator();
                    if (it2.hasNext()) {
                        qt4.A(it2.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dtb
    public void d() {
        switch (this.d) {
            case 3:
                c cVar = (c) this.e;
                if (c.K(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                cVar.x();
                cVar.y(new gb7(cVar), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq4(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
