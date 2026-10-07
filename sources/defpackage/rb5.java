package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class rb5 extends see {
    public static TimeInterpolator s;
    public boolean g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;

    public rb5() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f = 250L;
        this.g = true;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    public static void m(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((lfe) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.see
    public void d(lfe lfeVar) {
        View view = lfeVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((qb5) arrayList.get(size)).a == lfeVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                b(lfeVar);
                arrayList.remove(size);
            }
        }
        p(this.k, lfeVar);
        if (this.h.remove(lfeVar)) {
            view.setAlpha(1.0f);
            o(lfeVar);
        }
        if (this.i.remove(lfeVar)) {
            view.setAlpha(1.0f);
            b(lfeVar);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            p(arrayList3, lfeVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((qb5) arrayList5.get(size4)).a == lfeVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    b(lfeVar);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(lfeVar)) {
                view.setAlpha(1.0f);
                b(lfeVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(lfeVar);
        this.o.remove(lfeVar);
        this.r.remove(lfeVar);
        this.p.remove(lfeVar);
        n();
    }

    @Override // defpackage.see
    public void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qb5 qb5Var = (qb5) arrayList.get(size);
            View view = qb5Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            b(qb5Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            o((lfe) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            lfe lfeVar = (lfe) arrayList3.get(size3);
            lfeVar.a.setAlpha(1.0f);
            b(lfeVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            pb5 pb5Var = (pb5) arrayList4.get(size4);
            lfe lfeVar2 = pb5Var.a;
            if (lfeVar2 != null) {
                q(pb5Var, lfeVar2);
            }
            lfe lfeVar3 = pb5Var.b;
            if (lfeVar3 != null) {
                q(pb5Var, lfeVar3);
            }
        }
        arrayList4.clear();
        if (g()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    qb5 qb5Var2 = (qb5) arrayList6.get(size6);
                    View view2 = qb5Var2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    b(qb5Var2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    lfe lfeVar4 = (lfe) arrayList8.get(size8);
                    lfeVar4.a.setAlpha(1.0f);
                    b(lfeVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    pb5 pb5Var2 = (pb5) arrayList10.get(size10);
                    lfe lfeVar5 = pb5Var2.a;
                    if (lfeVar5 != null) {
                        q(pb5Var2, lfeVar5);
                    }
                    lfe lfeVar6 = pb5Var2.b;
                    if (lfeVar6 != null) {
                        q(pb5Var2, lfeVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m(this.q);
            m(this.p);
            m(this.o);
            m(this.r);
            c();
        }
    }

    @Override // defpackage.see
    public boolean g() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // defpackage.see
    public void h() {
        ArrayList<lfe> arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (lfe lfeVar : arrayList) {
            View view = lfeVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(lfeVar);
            viewPropertyAnimatorAnimate.setDuration(this.d).alpha(0.0f).setListener(new mb5(this, lfeVar, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        boolean z = false;
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            og7 og7Var = new og7(this, arrayList5, z, 4);
            if (zIsEmpty) {
                og7Var.run();
            } else {
                View view2 = ((qb5) arrayList5.get(0)).a.a;
                long j = this.d;
                WeakHashMap weakHashMap = i7j.a;
                view2.postOnAnimationDelayed(og7Var, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            ng7 ng7Var = new ng7(this, arrayList6, z, 5);
            if (zIsEmpty) {
                ng7Var.run();
            } else {
                View view3 = ((pb5) arrayList6.get(0)).a.a;
                long j2 = this.d;
                WeakHashMap weakHashMap2 = i7j.a;
                view3.postOnAnimationDelayed(ng7Var, j2);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        p0 p0Var = new p0(this, 2, arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            p0Var.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? f() : 0L, zIsEmpty3 ? 0L : this.f) + (!zIsEmpty ? this.d : 0L);
        View view4 = ((lfe) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = i7j.a;
        view4.postOnAnimationDelayed(p0Var, jMax);
    }

    public boolean i(lfe lfeVar) {
        s(lfeVar);
        lfeVar.a.setAlpha(0.0f);
        this.i.add(lfeVar);
        return true;
    }

    public boolean j(lfe lfeVar, lfe lfeVar2, int i, int i2, int i3, int i4) {
        if (lfeVar == lfeVar2) {
            return k(lfeVar, i, i2, i3, i4);
        }
        View view = lfeVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        s(lfeVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = lfeVar2.a;
        s(lfeVar2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        this.k.add(new pb5(lfeVar, lfeVar2, i, i2, i3, i4));
        return true;
    }

    public boolean k(lfe lfeVar, int i, int i2, int i3, int i4) {
        View view = lfeVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) lfeVar.a.getTranslationY());
        s(lfeVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            b(lfeVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new qb5(lfeVar, translationX, translationY, i3, i4));
        return true;
    }

    public boolean l(lfe lfeVar) {
        s(lfeVar);
        this.h.add(lfeVar);
        return true;
    }

    public final void n() {
        if (g()) {
            return;
        }
        c();
    }

    public final void o(lfe lfeVar) {
        r();
        b(lfeVar);
    }

    public final void p(ArrayList arrayList, lfe lfeVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pb5 pb5Var = (pb5) arrayList.get(size);
            if (q(pb5Var, lfeVar) && pb5Var.a == null && pb5Var.b == null) {
                arrayList.remove(pb5Var);
            }
        }
    }

    public final boolean q(pb5 pb5Var, lfe lfeVar) {
        if (pb5Var.b == lfeVar) {
            pb5Var.b = null;
        } else {
            if (pb5Var.a != lfeVar) {
                return false;
            }
            pb5Var.a = null;
        }
        View view = lfeVar.a;
        View view2 = lfeVar.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        b(lfeVar);
        return true;
    }

    public void r() {
    }

    public final void s(lfe lfeVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        lfeVar.a.animate().setInterpolator(s);
        d(lfeVar);
    }
}
