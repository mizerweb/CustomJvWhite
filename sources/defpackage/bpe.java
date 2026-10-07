package defpackage;

import android.content.ContextWrapper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class bpe {
    public final nee a;
    public final cf7 d;
    public final WeakReference e;
    public final i19 f;
    public boolean g;
    public mn8 h;
    public final po3 j;
    public final String k;
    public int b = -1;
    public int c = 0;
    public final zoe i = new zoe(0, this);

    public bpe(nee neeVar, RecyclerView recyclerView, cf7 cf7Var) {
        g19 g19Var;
        this.a = neeVar;
        this.d = cf7Var;
        this.e = new WeakReference(recyclerView);
        po3 po3Var = new po3(1, this);
        this.j = po3Var;
        this.k = bpe.class.getName();
        recyclerView.addOnAttachStateChangeListener(po3Var);
        Object context = recyclerView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                g19Var = null;
                break;
            } else {
                if (context instanceof g19) {
                    g19Var = (g19) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (g19Var == null) {
            String str = this.k;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "registerLifecycleObserver findLifecycleOwner() is null", null);
                }
            }
        } else {
            i19 i19VarF = g19Var.f();
            this.f = i19VarF;
            if (i19VarF != null) {
                i19VarF.a(this.i);
            }
            this.g = !g19Var.f().d.a(n09.d);
        }
        this.j.onViewAttachedToWindow(recyclerView);
    }

    public final void a(RecyclerView recyclerView) {
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "attachAdapter", null);
            }
        }
        nee neeVar = this.a;
        if (recyclerView.getAdapter() != neeVar) {
            recyclerView.setAdapter(neeVar);
        }
        if (this.b != -1) {
            vee layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.p1(this.b, this.c);
            }
        }
        mn8 mn8Var = this.h;
        if (mn8Var != null) {
            mn8Var.a(recyclerView);
        } else {
            cf7 cf7Var = this.d;
            this.h = cf7Var != null ? (mn8) cf7Var.invoke(recyclerView) : null;
        }
    }

    public final void b(RecyclerView recyclerView) {
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "detachAdapter", null);
            }
        }
        vee layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            this.b = linearLayoutManager.X0();
            View childAt = recyclerView.getChildAt(0);
            this.c = childAt != null ? childAt.getTop() : 0;
        }
        mn8 mn8Var = this.h;
        if (mn8Var != null) {
            mn8Var.b(recyclerView);
        }
        if (recyclerView.getAdapter() != null) {
            recyclerView.setAdapter(null);
        }
    }
}
