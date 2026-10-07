package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class dtb {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public af7 c;

    public dtb(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(sl0 sl0Var) {
    }

    public void d() {
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bk2) it.next()).cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        af7 af7Var = this.c;
        if (af7Var != null) {
            af7Var.invoke();
        }
    }
}
