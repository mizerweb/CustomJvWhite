package defpackage;

import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class cfe {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public a g;
    public final /* synthetic */ RecyclerView h;

    public cfe(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(lfe lfeVar, boolean z) {
        RecyclerView.m(lfeVar);
        View view = lfeVar.a;
        RecyclerView recyclerView = this.h;
        nfe nfeVar = recyclerView.N1;
        if (nfeVar != null) {
            mfe mfeVar = nfeVar.e;
            i7j.l(view, mfeVar != null ? (l4) mfeVar.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ore.m();
                return;
            }
            nee neeVar = recyclerView.m;
            if (neeVar != null) {
                neeVar.B(lfeVar);
            }
            if (recyclerView.G1 != null) {
                recyclerView.g.x(lfeVar);
            }
            if (RecyclerView.a2) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + lfeVar);
            }
        }
        lfeVar.s = null;
        lfeVar.r = null;
        c().putRecycledView(lfeVar);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        hfe hfeVar = recyclerView.G1;
        if (i >= 0 && i < hfeVar.b()) {
            return !hfeVar.h ? i : recyclerView.e.o(i, 0);
        }
        StringBuilder sbY = zo5.y(i, "invalid position ", ". State item count is ");
        sbY.append(hfeVar.b());
        sbY.append(recyclerView.D());
        throw new IndexOutOfBoundsException(sbY.toString());
    }

    public final a c() {
        if (this.g == null) {
            this.g = new a();
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return k(i, BuildConfig.MAX_TIME_TO_UPLOAD).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        nee neeVar;
        a aVar = this.g;
        if (aVar == null || (neeVar = (recyclerView = this.h).m) == null || !recyclerView.s) {
            return;
        }
        aVar.attachForPoolingContainer(neeVar);
    }

    public final void f() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            g(size);
        }
        this.c.clear();
        if (RecyclerView.f2) {
            nk5 nk5Var = this.h.F1;
            int[] iArr = (int[]) nk5Var.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            nk5Var.c = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.a2) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        lfe lfeVar = (lfe) this.c.get(i);
        if (RecyclerView.a2) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + lfeVar);
        }
        a(lfeVar, true);
        this.c.remove(i);
    }

    public final void h(View view) {
        lfe lfeVarT = RecyclerView.T(view);
        boolean zU = lfeVarT.u();
        RecyclerView recyclerView = this.h;
        if (zU) {
            recyclerView.removeDetachedView(view, false);
        }
        if (lfeVarT.t()) {
            lfeVarT.n.l(lfeVarT);
        } else if (lfeVarT.A()) {
            lfeVarT.j &= -33;
        }
        i(lfeVarT);
        if (recyclerView.o1 == null || lfeVarT.r()) {
            return;
        }
        recyclerView.o1.d(lfeVarT);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e4 A[LOOP:2: B:64:0x00d7->B:68:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00e7 A[EDGE_INSN: B:93:0x00e7->B:69:0x00e7 BREAK  A[LOOP:1: B:60:0x00c0->B:67:0x00e1, LOOP_LABEL: LOOP:1: B:60:0x00c0->B:67:0x00e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e7 A[EDGE_INSN: B:95:0x00e7->B:69:0x00e7 BREAK  A[LOOP:1: B:60:0x00c0->B:67:0x00e1], SYNTHETIC] */
    public final void i(lfe lfeVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.h;
        nk5 nk5Var = recyclerView.F1;
        boolean zT = lfeVar.t();
        View view = lfeVar.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zT || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(lfeVar.t());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.D());
            throw new IllegalArgumentException(sb.toString());
        }
        if (lfeVar.u()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(lfeVar);
            c.m(sb2, recyclerView.D());
            return;
        }
        if (lfeVar.z()) {
            ore.p("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.D()));
            return;
        }
        if ((lfeVar.j & 16) == 0) {
            WeakHashMap weakHashMap = i7j.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        nee neeVar = recyclerView.m;
        boolean z5 = neeVar != null && z && neeVar.y(lfeVar);
        if (RecyclerView.Z1 && this.c.contains(lfeVar)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(lfeVar);
            c.m(sb3, recyclerView.D());
            return;
        }
        if (z5 || lfeVar.r()) {
            if (this.f <= 0 || (lfeVar.j & 526) != 0) {
                z2 = false;
            } else {
                int size = this.c.size();
                if (size >= this.f && size > 0) {
                    g(0);
                    size--;
                }
                if (RecyclerView.f2 && size > 0) {
                    int i5 = lfeVar.c;
                    if (((int[]) nk5Var.d) != null) {
                        int i6 = nk5Var.c * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((lfe) this.c.get(i)).c;
                                    if (((int[]) nk5Var.d) != null) {
                                        break;
                                    }
                                    i3 = nk5Var.c * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) nk5Var.d)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) nk5Var.d)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((lfe) this.c.get(i)).c;
                            if (((int[]) nk5Var.d) != null) {
                                break;
                                break;
                            }
                            i3 = nk5Var.c * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) nk5Var.d)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                this.c.add(size, lfeVar);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(lfeVar, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.a2) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.D()));
            }
            z4 = false;
        }
        recyclerView.g.x(lfeVar);
        if (z3 || z4 || !z) {
            return;
        }
        rx8.l(view);
        lfeVar.s = null;
        lfeVar.r = null;
    }

    public final void j(View view) {
        see seeVar;
        lfe lfeVarT = RecyclerView.T(view);
        int i = lfeVarT.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && lfeVarT.v() && (seeVar = recyclerView.o1) != null) {
            rb5 rb5Var = (rb5) seeVar;
            if (lfeVarT.n().isEmpty() && rb5Var.g && !lfeVarT.q()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                lfeVarT.n = this;
                lfeVarT.o = true;
                this.b.add(lfeVarT);
                return;
            }
        }
        if (lfeVarT.q() && !lfeVarT.s() && !recyclerView.m.b) {
            ore.p("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.D()));
            return;
        }
        lfeVarT.n = this;
        lfeVarT.o = false;
        this.a.add(lfeVarT);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:127:0x0203  */
    /* JADX WARN: Code duplicated, block: B:129:0x020d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0218  */
    /* JADX WARN: Code duplicated, block: B:132:0x021e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0229  */
    /* JADX WARN: Code duplicated, block: B:138:0x0248  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:218:0x03da  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:226:0x0407  */
    /* JADX WARN: Code duplicated, block: B:228:0x040d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0425  */
    /* JADX WARN: Code duplicated, block: B:244:0x0455  */
    /* JADX WARN: Code duplicated, block: B:247:0x0464  */
    /* JADX WARN: Code duplicated, block: B:249:0x046a  */
    /* JADX WARN: Code duplicated, block: B:250:0x0478  */
    /* JADX WARN: Code duplicated, block: B:253:0x0480  */
    /* JADX WARN: Code duplicated, block: B:256:0x0493  */
    /* JADX WARN: Code duplicated, block: B:278:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:281:0x04da  */
    /* JADX WARN: Code duplicated, block: B:285:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:286:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:288:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:289:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:292:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:294:0x0508  */
    /* JADX WARN: Code duplicated, block: B:306:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007d A[EDGE_INSN: B:35:0x007d->B:36:0x007e BREAK  A[LOOP:0: B:14:0x0025->B:20:0x003f]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x0106  */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137 A[EDGE_INSN: B:81:0x0137->B:101:0x01ae BREAK  A[LOOP:1: B:43:0x008f->B:56:0x00bb]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:86:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x016c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final lfe k(int i, long j) {
        lfe lfeVarW;
        int i2;
        int i3;
        long j2;
        lfe lfeVar;
        View view;
        boolean z;
        int iO;
        long nanoTime;
        int i4;
        AccessibilityManager accessibilityManager;
        int i5;
        int i6;
        ViewGroup.LayoutParams layoutParams;
        wee weeVar;
        boolean z2;
        int i7;
        int iO2;
        int i8;
        RecyclerView recyclerViewJ;
        int size;
        int i9;
        ArrayList arrayList;
        int size2;
        int i10;
        View view2;
        int size3;
        int i11;
        lfe lfeVar2;
        vyh vyhVar;
        xp3 xp3Var;
        int iIndexOfChild;
        xp3 xp3Var2;
        int iIndexOfChild2;
        int iB;
        lfe lfeVarT;
        int i12;
        boolean z3;
        int size4;
        int iO3;
        RecyclerView recyclerView = this.h;
        hfe hfeVar = recyclerView.G1;
        if (i < 0 || i >= hfeVar.b()) {
            StringBuilder sbP = qv1.p("Invalid item position ", i, "(", i, "). Item count:");
            sbP.append(hfeVar.b());
            sbP.append(recyclerView.D());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        int i13 = 1;
        if (hfeVar.h) {
            ArrayList arrayList2 = this.b;
            if (arrayList2 != null && (size4 = arrayList2.size()) != 0) {
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        if (recyclerView.m.b && (iO3 = recyclerView.e.o(i, 0)) > 0 && iO3 < recyclerView.m.l()) {
                            long jM = recyclerView.m.m(iO3);
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size4) {
                                    lfeVarW = null;
                                    break;
                                }
                                lfe lfeVar3 = (lfe) this.b.get(i15);
                                if (!lfeVar3.A() && lfeVar3.e == jM) {
                                    lfeVar3.j(32);
                                    lfeVarW = lfeVar3;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            lfeVarW = null;
                            break;
                        }
                    } else {
                        lfeVarW = (lfe) this.b.get(i14);
                        if (!lfeVarW.A() && lfeVarW.m() == i) {
                            lfeVarW.j(32);
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                lfeVarW = null;
                break;
            }
            if (lfeVarW != null) {
                i2 = 1;
            }
            if (lfeVarW == null) {
                size = this.a.size();
                i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        arrayList = (ArrayList) recyclerView.f.e;
                        size2 = arrayList.size();
                        i10 = 0;
                        while (true) {
                            if (i10 < size2) {
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList.get(i10);
                            lfeVarT = RecyclerView.T(view2);
                            if (lfeVarT.m() != i && !lfeVarT.q() && !lfeVarT.s()) {
                                break;
                            }
                            i10++;
                        }
                        if (view2 != null) {
                            size3 = this.c.size();
                            i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    lfeVarW = null;
                                    break;
                                }
                                lfeVar2 = (lfe) this.c.get(i11);
                                if (lfeVar2.q() && lfeVar2.m() == i && !lfeVar2.o()) {
                                    this.c.remove(i11);
                                    if (RecyclerView.a2) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + lfeVar2);
                                    }
                                } else {
                                    i11++;
                                }
                            }
                        } else {
                            lfeVarW = RecyclerView.T(view2);
                            vyhVar = recyclerView.f;
                            xp3Var = (xp3) vyhVar.d;
                            iIndexOfChild = ((RecyclerView) ((p3c) vyhVar.c).b).indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                qr7.y(view2, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (xp3Var.d(iIndexOfChild)) {
                                c.g(view2, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            xp3Var.a(iIndexOfChild);
                            vyhVar.L(view2);
                            vyh vyhVar2 = recyclerView.f;
                            xp3Var2 = (xp3) vyhVar2.d;
                            iIndexOfChild2 = ((RecyclerView) ((p3c) vyhVar2.c).b).indexOfChild(view2);
                            if (iIndexOfChild2 == -1 && !xp3Var2.d(iIndexOfChild2)) {
                                iB = iIndexOfChild2 - xp3Var2.b(iIndexOfChild2);
                            } else {
                                iB = -1;
                            }
                            if (iB != -1) {
                                recyclerView.f.o(iB);
                                j(view2);
                                lfeVarW.j(8224);
                                break;
                            }
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(lfeVarW);
                            qr7.m(sb, recyclerView.D());
                            return null;
                        }
                    } else {
                        lfeVar2 = (lfe) this.a.get(i9);
                        if (!lfeVar2.A() || lfeVar2.m() != i || lfeVar2.q() || (!hfeVar.h && lfeVar2.s())) {
                            i9++;
                        } else {
                            lfeVar2.j(32);
                        }
                    }
                    lfeVarW = lfeVar2;
                    break;
                }
                if (lfeVarW != null) {
                    if (!lfeVarW.s()) {
                        i12 = lfeVarW.c;
                        if (i12 >= 0 || i12 >= recyclerView.m.l()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + lfeVarW + recyclerView.D());
                        }
                        if (hfeVar.h || recyclerView.m.n(lfeVarW.c) == lfeVarW.f) {
                            nee neeVar = recyclerView.m;
                            if (!neeVar.b || lfeVarW.e == neeVar.m(lfeVarW.c)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        if (!RecyclerView.Z1 && !hfeVar.h) {
                            ore.k("should not receive a removed view unless it is pre layout".concat(recyclerView.D()));
                            return null;
                        }
                        z3 = hfeVar.h;
                    }
                    if (z3) {
                        i2 = 1;
                    } else {
                        lfeVarW.j(4);
                        if (lfeVarW.t()) {
                            recyclerView.removeDetachedView(lfeVarW.a, false);
                            lfeVarW.n.l(lfeVarW);
                        } else if (lfeVarW.A()) {
                            lfeVarW.j &= -33;
                        }
                        i(lfeVarW);
                        lfeVarW = null;
                    }
                }
            }
            if (lfeVarW == null) {
                iO2 = recyclerView.e.o(i, 0);
                if (iO2 >= 0 || iO2 >= recyclerView.m.l()) {
                    StringBuilder sbP2 = qv1.p("Inconsistency detected. Invalid item position ", i, "(offset:", iO2, ").state:");
                    sbP2.append(hfeVar.b());
                    sbP2.append(recyclerView.D());
                    throw new IndexOutOfBoundsException(sbP2.toString());
                }
                int iN = recyclerView.m.n(iO2);
                nee neeVar2 = recyclerView.m;
                j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                if (neeVar2.b) {
                    long jM2 = neeVar2.m(iO2);
                    int size5 = this.a.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            i3 = i13;
                            int size6 = this.c.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    lfe lfeVar4 = (lfe) this.c.get(size6);
                                    if (lfeVar4.e != jM2 || lfeVar4.o()) {
                                        size6--;
                                    } else {
                                        if (iN == lfeVar4.f) {
                                            this.c.remove(size6);
                                            lfeVarW = lfeVar4;
                                            break;
                                        }
                                        g(size6);
                                    }
                                }
                                lfeVarW = null;
                                break;
                            }
                        }
                        lfe lfeVar5 = (lfe) this.a.get(size5);
                        i3 = i13;
                        long j3 = lfeVar5.e;
                        View view3 = lfeVar5.a;
                        if (j3 == jM2 && !lfeVar5.A()) {
                            if (iN == lfeVar5.f) {
                                lfeVar5.j(32);
                                if (lfeVar5.s() && !hfeVar.h) {
                                    lfeVar5.j = (lfeVar5.j & (-15)) | 2;
                                }
                                lfeVarW = lfeVar5;
                                break;
                            }
                            this.a.remove(size5);
                            recyclerView.removeDetachedView(view3, false);
                            lfe lfeVarT2 = RecyclerView.T(view3);
                            lfeVarT2.n = null;
                            lfeVarT2.o = false;
                            lfeVarT2.j &= -33;
                            i(lfeVarT2);
                        }
                        size5--;
                        i13 = i3;
                    }
                    if (lfeVarW != null) {
                        lfeVarW.c = iO2;
                        i2 = i3;
                    }
                } else {
                    i3 = 1;
                }
                if (lfeVarW == null) {
                    if (RecyclerView.a2) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                    }
                    lfe recycledView = c().getRecycledView(iN);
                    if (recycledView != null) {
                        recycledView.x();
                    }
                    lfeVarW = recycledView;
                }
                if (lfeVarW == null) {
                    long nanoTime2 = recyclerView.getNanoTime();
                    if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
                        i8 = iN;
                        if (!this.g.willCreateInTime(iN, nanoTime2, j)) {
                            return null;
                        }
                    } else {
                        i8 = iN;
                    }
                    nee neeVar3 = recyclerView.m;
                    neeVar3.getClass();
                    try {
                        int i16 = mwh.a;
                        Trace.beginSection("RV CreateView");
                        lfeVarW = neeVar3.w(recyclerView, i8);
                        if (lfeVarW.a.getParent() != null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        lfeVarW.f = i8;
                        Trace.endSection();
                        if (RecyclerView.f2 && (recyclerViewJ = RecyclerView.J(lfeVarW.a)) != null) {
                            lfeVarW.b = new WeakReference(recyclerViewJ);
                        }
                        this.g.factorInCreateTime(i8, recyclerView.getNanoTime() - nanoTime2);
                        if (RecyclerView.a2) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    } catch (Throwable th) {
                        int i17 = mwh.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            } else {
                i3 = 1;
                j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
            }
            lfeVar = lfeVarW;
            view = lfeVar.a;
            if (i2 != 0 && !hfeVar.h) {
                i7 = lfeVar.j;
                if ((i7 & 8192) != 0) {
                    lfeVar.j = i7 & (-8193);
                    if (hfeVar.k) {
                        see.a(lfeVar);
                        see seeVar = recyclerView.o1;
                        lfeVar.n();
                        seeVar.getClass();
                        bs0 bs0Var = new bs0(22);
                        bs0Var.m(lfeVar);
                        recyclerView.k0(lfeVar, bs0Var);
                    }
                }
            }
            if (hfeVar.h || !lfeVar.p()) {
                if (lfeVar.p() || (lfeVar.j & 2) != 0 || lfeVar.q()) {
                    if (!RecyclerView.Z1 && lfeVar.s()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(lfeVar);
                        qr7.m(sb2, recyclerView.D());
                        return null;
                    }
                    l4 l4Var = null;
                    z = false;
                    iO = recyclerView.e.o(i, 0);
                    lfeVar.s = null;
                    lfeVar.r = recyclerView;
                    int i18 = lfeVar.f;
                    nanoTime = recyclerView.getNanoTime();
                    if (j != j2 || this.g.willBindInTime(i18, nanoTime, j)) {
                        if (lfeVar.u()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            i4 = i3;
                        } else {
                            i4 = 0;
                        }
                        recyclerView.m.j(lfeVar, iO);
                        if (i4 != 0) {
                            recyclerView.detachViewFromParent(view);
                        }
                        this.g.factorInBindTime(lfeVar.f, recyclerView.getNanoTime() - nanoTime);
                        accessibilityManager = recyclerView.B;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            WeakHashMap weakHashMap = i7j.a;
                            if (view.getImportantForAccessibility() == 0) {
                                i5 = i3;
                                view.setImportantForAccessibility(i5);
                            } else {
                                i5 = i3;
                            }
                            nfe nfeVar = recyclerView.N1;
                            if (nfeVar != null) {
                                mfe mfeVar = nfeVar.e;
                                if (mfeVar != null) {
                                    View.AccessibilityDelegate accessibilityDelegateC = i7j.c(view);
                                    if (accessibilityDelegateC != null) {
                                        l4Var = accessibilityDelegateC instanceof k4 ? ((k4) accessibilityDelegateC).a : new l4(accessibilityDelegateC);
                                    }
                                    if (l4Var != null && l4Var != mfeVar) {
                                        mfeVar.e.put(view, l4Var);
                                    }
                                }
                                i7j.l(view, mfeVar);
                            }
                        } else {
                            i5 = i3;
                        }
                        if (hfeVar.h) {
                            lfeVar.g = i;
                        }
                        i6 = i5;
                    } else {
                        i6 = 0;
                        i5 = i3;
                    }
                }
                layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    weeVar = (wee) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(weeVar);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    weeVar = (wee) layoutParams;
                } else {
                    weeVar = (wee) recyclerView.generateLayoutParams(layoutParams);
                    view.setLayoutParams(weeVar);
                }
                weeVar.a = lfeVar;
                if (i2 != 0 || i6 == 0) {
                    z2 = z;
                } else {
                    z2 = i5;
                }
                weeVar.d = z2;
                return lfeVar;
            }
            lfeVar.g = i;
            i5 = i3;
            i6 = 0;
            z = false;
            layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                weeVar = (wee) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(weeVar);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                weeVar = (wee) recyclerView.generateLayoutParams(layoutParams);
                view.setLayoutParams(weeVar);
            } else {
                weeVar = (wee) layoutParams;
            }
            weeVar.a = lfeVar;
            if (i2 != 0) {
                z2 = z;
            } else {
                z2 = z;
            }
            weeVar.d = z2;
            return lfeVar;
        }
        lfeVarW = null;
        i2 = 0;
        if (lfeVarW == null) {
            size = this.a.size();
            i9 = 0;
            while (true) {
                if (i9 >= size) {
                    lfeVar2 = (lfe) this.a.get(i9);
                    if (lfeVar2.A()) {
                    }
                    i9++;
                } else {
                    arrayList = (ArrayList) recyclerView.f.e;
                    size2 = arrayList.size();
                    i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            view2 = null;
                            break;
                        }
                        view2 = (View) arrayList.get(i10);
                        lfeVarT = RecyclerView.T(view2);
                        if (lfeVarT.m() != i) {
                        }
                        i10++;
                    }
                    if (view2 != null) {
                        size3 = this.c.size();
                        i11 = 0;
                        while (true) {
                            if (i11 < size3) {
                                lfeVarW = null;
                                break;
                            }
                            lfeVar2 = (lfe) this.c.get(i11);
                            if (lfeVar2.q()) {
                            }
                            i11++;
                        }
                    } else {
                        lfeVarW = RecyclerView.T(view2);
                        vyhVar = recyclerView.f;
                        xp3Var = (xp3) vyhVar.d;
                        iIndexOfChild = ((RecyclerView) ((p3c) vyhVar.c).b).indexOfChild(view2);
                        if (iIndexOfChild >= 0) {
                            qr7.y(view2, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (xp3Var.d(iIndexOfChild)) {
                            c.g(view2, "trying to unhide a view that was not hidden");
                            return null;
                        }
                        xp3Var.a(iIndexOfChild);
                        vyhVar.L(view2);
                        vyh vyhVar3 = recyclerView.f;
                        xp3Var2 = (xp3) vyhVar3.d;
                        iIndexOfChild2 = ((RecyclerView) ((p3c) vyhVar3.c).b).indexOfChild(view2);
                        if (iIndexOfChild2 == -1) {
                            iB = -1;
                        } else {
                            iB = iIndexOfChild2 - xp3Var2.b(iIndexOfChild2);
                        }
                        if (iB != -1) {
                            recyclerView.f.o(iB);
                            j(view2);
                            lfeVarW.j(8224);
                            break;
                        }
                        StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb3.append(lfeVarW);
                        qr7.m(sb3, recyclerView.D());
                        return null;
                    }
                    if (lfeVarW != null) {
                        if (!lfeVarW.s()) {
                            i12 = lfeVarW.c;
                            if (i12 >= 0) {
                            }
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + lfeVarW + recyclerView.D());
                        }
                        if (!RecyclerView.Z1) {
                        }
                        z3 = hfeVar.h;
                        if (z3) {
                            lfeVarW.j(4);
                            if (lfeVarW.t()) {
                                recyclerView.removeDetachedView(lfeVarW.a, false);
                                lfeVarW.n.l(lfeVarW);
                            } else if (lfeVarW.A()) {
                                lfeVarW.j &= -33;
                            }
                            i(lfeVarW);
                            lfeVarW = null;
                        } else {
                            i2 = 1;
                        }
                    }
                }
                lfeVarW = lfeVar2;
                if (lfeVarW != null) {
                    if (!lfeVarW.s()) {
                        i12 = lfeVarW.c;
                        if (i12 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + lfeVarW + recyclerView.D());
                    }
                    if (!RecyclerView.Z1) {
                    }
                    z3 = hfeVar.h;
                    if (z3) {
                        lfeVarW.j(4);
                        if (lfeVarW.t()) {
                            recyclerView.removeDetachedView(lfeVarW.a, false);
                            lfeVarW.n.l(lfeVarW);
                        } else if (lfeVarW.A()) {
                            lfeVarW.j &= -33;
                        }
                        i(lfeVarW);
                        lfeVarW = null;
                    } else {
                        i2 = 1;
                    }
                }
            }
        }
        if (lfeVarW == null) {
            iO2 = recyclerView.e.o(i, 0);
            if (iO2 >= 0) {
            }
            StringBuilder sbP3 = qv1.p("Inconsistency detected. Invalid item position ", i, "(offset:", iO2, ").state:");
            sbP3.append(hfeVar.b());
            sbP3.append(recyclerView.D());
            throw new IndexOutOfBoundsException(sbP3.toString());
        }
        i3 = 1;
        j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
        lfeVar = lfeVarW;
        view = lfeVar.a;
        if (i2 != 0) {
            i7 = lfeVar.j;
            if ((i7 & 8192) != 0) {
                lfeVar.j = i7 & (-8193);
                if (hfeVar.k) {
                    see.a(lfeVar);
                    see seeVar2 = recyclerView.o1;
                    lfeVar.n();
                    seeVar2.getClass();
                    bs0 bs0Var2 = new bs0(22);
                    bs0Var2.m(lfeVar);
                    recyclerView.k0(lfeVar, bs0Var2);
                }
            }
        }
        if (hfeVar.h) {
            if (lfeVar.p()) {
            }
            if (!RecyclerView.Z1) {
            }
            l4 l4Var2 = null;
            z = false;
            iO = recyclerView.e.o(i, 0);
            lfeVar.s = null;
            lfeVar.r = recyclerView;
            int i19 = lfeVar.f;
            nanoTime = recyclerView.getNanoTime();
            if (j != j2) {
                if (lfeVar.u()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                recyclerView.m.j(lfeVar, iO);
                if (i4 != 0) {
                    recyclerView.detachViewFromParent(view);
                }
                this.g.factorInBindTime(lfeVar.f, recyclerView.getNanoTime() - nanoTime);
                accessibilityManager = recyclerView.B;
                if (accessibilityManager == null) {
                    i5 = i3;
                } else {
                    i5 = i3;
                }
                if (hfeVar.h) {
                    lfeVar.g = i;
                }
                i6 = i5;
            } else {
                if (lfeVar.u()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                recyclerView.m.j(lfeVar, iO);
                if (i4 != 0) {
                    recyclerView.detachViewFromParent(view);
                }
                this.g.factorInBindTime(lfeVar.f, recyclerView.getNanoTime() - nanoTime);
                accessibilityManager = recyclerView.B;
                if (accessibilityManager == null) {
                    i5 = i3;
                } else {
                    i5 = i3;
                }
                if (hfeVar.h) {
                    lfeVar.g = i;
                }
                i6 = i5;
            }
        } else {
            if (lfeVar.p()) {
            }
            if (!RecyclerView.Z1) {
            }
            l4 l4Var3 = null;
            z = false;
            iO = recyclerView.e.o(i, 0);
            lfeVar.s = null;
            lfeVar.r = recyclerView;
            int i110 = lfeVar.f;
            nanoTime = recyclerView.getNanoTime();
            if (j != j2) {
                if (lfeVar.u()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                recyclerView.m.j(lfeVar, iO);
                if (i4 != 0) {
                    recyclerView.detachViewFromParent(view);
                }
                this.g.factorInBindTime(lfeVar.f, recyclerView.getNanoTime() - nanoTime);
                accessibilityManager = recyclerView.B;
                if (accessibilityManager == null) {
                    i5 = i3;
                } else {
                    i5 = i3;
                }
                if (hfeVar.h) {
                    lfeVar.g = i;
                }
                i6 = i5;
            } else {
                if (lfeVar.u()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                recyclerView.m.j(lfeVar, iO);
                if (i4 != 0) {
                    recyclerView.detachViewFromParent(view);
                }
                this.g.factorInBindTime(lfeVar.f, recyclerView.getNanoTime() - nanoTime);
                accessibilityManager = recyclerView.B;
                if (accessibilityManager == null) {
                    i5 = i3;
                } else {
                    i5 = i3;
                }
                if (hfeVar.h) {
                    lfeVar.g = i;
                }
                i6 = i5;
            }
        }
        layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            weeVar = (wee) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(weeVar);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            weeVar = (wee) recyclerView.generateLayoutParams(layoutParams);
            view.setLayoutParams(weeVar);
        } else {
            weeVar = (wee) layoutParams;
        }
        weeVar.a = lfeVar;
        if (i2 != 0) {
            z2 = z;
        } else {
            z2 = z;
        }
        weeVar.d = z2;
        return lfeVar;
    }

    public final void l(lfe lfeVar) {
        if (lfeVar.o) {
            this.b.remove(lfeVar);
        } else {
            this.a.remove(lfeVar);
        }
        lfeVar.n = null;
        lfeVar.o = false;
        lfeVar.j &= -33;
    }

    public final void m() {
        vee veeVar = this.h.n;
        this.f = this.e + (veeVar != null ? veeVar.j : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
            g(size);
        }
    }
}
