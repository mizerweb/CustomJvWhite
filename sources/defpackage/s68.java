package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s68 {
    public boolean a;
    public final Object b;
    public Object c;

    public s68(Map map, boolean z) {
        this.b = new HashSet();
        this.c = map;
        this.a = z;
    }

    public void a() {
        c1f c1fVar = (c1f) this.b;
        i19 i19VarF = c1fVar.f();
        if (i19VarF.d != n09.b) {
            ore.k("Restarter must be created only during owner's initialization stage");
            return;
        }
        i19VarF.a(new kee(0, c1fVar));
        b1f b1fVar = (b1f) this.c;
        if (b1fVar.b) {
            ore.k("SavedStateRegistry was already attached.");
            return;
        }
        i19VarF.a(new zoe(1, b1fVar));
        b1fVar.b = true;
        this.a = true;
    }

    public void b(Bundle bundle) {
        if (!this.a) {
            a();
        }
        i19 i19VarF = ((c1f) this.b).f();
        if (i19VarF.d.a(n09.d)) {
            qr7.r(i19VarF.d, "performRestore cannot be called when owner is ");
            return;
        }
        b1f b1fVar = (b1f) this.c;
        if (!b1fVar.b) {
            ore.k("You must call performAttach() before calling performRestore(Bundle).");
        } else if (b1fVar.d) {
            ore.k("SavedStateRegistry was already restored.");
        } else {
            b1fVar.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            b1fVar.d = true;
        }
    }

    public void c(Bundle bundle) {
        b1f b1fVar = (b1f) this.c;
        b1fVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = b1fVar.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        iye iyeVar = b1fVar.a;
        iyeVar.getClass();
        fye fyeVar = new fye(iyeVar);
        iyeVar.c.put(fyeVar, Boolean.FALSE);
        while (fyeVar.hasNext()) {
            Map.Entry entry = (Map.Entry) fyeVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a1f) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(g1m g1mVar) {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(g1mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Task task) {
        g1m g1mVar;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            g1mVar = (g1m) ((ArrayDeque) this.c).poll();
                            if (g1mVar == null) {
                                this.a = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    g1mVar.b(task);
                }
            }
        }
    }

    public s68(c1f c1fVar) {
        this.b = c1fVar;
        this.c = new b1f();
    }

    public s68() {
        this.b = new Object();
    }
}
