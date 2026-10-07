package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class ll5 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ll5() {
        this.a = 2;
        h4e h4eVar = i4e.a;
        e3 e3Var = i4e.b;
        this.d = new BigInteger(Long.toUnsignedString(e3Var.f()), 10).toString(36);
        this.e = new BigInteger(Long.toUnsignedString(e3Var.f()), 10).toString(36);
        this.h = new LinkedHashMap();
    }

    public h4d a() {
        return new h4d((String) this.c, (String) this.d, (String) this.e, (String) this.f, (ip4) this.g, null, false, this.b, false, (LinkedHashMap) this.h);
    }

    public void b(j8c j8cVar) {
        qeh callback;
        int iOrdinal = j8cVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            ore.o();
                            return;
                        }
                    }
                }
            }
            reh rehVar = (reh) this.e;
            if (rehVar != null && (callback = rehVar.getCallback()) != null) {
                callback.onDismiss();
            }
            i8c i8cVar = (i8c) this.f;
            if (i8cVar != null) {
                i8cVar.w(j8cVar);
                return;
            }
            return;
        }
        reh rehVar2 = (reh) this.e;
        if (rehVar2 != null) {
            vx9 vx9Var = new vx9(this, 18, j8cVar);
            qeh qehVar = rehVar2.d;
            if (qehVar == null) {
                return;
            }
            if (qehVar.z().getHeight() > 0) {
                rehVar2.c(qehVar.s(), qehVar.C(), new l9j(vx9Var, qehVar), new yvg(11), new peh(rehVar2, 1));
            } else {
                vx9Var.invoke();
                qehVar.onDismiss();
            }
            rehVar2.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0069  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    public void c() {
        boolean z;
        ArrayList arrayList;
        mw mwVar;
        boolean z2;
        ArrayList arrayList2;
        Rect rect;
        char c;
        int i;
        int i2;
        switch (this.a) {
            case 3:
                kzf kzfVar = (kzf) this.h;
                ViewGroup viewGroup = (ViewGroup) this.c;
                View view = (View) this.d;
                View view2 = (View) this.e;
                r2i r2iVar = (r2i) this.f;
                boolean z3 = this.b;
                View view3 = new View(viewGroup.getContext());
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                mw mwVar2 = kzfVar.g;
                if (view2 == null || view == null) {
                    z = false;
                } else {
                    if (mwVar2.isEmpty() || kzfVar.l == null) {
                        mwVar2.clear();
                        mwVar = null;
                    } else {
                        mwVar = new mw(0);
                        lzl.c(mwVar, view);
                        mwVar.l(new ArrayList(mwVar2.keySet()));
                        mwVar2.l(mwVar.keySet());
                    }
                    if (mwVar2.isEmpty()) {
                        kzfVar.l = null;
                    } else if (mwVar != null) {
                        arrayList3.addAll(mwVar.values());
                    }
                    if (kzfVar.k == null && kzfVar.j == null && kzfVar.l == null) {
                        z = false;
                    } else {
                        if (kzfVar.l != null) {
                            Rect rect2 = new Rect();
                            r2i r2iVar2 = kzfVar.l;
                            ArrayList arrayList5 = r2iVar2.f;
                            arrayList5.clear();
                            int size = arrayList3.size();
                            int i3 = 0;
                            while (i3 < size) {
                                int i4 = i3;
                                View view4 = (View) arrayList3.get(i3);
                                boolean z4 = z3;
                                int size2 = arrayList5.size();
                                ArrayList arrayList6 = arrayList4;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        i = size;
                                        arrayList5.add(view4);
                                        int i6 = size2;
                                        while (i6 < arrayList5.size()) {
                                            View view5 = (View) arrayList5.get(i6);
                                            if (view5 instanceof ViewGroup) {
                                                ViewGroup viewGroup2 = (ViewGroup) view5;
                                                int childCount = viewGroup2.getChildCount();
                                                int i7 = 0;
                                                while (i7 < childCount) {
                                                    int i8 = childCount;
                                                    View childAt = viewGroup2.getChildAt(i7);
                                                    int i9 = i7;
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 >= size2) {
                                                            i2 = size2;
                                                            arrayList5.add(childAt);
                                                        } else {
                                                            i2 = size2;
                                                            if (arrayList5.get(i10) == childAt) {
                                                            }
                                                            i10++;
                                                            size2 = i2;
                                                        }
                                                        break;
                                                    }
                                                    i7 = i9 + 1;
                                                    childCount = i8;
                                                    size2 = i2;
                                                }
                                            }
                                            i6++;
                                            size2 = size2;
                                        }
                                    }
                                    i = size;
                                    if (arrayList5.get(i5) == view4) {
                                    }
                                    i5++;
                                    size = i;
                                    break;
                                    break;
                                }
                                i3 = i4 + 1;
                                z3 = z4;
                                arrayList4 = arrayList6;
                                size = i;
                            }
                            z2 = z3;
                            arrayList2 = arrayList4;
                            arrayList5.add(view3);
                            arrayList3.add(view3);
                            lzl.a(r2iVar2, arrayList3);
                            if (mwVar2.c <= 0 || mwVar == null) {
                                z = false;
                            } else {
                                View view6 = (View) mwVar.get(mwVar2.f(0));
                                r2i r2iVar3 = kzfVar.l;
                                if (r2iVar3 == null || view6 == null) {
                                    c = 1;
                                } else {
                                    Rect rect3 = new Rect();
                                    int[] iArr = new int[2];
                                    view6.getLocationOnScreen(iArr);
                                    int i11 = iArr[0];
                                    c = 1;
                                    rect3.set(i11, iArr[1], view6.getWidth() + i11, view6.getHeight() + iArr[1]);
                                    r2iVar3.H(new gzf());
                                }
                                r2i r2iVar4 = kzfVar.j;
                                if (r2iVar4 == null || view6 == null) {
                                    z = false;
                                } else {
                                    Rect rect4 = new Rect();
                                    int[] iArr2 = new int[2];
                                    view6.getLocationOnScreen(iArr2);
                                    z = false;
                                    int i12 = iArr2[0];
                                    rect4.set(i12, iArr2[c], view6.getWidth() + i12, view6.getHeight() + iArr2[c]);
                                    r2iVar4.H(new gzf());
                                }
                            }
                            r2i r2iVar5 = kzfVar.k;
                            if (r2iVar5 != null) {
                                r2iVar5.H(new gzf());
                            }
                            rect = rect2;
                        } else {
                            z2 = z3;
                            arrayList2 = arrayList4;
                            z = false;
                            rect = null;
                        }
                        view2 = view2;
                        arrayList4 = arrayList2;
                        izf.a(viewGroup, new fzf(kzfVar, view2, z2, arrayList4, view3, arrayList3, rect));
                    }
                }
                r2i r2iVar6 = kzfVar.j;
                if (r2iVar6 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    if (view != null) {
                        kzf.n(arrayList7, view);
                    }
                    arrayList7.removeAll(arrayList3);
                    if (!arrayList7.isEmpty()) {
                        arrayList7.add(view3);
                        lzl.a(r2iVar6, arrayList7);
                    }
                    arrayList = arrayList7;
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    kzfVar.j = null;
                }
                r2i r2iVar7 = kzfVar.k;
                if (r2iVar7 != null) {
                    r2iVar7.b(view3);
                }
                ArrayList arrayList8 = new ArrayList();
                boolean z5 = z;
                r2iVar.a(new hzf(kzfVar.k, arrayList8, kzfVar.j, arrayList, kzfVar.l, arrayList4));
                izf.a(viewGroup, new fzf(kzfVar, view3, view2, arrayList4, arrayList8, arrayList));
                izf.a(viewGroup, new ng7(kzfVar, arrayList4, z5, 23));
                izf.a(viewGroup, new og7(kzfVar, arrayList4, z5, 25));
                ((ll5) this.g).c();
                break;
            default:
                r2i r2iVar8 = (r2i) this.d;
                ViewGroup viewGroup3 = (ViewGroup) this.c;
                t2i t2iVar = (t2i) this.h;
                if (!t2iVar.d) {
                    x2i.a(r2iVar8, viewGroup3);
                    t2iVar.k((ViewGroup) this.c, (View) this.e, (View) this.f, r2iVar8, this.b);
                    viewGroup3.post((rda) this.g);
                }
                break;
        }
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(ip4 ip4Var) {
        this.g = ip4Var;
    }

    public void f(boolean z) {
        this.b = z;
    }

    public void g(String str) {
        this.c = str;
    }

    public ll5(rai raiVar, fpi fpiVar, CidLogger cidLogger, xt1 xt1Var) {
        this.a = 0;
        this.h = null;
        this.b = false;
        this.c = raiVar;
        this.d = fpiVar;
        this.e = cidLogger;
        this.g = new mb(2, this);
        this.f = xt1Var;
    }

    public ll5(WeakReference weakReference) {
        this.a = 1;
        this.c = weakReference;
        this.d = h9c.h;
        this.g = new vn2(3, this);
        this.h = new k8c(this);
    }

    public /* synthetic */ ll5(t2i t2iVar, ViewGroup viewGroup, Object obj, View view, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.h = t2iVar;
        this.c = viewGroup;
        this.d = obj;
        this.e = view;
        this.f = obj2;
        this.b = z;
        this.g = obj3;
    }
}
