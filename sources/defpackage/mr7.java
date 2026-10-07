package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mr7(nr7 nr7Var, Runnable runnable, int i) {
        this.c = nr7Var;
        this.d = runnable;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nr7 nr7Var = (nr7) this.c;
                Runnable runnable = (Runnable) this.d;
                int i = this.b;
                WeakReference weakReference = (WeakReference) nr7Var.c.get();
                RecyclerView recyclerView = weakReference != null ? (RecyclerView) weakReference.get() : null;
                if (recyclerView == null || !recyclerView.Y()) {
                    runnable.run();
                } else if (i < 16) {
                    nr7Var.b.post(new mr7(nr7Var, runnable, i + 1));
                } else {
                    String str = nr7Var.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Guarded dispatch cap (16) exhausted; running notify despite RV computing layout. RV -> " + recyclerView, null);
                        }
                    }
                    runnable.run();
                }
                break;
            default:
                CopyOnWriteArraySet<t89> copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i2 = this.b;
                r89 r89Var = (r89) this.d;
                for (t89 t89Var : copyOnWriteArraySet) {
                    if (!t89Var.d) {
                        if (i2 != -1) {
                            t89Var.b.a(i2);
                        }
                        t89Var.c = true;
                        r89Var.invoke(t89Var.a);
                    }
                }
                break;
        }
    }

    public /* synthetic */ mr7(CopyOnWriteArraySet copyOnWriteArraySet, int i, r89 r89Var) {
        this.c = copyOnWriteArraySet;
        this.b = i;
        this.d = r89Var;
    }
}
