package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.c1m;
import defpackage.do6;
import defpackage.emk;
import defpackage.fo;
import defpackage.fo7;
import defpackage.fr0;
import defpackage.go7;
import defpackage.ho7;
import defpackage.io7;
import defpackage.km7;
import defpackage.le4;
import defpackage.m5l;
import defpackage.mqk;
import defpackage.nul;
import defpackage.ore;
import defpackage.p3c;
import defpackage.pse;
import defpackage.q1l;
import defpackage.qil;
import defpackage.rai;
import defpackage.s28;
import defpackage.s80;
import defpackage.smk;
import defpackage.umk;
import defpackage.uxk;
import defpackage.v56;
import defpackage.w8l;
import defpackage.yab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements fo {
    public static final do6[] x = new do6[0];
    public volatile String a;
    public pse b;
    public final Context c;
    public final c1m d;
    public final mqk e;
    public final Object f;
    public final Object g;
    public umk h;
    public fr0 i;
    public IInterface j;
    public final ArrayList k;
    public q1l l;
    public int m;
    public final p3c n;
    public final v56 o;
    public final int p;
    public final String q;
    public volatile String r;
    public le4 s;
    public boolean t;
    public volatile qil u;
    public final AtomicInteger v;
    public final Set w;

    public a(Context context, Looper looper, int i, s80 s80Var, ho7 ho7Var, io7 io7Var, int i2) {
        synchronized (c1m.g) {
            try {
                if (c1m.h == null) {
                    if (!c1m.j) {
                        context.getPackageName();
                        c1m.j = true;
                    }
                    c1m.h = new c1m(context.getApplicationContext(), c1m.j ? c1m.a().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c1m c1mVar = c1m.h;
        Object obj = fo7.c;
        yab.s(ho7Var);
        yab.s(io7Var);
        p3c p3cVar = new p3c(25, ho7Var);
        v56 v56Var = new v56(24, io7Var);
        String str = (String) s80Var.d;
        this.a = null;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = 1;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = new AtomicInteger(0);
        yab.t(context, "Context must not be null");
        this.c = context;
        yab.t(looper, "Looper must not be null");
        yab.t(c1mVar, "Supervisor must not be null");
        this.d = c1mVar;
        this.e = new mqk(this, looper);
        this.p = i;
        this.n = p3cVar;
        this.o = v56Var;
        this.q = str;
        Set set = (Set) s80Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                ore.k("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.w = set;
    }

    @Override // defpackage.fo
    public final void a(String str) {
        this.a = str;
        m();
    }

    @Override // defpackage.fo
    public final boolean b() {
        boolean z;
        synchronized (this.f) {
            int i = this.m;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fo
    public final String c() {
        if (isConnected() && this.b != null) {
            return "com.google.android.gms";
        }
        ore.q("Failed to connect when checking package");
        return null;
    }

    @Override // defpackage.fo
    public boolean d() {
        return false;
    }

    @Override // defpackage.fo
    public final void e(s28 s28Var, Set set) {
        Bundle bundleO = o();
        String str = this.r;
        int i = this.p;
        int i2 = go7.a;
        Scope[] scopeArr = km7.o;
        Bundle bundle = new Bundle();
        do6[] do6VarArr = km7.p;
        km7 km7Var = new km7(6, i, i2, null, null, scopeArr, bundle, null, do6VarArr, do6VarArr, true, 0, false, str);
        km7Var.d = this.c.getPackageName();
        km7Var.g = bundleO;
        if (set != null) {
            km7Var.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (d()) {
            km7Var.h = new Account("<<default account>>", "com.google");
            if (s28Var != null) {
                km7Var.e = s28Var.asBinder();
            }
        }
        km7Var.i = x;
        km7Var.j = n();
        if (u()) {
            km7Var.m = true;
        }
        try {
            synchronized (this.g) {
                try {
                    umk umkVar = this.h;
                    if (umkVar != null) {
                        umkVar.G(new uxk(this, this.v.get()), km7Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.v.get();
            mqk mqkVar = this.e;
            mqkVar.sendMessage(mqkVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.v.get();
            m5l m5lVar = new m5l(this, 8, null, null);
            mqk mqkVar2 = this.e;
            mqkVar2.sendMessage(mqkVar2.obtainMessage(1, i4, -1, m5lVar));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.v.get();
            m5l m5lVar2 = new m5l(this, 8, null, null);
            mqk mqkVar3 = this.e;
            mqkVar3.sendMessage(mqkVar3.obtainMessage(1, i5, -1, m5lVar2));
        }
    }

    @Override // defpackage.fo
    public final Set f() {
        return d() ? this.w : Collections.EMPTY_SET;
    }

    @Override // defpackage.fo
    public final void g(fr0 fr0Var) {
        this.i = fr0Var;
        w(2, null);
    }

    @Override // defpackage.fo
    public final void h(rai raiVar) {
        raiVar.e();
    }

    @Override // defpackage.fo
    public final boolean isConnected() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    @Override // defpackage.fo
    public final do6[] j() {
        qil qilVar = this.u;
        if (qilVar == null) {
            return null;
        }
        return qilVar.b;
    }

    @Override // defpackage.fo
    public final String k() {
        return this.a;
    }

    public abstract IInterface l(IBinder iBinder);

    public final void m() {
        this.v.incrementAndGet();
        ArrayList arrayList = this.k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((smk) arrayList.get(i)).e();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.h = null;
        }
        w(1, null);
    }

    public do6[] n() {
        return x;
    }

    public Bundle o() {
        return new Bundle();
    }

    public final IInterface p() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.m == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.j;
                yab.t(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String q();

    public abstract String r();

    public boolean s() {
        return i() >= 211700000;
    }

    public void t() {
        System.currentTimeMillis();
    }

    public boolean u() {
        return this instanceof emk;
    }

    public final /* synthetic */ boolean v(int i, int i2, IInterface iInterface) {
        synchronized (this.f) {
            try {
                if (this.m != i) {
                    return false;
                }
                w(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(int i, IInterface iInterface) {
        pse pseVar;
        if ((i == 4) != (iInterface != null)) {
            ore.a();
            return;
        }
        synchronized (this.f) {
            try {
                this.m = i;
                this.j = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    q1l q1lVar = this.l;
                    if (q1lVar != null) {
                        c1m c1mVar = this.d;
                        String strA = this.b.a();
                        yab.s(strA);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        c1mVar.c(new nul(strA, "com.google.android.gms", this.b.b()), q1lVar);
                        this.l = null;
                    }
                } else if (i == 2 || i == 3) {
                    q1l q1lVar2 = this.l;
                    if (q1lVar2 != null && (pseVar = this.b) != null) {
                        String strA2 = pseVar.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(strA2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strA2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        c1m c1mVar2 = this.d;
                        String strA3 = this.b.a();
                        yab.s(strA3);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        boolean zB = this.b.b();
                        c1mVar2.getClass();
                        c1mVar2.c(new nul(strA3, "com.google.android.gms", zB), q1lVar2);
                        this.v.incrementAndGet();
                    }
                    q1l q1lVar3 = new q1l(this, this.v.get());
                    this.l = q1lVar3;
                    pse pseVar2 = new pse(r(), s());
                    this.b = pseVar2;
                    if (pseVar2.b() && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a())));
                    }
                    c1m c1mVar3 = this.d;
                    String strA4 = this.b.a();
                    yab.s(strA4);
                    this.b.getClass();
                    String name = this.q;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    le4 le4VarB = c1mVar3.b(new nul(strA4, "com.google.android.gms", this.b.b()), q1lVar3, name);
                    if (!(le4VarB.b == 0)) {
                        String strA5 = this.b.a();
                        this.b.getClass();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strA5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strA5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = le4VarB.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (le4VarB.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", le4VarB.c);
                        }
                        int i3 = this.v.get();
                        w8l w8lVar = new w8l(this, i2, bundle);
                        mqk mqkVar = this.e;
                        mqkVar.sendMessage(mqkVar.obtainMessage(7, i3, -1, w8lVar));
                    }
                } else if (i == 4) {
                    yab.s(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
