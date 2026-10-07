package defpackage;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements t25 {
    public Map a;
    public Object d = null;
    public Throwable e = null;
    public float f = 0.0f;
    public boolean c = false;
    public int b = 1;
    public final ConcurrentLinkedQueue g = new ConcurrentLinkedQueue();

    public void a(Object obj) {
    }

    public final synchronized Throwable b() {
        return this.e;
    }

    public final synchronized float c() {
        return this.f;
    }

    @Override // defpackage.t25
    public boolean close() {
        synchronized (this) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                Object obj = this.d;
                this.d = null;
                if (obj != null) {
                    a(obj);
                }
                if (!g()) {
                    h();
                }
                synchronized (this) {
                    this.g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean d() {
        return this.c;
    }

    @Override // defpackage.t25
    public synchronized Object e() {
        return this.d;
    }

    @Override // defpackage.t25
    public synchronized boolean f() {
        return this.d != null;
    }

    public final synchronized boolean g() {
        return this.b != 1;
    }

    public final void h() {
        boolean z;
        synchronized (this) {
            z = this.b == 3;
        }
        boolean zM = m();
        for (Pair pair : this.g) {
            ((Executor) pair.second).execute(new o0(this, z, (d35) pair.first, zM));
        }
    }

    public final boolean i(Throwable th, Map map) {
        boolean z;
        synchronized (this) {
            if (this.c) {
                z = false;
            } else {
                z = true;
                if (this.b != 1) {
                    z = false;
                } else {
                    this.b = 3;
                    this.e = th;
                    this.a = map;
                }
            }
        }
        if (z) {
            h();
        }
        return z;
    }

    public final boolean j(float f) {
        int i;
        boolean z;
        synchronized (this) {
            i = 0;
            if (this.c) {
                z = false;
            } else {
                z = true;
                if (this.b != 1) {
                    z = false;
                } else if (f < this.f) {
                    z = false;
                } else {
                    this.f = f;
                }
            }
        }
        if (z) {
            for (Pair pair : this.g) {
                ((Executor) pair.second).execute(new p0(this, i, (d35) pair.first));
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0029 A[PHI: r1 r3
  0x0029: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r3v7 java.lang.Object) = (r3v0 java.lang.Object), (r3v10 java.lang.Object) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003c). Please report as a decompilation issue!!! */
    public boolean k(Object obj, boolean z, Map map) {
        boolean z2;
        this.a = map;
        Object obj2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (this.c) {
                            z2 = false;
                            if (obj != null) {
                                a(obj);
                            }
                        } else {
                            z2 = true;
                            if (this.b != 1) {
                                z2 = false;
                                if (obj != null) {
                                    a(obj);
                                }
                            } else {
                                if (z) {
                                    this.b = 2;
                                    this.f = 1.0f;
                                }
                                Object obj3 = this.d;
                                if (obj3 != obj) {
                                    try {
                                        this.d = obj;
                                        obj = obj3;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj2 = obj3;
                                        throw th;
                                    }
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    a(obj);
                                }
                            }
                        }
                        if (z2) {
                            h();
                        }
                        return z2;
                    } catch (Throwable th2) {
                        obj2 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (obj2 != null) {
                a(obj2);
            }
            throw th4;
        }
    }

    public final void l(d35 d35Var, Executor executor) {
        boolean z;
        executor.getClass();
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                if (this.b == 1) {
                    this.g.add(Pair.create(d35Var, executor));
                }
                boolean z2 = f() || g() || m();
                if (z2) {
                    synchronized (this) {
                        z = this.b == 3;
                    }
                    executor.execute(new o0(this, z, d35Var, m()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean m() {
        return d() && !g();
    }
}
