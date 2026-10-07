package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import defpackage.ab7;
import defpackage.b1f;
import defpackage.b8j;
import defpackage.bb7;
import defpackage.c0a;
import defpackage.c46;
import defpackage.cb7;
import defpackage.e74;
import defpackage.eb7;
import defpackage.gp0;
import defpackage.hb7;
import defpackage.ib7;
import defpackage.kb7;
import defpackage.khb;
import defpackage.ki3;
import defpackage.lb7;
import defpackage.ltb;
import defpackage.mb7;
import defpackage.n09;
import defpackage.nb7;
import defpackage.np0;
import defpackage.ore;
import defpackage.p3c;
import defpackage.qe7;
import defpackage.qr7;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.sr3;
import defpackage.ta7;
import defpackage.tl0;
import defpackage.ug4;
import defpackage.ul0;
import defpackage.v2a;
import defpackage.v56;
import defpackage.v9;
import defpackage.va7;
import defpackage.vd5;
import defpackage.ve9;
import defpackage.vl0;
import defpackage.vq4;
import defpackage.w4;
import defpackage.x7b;
import defpackage.xa7;
import defpackage.y64;
import defpackage.ya7;
import defpackage.za7;
import defpackage.zfe;
import defpackage.zn;
import defpackage.zo5;
import defpackage.zv4;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public final gp0 A;
    public c46 B;
    public c46 C;
    public c46 D;
    public ArrayDeque E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public FragmentManagerViewModel N;
    public final zn O;
    public boolean b;
    public ArrayList e;
    public ltb g;
    public final ArrayList m;
    public final v2a n;
    public final CopyOnWriteArrayList o;
    public final za7 p;
    public final za7 q;
    public final za7 r;
    public final za7 s;
    public final ab7 t;
    public int u;
    public va7 v;
    public qe7 w;
    public a x;
    public a y;
    public final bb7 z;
    public final ArrayList a = new ArrayList();
    public final f c = new f();
    public ArrayList d = new ArrayList();
    public final ya7 f = new ya7(this);
    public tl0 h = null;
    public final vq4 i = new vq4(3, this);
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [za7] */
    /* JADX WARN: Type inference failed for: r0v16, types: [za7] */
    /* JADX WARN: Type inference failed for: r0v17, types: [za7] */
    /* JADX WARN: Type inference failed for: r0v18, types: [za7] */
    public c() {
        Collections.synchronizedMap(new HashMap());
        this.m = new ArrayList();
        this.n = new v2a(this);
        this.o = new CopyOnWriteArrayList();
        final int i = 0;
        this.p = new ug4(this) { // from class: za7
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ug4
            public final void accept(Object obj) {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        if (cVar.M()) {
                            cVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.M() && num.intValue() == 80) {
                            cVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        i6b i6bVar = (i6b) obj;
                        if (cVar.M()) {
                            i6bVar.getClass();
                            cVar.n(false);
                        }
                        break;
                    default:
                        fzc fzcVar = (fzc) obj;
                        if (cVar.M()) {
                            fzcVar.getClass();
                            cVar.s(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.q = new ug4(this) { // from class: za7
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ug4
            public final void accept(Object obj) {
                int i3 = i2;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        if (cVar.M()) {
                            cVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.M() && num.intValue() == 80) {
                            cVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        i6b i6bVar = (i6b) obj;
                        if (cVar.M()) {
                            i6bVar.getClass();
                            cVar.n(false);
                        }
                        break;
                    default:
                        fzc fzcVar = (fzc) obj;
                        if (cVar.M()) {
                            fzcVar.getClass();
                            cVar.s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.r = new ug4(this) { // from class: za7
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ug4
            public final void accept(Object obj) {
                int i4 = i3;
                c cVar = this.b;
                switch (i4) {
                    case 0:
                        if (cVar.M()) {
                            cVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.M() && num.intValue() == 80) {
                            cVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        i6b i6bVar = (i6b) obj;
                        if (cVar.M()) {
                            i6bVar.getClass();
                            cVar.n(false);
                        }
                        break;
                    default:
                        fzc fzcVar = (fzc) obj;
                        if (cVar.M()) {
                            fzcVar.getClass();
                            cVar.s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.s = new ug4(this) { // from class: za7
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ug4
            public final void accept(Object obj) {
                int i5 = i4;
                c cVar = this.b;
                switch (i5) {
                    case 0:
                        if (cVar.M()) {
                            cVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.M() && num.intValue() == 80) {
                            cVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        i6b i6bVar = (i6b) obj;
                        if (cVar.M()) {
                            i6bVar.getClass();
                            cVar.n(false);
                        }
                        break;
                    default:
                        fzc fzcVar = (fzc) obj;
                        if (cVar.M()) {
                            fzcVar.getClass();
                            cVar.s(false);
                        }
                        break;
                }
            }
        };
        this.t = new ab7(this);
        this.u = -1;
        this.z = new bb7(this);
        this.A = new gp0(18);
        this.E = new ArrayDeque();
        this.O = new zn(7, this);
    }

    public static HashSet F(tl0 tl0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < tl0Var.a.size(); i++) {
            a aVar = ((nb7) tl0Var.a.get(i)).b;
            if (aVar != null && tl0Var.g) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean L(a aVar) {
        if (aVar.E && aVar.F) {
            return true;
        }
        boolean zL = false;
        for (a aVar2 : aVar.v.c.e()) {
            if (aVar2 != null) {
                zL = L(aVar2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(a aVar) {
        if (aVar == null) {
            return true;
        }
        if (aVar.F) {
            return aVar.t == null || N(aVar.w);
        }
        return false;
    }

    public static boolean O(a aVar) {
        if (aVar == null) {
            return true;
        }
        c cVar = aVar.t;
        return aVar == cVar.y && O(cVar.x);
    }

    public static void e0(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + aVar);
        }
        if (aVar.A) {
            aVar.A = false;
            aVar.X = !aVar.X;
        }
    }

    public final boolean A(boolean z) {
        boolean zA;
        ArrayList arrayList;
        z(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((eb7) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.v.i.removeCallbacks(this.O);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.v.i.removeCallbacks(this.O);
                        throw th;
                    }
                }
            }
            if (!zA) {
                h0();
                v();
                this.c.b.values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                W(this.K, this.L);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    public final void B(tl0 tl0Var, boolean z) {
        if (z && (this.v == null || this.I)) {
            return;
        }
        z(z);
        tl0Var.a(this.K, this.L);
        this.b = true;
        try {
            W(this.K, this.L);
            d();
            h0();
            v();
            this.c.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0220 A[PHI: r15
  0x0220: PHI (r15v20 int) = (r15v19 int), (r15v22 int) binds: [B:105:0x020d, B:109:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    public final void C(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        boolean z3 = ((tl0) arrayList.get(i7)).o;
        ArrayList arrayList3 = this.M;
        if (arrayList3 == null) {
            this.M = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.M;
        f fVar = this.c;
        arrayList4.addAll(fVar.f());
        a aVar = this.y;
        int i8 = i7;
        boolean z4 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z5 = z3;
                boolean z6 = z4;
                this.M.clear();
                if (!z5 && this.u >= 1) {
                    for (int i10 = i7; i10 < i2; i10++) {
                        Iterator it = ((tl0) arrayList.get(i10)).a.iterator();
                        while (it.hasNext()) {
                            a aVar2 = ((nb7) it.next()).b;
                            if (aVar2 != null && aVar2.t != null) {
                                fVar.g(g(aVar2));
                            }
                        }
                    }
                }
                int i11 = i7;
                while (i11 < i2) {
                    tl0 tl0Var = (tl0) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        tl0Var.c(-1);
                        c cVar = tl0Var.q;
                        ArrayList arrayList5 = tl0Var.a;
                        boolean z7 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            nb7 nb7Var = (nb7) arrayList5.get(size);
                            a aVar3 = nb7Var.b;
                            if (aVar3 != null) {
                                if (aVar3.K != null) {
                                    aVar3.g().a = z7;
                                }
                                int i12 = tl0Var.f;
                                int i13 = 8194;
                                int i14 = 4097;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        if (i12 != 8197) {
                                            i14 = 4099;
                                            if (i12 != 4099) {
                                                i13 = i12 != 4100 ? 0 : 8197;
                                            } else {
                                                i13 = i14;
                                            }
                                        }
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                if (aVar3.K != null || i13 != 0) {
                                    aVar3.g();
                                    aVar3.K.f = i13;
                                }
                                aVar3.g();
                                aVar3.K.getClass();
                            }
                            switch (nb7Var.a) {
                                case 1:
                                    aVar3.M(nb7Var.d, nb7Var.e, nb7Var.f, nb7Var.g);
                                    z7 = true;
                                    cVar.a0(aVar3, true);
                                    cVar.V(aVar3);
                                    break;
                                case 2:
                                default:
                                    qr7.p(nb7Var.a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    aVar3.M(nb7Var.d, nb7Var.e, nb7Var.f, nb7Var.g);
                                    cVar.a(aVar3);
                                    z7 = true;
                                    break;
                                case 4:
                                    aVar3.M(nb7Var.d, nb7Var.e, nb7Var.f, nb7Var.g);
                                    cVar.getClass();
                                    e0(aVar3);
                                    z7 = true;
                                    break;
                                case 5:
                                    aVar3.M(nb7Var.d, nb7Var.e, nb7Var.f, nb7Var.g);
                                    cVar.a0(aVar3, true);
                                    cVar.J(aVar3);
                                    z7 = true;
                                    break;
                                case 6:
                                    aVar3.M(nb7Var.d, nb7Var.e, nb7Var.f, nb7Var.g);
                                    cVar.c(aVar3);
                                    z7 = true;
                                    break;
                                case 7:
                                    aVar3.M(nb7Var.d, nb7Var.e, nb7Var.f, nb7Var.g);
                                    cVar.a0(aVar3, true);
                                    cVar.h(aVar3);
                                    z7 = true;
                                    break;
                                case 8:
                                    cVar.c0(null);
                                    z7 = true;
                                    break;
                                case 9:
                                    cVar.c0(aVar3);
                                    z7 = true;
                                    break;
                                case 10:
                                    cVar.b0(aVar3, nb7Var.h);
                                    z7 = true;
                                    break;
                            }
                        }
                    } else {
                        tl0Var.c(1);
                        c cVar2 = tl0Var.q;
                        ArrayList arrayList6 = tl0Var.a;
                        int size2 = arrayList6.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            nb7 nb7Var2 = (nb7) arrayList6.get(i15);
                            a aVar4 = nb7Var2.b;
                            if (aVar4 != null) {
                                if (aVar4.K != null) {
                                    aVar4.g().a = false;
                                }
                                int i16 = tl0Var.f;
                                if (aVar4.K != null || i16 != 0) {
                                    aVar4.g();
                                    aVar4.K.f = i16;
                                }
                                aVar4.g();
                                aVar4.K.getClass();
                            }
                            switch (nb7Var2.a) {
                                case 1:
                                    aVar4.M(nb7Var2.d, nb7Var2.e, nb7Var2.f, nb7Var2.g);
                                    cVar2.a0(aVar4, false);
                                    cVar2.a(aVar4);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 2:
                                default:
                                    qr7.p(nb7Var2.a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    aVar4.M(nb7Var2.d, nb7Var2.e, nb7Var2.f, nb7Var2.g);
                                    cVar2.V(aVar4);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 4:
                                    aVar4.M(nb7Var2.d, nb7Var2.e, nb7Var2.f, nb7Var2.g);
                                    cVar2.J(aVar4);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 5:
                                    aVar4.M(nb7Var2.d, nb7Var2.e, nb7Var2.f, nb7Var2.g);
                                    cVar2.a0(aVar4, false);
                                    e0(aVar4);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 6:
                                    aVar4.M(nb7Var2.d, nb7Var2.e, nb7Var2.f, nb7Var2.g);
                                    cVar2.h(aVar4);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 7:
                                    aVar4.M(nb7Var2.d, nb7Var2.e, nb7Var2.f, nb7Var2.g);
                                    cVar2.a0(aVar4, false);
                                    cVar2.c(aVar4);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 8:
                                    cVar2.c0(aVar4);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 9:
                                    cVar2.c0(null);
                                    i15++;
                                    i11 = i11;
                                    break;
                                case 10:
                                    cVar2.b0(aVar4, nb7Var2.i);
                                    i15++;
                                    i11 = i11;
                                    break;
                            }
                        }
                    }
                    i11++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList7 = this.m;
                if (z6 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(F((tl0) it2.next()));
                    }
                    if (this.h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                ore.m();
                                return;
                            }
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw null;
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            if (it5.next() != null) {
                                ore.m();
                                return;
                            }
                            Iterator it6 = linkedHashSet.iterator();
                            if (it6.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i17 = i7; i17 < i2; i17++) {
                    tl0 tl0Var2 = (tl0) arrayList.get(i17);
                    if (zBooleanValue) {
                        for (int size3 = tl0Var2.a.size() - 1; size3 >= 0; size3--) {
                            a aVar5 = ((nb7) tl0Var2.a.get(size3)).b;
                            if (aVar5 != null) {
                                g(aVar5).j();
                            }
                        }
                    } else {
                        Iterator it7 = tl0Var2.a.iterator();
                        while (it7.hasNext()) {
                            a aVar6 = ((nb7) it7.next()).b;
                            if (aVar6 != null) {
                                g(aVar6).j();
                            }
                        }
                    }
                }
                Q(this.u, true);
                for (vd5 vd5Var : f(arrayList, i7, i2)) {
                    vd5Var.n(zBooleanValue);
                    vd5Var.j();
                    vd5Var.d();
                }
                while (i7 < i2) {
                    tl0 tl0Var3 = (tl0) arrayList.get(i7);
                    if (((Boolean) arrayList2.get(i7)).booleanValue() && tl0Var3.s >= 0) {
                        tl0Var3.s = -1;
                    }
                    if (tl0Var3.p != null) {
                        for (int i18 = 0; i18 < tl0Var3.p.size(); i18++) {
                            ((Runnable) tl0Var3.p.get(i18)).run();
                        }
                        tl0Var3.p = null;
                    }
                    i7++;
                }
                if (!z6 || arrayList7.size() <= 0) {
                    return;
                }
                qt4.A(arrayList7.get(0));
                throw null;
            }
            tl0 tl0Var4 = (tl0) arrayList.get(i8);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i8)).booleanValue();
            ArrayList arrayList8 = this.M;
            if (zBooleanValue2) {
                z = z3;
                i3 = i8;
                z2 = z4;
                int i19 = 1;
                ArrayList arrayList9 = tl0Var4.a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    nb7 nb7Var3 = (nb7) arrayList9.get(size4);
                    int i20 = nb7Var3.a;
                    if (i20 == i19) {
                        arrayList8.remove(nb7Var3.b);
                    } else if (i20 != 3) {
                        switch (i20) {
                            case 6:
                                arrayList8.add(nb7Var3.b);
                                break;
                            case 7:
                                arrayList8.remove(nb7Var3.b);
                                break;
                            case 8:
                                aVar = null;
                                break;
                            case 9:
                                aVar = nb7Var3.b;
                                break;
                            case 10:
                                nb7Var3.i = nb7Var3.h;
                                break;
                        }
                    } else {
                        arrayList8.add(nb7Var3.b);
                    }
                    size4--;
                    i19 = 1;
                }
            } else {
                ArrayList arrayList10 = tl0Var4.a;
                int i21 = 0;
                while (i21 < arrayList10.size()) {
                    nb7 nb7Var4 = (nb7) arrayList10.get(i21);
                    boolean z8 = z3;
                    int i22 = nb7Var4.a;
                    if (i22 != i9) {
                        i4 = i8;
                        if (i22 != 2) {
                            if (i22 == 3 || i22 == 6) {
                                arrayList8.remove(nb7Var4.b);
                                a aVar7 = nb7Var4.b;
                                if (aVar7 == aVar) {
                                    arrayList10.add(i21, new nb7(9, aVar7));
                                    i21++;
                                    aVar = null;
                                }
                                i5 = 1;
                            } else if (i22 == 7) {
                                i5 = 1;
                            } else if (i22 == 8) {
                                arrayList10.add(i21, new nb7(9, aVar, 0));
                                nb7Var4.c = true;
                                i21++;
                                aVar = nb7Var4.b;
                            }
                            i5 = 1;
                        } else {
                            a aVar8 = nb7Var4.b;
                            int i23 = aVar8.y;
                            int size5 = arrayList8.size() - 1;
                            boolean z9 = false;
                            while (size5 >= 0) {
                                int i24 = size5;
                                a aVar9 = (a) arrayList8.get(size5);
                                boolean z10 = z4;
                                if (aVar9.y != i23) {
                                    i23 = i23;
                                } else if (aVar9 == aVar8) {
                                    i23 = i23;
                                    z9 = true;
                                } else {
                                    if (aVar9 == aVar) {
                                        i6 = 0;
                                        arrayList10.add(i21, new nb7(9, aVar9, 0));
                                        i21++;
                                        aVar = null;
                                    } else {
                                        i6 = 0;
                                    }
                                    nb7 nb7Var5 = new nb7(3, aVar9, i6);
                                    nb7Var5.d = nb7Var4.d;
                                    nb7Var5.f = nb7Var4.f;
                                    nb7Var5.e = nb7Var4.e;
                                    nb7Var5.g = nb7Var4.g;
                                    arrayList10.add(i21, nb7Var5);
                                    arrayList8.remove(aVar9);
                                    i21++;
                                    aVar = aVar;
                                }
                                size5 = i24 - 1;
                                i23 = i23;
                                z4 = z10;
                            }
                            z4 = z4;
                            i5 = 1;
                            if (z9) {
                                arrayList10.remove(i21);
                                i21--;
                            } else {
                                nb7Var4.a = 1;
                                nb7Var4.c = true;
                                arrayList8.add(aVar8);
                            }
                        }
                        i21 += i5;
                        i9 = i5;
                        z3 = z8;
                        i8 = i4;
                        z4 = z4;
                    } else {
                        i4 = i8;
                        i5 = i9;
                    }
                    z4 = z4;
                    arrayList8.add(nb7Var4.b);
                    i21 += i5;
                    i9 = i5;
                    z3 = z8;
                    i8 = i4;
                    z4 = z4;
                }
                z = z3;
                i3 = i8;
                z2 = z4;
            }
            z4 = z2 || tl0Var4.g;
            i8 = i3 + 1;
            z3 = z;
        }
    }

    public final a D(int i) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && aVar.x == i) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar2.x == i) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final a E(String str) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && str.equals(aVar.z)) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (str.equals(aVar2.z)) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup G(a aVar) {
        ViewGroup viewGroup = aVar.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (aVar.y <= 0 || !this.w.B()) {
            return null;
        }
        View viewA = this.w.A(aVar.y);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    public final bb7 H() {
        a aVar = this.x;
        return aVar != null ? aVar.t.H() : this.z;
    }

    public final gp0 I() {
        a aVar = this.x;
        return aVar != null ? aVar.t.I() : this.A;
    }

    public final void J(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + aVar);
        }
        if (aVar.A) {
            return;
        }
        aVar.A = true;
        aVar.X = true ^ aVar.X;
        d0(aVar);
    }

    public final boolean M() {
        a aVar = this.x;
        if (aVar == null) {
            return true;
        }
        return aVar.p() && this.x.l().M();
    }

    public final boolean P() {
        return this.G || this.H;
    }

    public final void Q(int i, boolean z) {
        va7 va7Var;
        if (this.v == null && i != -1) {
            ore.k("No activity");
            return;
        }
        if (z || i != this.u) {
            this.u = i;
            f fVar = this.c;
            HashMap map = fVar.b;
            Iterator it = fVar.a.iterator();
            while (it.hasNext()) {
                e eVar = (e) map.get(((a) it.next()).e);
                if (eVar != null) {
                    eVar.j();
                }
            }
            for (e eVar2 : map.values()) {
                if (eVar2 != null) {
                    eVar2.j();
                    a aVar = eVar2.c;
                    if (aVar.l && !aVar.r()) {
                        fVar.h(eVar2);
                    }
                }
            }
            f0();
            if (this.F && (va7Var = this.v) != null && this.u == 7) {
                va7Var.k.invalidateOptionsMenu();
                this.F = false;
            }
        }
    }

    public final void R() {
        if (this.v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.g = false;
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.v.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i, int i2) {
        A(false);
        z(true);
        a aVar = this.y;
        if (aVar != null && i < 0 && aVar.i().S()) {
            return true;
        }
        boolean zU = U(this.K, this.L, i, i2);
        if (zU) {
            this.b = true;
            try {
                W(this.K, this.L);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        h0();
        v();
        this.c.b.values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    tl0 tl0Var = (tl0) this.d.get(size2);
                    if (i >= 0 && i == tl0Var.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        tl0 tl0Var2 = (tl0) this.d.get(size - 1);
                        if (i < 0 || i != tl0Var2.s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((tl0) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + aVar + " nesting=" + aVar.s);
        }
        boolean zR = aVar.r();
        if (aVar.B && zR) {
            return;
        }
        f fVar = this.c;
        synchronized (fVar.a) {
            fVar.a.remove(aVar);
        }
        aVar.k = false;
        if (L(aVar)) {
            this.F = true;
        }
        aVar.l = true;
        d0(aVar);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            ore.k("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((tl0) arrayList.get(i)).o) {
                if (i2 != i) {
                    C(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((tl0) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                C(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            C(arrayList, arrayList2, i2, size);
        }
    }

    public final void X(Bundle bundle) {
        v2a v2aVar;
        e eVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.v.h.getClassLoader());
                this.l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.v.h.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        f fVar = this.c;
        HashMap map2 = fVar.c;
        HashMap map3 = fVar.b;
        map2.clear();
        map2.putAll(map);
        ib7 ib7Var = (ib7) bundle.getParcelable("state");
        if (ib7Var == null) {
            return;
        }
        map3.clear();
        Iterator it = ib7Var.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            v2aVar = this.n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = fVar.i(null, (String) it.next());
            if (bundleI != null) {
                a aVar = (a) this.N.b.get(((kb7) bundleI.getParcelable("state")).b);
                if (aVar != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + aVar);
                    }
                    eVar = new e(v2aVar, fVar, aVar, bundleI);
                } else {
                    eVar = new e(this.n, this.c, this.v.h.getClassLoader(), H(), bundleI);
                }
                a aVar2 = eVar.c;
                aVar2.b = bundleI;
                aVar2.t = this;
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + aVar2.e + "): " + aVar2);
                }
                eVar.l(this.v.h.getClassLoader());
                fVar.g(eVar);
                eVar.e = this.u;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.N;
        fragmentManagerViewModel.getClass();
        for (a aVar3 : new ArrayList(fragmentManagerViewModel.b.values())) {
            if (map3.get(aVar3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + aVar3 + " that was not found in the set of active Fragments " + ib7Var.a);
                }
                this.N.g(aVar3);
                aVar3.t = this;
                e eVar2 = new e(v2aVar, fVar, aVar3);
                eVar2.e = 1;
                eVar2.j();
                aVar3.l = true;
                eVar2.j();
            }
        }
        ArrayList<String> arrayList = ib7Var.b;
        fVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                a aVarB = fVar.b(str3);
                if (aVarB == null) {
                    ore.k(c0a.o("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + aVarB);
                }
                fVar.a(aVarB);
            }
        }
        if (ib7Var.c != null) {
            this.d = new ArrayList(ib7Var.c.length);
            int i = 0;
            while (true) {
                ul0[] ul0VarArr = ib7Var.c;
                if (i >= ul0VarArr.length) {
                    break;
                }
                tl0 tl0VarA = ul0VarArr[i].a(this);
                if (K(2)) {
                    StringBuilder sbY = zo5.y(i, "restoreAllState: back stack #", " (index ");
                    sbY.append(tl0VarA.s);
                    sbY.append("): ");
                    sbY.append(tl0VarA);
                    Log.v("FragmentManager", sbY.toString());
                    PrintWriter printWriter = new PrintWriter(new ve9());
                    tl0VarA.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(tl0VarA);
                i++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.j.set(ib7Var.d);
        String str4 = ib7Var.e;
        if (str4 != null) {
            a aVarB2 = fVar.b(str4);
            this.y = aVarB2;
            r(aVarB2);
        }
        ArrayList arrayList2 = ib7Var.f;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.k.put((String) arrayList2.get(i2), (vl0) ib7Var.g.get(i2));
            }
        }
        this.E = new ArrayDeque(ib7Var.h);
    }

    public final Bundle Y() {
        int i;
        ul0[] ul0VarArr;
        ArrayList arrayList;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((vd5) it.next()).f();
        }
        x();
        A(true);
        this.G = true;
        this.N.g = true;
        f fVar = this.c;
        fVar.getClass();
        HashMap map = fVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it2 = map.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            e eVar = (e) it2.next();
            if (eVar != null) {
                a aVar = eVar.c;
                String str = aVar.e;
                Bundle bundle3 = new Bundle();
                a aVar2 = eVar.c;
                if (aVar2.a == -1 && (bundle = aVar2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new kb7(aVar2));
                if (aVar2.a > -1) {
                    Bundle bundle4 = new Bundle();
                    aVar2.H(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    eVar.a.B(aVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    aVar2.q1.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleY = aVar2.v.Y();
                    if (!bundleY.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleY);
                    }
                    SparseArray<? extends Parcelable> sparseArray = aVar2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = aVar2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = aVar2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                fVar.i(bundle3, str);
                arrayList2.add(aVar.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + aVar + ": " + aVar.b);
                }
            }
        }
        HashMap map2 = this.c.c;
        if (!map2.isEmpty()) {
            f fVar2 = this.c;
            synchronized (fVar2.a) {
                try {
                    ul0VarArr = null;
                    if (fVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fVar2.a.size());
                        for (a aVar3 : fVar2.a) {
                            arrayList.add(aVar3.e);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + aVar3.e + "): " + aVar3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.d.size();
            if (size > 0) {
                ul0VarArr = new ul0[size];
                for (i = 0; i < size; i++) {
                    ul0VarArr[i] = new ul0((tl0) this.d.get(i));
                    if (K(2)) {
                        StringBuilder sbY = zo5.y(i, "saveAllState: adding back stack #", ": ");
                        sbY.append(this.d.get(i));
                        Log.v("FragmentManager", sbY.toString());
                    }
                }
            }
            ib7 ib7Var = new ib7();
            ib7Var.a = arrayList2;
            ib7Var.b = arrayList;
            ib7Var.c = ul0VarArr;
            ib7Var.d = this.j.get();
            a aVar4 = this.y;
            if (aVar4 != null) {
                ib7Var.e = aVar4.e;
            }
            ib7Var.f.addAll(this.k.keySet());
            ib7Var.g.addAll(this.k.values());
            ib7Var.h = new ArrayList(this.E);
            bundle2.putParcelable("state", ib7Var);
            for (String str2 : this.l.keySet()) {
                bundle2.putBundle(qv1.k("result_", str2), (Bundle) this.l.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(qv1.k("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.i.removeCallbacks(this.O);
                    this.v.i.post(this.O);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e a(a aVar) {
        String str = aVar.Z;
        if (str != null) {
            lb7 lb7Var = mb7.a;
            mb7.b(new FragmentReuseViolation(aVar, str));
            mb7.a(aVar).getClass();
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + aVar);
        }
        e eVarG = g(aVar);
        aVar.t = this;
        f fVar = this.c;
        fVar.g(eVarG);
        if (!aVar.B) {
            fVar.a(aVar);
            aVar.l = false;
            aVar.X = false;
            if (L(aVar)) {
                this.F = true;
            }
        }
        return eVarG;
    }

    public final void a0(a aVar, boolean z) {
        ViewGroup viewGroupG = G(aVar);
        if (viewGroupG == null || !(viewGroupG instanceof xa7)) {
            return;
        }
        ((xa7) viewGroupG).setDrawDisappearingViewsLast(!z);
    }

    public final void b(va7 va7Var, qe7 qe7Var, a aVar) {
        b8j b8jVarA;
        if (this.v != null) {
            ore.k("Already attached");
            return;
        }
        this.v = va7Var;
        this.w = qe7Var;
        this.x = aVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.o;
        if (aVar != null) {
            copyOnWriteArrayList.add(new cb7(aVar));
        } else if (va7Var != null) {
            copyOnWriteArrayList.add(va7Var);
        }
        if (this.x != null) {
            h0();
        }
        if (va7Var != null) {
            ltb ltbVarD = va7Var.k.d();
            this.g = ltbVarD;
            ltbVarD.a(aVar != null ? aVar : va7Var, this.i);
        }
        if (aVar != null) {
            FragmentManagerViewModel fragmentManagerViewModel = aVar.t.N;
            HashMap map = fragmentManagerViewModel.c;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) map.get(aVar.e);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.e);
                map.put(aVar.e, fragmentManagerViewModel2);
            }
            this.N = fragmentManagerViewModel2;
        } else if (va7Var != null) {
            LinkedHashMap linkedHashMap = va7Var.k.b().a;
            zv4 zv4Var = zv4.c;
            sr3 sr3VarA = zfe.a(FragmentManagerViewModel.class);
            String strG = sr3VarA.g();
            if (strG == null) {
                ore.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG);
            b8j b8jVar = (b8j) linkedHashMap.get(strConcat);
            boolean zI = sr3VarA.i(b8jVar);
            d dVar = FragmentManagerViewModel.h;
            if (!zI) {
                x7b x7bVar = new x7b(zv4Var);
                x7bVar.o(khb.n, strConcat);
                try {
                    try {
                        b8jVarA = dVar.c(sr3VarA, x7bVar);
                    } catch (AbstractMethodError unused) {
                        b8jVarA = dVar.b(sr3VarA.d(), x7bVar);
                    }
                } catch (AbstractMethodError unused2) {
                    b8jVarA = dVar.a(sr3VarA.d());
                }
                b8jVar = b8jVarA;
                b8j b8jVar2 = (b8j) linkedHashMap.put(strConcat, b8jVar);
                if (b8jVar2 != null) {
                    b8jVar2.a();
                }
            }
            this.N = (FragmentManagerViewModel) b8jVar;
        } else {
            this.N = new FragmentManagerViewModel(false);
        }
        this.N.g = P();
        this.c.d = this.N;
        va7 va7Var2 = this.v;
        if (va7Var2 != null && aVar == null) {
            b1f b1fVarC = va7Var2.c();
            b1fVarC.c("android:support:fragments", new y64(2, (hb7) this));
            Bundle bundleA = b1fVarC.a("android:support:fragments");
            if (bundleA != null) {
                X(bundleA);
            }
        }
        va7 va7Var3 = this.v;
        if (va7Var3 != null) {
            e74 e74Var = va7Var3.k.h;
            String strConcat2 = "FragmentManager:".concat(aVar != null ? zo5.w(new StringBuilder(), aVar.e, ":") : "");
            hb7 hb7Var = (hb7) this;
            this.B = e74Var.c(strConcat2.concat("StartActivityForResult"), new v9(1), new v56(8, hb7Var));
            this.C = e74Var.c(strConcat2.concat("StartIntentSenderForResult"), new v9(2), new w4(hb7Var));
            this.D = e74Var.c(strConcat2.concat("RequestPermissions"), new v9(0), new p3c(9, hb7Var));
        }
        va7 va7Var4 = this.v;
        if (va7Var4 != null) {
            va7Var4.k.h(this.p);
        }
        va7 va7Var5 = this.v;
        if (va7Var5 != null) {
            va7Var5.k.j.add(this.q);
        }
        va7 va7Var6 = this.v;
        if (va7Var6 != null) {
            va7Var6.k.l.add(this.r);
        }
        va7 va7Var7 = this.v;
        if (va7Var7 != null) {
            va7Var7.k.j(this.s);
        }
        va7 va7Var8 = this.v;
        if (va7Var8 == null || aVar != null) {
            return;
        }
        ki3 ki3Var = va7Var8.k.c;
        ((CopyOnWriteArrayList) ki3Var.b).add(this.t);
        ((Runnable) ki3Var.a).run();
    }

    public final void b0(a aVar, n09 n09Var) {
        if (aVar == this.c.b(aVar.e) && (aVar.u == null || aVar.t == this)) {
            aVar.n1 = n09Var;
        } else {
            defpackage.c.v("Fragment ", aVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void c(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + aVar);
        }
        if (aVar.B) {
            aVar.B = false;
            if (aVar.k) {
                return;
            }
            this.c.a(aVar);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + aVar);
            }
            if (L(aVar)) {
                this.F = true;
            }
        }
    }

    public final void c0(a aVar) {
        if (aVar != null) {
            if (aVar != this.c.b(aVar.e) || (aVar.u != null && aVar.t != this)) {
                defpackage.c.v("Fragment ", aVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        a aVar2 = this.y;
        this.y = aVar;
        r(aVar2);
        r(this.y);
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(a aVar) {
        ViewGroup viewGroupG = G(aVar);
        if (viewGroupG != null) {
            ta7 ta7Var = aVar.K;
            if ((ta7Var == null ? 0 : ta7Var.e) + (ta7Var == null ? 0 : ta7Var.d) + (ta7Var == null ? 0 : ta7Var.c) + (ta7Var == null ? 0 : ta7Var.b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, aVar);
                }
                a aVar2 = (a) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                ta7 ta7Var2 = aVar.K;
                boolean z = ta7Var2 != null ? ta7Var2.a : false;
                if (aVar2.K == null) {
                    return;
                }
                aVar2.g().a = z;
            }
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e) it.next()).c.H;
            if (viewGroup != null) {
                I();
                hashSet.add(vd5.h(viewGroup));
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((tl0) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                a aVar = ((nb7) it.next()).b;
                if (aVar != null && (viewGroup = aVar.H) != null) {
                    hashSet.add(vd5.i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0() {
        for (e eVar : this.c.d()) {
            a aVar = eVar.c;
            if (aVar.I) {
                if (this.b) {
                    this.J = true;
                } else {
                    aVar.I = false;
                    eVar.j();
                }
            }
        }
    }

    public final e g(a aVar) {
        String str = aVar.e;
        f fVar = this.c;
        e eVar = (e) fVar.b.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this.n, fVar, aVar);
        eVar2.l(this.v.h.getClassLoader());
        eVar2.e = this.u;
        return eVar2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ve9());
        va7 va7Var = this.v;
        if (va7Var == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            va7Var.k.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void h(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + aVar);
        }
        if (aVar.B) {
            return;
        }
        aVar.B = true;
        if (aVar.k) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + aVar);
            }
            f fVar = this.c;
            synchronized (fVar.a) {
                fVar.a.remove(aVar);
            }
            aVar.k = false;
            if (L(aVar)) {
                this.F = true;
            }
            d0(aVar);
        }
    }

    public final void h0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.i.f(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.x);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.i.f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.G = true;
                if (z) {
                    aVar.v.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.u >= 1) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    if (!aVar.A ? aVar.v.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        boolean zK;
        boolean z;
        if (this.u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && N(aVar)) {
                if (aVar.A) {
                    zK = false;
                } else {
                    if (aVar.E && aVar.F) {
                        aVar.w(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zK = z | aVar.v.k(menu, menuInflater);
                }
                if (zK) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                a aVar2 = (a) this.e.get(i);
                if (arrayList == null || !arrayList.contains(aVar2)) {
                    aVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.I = true;
        A(true);
        x();
        va7 va7Var = this.v;
        f fVar = this.c;
        if (va7Var != null) {
            zIsChangingConfigurations = fVar.d.f;
        } else {
            b bVar = va7Var.h;
            if (bVar != null) {
                zIsChangingConfigurations = true ^ bVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((vl0) it.next()).a.iterator();
                while (it2.hasNext()) {
                    fVar.d.e((String) it2.next(), false);
                }
            }
        }
        u(-1);
        va7 va7Var2 = this.v;
        if (va7Var2 != null) {
            va7Var2.k.j.remove(this.q);
        }
        va7 va7Var3 = this.v;
        if (va7Var3 != null) {
            va7Var3.k.i.remove(this.p);
        }
        va7 va7Var4 = this.v;
        if (va7Var4 != null) {
            va7Var4.k.l.remove(this.r);
        }
        va7 va7Var5 = this.v;
        if (va7Var5 != null) {
            va7Var5.k.o(this.s);
        }
        va7 va7Var6 = this.v;
        if (va7Var6 != null && this.x == null) {
            ki3 ki3Var = va7Var6.k.c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ki3Var.b;
            ab7 ab7Var = this.t;
            copyOnWriteArrayList.remove(ab7Var);
            qt4.A(((HashMap) ki3Var.c).remove(ab7Var));
            ((Runnable) ki3Var.a).run();
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.i.e();
            this.g = null;
        }
        c46 c46Var = this.B;
        if (c46Var != null) {
            c46Var.r();
            this.C.r();
            this.D.r();
        }
    }

    public final void m(boolean z) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.G = true;
                if (z) {
                    aVar.v.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z) {
                aVar.v.n(true);
            }
        }
    }

    public final void o() {
        for (a aVar : this.c.e()) {
            if (aVar != null) {
                aVar.q();
                aVar.v.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.u >= 1) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    if (aVar.A ? false : (aVar.E && aVar.F && aVar.C(menuItem)) ? true : aVar.v.p(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.u < 1) {
            return;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && !aVar.A) {
                aVar.v.q();
            }
        }
    }

    public final void r(a aVar) {
        if (aVar != null) {
            if (aVar != this.c.b(aVar.e)) {
                return;
            }
            aVar.t.getClass();
            boolean zO = O(aVar);
            Boolean bool = aVar.j;
            if (bool == null || bool.booleanValue() != zO) {
                aVar.j = Boolean.valueOf(zO);
                hb7 hb7Var = aVar.v;
                hb7Var.h0();
                hb7Var.r(hb7Var.y);
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z) {
                aVar.v.s(true);
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean zT;
        boolean z;
        if (this.u < 1) {
            return false;
        }
        boolean z2 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && N(aVar)) {
                if (aVar.A) {
                    zT = false;
                } else {
                    if (aVar.E && aVar.F) {
                        aVar.E(menu);
                        z = true;
                    } else {
                        z = false;
                    }
                    zT = aVar.v.t(menu) | z;
                }
                if (zT) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(np0.m);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a aVar = this.x;
        if (aVar != null) {
            sb.append(aVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            va7 va7Var = this.v;
            if (va7Var != null) {
                sb.append(va7Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (e eVar : this.c.b.values()) {
                if (eVar != null) {
                    eVar.e = i;
                }
            }
            Q(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((vd5) it.next()).e();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.J) {
            this.J = false;
            f0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strO = zo5.o(str, "    ");
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        String strO2 = zo5.o(str, "    ");
        HashMap map = fVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e eVar : map.values()) {
                printWriter.print(str);
                if (eVar != null) {
                    a aVar = eVar.c;
                    printWriter.println(aVar);
                    aVar.getClass();
                    printWriter.print(strO2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(aVar.x));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(aVar.y));
                    printWriter.print(" mTag=");
                    printWriter.println(aVar.z);
                    printWriter.print(strO2);
                    printWriter.print("mState=");
                    printWriter.print(aVar.a);
                    printWriter.print(" mWho=");
                    printWriter.print(aVar.e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(aVar.s);
                    printWriter.print(strO2);
                    printWriter.print("mAdded=");
                    printWriter.print(aVar.k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(aVar.l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(aVar.n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(aVar.o);
                    printWriter.print(strO2);
                    printWriter.print("mHidden=");
                    printWriter.print(aVar.A);
                    printWriter.print(" mDetached=");
                    printWriter.print(aVar.B);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(aVar.F);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(aVar.E);
                    printWriter.print(strO2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(aVar.C);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(aVar.J);
                    if (aVar.t != null) {
                        printWriter.print(strO2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(aVar.t);
                    }
                    if (aVar.u != null) {
                        printWriter.print(strO2);
                        printWriter.print("mHost=");
                        printWriter.println(aVar.u);
                    }
                    if (aVar.w != null) {
                        printWriter.print(strO2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(aVar.w);
                    }
                    if (aVar.f != null) {
                        printWriter.print(strO2);
                        printWriter.print("mArguments=");
                        printWriter.println(aVar.f);
                    }
                    if (aVar.b != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(aVar.b);
                    }
                    if (aVar.c != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(aVar.c);
                    }
                    if (aVar.d != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(aVar.d);
                    }
                    Object objB = aVar.g;
                    if (objB == null) {
                        c cVar = aVar.t;
                        objB = (cVar == null || (str2 = aVar.h) == null) ? null : cVar.c.b(str2);
                    }
                    if (objB != null) {
                        printWriter.print(strO2);
                        printWriter.print("mTarget=");
                        printWriter.print(objB);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(aVar.i);
                    }
                    printWriter.print(strO2);
                    printWriter.print("mPopDirection=");
                    ta7 ta7Var = aVar.K;
                    printWriter.println(ta7Var == null ? false : ta7Var.a);
                    ta7 ta7Var2 = aVar.K;
                    if ((ta7Var2 == null ? 0 : ta7Var2.b) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getEnterAnim=");
                        ta7 ta7Var3 = aVar.K;
                        printWriter.println(ta7Var3 == null ? 0 : ta7Var3.b);
                    }
                    ta7 ta7Var4 = aVar.K;
                    if ((ta7Var4 == null ? 0 : ta7Var4.c) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getExitAnim=");
                        ta7 ta7Var5 = aVar.K;
                        printWriter.println(ta7Var5 == null ? 0 : ta7Var5.c);
                    }
                    ta7 ta7Var6 = aVar.K;
                    if ((ta7Var6 == null ? 0 : ta7Var6.d) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getPopEnterAnim=");
                        ta7 ta7Var7 = aVar.K;
                        printWriter.println(ta7Var7 == null ? 0 : ta7Var7.d);
                    }
                    ta7 ta7Var8 = aVar.K;
                    if ((ta7Var8 == null ? 0 : ta7Var8.e) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getPopExitAnim=");
                        ta7 ta7Var9 = aVar.K;
                        printWriter.println(ta7Var9 == null ? 0 : ta7Var9.e);
                    }
                    if (aVar.H != null) {
                        printWriter.print(strO2);
                        printWriter.print("mContainer=");
                        printWriter.println(aVar.H);
                    }
                    if (aVar.j() != null) {
                        androidx.loader.app.b.b(aVar).a(strO2, printWriter);
                    }
                    printWriter.print(strO2);
                    printWriter.println("Child " + aVar.v + ":");
                    aVar.v.w(strO2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                a aVar2 = (a) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(aVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                a aVar3 = (a) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                tl0 tl0Var = (tl0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(tl0Var.toString());
                tl0Var.f(strO, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (eb7) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((vd5) it.next()).e();
        }
    }

    public final void y(eb7 eb7Var, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (this.I) {
                    ore.k("FragmentManager has been destroyed");
                    return;
                } else {
                    ore.k("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (P()) {
                ore.k("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(eb7Var);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            ore.k("FragmentManager is already executing transactions");
            return;
        }
        if (this.v == null) {
            if (this.I) {
                ore.k("FragmentManager has been destroyed");
                return;
            } else {
                ore.k("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.v.i.getLooper()) {
            ore.k("Must be called from main thread of fragment host");
            return;
        }
        if (!z && P()) {
            ore.k("Can not perform this action after onSaveInstanceState");
        } else if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }
}
