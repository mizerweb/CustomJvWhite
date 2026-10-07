package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class c1c {
    public final w4 a;
    public final String b = c1c.class.getName();
    public boolean c = true;
    public final LinkedList d = new LinkedList();
    public RootController e;

    public c1c(w4 w4Var) {
        this.a = w4Var;
    }

    public static lve a(u65 u65Var, boolean z) {
        t65 t65Var = u65Var.g;
        f2 f2Var = u65Var.e;
        lve lveVarE = oc9.e((Widget) t65Var.t(), null, null);
        lveVarE.e(u65Var.a);
        if (z && !(f2Var instanceof s65)) {
            Object objInvoke = ((af7) f2Var.a).invoke();
            gr4 no9Var = objInvoke instanceof gr4 ? (gr4) objInvoke : null;
            if (no9Var == null) {
                no9Var = new no9(0);
            }
            lveVarE.c(no9Var);
            Object objInvoke2 = ((af7) f2Var.b).invoke();
            gr4 no9Var2 = objInvoke2 instanceof gr4 ? (gr4) objInvoke2 : null;
            if (no9Var2 == null) {
                no9Var2 = new no9(0);
            }
            lveVarE.a(no9Var2);
        }
        return lveVarE;
    }

    public static boolean e(hve hveVar, String str) {
        ArrayList arrayListE = hveVar.e();
        if (arrayListE.isEmpty()) {
            return false;
        }
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            if (cqk.d(((lve) it.next()).b, str)) {
                return true;
            }
        }
        return false;
    }

    public static void i(br4 br4Var, u65 u65Var) {
        Bundle bundle = u65Var.c;
        Widget widget = br4Var instanceof Widget ? (Widget) br4Var : null;
        if (widget != null) {
            widget.updateArgs(bundle);
        } else {
            br4Var.getArgs().clear();
            br4Var.getArgs().putAll(bundle);
        }
    }

    public final ArrayList b() {
        ArrayList arrayListE = c().w1().e();
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListE, 10));
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            arrayList.add(new b1c((lve) it.next()));
        }
        return arrayList;
    }

    public final RootController c() {
        RootController rootController = this.e;
        if (rootController != null) {
            return rootController;
        }
        ore.k("Router not set");
        return null;
    }

    public final int d() {
        if (!this.c) {
            return c().w1().a.a.size();
        }
        List listE = this.d;
        if (listE.isEmpty()) {
            listE = c().w1().e();
        }
        return listE.size();
    }

    public final b1c f() {
        lve lveVarA;
        RootController rootController = this.e;
        if (rootController == null || (lveVarA = rootController.w1().a.a()) == null) {
            return null;
        }
        return new b1c(lveVarA);
    }

    public final void g(af7 af7Var) {
        this.c = true;
        af7Var.invoke();
        this.c = false;
        LinkedList linkedList = this.d;
        if (linkedList.isEmpty()) {
            gm0.Y(this.b, "Early return in runPendingTransactions cuz of pendingTransactions.isEmpty()");
            return;
        }
        ArrayList arrayListE = c().w1().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (!((Widget) ((lve) obj).a).getF()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListG1 = ww3.G1(arrayList, arrayListE);
        ArrayList arrayListE2 = c().u1().e();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedList) {
            if (((Widget) ((lve) obj2).a).getF()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListG2 = ww3.G1(arrayList2, arrayListE2);
        linkedList.clear();
        c().u1().R(arrayListG2, null);
        hve hveVarW1 = c().w1();
        lve lveVar = (lve) ww3.D1(arrayListG1);
        hveVarW1.R(arrayListG1, lveVar != null ? lveVar.b() : null);
    }

    public final void h(u65 u65Var, e7 e7Var) {
        lve lveVarA = a(u65Var, !b().isEmpty());
        if (e7Var != null) {
            lveVarA.c(e7Var);
        }
        if (this.c) {
            this.d.add(lveVarA);
        } else {
            c().w1().T(lveVarA);
            ((iv4) ((ny8) this.a.a).getValue()).getClass();
        }
    }
}
