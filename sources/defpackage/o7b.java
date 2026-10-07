package defpackage;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class o7b {
    public final Object a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public Closeable c;
    public float d;
    public int e;
    public es0 f;
    public p3 g;
    public final /* synthetic */ by0 h;

    public o7b(by0 by0Var, Object obj) {
        this.h = by0Var;
        this.a = obj;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                qr7.o(e);
            }
        }
    }

    public final boolean a(lq0 lq0Var, es0 es0Var) {
        o7b o7bVar;
        Pair pairCreate = Pair.create(lq0Var, es0Var);
        synchronized (this) {
            try {
                by0 by0Var = this.h;
                Object obj = this.a;
                synchronized (by0Var) {
                    o7bVar = (o7b) by0Var.a.get(obj);
                }
                if (o7bVar != this) {
                    return false;
                }
                this.b.add(pairCreate);
                ArrayList arrayListK = k();
                ArrayList arrayListL = l();
                ArrayList arrayListJ = j();
                Closeable closeableC = this.c;
                float f = this.d;
                int i = this.e;
                es0.c(arrayListK);
                es0.d(arrayListL);
                es0.b(arrayListJ);
                synchronized (pairCreate) {
                    try {
                        synchronized (this) {
                            try {
                                if (closeableC != this.c) {
                                    closeableC = null;
                                } else if (closeableC != null) {
                                    closeableC = this.h.c(closeableC);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (closeableC != null) {
                            if (f > 0.0f) {
                                lq0Var.i(f);
                            }
                            lq0Var.g(i, closeableC);
                            b(closeableC);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                es0Var.a(new r68(this, 1, pairCreate));
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized boolean c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((es0) ((Pair) it.next()).second).f()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (!((es0) ((Pair) it.next()).second).g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized whd e() {
        whd whdVar;
        whd whdVar2;
        whdVar = whd.a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            es0 es0Var = (es0) ((Pair) it.next()).second;
            synchronized (es0Var) {
                whdVar2 = es0Var.h;
            }
            if (whdVar.ordinal() <= whdVar2.ordinal()) {
                whdVar = whdVar2;
            }
        }
        return whdVar;
    }

    public final void f(p3 p3Var, Throwable th) {
        synchronized (this) {
            try {
                if (this.g != p3Var) {
                    return;
                }
                this.b.clear();
                this.h.d(this.a, this);
                b(this.c);
                this.c = null;
                for (Pair pair : this.b) {
                    synchronized (pair) {
                        try {
                            Object obj = pair.second;
                            ((es0) obj).c.b((es0) obj, this.h.c, th, null);
                            es0 es0Var = this.f;
                            if (es0Var != null) {
                                ((es0) pair.second).putExtras(es0Var.f);
                            }
                            ((lq0) pair.first).e(th);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g(p3 p3Var, Closeable closeable, int i) {
        synchronized (this) {
            try {
                if (this.g != p3Var) {
                    return;
                }
                b(this.c);
                this.c = null;
                int size = this.b.size();
                if (lq0.b(i)) {
                    this.c = this.h.c(closeable);
                    this.e = i;
                } else {
                    this.b.clear();
                    this.h.d(this.a, this);
                }
                for (Pair pair : this.b) {
                    synchronized (pair) {
                        try {
                            if (lq0.a(i)) {
                                Object obj = pair.second;
                                ((es0) obj).c.d((es0) obj, this.h.c, null);
                                es0 es0Var = this.f;
                                if (es0Var != null) {
                                    ((es0) pair.second).putExtras(es0Var.f);
                                }
                                ((es0) pair.second).putExtra(this.h.d, Integer.valueOf(size));
                            }
                            ((lq0) pair.first).g(i, closeable);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(p3 p3Var, float f) {
        synchronized (this) {
            try {
                if (this.g != p3Var) {
                    return;
                }
                this.d = f;
                for (Pair pair : this.b) {
                    synchronized (pair) {
                        ((lq0) pair.first).i(f);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(int i) {
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                oc9.i(Boolean.valueOf(this.f == null));
                oc9.i(Boolean.valueOf(this.g == null));
                if (this.b.isEmpty()) {
                    this.h.d(this.a, this);
                    return;
                }
                es0 es0Var = (es0) ((Pair) this.b.iterator().next()).second;
                es0 es0Var2 = new es0(es0Var.a, es0Var.b, null, es0Var.c, es0Var.d, es0Var.e, d(), c(), e(), es0Var.l);
                this.f = es0Var2;
                es0Var2.putExtras(es0Var.f);
                qt4.c(i);
                if (i != 3) {
                    es0 es0Var3 = this.f;
                    int iD = qt4.D(i);
                    if (iD == 0) {
                        z = true;
                    } else if (iD != 1) {
                        if (iD == 2) {
                            throw new IllegalStateException("No boolean equivalent for UNSET");
                        }
                        if (i == 1) {
                            str = "YES";
                        } else if (i != 2) {
                            str = i != 3 ? "null" : "UNSET";
                        } else {
                            str = "NO";
                        }
                        throw new IllegalStateException("Unrecognized TriState value: ".concat(str));
                    }
                    es0Var3.putExtra("started_as_prefetch", Boolean.valueOf(z));
                }
                p3 p3Var = new p3(1, this);
                this.g = p3Var;
                this.h.b.b(p3Var, this.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList j() {
        es0 es0Var = this.f;
        ArrayList arrayList = null;
        if (es0Var == null) {
            return null;
        }
        boolean zC = c();
        synchronized (es0Var) {
            if (zC != es0Var.i) {
                es0Var.i = zC;
                arrayList = new ArrayList(es0Var.k);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList k() {
        es0 es0Var = this.f;
        ArrayList arrayList = null;
        if (es0Var == null) {
            return null;
        }
        boolean zD = d();
        synchronized (es0Var) {
            if (zD != es0Var.g) {
                es0Var.g = zD;
                arrayList = new ArrayList(es0Var.k);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList l() {
        es0 es0Var = this.f;
        ArrayList arrayList = null;
        if (es0Var == null) {
            return null;
        }
        whd whdVarE = e();
        synchronized (es0Var) {
            if (whdVarE != es0Var.h) {
                es0Var.h = whdVarE;
                arrayList = new ArrayList(es0Var.k);
            }
        }
        return arrayList;
    }
}
