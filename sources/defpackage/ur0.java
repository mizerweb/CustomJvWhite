package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ur0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final ed7 c = new ed7(new CopyOnWriteArrayList(), 0, (x4a) null);
    public final av5 d = new av5(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public ush f;
    public z3d g;

    public final void a(Handler handler, bv5 bv5Var) {
        handler.getClass();
        av5 av5Var = this.d;
        av5Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = av5Var.c;
        zu5 zu5Var = new zu5();
        zu5Var.a = handler;
        zu5Var.b = bv5Var;
        copyOnWriteArrayList.add(zu5Var);
    }

    public final void b(Handler handler, c5a c5aVar) {
        handler.getClass();
        ed7 ed7Var = this.c;
        ed7Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ed7Var.d;
        b5a b5aVar = new b5a();
        b5aVar.a = handler;
        b5aVar.b = c5aVar;
        copyOnWriteArrayList.add(b5aVar);
    }

    public boolean c(ry9 ry9Var) {
        return this instanceof e94;
    }

    public final ed7 d(x4a x4aVar) {
        return new ed7((CopyOnWriteArrayList) this.c.d, 0, x4aVar);
    }

    public abstract u0a e(x4a x4aVar, qf qfVar, long j);

    public final void f(y4a y4aVar) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(y4aVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        g();
    }

    public void g() {
    }

    public final void h(y4a y4aVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(y4aVar);
        if (zIsEmpty) {
            i();
        }
    }

    public void i() {
    }

    public ush j() {
        return null;
    }

    public abstract ry9 k();

    public boolean l() {
        return !(this instanceof f94);
    }

    public abstract void m();

    public final void n(y4a y4aVar, v1i v1iVar, z3d z3dVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        lvb.R(looper == null || looper == looperMyLooper);
        this.g = z3dVar;
        ush ushVar = this.f;
        this.a.add(y4aVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(y4aVar);
            o(v1iVar);
        } else if (ushVar != null) {
            h(y4aVar);
            y4aVar.a(this, ushVar);
        }
    }

    public abstract void o(v1i v1iVar);

    public final void p(ush ushVar) {
        this.f = ushVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y4a) it.next()).a(this, ushVar);
        }
    }

    public abstract void q(u0a u0aVar);

    public final void r(y4a y4aVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(y4aVar);
        if (!arrayList.isEmpty()) {
            f(y4aVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        s();
    }

    public abstract void s();

    public final void t(bv5 bv5Var) {
        CopyOnWriteArrayList<zu5> copyOnWriteArrayList = this.d.c;
        for (zu5 zu5Var : copyOnWriteArrayList) {
            if (zu5Var.b == bv5Var) {
                copyOnWriteArrayList.remove(zu5Var);
            }
        }
    }

    public final void u(c5a c5aVar) {
        CopyOnWriteArrayList<b5a> copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        for (b5a b5aVar : copyOnWriteArrayList) {
            if (b5aVar.b == c5aVar) {
                copyOnWriteArrayList.remove(b5aVar);
            }
        }
    }

    public void v(ry9 ry9Var) {
    }
}
