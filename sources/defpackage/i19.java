package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class i19 {
    public final AtomicReference a = new AtomicReference(null);
    public final boolean b = true;
    public ml6 c = new ml6();
    public n09 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final mjg j;

    public i19(g19 g19Var) {
        n09 n09Var = n09.b;
        this.d = n09Var;
        this.i = new ArrayList();
        this.e = new WeakReference(g19Var);
        this.j = p90.a(n09Var);
    }

    public final void a(c19 c19Var) {
        z09 qz8Var;
        Object obj;
        g19 g19Var;
        m09 m09Var;
        c("addObserver");
        n09 n09Var = this.d;
        n09 n09Var2 = n09.a;
        if (n09Var != n09Var2) {
            n09Var2 = n09.b;
        }
        h19 h19Var = new h19();
        HashMap map = j19.a;
        boolean z = c19Var instanceof z09;
        boolean z2 = c19Var instanceof sb5;
        if (z && z2) {
            qz8Var = new ub5((sb5) c19Var, (z09) c19Var);
        } else if (z2) {
            qz8Var = new ub5((sb5) c19Var, null);
        } else if (z) {
            qz8Var = (z09) c19Var;
        } else {
            Class<?> cls = c19Var.getClass();
            if (j19.b(cls) == 2) {
                List list = (List) j19.b.get(cls);
                if (list.size() == 1) {
                    j19.a((Constructor) list.get(0), c19Var);
                    throw null;
                }
                int size = list.size();
                kj7[] kj7VarArr = new kj7[size];
                if (size > 0) {
                    j19.a((Constructor) list.get(0), c19Var);
                    throw null;
                }
                qz8Var = new z74(kj7VarArr);
            } else {
                qz8Var = new qz8(c19Var);
            }
        }
        h19Var.b = qz8Var;
        h19Var.a = n09Var2;
        ml6 ml6Var = this.c;
        eye eyeVarA = ml6Var.a(c19Var);
        if (eyeVarA != null) {
            obj = eyeVarA.b;
        } else {
            HashMap map2 = ml6Var.e;
            eye eyeVar = new eye(c19Var, h19Var);
            ml6Var.d++;
            eye eyeVar2 = ml6Var.b;
            if (eyeVar2 == null) {
                ml6Var.a = eyeVar;
                ml6Var.b = eyeVar;
            } else {
                eyeVar2.c = eyeVar;
                eyeVar.d = eyeVar2;
                ml6Var.b = eyeVar;
            }
            map2.put(c19Var, eyeVar);
            obj = null;
        }
        if (((h19) obj) == null && (g19Var = (g19) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            n09 n09VarB = b(c19Var);
            this.f++;
            while (h19Var.a.compareTo(n09VarB) < 0 && this.c.e.containsKey(c19Var)) {
                n09 n09Var3 = h19Var.a;
                ArrayList arrayList = this.i;
                arrayList.add(n09Var3);
                k09 k09Var = m09.Companion;
                n09 n09Var4 = h19Var.a;
                k09Var.getClass();
                int iOrdinal = n09Var4.ordinal();
                if (iOrdinal == 1) {
                    m09Var = m09.ON_CREATE;
                } else if (iOrdinal != 2) {
                    m09Var = iOrdinal != 3 ? null : m09.ON_RESUME;
                } else {
                    m09Var = m09.ON_START;
                }
                if (m09Var == null) {
                    qr7.x(h19Var.a, "no event up from ");
                    return;
                } else {
                    h19Var.a(g19Var, m09Var);
                    arrayList.remove(arrayList.size() - 1);
                    n09VarB = b(c19Var);
                }
            }
            if (!z3) {
                h();
            }
            this.f--;
        }
    }

    public final n09 b(c19 c19Var) {
        h19 h19Var;
        HashMap map = this.c.e;
        eye eyeVar = map.containsKey(c19Var) ? ((eye) map.get(c19Var)).d : null;
        n09 n09Var = (eyeVar == null || (h19Var = (h19) eyeVar.b) == null) ? null : h19Var.a;
        ArrayList arrayList = this.i;
        n09 n09Var2 = arrayList.isEmpty() ? null : (n09) qv1.f(1, arrayList);
        n09 n09Var3 = this.d;
        if (n09Var == null || n09Var.compareTo(n09Var3) >= 0) {
            n09Var = n09Var3;
        }
        return (n09Var2 == null || n09Var2.compareTo(n09Var) >= 0) ? n09Var : n09Var2;
    }

    public final void c(String str) {
        if (this.b) {
            tv.S().k.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            ore.c(c0a.o("Method ", str, " must be called on the main thread"));
        }
    }

    public final void d(m09 m09Var) {
        c("handleLifecycleEvent");
        e(m09Var.a());
    }

    public final void e(n09 n09Var) {
        n09 n09Var2 = this.d;
        if (n09Var2 == n09Var) {
            return;
        }
        n09 n09Var3 = n09.b;
        n09 n09Var4 = n09.a;
        if (n09Var2 == n09Var3 && n09Var == n09Var4) {
            StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
            sb.append(n09Var);
            sb.append(", but was ");
            sb.append(this.d);
            qr7.n(sb, " in component ", this.e.get());
            return;
        }
        this.d = n09Var;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.d == n09Var4) {
            this.c = new ml6();
        }
    }

    public final void f(c19 c19Var) {
        c("removeObserver");
        this.c.b(c19Var);
    }

    public final void g(n09 n09Var) {
        c("setCurrentState");
        e(n09Var);
    }

    public final void h() {
        n09 n09Var;
        n09 n09Var2;
        m09 m09Var;
        m09 m09Var2;
        g19 g19Var = (g19) this.e.get();
        if (g19Var == null) {
            ore.k("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            ml6 ml6Var = this.c;
            if (ml6Var.d == 0 || ((n09Var = ((h19) ml6Var.a.b).a) == (n09Var2 = ((h19) ml6Var.b.b).a) && this.d == n09Var2)) {
                break;
            }
            this.h = false;
            int iCompareTo = this.d.compareTo(n09Var);
            ArrayList arrayList = this.i;
            if (iCompareTo < 0) {
                ml6 ml6Var2 = this.c;
                dye dyeVar = new dye(ml6Var2.b, ml6Var2.a);
                ml6Var2.c.put(dyeVar, Boolean.FALSE);
                while (dyeVar.hasNext() && !this.h) {
                    Map.Entry entry = (Map.Entry) dyeVar.next();
                    c19 c19Var = (c19) entry.getKey();
                    h19 h19Var = (h19) entry.getValue();
                    while (h19Var.a.compareTo(this.d) > 0 && !this.h && this.c.e.containsKey(c19Var)) {
                        k09 k09Var = m09.Companion;
                        n09 n09Var3 = h19Var.a;
                        k09Var.getClass();
                        int iOrdinal = n09Var3.ordinal();
                        if (iOrdinal == 2) {
                            m09Var2 = m09.ON_DESTROY;
                        } else if (iOrdinal != 3) {
                            m09Var2 = iOrdinal != 4 ? null : m09.ON_PAUSE;
                        } else {
                            m09Var2 = m09.ON_STOP;
                        }
                        if (m09Var2 == null) {
                            qr7.x(h19Var.a, "no event down from ");
                            return;
                        } else {
                            arrayList.add(m09Var2.a());
                            h19Var.a(g19Var, m09Var2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            eye eyeVar = this.c.b;
            if (!this.h && eyeVar != null && this.d.compareTo(((h19) eyeVar.b).a) > 0) {
                ml6 ml6Var3 = this.c;
                ml6Var3.getClass();
                fye fyeVar = new fye(ml6Var3);
                ml6Var3.c.put(fyeVar, Boolean.FALSE);
                while (fyeVar.hasNext() && !this.h) {
                    Map.Entry entry2 = (Map.Entry) fyeVar.next();
                    c19 c19Var2 = (c19) entry2.getKey();
                    h19 h19Var2 = (h19) entry2.getValue();
                    while (h19Var2.a.compareTo(this.d) < 0 && !this.h && this.c.e.containsKey(c19Var2)) {
                        arrayList.add(h19Var2.a);
                        k09 k09Var2 = m09.Companion;
                        n09 n09Var4 = h19Var2.a;
                        k09Var2.getClass();
                        int iOrdinal2 = n09Var4.ordinal();
                        if (iOrdinal2 == 1) {
                            m09Var = m09.ON_CREATE;
                        } else if (iOrdinal2 != 2) {
                            m09Var = iOrdinal2 != 3 ? null : m09.ON_RESUME;
                        } else {
                            m09Var = m09.ON_START;
                        }
                        if (m09Var == null) {
                            qr7.x(h19Var2.a, "no event up from ");
                            return;
                        } else {
                            h19Var2.a(g19Var, m09Var);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
        }
        this.h = false;
        this.j.setValue(this.d);
    }
}
