package defpackage;

import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t09 {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public je2 e;

    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:45:0x008d, B:46:0x0090, B:48:0x009e, B:49:0x00a1, B:52:0x00a4, B:53:0x00a9, B:20:0x003b, B:21:0x003c, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:29:0x0068, B:30:0x006a, B:37:0x0078, B:39:0x007e, B:40:0x0082, B:41:0x0089, B:44:0x008c, B:31:0x006b, B:35:0x0075, B:34:0x0071, B:14:0x0033), top: B:56:0x0003, inners: #1, #2, #3 }] */
    public final void a(o09 o09Var, ec1 ec1Var, je2 je2Var) {
        Iterator it;
        o09 o09Var2;
        boolean zG;
        int i;
        synchronized (this.a) {
            try {
                qyj.i(!((List) ec1Var.h).isEmpty());
                this.e = je2Var;
                g19 g19VarT = o09Var.t();
                e(g19VarT);
                s09 s09VarC = c(g19VarT);
                if (s09VarC == null) {
                    return;
                }
                Set set = (Set) this.c.get(s09VarC);
                je2 je2Var2 = this.e;
                if (je2Var2 != null) {
                    synchronized (je2Var2.b) {
                        i = je2Var2.e;
                    }
                    if (i != 2) {
                        it = set.iterator();
                        while (it.hasNext()) {
                            o09Var2 = (o09) this.b.get((xh0) it.next());
                            o09Var2.getClass();
                            if (o09Var2.equals(o09Var) && !o09Var2.u().isEmpty()) {
                                synchronized (o09Var2.a) {
                                    ec1 ec1Var2 = o09Var2.f;
                                    zG = ec1Var2 == null ? false : ec1Var2.g();
                                }
                                if (zG || ec1Var.g()) {
                                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                                }
                                o09Var2.x();
                            }
                        }
                    }
                    throw th;
                }
                it = set.iterator();
                while (it.hasNext()) {
                    o09Var2 = (o09) this.b.get((xh0) it.next());
                    o09Var2.getClass();
                    if (o09Var2.equals(o09Var)) {
                    }
                }
                try {
                    o09Var.c(ec1Var);
                    if (g19VarT.f().d.a(n09.d)) {
                        g(g19VarT);
                    }
                } catch (CameraUseCaseAdapter$CameraException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o09 b(g19 g19Var, mi2 mi2Var, oue oueVar) {
        synchronized (this.a) {
            try {
                qyj.h("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new xh0(System.identityHashCode(g19Var), mi2Var.d)) == null);
                o09 o09Var = new o09(g19Var, mi2Var, oueVar);
                if (((ArrayList) mi2Var.y()).isEmpty()) {
                    o09Var.v();
                }
                if (g19Var.f().d == n09.a) {
                    return o09Var;
                }
                f(o09Var);
                return o09Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s09 c(g19 g19Var) {
        synchronized (this.a) {
            try {
                for (s09 s09Var : this.c.keySet()) {
                    if (g19Var.equals(s09Var.b)) {
                        return s09Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(g19 g19Var) {
        synchronized (this.a) {
            try {
                s09 s09VarC = c(g19Var);
                if (s09VarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(s09VarC)).iterator();
                while (it.hasNext()) {
                    o09 o09Var = (o09) this.b.get((xh0) it.next());
                    o09Var.getClass();
                    if (!o09Var.u().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(g19 g19Var) {
        HashMap map;
        ka kaVar;
        s09 s09VarC = c(g19Var);
        if (s09VarC == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.c.get(s09VarC);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.b;
            if (!zHasNext) {
                break;
            }
            xh0 xh0Var = (xh0) it.next();
            o09 o09Var = (o09) map.get(xh0Var);
            if (o09Var != null) {
                mi2 mi2Var = o09Var.c;
                if (mi2Var.a.a.m() || ((kaVar = mi2Var.b) != null && kaVar.a.m())) {
                    hashSet.add(xh0Var);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        tvj.g("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            o09 o09Var2 = (o09) map.get((xh0) it2.next());
            Objects.requireNonNull(o09Var2);
            l(o09Var2);
        }
    }

    public final void f(o09 o09Var) {
        synchronized (this.a) {
            try {
                g19 g19VarT = o09Var.t();
                xh0 xh0Var = new xh0(System.identityHashCode(g19VarT), o09Var.c.d);
                s09 s09VarC = c(g19VarT);
                Set hashSet = s09VarC != null ? (Set) this.c.get(s09VarC) : new HashSet();
                hashSet.add(xh0Var);
                this.b.put(xh0Var, o09Var);
                if (s09VarC == null) {
                    s09 s09Var = new s09(g19VarT, this);
                    this.c.put(s09Var, hashSet);
                    g19VarT.f().a(s09Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003a A[Catch: all -> 0x000b, TryCatch #1 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000d, B:12:0x0015, B:28:0x0047, B:29:0x004a, B:13:0x001b, B:15:0x001f, B:16:0x0021, B:18:0x0024, B:23:0x002a, B:24:0x002b, B:25:0x002c, B:27:0x003a, B:17:0x0022), top: B:35:0x0003, inners: #0 }] */
    public final void g(g19 g19Var) {
        g19 g19Var2;
        int i;
        synchronized (this.a) {
            try {
                if (d(g19Var)) {
                    if (this.d.isEmpty()) {
                        this.d.push(g19Var);
                    } else {
                        je2 je2Var = this.e;
                        if (je2Var != null) {
                            synchronized (je2Var.b) {
                                i = je2Var.e;
                            }
                            if (i != 2) {
                                g19Var2 = (g19) this.d.peek();
                                if (!g19Var.equals(g19Var2)) {
                                    i(g19Var2);
                                    this.d.remove(g19Var);
                                    this.d.push(g19Var);
                                }
                            }
                        } else {
                            g19Var2 = (g19) this.d.peek();
                            if (!g19Var.equals(g19Var2)) {
                                i(g19Var2);
                                this.d.remove(g19Var);
                                this.d.push(g19Var);
                            }
                        }
                    }
                    n(g19Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(g19 g19Var) {
        synchronized (this.a) {
            try {
                this.d.remove(g19Var);
                i(g19Var);
                if (!this.d.isEmpty()) {
                    n((g19) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(g19 g19Var) {
        synchronized (this.a) {
            try {
                s09 s09VarC = c(g19Var);
                if (s09VarC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(s09VarC)).iterator();
                while (it.hasNext()) {
                    o09 o09Var = (o09) this.b.get((xh0) it.next());
                    o09Var.getClass();
                    o09Var.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(ec1 ec1Var, HashSet hashSet) {
        Set<xh0> setKeySet = hashSet;
        synchronized (this.a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (xh0 xh0Var : setKeySet) {
                if (this.b.containsKey(xh0Var)) {
                    o09 o09Var = (o09) this.b.get(xh0Var);
                    boolean zIsEmpty = o09Var.u().isEmpty();
                    o09Var.w(ec1Var);
                    if (!zIsEmpty && o09Var.u().isEmpty()) {
                        h(o09Var.t());
                    }
                }
            }
        }
    }

    public final void k(HashSet hashSet) {
        Set setKeySet = hashSet;
        synchronized (this.a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                o09 o09Var = (o09) this.b.get((xh0) it.next());
                if (o09Var != null) {
                    o09Var.x();
                    h(o09Var.t());
                }
            }
        }
    }

    public final void l(o09 o09Var) {
        synchronized (this.a) {
            try {
                g19 g19VarT = o09Var.t();
                xh0 xh0Var = new xh0(System.identityHashCode(g19VarT), o09Var.c.d);
                this.b.remove(xh0Var);
                HashSet hashSet = new HashSet();
                for (s09 s09Var : this.c.keySet()) {
                    if (g19VarT.equals(s09Var.b)) {
                        Set set = (Set) this.c.get(s09Var);
                        set.remove(xh0Var);
                        if (set.isEmpty()) {
                            hashSet.add(s09Var.b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m((g19) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(g19 g19Var) {
        synchronized (this.a) {
            try {
                s09 s09VarC = c(g19Var);
                if (s09VarC == null) {
                    return;
                }
                h(g19Var);
                Iterator it = ((Set) this.c.get(s09VarC)).iterator();
                while (it.hasNext()) {
                    this.b.remove((xh0) it.next());
                }
                this.c.remove(s09VarC);
                s09VarC.b.f().f(s09VarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(g19 g19Var) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(c(g19Var))).iterator();
                while (it.hasNext()) {
                    o09 o09Var = (o09) this.b.get((xh0) it.next());
                    o09Var.getClass();
                    if (!o09Var.u().isEmpty()) {
                        o09Var.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
