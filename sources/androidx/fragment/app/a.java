package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import defpackage.b1f;
import defpackage.c1f;
import defpackage.db7;
import defpackage.e8j;
import defpackage.g19;
import defpackage.g8b;
import defpackage.h8j;
import defpackage.hb7;
import defpackage.i19;
import defpackage.i8j;
import defpackage.lb7;
import defpackage.mb7;
import defpackage.n09;
import defpackage.np0;
import defpackage.ore;
import defpackage.qe7;
import defpackage.ra7;
import defpackage.rt7;
import defpackage.s68;
import defpackage.sa7;
import defpackage.ta7;
import defpackage.va7;
import defpackage.x7b;
import defpackage.yab;
import defpackage.zn;
import defpackage.zo5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ComponentCallbacks, View.OnCreateContextMenuListener, g19, i8j, rt7, c1f {
    public static final Object t1 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean G;
    public ViewGroup H;
    public boolean I;
    public ta7 K;
    public boolean X;
    public boolean Y;
    public String Z;
    public Bundle b;
    public SparseArray c;
    public Bundle d;
    public Bundle f;
    public a g;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public n09 n1;
    public boolean o;
    public i19 o1;
    public boolean p;
    public final g8b p1;
    public boolean q;
    public s68 q1;
    public boolean r;
    public final ArrayList r1;
    public int s;
    public final ra7 s1;
    public c t;
    public va7 u;
    public a w;
    public int x;
    public int y;
    public String z;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String h = null;
    public Boolean j = null;
    public hb7 v = new hb7();
    public final boolean F = true;
    public boolean J = true;

    public a() {
        new zn(6, this);
        this.n1 = n09.e;
        this.p1 = new g8b();
        new AtomicInteger();
        this.r1 = new ArrayList();
        this.s1 = new ra7(this);
        n();
    }

    public LayoutInflater A(Bundle bundle) {
        va7 va7Var = this.u;
        if (va7Var == null) {
            ore.k("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        b bVar = va7Var.k;
        LayoutInflater layoutInflaterCloneInContext = bVar.getLayoutInflater().cloneInContext(bVar);
        layoutInflaterCloneInContext.setFactory2(this.v.f);
        return layoutInflaterCloneInContext;
    }

    public final void B() {
        this.G = true;
        va7 va7Var = this.u;
        if ((va7Var == null ? null : va7Var.g) != null) {
            this.G = true;
        }
    }

    public boolean C(MenuItem menuItem) {
        return false;
    }

    public void D() {
        this.G = true;
    }

    public void E(Menu menu) {
    }

    public void F(int i, String[] strArr, int[] iArr) {
    }

    public void G() {
        this.G = true;
    }

    public void H(Bundle bundle) {
    }

    public void I() {
        this.G = true;
    }

    public void J() {
        this.G = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.R();
        this.r = true;
        b();
    }

    public final Context L() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        ore.k(zo5.n("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final void M(int i, int i2, int i3, int i4) {
        if (this.K == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        g().b = i;
        g().c = i2;
        g().d = i3;
        g().e = i4;
    }

    public final void N() {
        lb7 lb7Var = mb7.a;
        mb7.b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        mb7.a(this).getClass();
        this.C = true;
        c cVar = this.t;
        if (cVar != null) {
            cVar.N.c(this);
        } else {
            this.D = true;
        }
    }

    public final void O(Intent intent, int i, Bundle bundle) {
        if (this.u == null) {
            ore.k(zo5.n("Fragment ", this, " not attached to Activity"));
            return;
        }
        c cVarL = l();
        if (cVarL.B != null) {
            cVarL.E.addLast(new db7(this.e, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            cVarL.B.n(intent);
            return;
        }
        va7 va7Var = cVarL.v;
        if (i == -1) {
            va7Var.h.startActivity(intent, bundle);
        } else {
            va7Var.getClass();
            ore.k("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public qe7 a() {
        return new sa7(this);
    }

    @Override // defpackage.i8j
    public final h8j b() {
        if (this.t == null) {
            ore.k("Can't access ViewModels from detached fragment");
            return null;
        }
        if (k() == 1) {
            ore.k("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.t.N.d;
        h8j h8jVar = (h8j) map.get(this.e);
        if (h8jVar != null) {
            return h8jVar;
        }
        h8j h8jVar2 = new h8j();
        map.put(this.e, h8jVar2);
        return h8jVar2;
    }

    @Override // defpackage.c1f
    public final b1f c() {
        return (b1f) this.q1.c;
    }

    @Override // defpackage.rt7
    public final x7b e() {
        Application application;
        Context applicationContext = L().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && c.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + L().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        x7b x7bVar = new x7b(0);
        if (application != null) {
            x7bVar.o(e8j.d, application);
        }
        x7bVar.o(yab.e, this);
        x7bVar.o(yab.f, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            x7bVar.o(yab.g, bundle);
        }
        return x7bVar;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.g19
    public final i19 f() {
        return this.o1;
    }

    public final ta7 g() {
        if (this.K == null) {
            ta7 ta7Var = new ta7();
            Object obj = t1;
            ta7Var.g = obj;
            ta7Var.h = obj;
            ta7Var.i = obj;
            ta7Var.j = null;
            this.K = ta7Var;
        }
        return this.K;
    }

    public final b h() {
        va7 va7Var = this.u;
        if (va7Var == null) {
            return null;
        }
        return va7Var.g;
    }

    public final c i() {
        if (this.u != null) {
            return this.v;
        }
        ore.k(zo5.n("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context j() {
        va7 va7Var = this.u;
        if (va7Var == null) {
            return null;
        }
        return va7Var.h;
    }

    public final int k() {
        n09 n09Var = this.n1;
        return (n09Var == n09.b || this.w == null) ? n09Var.ordinal() : Math.min(n09Var.ordinal(), this.w.k());
    }

    public final c l() {
        c cVar = this.t;
        if (cVar != null) {
            return cVar;
        }
        ore.k(zo5.n("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final String m(int i) {
        return L().getResources().getString(i);
    }

    public final void n() {
        this.o1 = new i19(this);
        this.q1 = new s68(this);
        ArrayList arrayList = this.r1;
        ra7 ra7Var = this.s1;
        if (arrayList.contains(ra7Var)) {
            return;
        }
        if (this.a < 0) {
            arrayList.add(ra7Var);
            return;
        }
        a aVar = ra7Var.a;
        aVar.q1.a();
        yab.z(aVar);
        Bundle bundle = aVar.b;
        aVar.q1.b(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void o() {
        n();
        this.Z = this.e;
        this.e = UUID.randomUUID().toString();
        this.k = false;
        this.l = false;
        this.n = false;
        this.o = false;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.v = new hb7();
        this.u = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        b bVarH = h();
        if (bVarH != null) {
            bVarH.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            ore.k(zo5.n("Fragment ", this, " not attached to an activity."));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.G = true;
    }

    public final boolean p() {
        return this.u != null && this.k;
    }

    public final boolean q() {
        if (this.A) {
            return true;
        }
        c cVar = this.t;
        if (cVar != null) {
            a aVar = this.w;
            cVar.getClass();
            if (aVar == null ? false : aVar.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.s > 0;
    }

    public void s() {
        this.G = true;
    }

    public void t(int i, int i2, Intent intent) {
        if (c.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(np0.m);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" tag=");
            sb.append(this.z);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Context context) {
        this.G = true;
        va7 va7Var = this.u;
        if ((va7Var == null ? null : va7Var.g) != null) {
            this.G = true;
        }
    }

    public void v(Bundle bundle) {
        Bundle bundle2;
        this.G = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.v.X(bundle2);
            hb7 hb7Var = this.v;
            hb7Var.G = false;
            hb7Var.H = false;
            hb7Var.N.g = false;
            hb7Var.u(1);
        }
        hb7 hb7Var2 = this.v;
        if (hb7Var2.u >= 1) {
            return;
        }
        hb7Var2.G = false;
        hb7Var2.H = false;
        hb7Var2.N.g = false;
        hb7Var2.u(1);
    }

    public void w(Menu menu, MenuInflater menuInflater) {
    }

    public void x() {
        this.G = true;
    }

    public void y() {
        this.G = true;
    }

    public void z() {
        this.G = true;
    }
}
