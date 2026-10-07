package defpackage;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r84 extends nee {
    public final t84 d;

    public r84(q84 q84Var, nee... neeVarArr) {
        List<nee> listAsList = Arrays.asList(neeVarArr);
        this.d = new t84(this, q84Var);
        for (nee neeVar : listAsList) {
            t84 t84Var = this.d;
            t84Var.b(((ArrayList) t84Var.d).size(), neeVar);
        }
        D(this.d.b != 1);
    }

    @Override // defpackage.nee
    public final void A(lfe lfeVar) {
        this.d.k(lfeVar).c.A(lfeVar);
    }

    @Override // defpackage.nee
    public final void B(lfe lfeVar) {
        t84 t84Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) t84Var.g;
        ybb ybbVar = (ybb) identityHashMap.get(lfeVar);
        if (ybbVar == null) {
            c.s("Cannot find wrapper for ", lfeVar, ", seems like it is not bound by this adapter: ", t84Var);
        } else {
            ybbVar.c.B(lfeVar);
            identityHashMap.remove(lfeVar);
        }
    }

    public final List F() {
        List list;
        ArrayList arrayList = (ArrayList) this.d.d;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ybb) it.next()).c);
            }
            list = arrayList2;
        }
        return Collections.unmodifiableList(list);
    }

    public final Pair G(int i) {
        t84 t84Var = this.d;
        s84 s84VarG = t84Var.g(i);
        Pair pair = new Pair(((ybb) s84VarG.c).c, Integer.valueOf(s84VarG.a));
        s84VarG.b = false;
        s84VarG.c = null;
        s84VarG.a = -1;
        t84Var.h = s84VarG;
        return pair;
    }

    public final void H(nee neeVar) {
        t84 t84Var = this.d;
        ArrayList arrayList = (ArrayList) t84Var.d;
        int iM = t84Var.m(neeVar);
        if (iM == -1) {
            return;
        }
        ybb ybbVar = (ybb) arrayList.get(iM);
        int iE = t84Var.e(ybbVar);
        arrayList.remove(iM);
        ((r84) t84Var.e).s(iE, ybbVar.e);
        Iterator it = ((ArrayList) t84Var.c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                neeVar.x(recyclerView);
            }
        }
        ybbVar.c.E(ybbVar.f);
        ybbVar.a.dispose();
        t84Var.d();
    }

    @Override // defpackage.nee
    public final int k(nee neeVar, lfe lfeVar, int i) {
        t84 t84Var = this.d;
        ybb ybbVar = (ybb) ((IdentityHashMap) t84Var.g).get(lfeVar);
        if (ybbVar == null) {
            return -1;
        }
        nee neeVar2 = ybbVar.c;
        int iE = i - t84Var.e(ybbVar);
        int iL = neeVar2.l();
        if (iE >= 0 && iE < iL) {
            return neeVar2.k(neeVar, lfeVar, iE);
        }
        StringBuilder sbP = qv1.p("Detected inconsistent adapter updates. The local position of the view holder maps to ", iE, " which is out of bounds for the adapter with size ", iL, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbP.append(lfeVar);
        sbP.append("adapter:");
        sbP.append(neeVar);
        throw new IllegalStateException(sbP.toString());
    }

    @Override // defpackage.nee
    public final int l() {
        Iterator it = ((ArrayList) this.d.d).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ybb) it.next()).e;
        }
        return i;
    }

    @Override // defpackage.nee
    public final long m(int i) {
        t84 t84Var = this.d;
        s84 s84VarG = t84Var.g(i);
        ybb ybbVar = (ybb) s84VarG.c;
        long jC = ybbVar.b.c(ybbVar.c.m(s84VarG.a));
        s84VarG.b = false;
        s84VarG.c = null;
        s84VarG.a = -1;
        t84Var.h = s84VarG;
        return jC;
    }

    @Override // defpackage.nee
    public final int n(int i) {
        t84 t84Var = this.d;
        s84 s84VarG = t84Var.g(i);
        ybb ybbVar = (ybb) s84VarG.c;
        int iE = ybbVar.a.e(ybbVar.c.n(s84VarG.a));
        s84VarG.b = false;
        s84VarG.c = null;
        s84VarG.a = -1;
        t84Var.h = s84VarG;
        return iE;
    }

    @Override // defpackage.nee
    public final void t(RecyclerView recyclerView) {
        t84 t84Var = this.d;
        ArrayList arrayList = (ArrayList) t84Var.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) t84Var.d).iterator();
        while (it2.hasNext()) {
            ((ybb) it2.next()).c.t(recyclerView);
        }
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        t84 t84Var = this.d;
        s84 s84VarG = t84Var.g(i);
        ((IdentityHashMap) t84Var.g).put(lfeVar, (ybb) s84VarG.c);
        ybb ybbVar = (ybb) s84VarG.c;
        ybbVar.c.j(lfeVar, s84VarG.a);
        s84VarG.b = false;
        s84VarG.c = null;
        s84VarG.a = -1;
        t84Var.h = s84VarG;
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        ybb ybbVarI = ((j9j) this.d.f).i(i);
        return ybbVarI.c.w(viewGroup, ybbVarI.a.d(i));
    }

    @Override // defpackage.nee
    public final void x(RecyclerView recyclerView) {
        t84 t84Var = this.d;
        ArrayList arrayList = (ArrayList) t84Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        Iterator it = ((ArrayList) t84Var.d).iterator();
        while (it.hasNext()) {
            ((ybb) it.next()).c.x(recyclerView);
        }
    }

    @Override // defpackage.nee
    public final boolean y(lfe lfeVar) {
        t84 t84Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) t84Var.g;
        ybb ybbVar = (ybb) identityHashMap.get(lfeVar);
        if (ybbVar == null) {
            c.s("Cannot find wrapper for ", lfeVar, ", seems like it is not bound by this adapter: ", t84Var);
            return false;
        }
        boolean zY = ybbVar.c.y(lfeVar);
        identityHashMap.remove(lfeVar);
        return zY;
    }

    @Override // defpackage.nee
    public final void z(lfe lfeVar) {
        this.d.k(lfeVar).c.z(lfeVar);
    }

    public r84(nee... neeVarArr) {
        this(q84.c, neeVarArr);
    }
}
