package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vd5 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    public vd5(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final vd5 h(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof vd5) {
            return (vd5) tag;
        }
        vd5 vd5Var = new vd5(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, vd5Var);
        return vd5Var;
    }

    public static final vd5 i(ViewGroup viewGroup, c cVar) {
        cVar.I();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof vd5) {
            return (vd5) tag;
        }
        vd5 vd5Var = new vd5(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, vd5Var);
        return vd5Var;
    }

    public final void a(oeg oegVar) {
        if (oegVar.b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((oeg) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((oeg) listIterator.previous()).getClass();
            throw null;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList<pd5> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ((oeg) ww3.B1(arrayList)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((oeg) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            oeg oegVar = (oeg) it3.next();
            arrayList2.add(new pd5(oegVar, z));
            new ud5(oegVar);
            if (!z) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!((ud5) obj).b()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((ud5) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((ud5) it5.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            ((pd5) it6.next()).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        for (pd5 pd5Var : arrayList2) {
            Context context = this.a.getContext();
            pd5Var.getClass();
            uvc uvcVarC = pd5Var.c(context);
            if (uvcVarC != null) {
                if (((AnimatorSet) uvcVarC.c) != null) {
                    throw null;
                }
                arrayList6.add(pd5Var);
            }
        }
        Iterator it7 = arrayList6.iterator();
        if (it7.hasNext()) {
            ((pd5) it7.next()).getClass();
            throw null;
        }
    }

    public final void c() {
        if (c.K(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        ArrayList arrayList = this.c;
        l(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((oeg) it.next()).getClass();
            cx3.Z0(null, arrayList2);
        }
        List listT1 = ww3.T1(ww3.X1(arrayList2));
        int size = listT1.size();
        for (int i = 0; i < size; i++) {
            ((neg) listT1.get(i)).a(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((oeg) arrayList.get(i2));
        }
        List listT2 = ww3.T1(arrayList);
        if (listT2.size() <= 0) {
            return;
        }
        ((oeg) listT2.get(0)).getClass();
        throw null;
    }

    public final void d() {
        if (this.e) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                boolean zIsEmpty = this.b.isEmpty();
                ArrayList arrayList = this.c;
                if (zIsEmpty) {
                    ArrayList<oeg> arrayList2 = new ArrayList(arrayList);
                    this.c.clear();
                    for (oeg oegVar : arrayList2) {
                        if (c.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + oegVar + " with no incoming pendingOperations");
                        }
                        ViewGroup viewGroup = this.a;
                        oegVar.getClass();
                        oegVar.a(viewGroup);
                        this.c.add(oegVar);
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    this.c.clear();
                    Iterator it = arrayList3.iterator();
                    if (it.hasNext()) {
                        oeg oegVar2 = (oeg) it.next();
                        if (c.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + oegVar2);
                        }
                        oegVar2.getClass();
                        throw null;
                    }
                    m();
                    ArrayList arrayList4 = new ArrayList(this.b);
                    if (arrayList4.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList4);
                    if (c.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayList4, this.d);
                    Iterator it2 = arrayList4.iterator();
                    if (it2.hasNext()) {
                        ((oeg) it2.next()).getClass();
                        throw null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        ((oeg) it3.next()).getClass();
                        cx3.Z0(null, arrayList5);
                    }
                    if (!arrayList5.isEmpty()) {
                        l(arrayList4);
                        int size = arrayList4.size();
                        for (int i = 0; i < size; i++) {
                            a((oeg) arrayList4.get(i));
                        }
                    }
                    this.d = false;
                    if (c.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (c.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                m();
                l(this.b);
                for (oeg oegVar : new ArrayList(this.c)) {
                    if (c.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + oegVar);
                    }
                    oegVar.a(this.a);
                }
                for (oeg oegVar2 : new ArrayList(this.b)) {
                    if (c.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + oegVar2);
                    }
                    oegVar2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        if (this.e) {
            if (c.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            d();
        }
    }

    public final int g(e eVar) {
        Object obj;
        Object next;
        a aVar = eVar.c;
        Iterator it = this.b.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((oeg) next).getClass();
        } while (!cqk.d(null, aVar));
        for (Object obj2 : this.c) {
            ((oeg) obj2).getClass();
            if (cqk.d(null, aVar)) {
                obj = obj2;
                break;
            }
        }
        return 0;
    }

    public final void j() {
        synchronized (this.b) {
            m();
            ArrayList arrayList = this.b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            if (listIterator.hasPrevious()) {
                ((oeg) listIterator.previous()).getClass();
                throw null;
            }
            this.e = false;
        }
    }

    public final void k(sl0 sl0Var) {
        if (c.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + sl0Var.c);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((oeg) it.next()).getClass();
            cx3.Z0(null, arrayList);
        }
        List listT1 = ww3.T1(ww3.X1(arrayList));
        int size = listT1.size();
        for (int i = 0; i < size; i++) {
            ((neg) listT1.get(i)).b(sl0Var);
        }
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oeg oegVar = (oeg) arrayList.get(i);
            oegVar.getClass();
            if (!oegVar.a) {
                oegVar.a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((oeg) it.next()).getClass();
            cx3.Z0(null, arrayList2);
        }
        List listT1 = ww3.T1(ww3.X1(arrayList2));
        int size2 = listT1.size();
        for (int i2 = 0; i2 < size2; i2++) {
            neg negVar = (neg) listT1.get(i2);
            if (!negVar.a) {
                negVar.c(this.a);
            }
            negVar.a = true;
        }
    }

    public final void m() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((oeg) it.next()).getClass();
        }
    }

    public final void n(boolean z) {
        this.d = z;
    }
}
