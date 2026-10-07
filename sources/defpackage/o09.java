package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o09 implements c19, nc2 {
    public final g19 b;
    public final mi2 c;
    public final oue d;
    public final Object a = new Object();
    public boolean e = false;
    public ec1 f = null;

    public o09(g19 g19Var, mi2 mi2Var, oue oueVar) {
        this.b = g19Var;
        this.c = mi2Var;
        this.d = oueVar;
        if (g19Var.f().d.a(n09.d)) {
            mi2Var.r();
        } else {
            mi2Var.u();
        }
        g19Var.f().a(this);
    }

    public static void z(List list, oue oueVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            if (cliVar.o()) {
                synchronized (cliVar.d) {
                    cliVar.q = oueVar;
                }
            }
        }
    }

    @Override // defpackage.nc2
    public final nf2 a() {
        return this.c.a.b;
    }

    public final void c(ec1 ec1Var) {
        synchronized (this.a) {
            try {
                if (this.f == null) {
                    this.f = ec1Var;
                } else {
                    boolean zG = ec1Var.g();
                    ec1 ec1Var2 = this.f;
                    if (zG) {
                        if (!ec1Var2.g()) {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                        ArrayList arrayList = new ArrayList((List) this.f.h);
                        arrayList.addAll((List) ec1Var.h);
                        this.f = new ec1(arrayList, (b9j) ec1Var.c, (List) ec1Var.d);
                    } else {
                        if (ec1Var2.g()) {
                            throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                        }
                        this.f = ec1Var;
                        mi2 mi2Var = this.c;
                        mi2Var.A((ArrayList) mi2Var.y());
                    }
                }
                mi2 mi2Var2 = this.c;
                b9j b9jVar = (b9j) ec1Var.c;
                synchronized (mi2Var2.m) {
                    mi2Var2.h = b9jVar;
                }
                mi2 mi2Var3 = this.c;
                List list = (List) ec1Var.d;
                synchronized (mi2Var3.m) {
                    mi2Var3.i = list;
                }
                mi2 mi2Var4 = this.c;
                int iF = ec1Var.f();
                synchronized (mi2Var4.m) {
                    mi2Var4.j = iF;
                }
                mi2 mi2Var5 = this.c;
                Range range = (Range) ec1Var.e;
                synchronized (mi2Var5.m) {
                    mi2Var5.k = range;
                }
                rj5 rj5VarM = iw8.m(ec1Var, a());
                ((us7) ec1Var.j).execute(new su6(rj5VarM, 9, ec1Var));
                this.c.c((List) ec1Var.h, rj5VarM);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @utb(m09.ON_DESTROY)
    public void onDestroy(g19 g19Var) {
        synchronized (this.a) {
            mi2 mi2Var = this.c;
            mi2Var.A((ArrayList) mi2Var.y());
        }
    }

    @utb(m09.ON_PAUSE)
    public void onPause(g19 g19Var) {
        this.c.a.g(false);
    }

    @utb(m09.ON_RESUME)
    public void onResume(g19 g19Var) {
        this.c.a.g(true);
    }

    @utb(m09.ON_START)
    public void onStart(g19 g19Var) {
        synchronized (this.a) {
            try {
                if (!this.e) {
                    this.c.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @utb(m09.ON_STOP)
    public void onStop(g19 g19Var) {
        synchronized (this.a) {
            try {
                if (!this.e) {
                    this.c.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final be2 r() {
        return this.c.a.c;
    }

    public final g19 t() {
        g19 g19Var;
        synchronized (this.a) {
            g19Var = this.b;
        }
        return g19Var;
    }

    public final List u() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.y());
        }
        return listUnmodifiableList;
    }

    public final void v() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                onStop(this.b);
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(ec1 ec1Var) {
        ec1 ec1Var2;
        synchronized (this.a) {
            try {
                ec1 ec1Var3 = this.f;
                if (ec1Var3 != null && ec1Var3.g() == ec1Var.b) {
                    if (this.f.g() || ec1Var.b) {
                        if (this.f.g() && ec1Var.b) {
                            ArrayList arrayList = new ArrayList((List) this.f.h);
                            arrayList.removeAll((List) ec1Var.h);
                            if (arrayList.isEmpty()) {
                                ec1Var2 = null;
                            } else {
                                ec1 ec1Var4 = this.f;
                                ec1Var2 = new ec1(arrayList, (b9j) ec1Var4.c, (List) ec1Var4.d);
                            }
                            this.f = ec1Var2;
                        }
                    } else if (this.f != ec1Var) {
                        return;
                    } else {
                        this.f = null;
                    }
                    ArrayList arrayList2 = new ArrayList((List) ec1Var.h);
                    arrayList2.retainAll(this.c.y());
                    this.c.A(arrayList2);
                    z(arrayList2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x() {
        synchronized (this.a) {
            List listY = this.c.y();
            this.c.A((ArrayList) listY);
            z(listY, null);
            this.f = null;
        }
    }

    public final void y() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    this.e = false;
                    if (this.b.f().d.a(n09.d)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
