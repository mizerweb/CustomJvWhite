package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class r2i implements Cloneable {
    public ArrayList k;
    public ArrayList l;
    public q2i[] m;
    public gzf v;
    public long x;
    public long y;
    public static final Animator[] z = new Animator[0];
    public static final int[] A = {2, 1, 3, 4};
    public static final lhb B = new lhb(25);
    public static final ThreadLocal C = new ThreadLocal();
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public gvb g = new gvb(16);
    public gvb h = new gvb(16);
    public z2i i = null;
    public final int[] j = A;
    public final ArrayList n = new ArrayList();
    public Animator[] o = z;
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public r2i s = null;
    public ArrayList t = null;
    public ArrayList u = new ArrayList();
    public lhb w = B;

    public static void c(gvb gvbVar, View view, c3i c3iVar) {
        mw mwVar = (mw) gvbVar.b;
        mw mwVar2 = (mw) gvbVar.a;
        SparseArray sparseArray = (SparseArray) gvbVar.c;
        vi9 vi9Var = (vi9) gvbVar.d;
        mwVar.put(view, c3iVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = i7j.a;
        String strF = y6j.f(view);
        if (strF != null) {
            if (mwVar2.containsKey(strF)) {
                mwVar2.put(strF, null);
            } else {
                mwVar2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (vi9Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    vi9Var.f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) vi9Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    vi9Var.f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static mw r() {
        ThreadLocal threadLocal = C;
        mw mwVar = (mw) threadLocal.get();
        if (mwVar != null) {
            return mwVar;
        }
        mw mwVar2 = new mw(0);
        threadLocal.set(mwVar2);
        return mwVar2;
    }

    public static boolean x(c3i c3iVar, c3i c3iVar2, String str) {
        Object obj = c3iVar.a.get(str);
        Object obj2 = c3iVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        mw mwVarR = r();
        this.x = 0L;
        int i = 0;
        while (true) {
            int size = this.u.size();
            ArrayList arrayList = this.u;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            n2i n2iVar = (n2i) mwVarR.get(animator);
            if (animator != null && n2iVar != null) {
                Animator animator2 = n2iVar.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.n.add(animator);
                this.x = Math.max(this.x, o2i.a(animator));
            }
            i++;
        }
    }

    public r2i B(q2i q2iVar) {
        r2i r2iVar;
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            if (!arrayList.remove(q2iVar) && (r2iVar = this.s) != null) {
                r2iVar.B(q2iVar);
            }
            if (this.t.size() == 0) {
                this.t = null;
            }
        }
        return this;
    }

    public void C(View view) {
        this.f.remove(view);
    }

    public void D(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = z;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                y(this, dzh.f, false);
            }
            this.q = false;
        }
    }

    public void E() {
        M();
        mw mwVarR = r();
        for (Animator animator : this.u) {
            if (mwVarR.containsKey(animator)) {
                M();
                if (animator != null) {
                    animator.addListener(new al(this, mwVarR, false, 4));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new y7(8, this));
                    animator.start();
                }
            }
        }
        this.u.clear();
        n();
    }

    public void F(long j, long j2) {
        long j3 = this.x;
        int i = 0;
        boolean z2 = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.r = false;
            y(this, dzh.b, z2);
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = z;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            o2i.b(animator, Math.min(Math.max(0L, j), o2i.a(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.o = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.r = true;
        }
        y(this, dzh.c, z2);
    }

    public void G(long j) {
        this.c = j;
    }

    public void H(gzf gzfVar) {
        this.v = gzfVar;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void J(lhb lhbVar) {
        if (lhbVar == null) {
            this.w = B;
        } else {
            this.w = lhbVar;
        }
    }

    public void K() {
    }

    public void L(long j) {
        this.b = j;
    }

    public final void M() {
        if (this.p == 0) {
            y(this, dzh.b, false);
            this.r = false;
        }
        this.p++;
    }

    public String N(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(q2i q2iVar) {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(q2iVar);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public void d() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = z;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        y(this, dzh.d, false);
    }

    public abstract void e(c3i c3iVar);

    public final void f(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            c3i c3iVar = new c3i(view);
            if (z2) {
                h(c3iVar);
            } else {
                e(c3iVar);
            }
            c3iVar.c.add(this);
            g(c3iVar);
            if (z2) {
                c(this.g, view, c3iVar);
            } else {
                c(this.h, view, c3iVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void g(c3i c3iVar) {
    }

    public abstract void h(c3i c3iVar);

    public final void i(ViewGroup viewGroup, boolean z2) {
        j(z2);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                c3i c3iVar = new c3i(viewFindViewById);
                if (z2) {
                    h(c3iVar);
                } else {
                    e(c3iVar);
                }
                c3iVar.c.add(this);
                g(c3iVar);
                if (z2) {
                    c(this.g, viewFindViewById, c3iVar);
                } else {
                    c(this.h, viewFindViewById, c3iVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            c3i c3iVar2 = new c3i(view);
            if (z2) {
                h(c3iVar2);
            } else {
                e(c3iVar2);
            }
            c3iVar2.c.add(this);
            g(c3iVar2);
            if (z2) {
                c(this.g, view, c3iVar2);
            } else {
                c(this.h, view, c3iVar2);
            }
        }
    }

    public final void j(boolean z2) {
        if (z2) {
            ((mw) this.g.b).clear();
            ((SparseArray) this.g.c).clear();
            ((vi9) this.g.d).a();
        } else {
            ((mw) this.h.b).clear();
            ((SparseArray) this.h.c).clear();
            ((vi9) this.h.d).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: k */
    public r2i clone() {
        try {
            r2i r2iVar = (r2i) super.clone();
            r2iVar.u = new ArrayList();
            r2iVar.g = new gvb(16);
            r2iVar.h = new gvb(16);
            r2iVar.k = null;
            r2iVar.l = null;
            r2iVar.s = this;
            r2iVar.t = null;
            return r2iVar;
        } catch (CloneNotSupportedException e) {
            qr7.o(e);
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, c3i c3iVar, c3i c3iVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, gvb gvbVar, gvb gvbVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        c3i c3iVar;
        c3i c3iVar2;
        r2i r2iVar = this;
        mw mwVarR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        r2iVar.q().getClass();
        for (int i = 0; i < size; i++) {
            c3i c3iVar3 = (c3i) arrayList.get(i);
            c3i c3iVar4 = (c3i) arrayList2.get(i);
            if (c3iVar3 != null && !c3iVar3.c.contains(r2iVar)) {
                c3iVar3 = null;
            }
            if (c3iVar4 != null && !c3iVar4.c.contains(r2iVar)) {
                c3iVar4 = null;
            }
            if ((c3iVar3 != null || c3iVar4 != null) && (c3iVar3 == null || c3iVar4 == null || r2iVar.v(c3iVar3, c3iVar4))) {
                Animator animatorL = r2iVar.l(viewGroup, c3iVar3, c3iVar4);
                if (animatorL != null) {
                    String str = r2iVar.a;
                    if (c3iVar4 != null) {
                        view = c3iVar4.b;
                        String[] strArrS = r2iVar.s();
                        if (strArrS != null && strArrS.length > 0) {
                            c3iVar2 = new c3i(view);
                            c3i c3iVar5 = (c3i) ((mw) gvbVar2.b).get(view);
                            if (c3iVar5 != null) {
                                int i2 = 0;
                                while (i2 < strArrS.length) {
                                    String str2 = strArrS[i2];
                                    c3iVar2.a.put(str2, c3iVar5.a.get(str2));
                                    i2++;
                                    strArrS = strArrS;
                                    animatorL = animatorL;
                                }
                            }
                            animator = animatorL;
                            int i3 = mwVarR.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                n2i n2iVar = (n2i) mwVarR.get((Animator) mwVarR.f(i4));
                                if (n2iVar.c != null && n2iVar.a == view && n2iVar.b.equals(str) && n2iVar.c.equals(c3iVar2)) {
                                    animator = null;
                                    break;
                                }
                            }
                        } else {
                            animator = animatorL;
                            c3iVar2 = null;
                        }
                        c3iVar = c3iVar2;
                    } else {
                        animator = animatorL;
                        view = c3iVar3.b;
                        c3iVar = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        r2iVar = this;
                        mwVarR.put(animator2, new n2i(view2, str, r2iVar, viewGroup.getWindowId(), c3iVar, animator2));
                        r2iVar.u.add(animator2);
                    } else {
                        r2iVar = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                n2i n2iVar2 = (n2i) mwVarR.get((Animator) r2iVar.u.get(sparseIntArray.keyAt(i5)));
                n2iVar2.f.setStartDelay(n2iVar2.f.getStartDelay() + (((long) sparseIntArray.valueAt(i5)) - BuildConfig.MAX_TIME_TO_UPLOAD));
            }
        }
    }

    public final void n() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            y(this, dzh.c, false);
            for (int i2 = 0; i2 < ((vi9) this.g.d).i(); i2++) {
                View view = (View) ((vi9) this.g.d).j(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((vi9) this.h.d).i(); i3++) {
                View view2 = (View) ((vi9) this.h.d).j(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    public void o(ViewGroup viewGroup) {
        mw mwVarR = r();
        int i = mwVarR.c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        mw mwVar = new mw(mwVarR);
        mwVarR.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            n2i n2iVar = (n2i) mwVar.i(i2);
            if (n2iVar.a != null && windowId.equals(n2iVar.d)) {
                ((Animator) mwVar.f(i2)).end();
            }
        }
    }

    public final c3i p(View view, boolean z2) {
        z2i z2iVar = this.i;
        if (z2iVar != null) {
            return z2iVar.p(view, z2);
        }
        ArrayList arrayList = z2 ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            c3i c3iVar = (c3i) arrayList.get(i);
            if (c3iVar == null) {
                return null;
            }
            if (c3iVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (c3i) (z2 ? this.l : this.k).get(i);
        }
        return null;
    }

    public final r2i q() {
        z2i z2iVar = this.i;
        return z2iVar != null ? z2iVar.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final c3i t(View view, boolean z2) {
        z2i z2iVar = this.i;
        if (z2iVar != null) {
            return z2iVar.t(view, z2);
        }
        return (c3i) ((mw) (z2 ? this.g : this.h).b).get(view);
    }

    public final String toString() {
        return N("");
    }

    public boolean u() {
        return !this.n.isEmpty();
    }

    public boolean v(c3i c3iVar, c3i c3iVar2) {
        if (c3iVar != null && c3iVar2 != null) {
            String[] strArrS = s();
            if (strArrS != null) {
                for (String str : strArrS) {
                    if (x(c3iVar, c3iVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c3iVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (x(c3iVar, c3iVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void y(r2i r2iVar, dzh dzhVar, boolean z2) {
        r2i r2iVar2 = this.s;
        if (r2iVar2 != null) {
            r2iVar2.y(r2iVar, dzhVar, z2);
        }
        ArrayList arrayList = this.t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.t.size();
        q2i[] q2iVarArr = this.m;
        if (q2iVarArr == null) {
            q2iVarArr = new q2i[size];
        }
        this.m = null;
        q2i[] q2iVarArr2 = (q2i[]) this.t.toArray(q2iVarArr);
        for (int i = 0; i < size; i++) {
            dzhVar.b(q2iVarArr2[i], r2iVar, z2);
            q2iVarArr2[i] = null;
        }
        this.m = q2iVarArr2;
    }

    public void z(View view) {
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = z;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.o = animatorArr;
        y(this, dzh.e, false);
        this.q = true;
    }
}
