package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ltb {
    public final Runnable a;
    public final zv b = new zv();
    public dtb c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public ltb(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = itb.a.a(new etb(this, 0), new etb(this, 1), new ftb(this, 0), new ftb(this, 1));
            } else {
                onBackInvokedCallbackA = gtb.a.a(new ftb(this, 2));
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a(g19 g19Var, dtb dtbVar) {
        i19 i19VarF = g19Var.f();
        if (i19VarF.d == n09.a) {
            return;
        }
        dtbVar.b.add(new jtb(this, i19VarF, dtbVar));
        f();
        dtbVar.c = new fl9(0, this, ltb.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
    }

    public final ktb b(dtb dtbVar) {
        this.b.addLast(dtbVar);
        ktb ktbVar = new ktb(this, dtbVar);
        dtbVar.b.add(ktbVar);
        f();
        dtbVar.c = new fl9(0, this, ltb.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        return ktbVar;
    }

    public final void c() {
        Object objPrevious;
        dtb dtbVar = this.c;
        if (dtbVar == null) {
            zv zvVar = this.b;
            ListIterator<E> listIterator = zvVar.listIterator(zvVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((dtb) objPrevious).a);
            dtbVar = (dtb) objPrevious;
        }
        this.c = null;
        if (dtbVar != null) {
            dtbVar.a();
        }
    }

    public final void d() {
        Object objPrevious;
        dtb dtbVar = this.c;
        if (dtbVar == null) {
            zv zvVar = this.b;
            ListIterator listIterator = zvVar.listIterator(zvVar.getSize());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((dtb) objPrevious).a);
            dtbVar = (dtb) objPrevious;
        }
        this.c = null;
        if (dtbVar != null) {
            dtbVar.b();
        } else {
            this.a.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        gtb gtbVar = gtb.a;
        if (z && !this.f) {
            gtbVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            gtbVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        boolean z2 = false;
        zv zvVar = this.b;
        if (zvVar == null || !zvVar.isEmpty()) {
            Iterator it = zvVar.iterator();
            while (it.hasNext()) {
                if (((dtb) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }
}
