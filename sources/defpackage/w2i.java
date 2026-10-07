package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class w2i implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final r2i a;
    public final ViewGroup b;

    public w2i(r2i r2iVar, ViewGroup viewGroup) {
        this.a = r2iVar;
        this.b = viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0210  */
    /* JADX WARN: Code duplicated, block: B:102:0x021e  */
    /* JADX WARN: Code duplicated, block: B:103:0x022a  */
    /* JADX WARN: Code duplicated, block: B:107:0x023c  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e7 A[EDGE_INSN: B:134:0x01e7->B:90:0x01e7 BREAK  A[LOOP:1: B:19:0x0085->B:89:0x01df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fd  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        r2i r2iVar;
        int i;
        gvb gvbVar;
        gvb gvbVar2;
        mw mwVar;
        mw mwVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        mw mwVarR;
        int i5;
        Animator animator;
        n2i n2iVar;
        c3i c3iVar;
        c3i c3iVar2;
        int i6;
        ViewGroup viewGroup;
        boolean z2;
        int i7;
        View view;
        c3i c3iVar3;
        mw mwVar3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        vi9 vi9Var;
        int i11;
        int i12;
        View view6;
        ViewGroup viewGroup2;
        boolean z3;
        Iterator it;
        ViewGroup viewGroup3 = this.b;
        viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup3.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!x2i.c.remove(viewGroup3)) {
            return true;
        }
        mw mwVarB = x2i.b();
        ArrayList arrayList2 = (ArrayList) mwVarB.get(viewGroup3);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            r2iVar = this.a;
            arrayList2.add(r2iVar);
            r2iVar.a(new v2i(this, mwVarB));
            i = 0;
            r2iVar.i(viewGroup3, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r2i) it.next()).D(viewGroup3);
                }
            }
            r2iVar.k = new ArrayList();
            r2iVar.l = new ArrayList();
            gvbVar = r2iVar.g;
            gvbVar2 = r2iVar.h;
            mwVar = new mw((mw) gvbVar.b);
            mwVar2 = new mw((mw) gvbVar2.b);
            i2 = 0;
            while (true) {
                iArr = r2iVar.j;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    viewGroup = viewGroup3;
                    z2 = z4;
                    for (i7 = mwVar.c - 1; i7 >= 0; i7--) {
                        view = (View) mwVar.f(i7);
                        if (view == null && r2iVar.w(view) && (c3iVar3 = (c3i) mwVar2.remove(view)) != null && r2iVar.w(c3iVar3.b)) {
                            r2iVar.k.add((c3i) mwVar.g(i7));
                            r2iVar.l.add(c3iVar3);
                        }
                    }
                } else if (i6 != 2) {
                    viewGroup = viewGroup3;
                    z2 = z4;
                    mwVar3 = (mw) gvbVar.a;
                    mw mwVar4 = (mw) gvbVar2.a;
                    i8 = mwVar3.c;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) mwVar3.i(i9);
                        if (view2 == null && r2iVar.w(view2) && (view3 = (View) mwVar4.get(mwVar3.f(i9))) != null && r2iVar.w(view3)) {
                            c3i c3iVar4 = (c3i) mwVar.get(view2);
                            c3i c3iVar5 = (c3i) mwVar2.get(view3);
                            if (c3iVar4 != null && c3iVar5 != null) {
                                r2iVar.k.add(c3iVar4);
                                r2iVar.l.add(c3iVar5);
                                mwVar.remove(view2);
                                mwVar2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        vi9Var = (vi9) gvbVar.d;
                        vi9 vi9Var2 = (vi9) gvbVar2.d;
                        i11 = vi9Var.i();
                        i12 = i;
                        while (i12 < i11) {
                            view6 = (View) vi9Var.j(i12);
                            if (view6 == null && r2iVar.w(view6)) {
                                viewGroup2 = viewGroup3;
                                View view7 = (View) vi9Var2.b(vi9Var.e(i12));
                                if (view7 != null && r2iVar.w(view7)) {
                                    c3i c3iVar6 = (c3i) mwVar.get(view6);
                                    z3 = z4;
                                    c3i c3iVar7 = (c3i) mwVar2.get(view7);
                                    if (c3iVar6 != null && c3iVar7 != null) {
                                        r2iVar.k.add(c3iVar6);
                                        r2iVar.l.add(c3iVar7);
                                        mwVar.remove(view6);
                                        mwVar2.remove(view7);
                                    }
                                }
                                i12++;
                                viewGroup3 = viewGroup2;
                                z4 = z3;
                            } else {
                                viewGroup2 = viewGroup3;
                            }
                            z3 = z4;
                            i12++;
                            viewGroup3 = viewGroup2;
                            z4 = z3;
                        }
                    }
                    viewGroup = viewGroup3;
                    z2 = z4;
                } else {
                    viewGroup = viewGroup3;
                    z2 = z4;
                    sparseArray = (SparseArray) gvbVar.c;
                    SparseArray sparseArray2 = (SparseArray) gvbVar2.c;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && r2iVar.w(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && r2iVar.w(view5)) {
                            c3i c3iVar8 = (c3i) mwVar.get(view4);
                            c3i c3iVar9 = (c3i) mwVar2.get(view5);
                            if (c3iVar8 != null && c3iVar9 != null) {
                                r2iVar.k.add(c3iVar8);
                                r2iVar.l.add(c3iVar9);
                                mwVar.remove(view4);
                                mwVar2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                viewGroup3 = viewGroup;
                z4 = z2;
                i = 0;
            }
            ViewGroup viewGroup4 = viewGroup3;
            z = z4;
            for (i3 = 0; i3 < mwVar.c; i3++) {
                c3iVar2 = (c3i) mwVar.i(i3);
                if (r2iVar.w(c3iVar2.b)) {
                    r2iVar.k.add(c3iVar2);
                    r2iVar.l.add(null);
                }
            }
            for (i4 = 0; i4 < mwVar2.c; i4++) {
                c3iVar = (c3i) mwVar2.i(i4);
                if (r2iVar.w(c3iVar.b)) {
                    r2iVar.l.add(c3iVar);
                    r2iVar.k.add(null);
                }
            }
            mwVarR = r2i.r();
            int i13 = mwVarR.c;
            WindowId windowId = viewGroup4.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                animator = (Animator) mwVarR.f(i5);
                if (animator == null && (n2iVar = (n2i) mwVarR.get(animator)) != null) {
                    r2i r2iVar2 = n2iVar.e;
                    View view8 = n2iVar.a;
                    if (view8 != null && windowId.equals(n2iVar.d)) {
                        c3i c3iVar10 = n2iVar.c;
                        boolean z5 = z;
                        c3i c3iVarT = r2iVar.t(view8, z5);
                        c3i c3iVarP = r2iVar.p(view8, z5);
                        if (c3iVarT == null && c3iVarP == null) {
                            c3iVarP = (c3i) ((mw) r2iVar.h.b).get(view8);
                        }
                        if ((c3iVarT != null || c3iVarP != null) && r2iVar2.v(c3iVar10, c3iVarP)) {
                            r2iVar2.q().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                mwVarR.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            r2iVar.m(viewGroup4, r2iVar.g, r2iVar.h, r2iVar.k, r2iVar.l);
            r2iVar.E();
            return true;
        }
        arrayList2 = new ArrayList();
        mwVarB.put(viewGroup3, arrayList2);
        r2iVar = this.a;
        arrayList2.add(r2iVar);
        r2iVar.a(new v2i(this, mwVarB));
        i = 0;
        r2iVar.i(viewGroup3, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((r2i) it.next()).D(viewGroup3);
            }
        }
        r2iVar.k = new ArrayList();
        r2iVar.l = new ArrayList();
        gvbVar = r2iVar.g;
        gvbVar2 = r2iVar.h;
        mwVar = new mw((mw) gvbVar.b);
        mwVar2 = new mw((mw) gvbVar2.b);
        i2 = 0;
        while (true) {
            iArr = r2iVar.j;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                viewGroup = viewGroup3;
                z2 = z4;
                while (i7 >= 0) {
                    view = (View) mwVar.f(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                viewGroup = viewGroup3;
                z2 = z4;
                mwVar3 = (mw) gvbVar.a;
                mw mwVar5 = (mw) gvbVar2.a;
                i8 = mwVar3.c;
                while (i9 < i8) {
                    view2 = (View) mwVar3.i(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    vi9Var = (vi9) gvbVar.d;
                    vi9 vi9Var3 = (vi9) gvbVar2.d;
                    i11 = vi9Var.i();
                    i12 = i;
                    while (i12 < i11) {
                        view6 = (View) vi9Var.j(i12);
                        if (view6 == null) {
                            viewGroup2 = viewGroup3;
                            z3 = z4;
                        } else {
                            viewGroup2 = viewGroup3;
                            z3 = z4;
                        }
                        i12++;
                        viewGroup3 = viewGroup2;
                        z4 = z3;
                    }
                }
                viewGroup = viewGroup3;
                z2 = z4;
            } else {
                viewGroup = viewGroup3;
                z2 = z4;
                sparseArray = (SparseArray) gvbVar.c;
                SparseArray sparseArray3 = (SparseArray) gvbVar2.c;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            viewGroup3 = viewGroup;
            z4 = z2;
            i = 0;
        }
        ViewGroup viewGroup5 = viewGroup3;
        z = z4;
        while (i3 < mwVar.c) {
            c3iVar2 = (c3i) mwVar.i(i3);
            if (r2iVar.w(c3iVar2.b)) {
                r2iVar.k.add(c3iVar2);
                r2iVar.l.add(null);
            }
        }
        while (i4 < mwVar2.c) {
            c3iVar = (c3i) mwVar2.i(i4);
            if (r2iVar.w(c3iVar.b)) {
                r2iVar.l.add(c3iVar);
                r2iVar.k.add(null);
            }
        }
        mwVarR = r2i.r();
        int i14 = mwVarR.c;
        WindowId windowId2 = viewGroup5.getWindowId();
        i5 = i14 - 1;
        while (i5 >= 0) {
            animator = (Animator) mwVarR.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        r2iVar.m(viewGroup5, r2iVar.g, r2iVar.h, r2iVar.k, r2iVar.l);
        r2iVar.E();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        x2i.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) x2i.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((r2i) it.next()).D(viewGroup);
            }
        }
        this.a.j(true);
    }
}
