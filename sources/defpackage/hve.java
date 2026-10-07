package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class hve {
    public final un0 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ViewGroup i;

    public hve() {
        un0 un0Var = new un0();
        this.a = un0Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.g = false;
        this.h = false;
        un0Var.b = new gve(this);
    }

    public static void b(hve hveVar, ArrayList arrayList) {
        hveVar.getClass();
        un0 un0Var = hveVar.a;
        ArrayList<br4> arrayList2 = new ArrayList(un0Var.a.size());
        Iterator itC = un0Var.c();
        while (itC.hasNext()) {
            arrayList2.add(((lve) itC.next()).a);
        }
        for (br4 br4Var : arrayList2) {
            if (br4Var.getView() != null) {
                arrayList.add(br4Var.getView());
            }
            Iterator<hve> it = br4Var.getChildRouters().iterator();
            while (it.hasNext()) {
                b(it.next(), arrayList);
            }
        }
    }

    public static ArrayList l(Iterator it, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        while (it.hasNext()) {
            lve lveVar = (lve) it.next();
            if (z2) {
                arrayList.add(lveVar);
            }
            z2 = (lveVar.b() == null || lveVar.b().d()) ? false : true;
            if (z && !z2) {
                break;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void A(lve lveVar, lve lveVar2, boolean z, gr4 gr4Var) {
        gr4 gr4Var2;
        boolean z2;
        dr4 dr4Var;
        ArrayList arrayList;
        br4 br4Var = lveVar != null ? lveVar.a : null;
        br4 br4Var2 = lveVar2 != null ? lveVar2.a : null;
        if (lveVar == null) {
            if (this.a.a.size() != 0 || this.e != 2) {
                if (z || br4Var2 == null || br4Var2.isAttached()) {
                }
                if (!z && br4Var != null && br4Var.isDestroyed()) {
                    qr7.q(br4Var.getClass().getSimpleName(), ")", "Trying to push a controller that has already been destroyed. (");
                    return;
                }
                dr4Var = new dr4(br4Var, br4Var2, z, this.i, gr4Var2, new ArrayList(this.b));
                arrayList = this.c;
                if (arrayList.size() > 0) {
                    if (br4Var != null) {
                        br4Var.setNeedsAttach(true);
                    }
                    arrayList.add(dr4Var);
                } else if (br4Var2 != null || (!(gr4Var2 == null || gr4Var2.d()) || this.g)) {
                    gr4.c(dr4Var);
                } else {
                    if (br4Var != null) {
                        br4Var.setNeedsAttach(true);
                    }
                    arrayList.add(dr4Var);
                    ViewGroup viewGroup = this.i;
                    if (viewGroup != null) {
                        viewGroup.post(new hed(6, this));
                    }
                }
                if (z2 || br4Var2 == null) {
                }
                if (br4Var2.getView() != null) {
                    br4Var2.detach(br4Var2.getView(), true, false);
                    return;
                } else {
                    br4Var2.destroy();
                    return;
                }
            }
            gr4Var = new jhb();
            gr4Var2 = gr4Var;
            z2 = true;
            if (!z) {
            }
            dr4Var = new dr4(br4Var, br4Var2, z, this.i, gr4Var2, new ArrayList(this.b));
            arrayList = this.c;
            if (arrayList.size() > 0) {
                if (br4Var != null) {
                    br4Var.setNeedsAttach(true);
                }
                arrayList.add(dr4Var);
            } else if (br4Var2 != null) {
                gr4.c(dr4Var);
            } else {
                gr4.c(dr4Var);
            }
            if (z2) {
            }
        }
        x3f x3fVarK = k();
        if (lveVar.f == -1) {
            int i = x3fVarK.a + 1;
            x3fVarK.a = i;
            lveVar.f = i;
        }
        U(br4Var);
        z2 = false;
        gr4Var2 = gr4Var;
        if (!z) {
        }
        dr4Var = new dr4(br4Var, br4Var2, z, this.i, gr4Var2, new ArrayList(this.b));
        arrayList = this.c;
        if (arrayList.size() > 0) {
            if (br4Var != null) {
                br4Var.setNeedsAttach(true);
            }
            arrayList.add(dr4Var);
        } else if (br4Var2 != null) {
            gr4.c(dr4Var);
        } else {
            gr4.c(dr4Var);
        }
        if (z2) {
        }
    }

    public final void B() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                gr4.c((dr4) arrayList.get(i));
                i++;
            }
        }
    }

    public final boolean C(br4 br4Var) {
        wk8.k();
        un0 un0Var = this.a;
        lve lveVarA = un0Var.a();
        ArrayDeque arrayDeque = un0Var.a;
        if (lveVarA == null || lveVarA.a != br4Var) {
            Iterator it = un0Var.iterator();
            lve lveVar = null;
            gr4 gr4VarB = lveVarA != null ? lveVarA.b() : null;
            boolean z = (gr4VarB == null || gr4VarB.d()) ? false : true;
            lve lveVar2 = null;
            while (true) {
                y1 y1Var = (y1) it;
                if (!y1Var.hasNext()) {
                    break;
                }
                lve lveVar3 = (lve) y1Var.next();
                br4 br4Var2 = lveVar3.a;
                if (br4Var2 == br4Var) {
                    Z(lveVar3);
                    arrayDeque.remove(lveVar3);
                    lveVar2 = lveVar3;
                } else if (lveVar2 != null) {
                    if (!z || br4Var2.isAttached()) {
                        break;
                        break;
                    }
                    lveVar = lveVar3;
                    break;
                }
            }
            if (lveVar2 != null) {
                z(lveVar, lveVar2, false);
            }
        } else {
            Z(un0Var.b());
            z(un0Var.a(), lveVarA, false);
        }
        if (this.e == 3) {
            return lveVarA != null;
        }
        return !arrayDeque.isEmpty();
    }

    public final boolean D() {
        wk8.k();
        lve lveVarA = this.a.a();
        if (lveVarA != null) {
            return C(lveVarA.a);
        }
        ore.k("Trying to pop the current controller when there are none on the backstack.");
        return false;
    }

    public final boolean E() {
        wk8.k();
        wk8.k();
        un0 un0Var = this.a;
        if (un0Var.a.size() <= 1) {
            return false;
        }
        G((lve) ww3.C1(un0Var.a));
        return true;
    }

    public final void F(String str) {
        lve lveVar;
        wk8.k();
        wk8.k();
        Iterator it = this.a.iterator();
        do {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            } else {
                lveVar = (lve) y1Var.next();
            }
        } while (!str.equals(lveVar.b));
        G(lveVar);
    }

    public final void G(lve lveVar) {
        un0 un0Var = this.a;
        if (un0Var.a.size() > 0) {
            lve lveVarA = un0Var.a();
            ArrayList arrayList = new ArrayList();
            Iterator itC = un0Var.c();
            while (itC.hasNext()) {
                lve lveVar2 = (lve) itC.next();
                arrayList.add(lveVar2);
                if (lveVar2 == lveVar) {
                    break;
                }
            }
            gr4 overriddenPopHandler = lveVarA.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = lveVarA.d;
            }
            R(arrayList, overriddenPopHandler);
        }
    }

    public final void H() {
        this.c.clear();
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            }
            br4 br4Var = ((lve) y1Var.next()).a;
            String instanceId = br4Var.getInstanceId();
            HashMap map = gr4.c;
            if (rx8.p(instanceId)) {
                br4Var.setNeedsAttach(true);
            }
            br4Var.prepareForHostDetach();
        }
    }

    public final void I(lve lveVar) {
        wk8.k();
        lve lveVarA = this.a.a();
        J(lveVar);
        z(lveVar, lveVarA, true);
    }

    public void J(lve lveVar) {
        br4 br4Var = lveVar.a;
        un0 un0Var = this.a;
        ArrayDeque arrayDeque = un0Var.a;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (cqk.d(((lve) it.next()).a, br4Var)) {
                    ore.k("Trying to push a controller that already exists on the backstack.");
                    return;
                }
            }
        }
        un0Var.a.push(lveVar);
        gve gveVar = un0Var.b;
        if (gveVar != null) {
            gveVar.d();
        }
    }

    public final void K() {
        wk8.k();
        un0 un0Var = this.a;
        ArrayList<lve> arrayList = new ArrayList(un0Var.a.size());
        Iterator itC = un0Var.c();
        while (itC.hasNext()) {
            arrayList.add((lve) itC.next());
        }
        for (lve lveVar : arrayList) {
            if (lveVar.a.getNeedsAttach()) {
                A(lveVar, null, true, new r7g(false));
            } else {
                U(lveVar.a);
            }
        }
    }

    public abstract void L(int i, String str);

    public final void M(fr4 fr4Var) {
        this.b.remove(fr4Var);
    }

    public final void N(lve lveVar) {
        wk8.k();
        un0 un0Var = this.a;
        lve lveVarA = un0Var.a();
        if (!un0Var.a.isEmpty()) {
            Z(un0Var.b());
        }
        gr4 gr4VarB = lveVar.b();
        if (lveVarA != null) {
            boolean z = lveVarA.b() == null || lveVarA.b().d();
            boolean z2 = gr4VarB == null || gr4VarB.d();
            if (!z && z2) {
                Iterator it = l(un0Var.iterator(), true).iterator();
                while (it.hasNext()) {
                    A(null, (lve) it.next(), true, gr4VarB);
                }
            }
        }
        J(lveVar);
        if (gr4VarB != null) {
            gr4VarB.a = true;
        }
        lveVar.c(gr4VarB);
        z(lveVar, lveVarA, true);
    }

    public abstract void O(String str, String[] strArr, int i);

    public void P(Bundle bundle) {
        Bundle bundle2 = (Bundle) bundle.getParcelable("Router.backstack");
        this.e = qt4.H(3)[bundle.getInt("Router.popRootControllerMode")];
        this.f = bundle.getBoolean("Router.onBackPressedDispatcherEnabled");
        un0 un0Var = this.a;
        un0Var.getClass();
        ArrayList<Bundle> parcelableArrayList = bundle2.getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            Collections.reverse(parcelableArrayList);
            for (Bundle bundle3 : parcelableArrayList) {
                ArrayDeque arrayDeque = un0Var.a;
                br4 br4VarNewInstance = br4.newInstance(bundle3.getBundle("RouterTransaction.controller.bundle"));
                HashMap map = gr4.c;
                gr4 gr4VarZ = rx8.z(bundle3.getBundle("RouterTransaction.pushControllerChangeHandler"));
                gr4 gr4VarZ2 = rx8.z(bundle3.getBundle("RouterTransaction.popControllerChangeHandler"));
                arrayDeque.push(new lve(br4VarNewInstance, bundle3.getString("RouterTransaction.tag"), gr4VarZ, gr4VarZ2, bundle3.getBoolean("RouterTransaction.attachedToRouter"), bundle3.getInt("RouterTransaction.transactionIndex")));
            }
        }
        gve gveVar = un0Var.b;
        if (gveVar != null) {
            gveVar.d();
        }
        Iterator itC = un0Var.c();
        while (itC.hasNext()) {
            U(((lve) itC.next()).a);
        }
    }

    public void Q(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        un0 un0Var = this.a;
        un0Var.getClass();
        ArrayDeque arrayDeque = un0Var.a;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(arrayDeque.size());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((lve) it.next()).d());
        }
        bundle2.putParcelableArrayList("Backstack.entries", arrayList);
        bundle.putInt("Router.popRootControllerMode", qt4.D(this.e));
        bundle.putBoolean("Router.onBackPressedDispatcherEnabled", this.f);
        bundle.putParcelable("Router.backstack", bundle2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0214  */
    /* JADX WARN: Code duplicated, block: B:105:0x0221  */
    /* JADX WARN: Code duplicated, block: B:107:0x022d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01be  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fe  */
    public void R(List list, gr4 gr4Var) {
        lve lveVar;
        lve lveVar2;
        int size;
        int i;
        lve lveVar3;
        lve lveVar4;
        gr4 r7gVar;
        wk8.k();
        ArrayList<lve> arrayListE = e();
        un0 un0Var = this.a;
        ArrayList arrayListL = l(un0Var.iterator(), false);
        ArrayList arrayList = new ArrayList();
        for (lve lveVar5 : l(un0Var.iterator(), false)) {
            if (lveVar5.a.getView() != null) {
                arrayList.add(lveVar5.a.getView());
            }
        }
        for (hve hveVar : j()) {
            if (hveVar.i == this.i) {
                b(hveVar, arrayList);
            }
        }
        for (int childCount = this.i.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.i.getChildAt(childCount);
            if (!arrayList.contains(childAt)) {
                this.i.removeView(childAt);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lve lveVar6 = (lve) it.next();
            x3f x3fVarK = k();
            if (lveVar6.f == -1) {
                int i2 = x3fVarK.a + 1;
                x3fVarK.a = i2;
                lveVar6.f = i2;
            }
            arrayList2.add(Integer.valueOf(lveVar6.f));
        }
        Collections.sort(arrayList2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((lve) list.get(i3)).f = ((Integer) arrayList2.get(i3)).intValue();
        }
        int i4 = 0;
        while (i4 < list.size()) {
            br4 br4Var = ((lve) list.get(i4)).a;
            i4++;
            for (int i5 = i4; i5 < list.size(); i5++) {
                if (((lve) list.get(i5)).a == br4Var) {
                    ore.k("Trying to push the same controller to the backstack more than once.");
                    return;
                }
            }
        }
        ArrayDeque arrayDeque = un0Var.a;
        arrayDeque.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayDeque.push((lve) it2.next());
        }
        gve gveVar = un0Var.b;
        if (gveVar != null) {
            gveVar.d();
        }
        ArrayList<lve> arrayList3 = new ArrayList();
        for (lve lveVar7 : arrayListE) {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    lveVar7.a.isBeingDestroyed = true;
                    arrayList3.add(lveVar7);
                    break;
                }
            } while (lveVar7.a != ((lve) it3.next()).a);
        }
        Iterator itC = un0Var.c();
        while (itC.hasNext()) {
            lve lveVar8 = (lve) itC.next();
            lveVar8.e = true;
            U(lveVar8.a);
        }
        if (list.size() > 0) {
            ArrayList arrayList4 = new ArrayList(list);
            Collections.reverse(arrayList4);
            ArrayList arrayListL2 = l(arrayList4.iterator(), false);
            boolean z = arrayListL2.size() <= 0 || !arrayListE.contains(arrayListL2.get(0));
            if (arrayListL2.size() != arrayListL.size()) {
                if (arrayListL.size() > 0) {
                    lveVar = (lve) arrayListL.get(0);
                } else {
                    lveVar = null;
                }
                lveVar2 = (lve) arrayListL2.get(0);
                if (lveVar != null || lveVar.a != lveVar2.a) {
                    if (lveVar != null) {
                        String instanceId = lveVar.a.getInstanceId();
                        HashMap map = gr4.c;
                        rx8.p(instanceId);
                    }
                    A(lveVar2, lveVar, z, gr4Var);
                }
                for (size = arrayListL.size() - 1; size > 0; size--) {
                    lveVar4 = (lve) arrayListL.get(size);
                    if (arrayListL2.contains(lveVar4)) {
                        if (gr4Var != null) {
                            r7gVar = gr4Var.b();
                        } else {
                            r7gVar = new r7g();
                        }
                        r7gVar.a = true;
                        rx8.p(lveVar4.a.getInstanceId());
                        if (lveVar4.a.view != null) {
                            A(null, lveVar4, z, r7gVar);
                        }
                    }
                }
                for (i = 1; i < arrayListL2.size(); i++) {
                    lveVar3 = (lve) arrayListL2.get(i);
                    if (!arrayListL.contains(lveVar3)) {
                        A(lveVar3, (lve) arrayListL2.get(i - 1), true, lveVar3.b());
                    }
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 < arrayListL.size()) {
                        if (((lve) arrayListL.get(i6)).a != ((lve) arrayListL2.get(i6)).a) {
                            if (arrayListL.size() > 0) {
                                lveVar = (lve) arrayListL.get(0);
                            } else {
                                lveVar = null;
                            }
                            lveVar2 = (lve) arrayListL2.get(0);
                            if (lveVar != null) {
                                if (lveVar != null) {
                                    String instanceId2 = lveVar.a.getInstanceId();
                                    HashMap map2 = gr4.c;
                                    rx8.p(instanceId2);
                                }
                                A(lveVar2, lveVar, z, gr4Var);
                            } else {
                                if (lveVar != null) {
                                    String instanceId3 = lveVar.a.getInstanceId();
                                    HashMap map3 = gr4.c;
                                    rx8.p(instanceId3);
                                }
                                A(lveVar2, lveVar, z, gr4Var);
                            }
                            while (size > 0) {
                                lveVar4 = (lve) arrayListL.get(size);
                                if (arrayListL2.contains(lveVar4)) {
                                    if (gr4Var != null) {
                                        r7gVar = gr4Var.b();
                                    } else {
                                        r7gVar = new r7g();
                                    }
                                    r7gVar.a = true;
                                    rx8.p(lveVar4.a.getInstanceId());
                                    if (lveVar4.a.view != null) {
                                        A(null, lveVar4, z, r7gVar);
                                    }
                                }
                            }
                            while (i < arrayListL2.size()) {
                                lveVar3 = (lve) arrayListL2.get(i);
                                if (!arrayListL.contains(lveVar3)) {
                                    A(lveVar3, (lve) arrayListL2.get(i - 1), true, lveVar3.b());
                                }
                            }
                        } else {
                            i6++;
                        }
                    }
                }
            }
        } else {
            for (int size2 = arrayListL.size() - 1; size2 >= 0; size2--) {
                lve lveVar9 = (lve) arrayListL.get(size2);
                gr4 gr4VarB = gr4Var != null ? gr4Var.b() : new r7g();
                String instanceId4 = lveVar9.a.getInstanceId();
                HashMap map4 = gr4.c;
                rx8.p(instanceId4);
                A(null, lveVar9, false, gr4VarB);
            }
        }
        for (lve lveVar10 : arrayList3) {
            Iterator it4 = this.c.iterator();
            boolean z2 = false;
            while (it4.hasNext()) {
                if (((dr4) it4.next()).b == lveVar10.a) {
                    z2 = true;
                }
            }
            if (!z2) {
                lveVar10.a.destroy();
            }
        }
    }

    public final void S(boolean z) {
        if (this.a.a.size() > 0 && z != this.f) {
            Log.e("Conductor", "setOnBackPressedDispatcherEnabled call ignored, as controllers with a different setting have already been pushed.");
        }
        this.f = z;
    }

    public final void T(lve lveVar) {
        wk8.k();
        R(Collections.singletonList(lveVar), lveVar.b());
    }

    public void U(br4 br4Var) {
        br4Var.setRouter(this);
        br4Var.onContextAvailable();
    }

    public abstract void V(Intent intent);

    public abstract void W(String str, Intent intent, int i);

    public abstract void X(String str, Intent intent, int i, Bundle bundle);

    public abstract void Y(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

    public final void Z(lve lveVar) {
        br4 br4Var = lveVar.a;
        if (br4Var.isDestroyed()) {
            return;
        }
        this.d.add(br4Var);
        br4Var.addLifecycleListener(new aq4(2, this));
    }

    public final void a(fr4 fr4Var) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(fr4Var)) {
            return;
        }
        arrayList.add(fr4Var);
    }

    public abstract void a0(String str);

    public void c(boolean z) {
        this.e = 3;
        un0 un0Var = this.a;
        un0Var.getClass();
        ArrayList<lve> arrayList = new ArrayList();
        while (!un0Var.a.isEmpty()) {
            arrayList.add(un0Var.b());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Z((lve) it.next());
        }
        lve lveVar = null;
        if (z && arrayList.size() > 0) {
            lve lveVar2 = (lve) arrayList.get(0);
            lveVar2.a.addLifecycleListener(new bb((ir4) this, arrayList));
            gr4 overriddenPopHandler = lveVar2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = lveVar2.d;
            }
            A(null, lveVar2, false, overriddenPopHandler);
            lveVar = lveVar2;
        }
        if (arrayList.size() > 0) {
            jhb jhbVar = new jhb();
            for (lve lveVar3 : arrayList) {
                if (lveVar3 != lveVar) {
                    br4 br4Var = lveVar3.a;
                    hr4 hr4Var = hr4.f;
                    br4Var.changeStarted(jhbVar, hr4Var);
                    lveVar3.a.changeEnded(jhbVar, hr4Var);
                }
            }
        }
    }

    public abstract Activity d();

    public final ArrayList e() {
        un0 un0Var = this.a;
        ArrayList arrayList = new ArrayList(un0Var.a.size());
        Iterator itC = un0Var.c();
        while (itC.hasNext()) {
            arrayList.add((lve) itC.next());
        }
        return arrayList;
    }

    public final br4 f(String str) {
        br4 br4VarFindController;
        Iterator it = this.a.iterator();
        do {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return null;
            }
            br4VarFindController = ((lve) y1Var.next()).a.findController(str);
        } while (br4VarFindController == null);
        return br4VarFindController;
    }

    public final br4 g(String str) {
        lve lveVar;
        Iterator it = this.a.iterator();
        do {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return null;
            }
            lveVar = (lve) y1Var.next();
        } while (!str.equals(lveVar.b));
        return lveVar.a;
    }

    public final ltb h() {
        Activity activityD = d();
        if (activityD instanceof g74) {
            return ((g74) activityD).d();
        }
        return null;
    }

    public abstract hve i();

    public abstract List j();

    public abstract x3f k();

    public final boolean m() {
        un0 un0Var = this.a;
        if (un0Var.a.isEmpty()) {
            return false;
        }
        return un0Var.a().a.handleBack() || ((un0Var.a.size() > 1 || this.e != 1) && D());
    }

    public abstract boolean n();

    public final boolean o() {
        return this.a.a.size() > 0;
    }

    public abstract void p();

    public void q(Activity activity, boolean z) {
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.b.clear();
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                break;
            }
            lve lveVar = (lve) y1Var.next();
            lveVar.a.activityDestroyed(activity);
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().q(activity, z);
            }
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            br4 br4Var = (br4) arrayList.get(size);
            br4Var.activityDestroyed(activity);
            Iterator<hve> it3 = br4Var.getChildRouters().iterator();
            while (it3.hasNext()) {
                it3.next().q(activity, z);
            }
        }
        this.i = null;
    }

    public final void r(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            }
            lve lveVar = (lve) y1Var.next();
            lveVar.a.activityPaused(activity);
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().r(activity);
            }
        }
    }

    public final void s(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            }
            lve lveVar = (lve) y1Var.next();
            lveVar.a.activityResumed(activity);
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().s(activity);
            }
        }
    }

    public final void t(Activity activity) {
        this.h = false;
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            }
            lve lveVar = (lve) y1Var.next();
            lveVar.a.activityStarted(activity);
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().t(activity);
            }
        }
    }

    public final void u(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                this.h = true;
                return;
            }
            lve lveVar = (lve) y1Var.next();
            lveVar.a.activityStopped(activity);
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().u(activity);
            }
        }
    }

    public void v() {
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            } else {
                ((lve) y1Var.next()).a.onContextAvailable();
            }
        }
    }

    public final void w(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            }
            lve lveVar = (lve) y1Var.next();
            lveVar.a.createOptionsMenu(menu, menuInflater);
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().w(menu, menuInflater);
            }
        }
    }

    public final boolean x(MenuItem menuItem) {
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return false;
            }
            lve lveVar = (lve) y1Var.next();
            if (lveVar.a.optionsItemSelected(menuItem)) {
                return true;
            }
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                if (it2.next().x(menuItem)) {
                    return true;
                }
            }
        }
    }

    public final void y(Menu menu) {
        Iterator it = this.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                return;
            }
            lve lveVar = (lve) y1Var.next();
            lveVar.a.prepareOptionsMenu(menu);
            Iterator<hve> it2 = lveVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().y(menu);
            }
        }
    }

    public void z(lve lveVar, lve lveVar2, boolean z) {
        gr4 overriddenPopHandler;
        if (z && lveVar != null) {
            lveVar.e = true;
        }
        if (z) {
            overriddenPopHandler = lveVar.b();
        } else if (lveVar2 != null) {
            overriddenPopHandler = lveVar2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = lveVar2.d;
            }
        } else {
            overriddenPopHandler = null;
        }
        A(lveVar, lveVar2, z, overriddenPopHandler);
    }
}
