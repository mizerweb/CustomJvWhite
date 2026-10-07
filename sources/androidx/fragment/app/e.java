package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import defpackage.bb7;
import defpackage.hb7;
import defpackage.jb7;
import defpackage.kb7;
import defpackage.kee;
import defpackage.lb7;
import defpackage.m09;
import defpackage.mb7;
import defpackage.ore;
import defpackage.ra7;
import defpackage.ta7;
import defpackage.v2a;
import defpackage.va7;
import defpackage.vd5;
import defpackage.w72;
import defpackage.xa7;
import defpackage.yab;
import defpackage.zo5;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final v2a a;
    public final f b;
    public final a c;
    public boolean d = false;
    public int e = -1;

    public e(v2a v2aVar, f fVar, ClassLoader classLoader, bb7 bb7Var, Bundle bundle) {
        this.a = v2aVar;
        this.b = fVar;
        a aVarA = ((kb7) bundle.getParcelable("state")).a(bb7Var);
        this.c = aVarA;
        aVarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        c cVar = aVarA.t;
        if (cVar != null && cVar.P()) {
            ore.k("Fragment already added and state has been saved");
            throw null;
        }
        aVarA.f = bundle2;
        if (c.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + aVarA);
        }
    }

    public final void a() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + aVar);
        }
        Bundle bundle = aVar.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        aVar.v.R();
        aVar.a = 3;
        aVar.G = false;
        aVar.s();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onActivityCreated()"));
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + aVar);
        }
        aVar.b = null;
        hb7 hb7Var = aVar.v;
        hb7Var.G = false;
        hb7Var.H = false;
        hb7Var.N.g = false;
        hb7Var.u(4);
        this.a.s(aVar, false);
    }

    public final void b() {
        e eVar;
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + aVar);
        }
        a aVar2 = aVar.g;
        f fVar = this.b;
        if (aVar2 != null) {
            eVar = (e) fVar.b.get(aVar2.e);
            if (eVar == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(aVar);
                a aVar3 = aVar.g;
                sb.append(" declared target fragment ");
                sb.append(aVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            aVar.h = aVar.g.e;
            aVar.g = null;
        } else {
            String str = aVar.h;
            if (str != null) {
                eVar = (e) fVar.b.get(str);
                if (eVar == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(aVar);
                    sb2.append(" declared target fragment ");
                    ore.k(zo5.w(sb2, aVar.h, " that does not belong to this FragmentManager!"));
                    return;
                }
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            eVar.j();
        }
        c cVar = aVar.t;
        aVar.u = cVar.v;
        aVar.w = cVar.x;
        v2a v2aVar = this.a;
        v2aVar.y(aVar, false);
        ArrayList arrayList = aVar.r1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar4 = ((ra7) it.next()).a;
            aVar4.q1.a();
            yab.z(aVar4);
            Bundle bundle = aVar4.b;
            aVar4.q1.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        aVar.v.b(aVar.u, aVar.a(), aVar);
        aVar.a = 0;
        aVar.G = false;
        aVar.u(aVar.u.h);
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onAttach()"));
        }
        Iterator it2 = aVar.t.o.iterator();
        while (it2.hasNext()) {
            ((jb7) it2.next()).a();
        }
        hb7 hb7Var = aVar.v;
        hb7Var.G = false;
        hb7Var.H = false;
        hb7Var.N.g = false;
        hb7Var.u(0);
        v2aVar.t(aVar, false);
    }

    public final int c() {
        a aVar = this.c;
        if (aVar.t == null) {
            return aVar.a;
        }
        int iMin = this.e;
        int iOrdinal = aVar.n1.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (aVar.n) {
            boolean z = aVar.o;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
            } else {
                iMin = i < 4 ? Math.min(iMin, aVar.a) : Math.min(iMin, 1);
            }
        }
        if (aVar.p && aVar.H == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!aVar.k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = aVar.H;
        int iG = viewGroup != null ? vd5.i(viewGroup, aVar.l()).g(this) : 0;
        if (iG == 2) {
            iMin = Math.min(iMin, 6);
        } else if (iG == 3) {
            iMin = Math.max(iMin, 3);
        } else if (aVar.l) {
            iMin = aVar.r() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (aVar.I && aVar.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (aVar.m) {
            iMin = Math.max(iMin, 3);
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + aVar);
        }
        return iMin;
    }

    public final void d() {
        Bundle bundle;
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + aVar);
        }
        Bundle bundle2 = aVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (aVar.Y) {
            aVar.a = 1;
            Bundle bundle4 = aVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            aVar.v.X(bundle);
            hb7 hb7Var = aVar.v;
            hb7Var.G = false;
            hb7Var.H = false;
            hb7Var.N.g = false;
            hb7Var.u(1);
            return;
        }
        v2a v2aVar = this.a;
        v2aVar.z(aVar, false);
        aVar.v.R();
        aVar.a = 1;
        aVar.G = false;
        aVar.o1.a(new kee(2, aVar));
        aVar.v(bundle3);
        aVar.Y = true;
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onCreate()"));
        }
        aVar.o1.d(m09.ON_CREATE);
        v2aVar.u(aVar, false);
    }

    public final void e() {
        String resourceName;
        a aVar = this.c;
        if (aVar.n) {
            return;
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + aVar);
        }
        Bundle bundle = aVar.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterA = aVar.A(bundle2);
        ViewGroup viewGroup2 = aVar.H;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = aVar.y;
            if (i != 0) {
                if (i == -1) {
                    ore.p(zo5.n("Cannot create fragment ", aVar, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) aVar.t.w.A(i);
                if (viewGroup == null) {
                    if (!aVar.q && !aVar.p) {
                        try {
                            resourceName = aVar.L().getResources().getResourceName(aVar.y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.y) + " (" + resourceName + ") for fragment " + aVar);
                    }
                } else if (!(viewGroup instanceof xa7)) {
                    lb7 lb7Var = mb7.a;
                    mb7.b(new WrongFragmentContainerViolation(aVar, viewGroup));
                    mb7.a(aVar).getClass();
                }
            }
        }
        aVar.H = viewGroup;
        aVar.K(layoutInflaterA, viewGroup, bundle2);
        aVar.a = 2;
    }

    public final void f() {
        a aVarB;
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + aVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = aVar.l && !aVar.r();
        f fVar = this.b;
        if (z) {
            fVar.i(null, aVar.e);
        }
        if (!z) {
            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
            if (!((fragmentManagerViewModel.b.containsKey(aVar.e) && fragmentManagerViewModel.e) ? fragmentManagerViewModel.f : true)) {
                String str = aVar.h;
                if (str != null && (aVarB = fVar.b(str)) != null && aVarB.C) {
                    aVar.g = aVarB;
                }
                aVar.a = 0;
                return;
            }
        }
        va7 va7Var = aVar.u;
        if (va7Var != null) {
            zIsChangingConfigurations = fVar.d.f;
        } else {
            b bVar = va7Var.h;
            if (bVar != null) {
                zIsChangingConfigurations = true ^ bVar.isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            fVar.d.d(aVar, false);
        }
        aVar.v.l();
        aVar.o1.d(m09.ON_DESTROY);
        aVar.a = 0;
        aVar.G = false;
        aVar.Y = false;
        aVar.x();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onDestroy()"));
        }
        this.a.v(aVar, false);
        for (e eVar : fVar.d()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar.e.equals(aVar2.h)) {
                    aVar2.g = aVar;
                    aVar2.h = null;
                }
            }
        }
        String str2 = aVar.h;
        if (str2 != null) {
            aVar.g = fVar.b(str2);
        }
        fVar.h(this);
    }

    public final void g() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + aVar);
        }
        ViewGroup viewGroup = aVar.H;
        aVar.v.u(1);
        aVar.a = 1;
        aVar.G = false;
        aVar.y();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onDestroyView()"));
        }
        androidx.loader.app.b.b(aVar).d();
        aVar.r = false;
        this.a.E(aVar, false);
        aVar.H = null;
        aVar.p1.k(null);
        aVar.o = false;
    }

    public final void h() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + aVar);
        }
        aVar.a = -1;
        aVar.G = false;
        aVar.z();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onDetach()"));
        }
        hb7 hb7Var = aVar.v;
        if (!hb7Var.I) {
            hb7Var.l();
            aVar.v = new hb7();
        }
        this.a.w(aVar, false);
        aVar.a = -1;
        aVar.u = null;
        aVar.w = null;
        aVar.t = null;
        if (!aVar.l || aVar.r()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.b.d;
            if (!((fragmentManagerViewModel.b.containsKey(aVar.e) && fragmentManagerViewModel.e) ? fragmentManagerViewModel.f : true)) {
                return;
            }
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + aVar);
        }
        aVar.o();
    }

    public final void i() {
        a aVar = this.c;
        if (aVar.n && aVar.o && !aVar.r) {
            if (c.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            aVar.K(aVar.A(bundle2), null, bundle2);
        }
    }

    public final void j() {
        f fVar = this.b;
        boolean z = this.d;
        a aVar = this.c;
        if (z) {
            if (c.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + aVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = aVar.a;
                if (iC == i) {
                    if (!z2 && i == -1 && aVar.l && !aVar.r()) {
                        if (c.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + aVar);
                        }
                        fVar.d.d(aVar, true);
                        fVar.h(this);
                        if (c.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + aVar);
                        }
                        aVar.o();
                    }
                    if (aVar.X) {
                        c cVar = aVar.t;
                        if (cVar != null && aVar.k && c.L(aVar)) {
                            cVar.F = true;
                        }
                        aVar.X = false;
                        aVar.v.o();
                    }
                    return;
                }
                if (iC <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            aVar.a = 1;
                            break;
                        case 2:
                            aVar.o = false;
                            aVar.a = 2;
                            break;
                        case 3:
                            if (c.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + aVar);
                            }
                            aVar.a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            aVar.a = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            aVar.a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            aVar.a = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom RESUMED: " + aVar);
        }
        aVar.v.u(5);
        aVar.o1.d(m09.ON_PAUSE);
        aVar.a = 6;
        aVar.G = false;
        aVar.D();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onPause()"));
        }
        this.a.x(aVar, false);
    }

    public final void l(ClassLoader classLoader) {
        a aVar = this.c;
        Bundle bundle = aVar.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (aVar.b.getBundle("savedInstanceState") == null) {
            aVar.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            aVar.c = aVar.b.getSparseParcelableArray("viewState");
            aVar.d = aVar.b.getBundle("viewRegistryState");
            kb7 kb7Var = (kb7) aVar.b.getParcelable("state");
            if (kb7Var != null) {
                aVar.h = kb7Var.m;
                aVar.i = kb7Var.n;
                aVar.J = kb7Var.o;
            }
            if (aVar.J) {
                return;
            }
            aVar.I = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aVar, e);
        }
    }

    public final void m() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto RESUMED: " + aVar);
        }
        ta7 ta7Var = aVar.K;
        View view = ta7Var == null ? null : ta7Var.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        aVar.g().j = null;
        aVar.v.R();
        aVar.v.A(true);
        aVar.a = 7;
        aVar.G = false;
        aVar.G();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onResume()"));
        }
        aVar.o1.d(m09.ON_RESUME);
        hb7 hb7Var = aVar.v;
        hb7Var.G = false;
        hb7Var.H = false;
        hb7Var.N.g = false;
        hb7Var.u(7);
        this.a.A(aVar, false);
        this.b.i(null, aVar.e);
        aVar.b = null;
        aVar.c = null;
        aVar.d = null;
    }

    public final void n() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto STARTED: " + aVar);
        }
        aVar.v.R();
        aVar.v.A(true);
        aVar.a = 5;
        aVar.G = false;
        aVar.I();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onStart()"));
        }
        aVar.o1.d(m09.ON_START);
        hb7 hb7Var = aVar.v;
        hb7Var.G = false;
        hb7Var.H = false;
        hb7Var.N.g = false;
        hb7Var.u(5);
        this.a.C(aVar, false);
    }

    public final void o() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom STARTED: " + aVar);
        }
        hb7 hb7Var = aVar.v;
        hb7Var.H = true;
        hb7Var.N.g = true;
        hb7Var.u(4);
        aVar.o1.d(m09.ON_STOP);
        aVar.a = 4;
        aVar.G = false;
        aVar.J();
        if (!aVar.G) {
            throw new w72(zo5.n("Fragment ", aVar, " did not call through to super.onStop()"));
        }
        this.a.D(aVar, false);
    }

    public e(v2a v2aVar, f fVar, a aVar) {
        this.a = v2aVar;
        this.b = fVar;
        this.c = aVar;
    }

    public e(v2a v2aVar, f fVar, a aVar, Bundle bundle) {
        this.a = v2aVar;
        this.b = fVar;
        this.c = aVar;
        aVar.c = null;
        aVar.d = null;
        aVar.s = 0;
        aVar.o = false;
        aVar.k = false;
        a aVar2 = aVar.g;
        aVar.h = aVar2 != null ? aVar2.e : null;
        aVar.g = null;
        aVar.b = bundle;
        aVar.f = bundle.getBundle("arguments");
    }
}
