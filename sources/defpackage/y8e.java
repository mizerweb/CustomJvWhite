package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class y8e implements Cloneable {
    public final qsb a;
    public final dle b;
    public final boolean c;
    public final e9e d;
    public final lc6 e;
    public final x8e f;
    public final AtomicBoolean g;
    public Object h;
    public kd6 i;
    public c9e j;
    public boolean k;
    public yf2 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public volatile yf2 q;
    public volatile c9e r;

    public y8e(qsb qsbVar, dle dleVar, boolean z) {
        this.a = qsbVar;
        this.b = dleVar;
        this.c = z;
        this.d = (e9e) qsbVar.b.a;
        this.e = (lc6) qsbVar.e.a;
        x8e x8eVar = new x8e(this);
        x8eVar.g(0L, TimeUnit.MILLISECONDS);
        this.f = x8eVar;
        this.g = new AtomicBoolean();
        this.o = true;
    }

    public static final String a(y8e y8eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(y8eVar.p ? "canceled " : "");
        sb.append(y8eVar.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(y8eVar.b.a.h());
        return sb.toString();
    }

    public final void b(c9e c9eVar) {
        byte[] bArr = uqi.a;
        if (this.j != null) {
            ore.k("Check failed.");
        } else {
            this.j = c9eVar;
            c9eVar.p.add(new w8e(this, this.h));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketK;
        byte[] bArr = uqi.a;
        c9e c9eVar = this.j;
        if (c9eVar != null) {
            synchronized (c9eVar) {
                socketK = k();
            }
            if (this.j == null) {
                if (socketK != null) {
                    uqi.e(socketK);
                }
            } else if (socketK != null) {
                ore.k("Check failed.");
                return null;
            }
        }
        if (!this.k && this.f.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        lc6 lc6Var = this.e;
        if (iOException != null) {
            lc6Var.b(this, interruptedIOException);
            return interruptedIOException;
        }
        lc6Var.a(this);
        return interruptedIOException;
    }

    public final Object clone() {
        return new y8e(this.a, this.b, this.c);
    }

    public final void d() {
        Socket socket;
        if (this.p) {
            return;
        }
        this.p = true;
        yf2 yf2Var = this.q;
        if (yf2Var != null) {
            ((jd6) yf2Var.e).cancel();
        }
        c9e c9eVar = this.r;
        if (c9eVar == null || (socket = c9eVar.c) == null) {
            return;
        }
        uqi.e(socket);
    }

    public final void e(m72 m72Var) {
        v8e v8eVar;
        if (!this.g.compareAndSet(false, true)) {
            ore.k("Already Executed");
            return;
        }
        i2d i2dVar = i2d.a;
        this.h = i2d.a.g();
        this.e.c(this);
        gvb gvbVar = this.a.a;
        v8e v8eVar2 = new v8e(this, m72Var);
        synchronized (gvbVar) {
            ((ArrayDeque) gvbVar.c).add(v8eVar2);
            if (!this.c) {
                String str = this.b.a.d;
                Iterator it = ((ArrayDeque) gvbVar.d).iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) gvbVar.c).iterator();
                        do {
                            if (!it2.hasNext()) {
                                v8eVar = null;
                                break;
                            }
                            v8eVar = (v8e) it2.next();
                        } while (!cqk.d(v8eVar.c.b.a.d, str));
                    } else {
                        v8eVar = (v8e) it.next();
                    }
                } while (!cqk.d(v8eVar.c.b.a.d, str));
                if (v8eVar != null) {
                    v8eVar2.b = v8eVar.b;
                }
            }
        }
        gvbVar.R();
    }

    public final pne f() {
        if (!this.g.compareAndSet(false, true)) {
            ore.k("Already Executed");
            return null;
        }
        this.f.i();
        i2d i2dVar = i2d.a;
        this.h = i2d.a.g();
        this.e.c(this);
        try {
            gvb gvbVar = this.a.a;
            synchronized (gvbVar) {
                ((ArrayDeque) gvbVar.a).add(this);
            }
            pne pneVarH = h();
            gvb gvbVar2 = this.a.a;
            gvbVar2.r((ArrayDeque) gvbVar2.a, this);
            return pneVarH;
        } catch (Throwable th) {
            gvb gvbVar3 = this.a.a;
            gvbVar3.r((ArrayDeque) gvbVar3.a, this);
            throw th;
        }
    }

    public final void g(boolean z) {
        yf2 yf2Var;
        synchronized (this) {
            if (!this.o) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (yf2Var = this.q) != null) {
            ((jd6) yf2Var.e).cancel();
            ((y8e) yf2Var.b).i(yf2Var, true, true, null);
        }
        this.l = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    public final pne h() throws Throwable {
        ArrayList arrayList = new ArrayList();
        cx3.Z0(this.a.c, arrayList);
        boolean z = true;
        arrayList.add(new x21(1, this.a));
        arrayList.add(new x21(0, this.a.j));
        arrayList.add(new q71(0));
        arrayList.add(q71.b);
        if (!this.c) {
            cx3.Z0(this.a.d, arrayList);
        }
        arrayList.add(new l02(this.c));
        dle dleVar = this.b;
        qsb qsbVar = this.a;
        try {
            pne pneVarB = new f9e(this, arrayList, 0, null, dleVar, qsbVar.v, qsbVar.w, qsbVar.x).b(dleVar);
            if (this.p) {
                uqi.d(pneVarB);
                throw new IOException("Canceled");
            }
            j(null);
            return pneVarB;
        } catch (IOException e) {
            try {
                throw j(e);
            } catch (Throwable th) {
                th = th;
                if (!z) {
                    j(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                j(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x001d A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:14:0x0017), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0021 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:14:0x0017), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002d  */
    public final IOException i(yf2 yf2Var, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (yf2Var.equals(this.q)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.m) {
                            if (z) {
                                this.m = false;
                            }
                            if (z2) {
                                this.n = false;
                            }
                            z5 = this.m;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.n) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.m = false;
                            }
                            if (z2) {
                                this.n = false;
                            }
                            z5 = this.m;
                            if (z5 || this.n) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.n && !this.o) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.q = null;
                c9e c9eVar = this.j;
                if (c9eVar != null) {
                    synchronized (c9eVar) {
                        c9eVar.m++;
                    }
                }
            }
            if (z4) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.o) {
                this.o = false;
                if (!this.m && !this.n) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        c9e c9eVar = this.j;
        byte[] bArr = uqi.a;
        ArrayList arrayList = c9eVar.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (cqk.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            ore.k("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.j = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c9eVar.q = System.nanoTime();
        e9e e9eVar = this.d;
        ConcurrentLinkedQueue concurrentLinkedQueue = e9eVar.d;
        fkh fkhVar = e9eVar.b;
        byte[] bArr2 = uqi.a;
        if (!c9eVar.j) {
            fkhVar.c(e9eVar.c, 0L);
            return null;
        }
        c9eVar.j = true;
        concurrentLinkedQueue.remove(c9eVar);
        if (concurrentLinkedQueue.isEmpty()) {
            fkhVar.a();
        }
        return c9eVar.d;
    }
}
