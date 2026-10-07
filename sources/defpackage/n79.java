package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n79 implements pca, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public yba c;
    public ExpandedMenuView d;
    public oca e;
    public m79 f;

    public n79(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    public final m79 a() {
        if (this.f == null) {
            this.f = new m79(this);
        }
        return this.f;
    }

    @Override // defpackage.pca
    public final boolean b(g7h g7hVar) {
        if (!g7hVar.hasVisibleItems()) {
            return false;
        }
        aca acaVar = new aca();
        acaVar.a = g7hVar;
        mf mfVar = new mf(g7hVar.a);
        hf hfVar = (hf) mfVar.c;
        n79 n79Var = new n79(hfVar.a);
        acaVar.c = n79Var;
        n79Var.e = acaVar;
        g7hVar.b(n79Var);
        hfVar.i = acaVar.c.a();
        hfVar.j = acaVar;
        View view = g7hVar.o;
        if (view != null) {
            hfVar.e = view;
        } else {
            hfVar.c = g7hVar.n;
            hfVar.d = g7hVar.m;
        }
        hfVar.h = acaVar;
        nf nfVarD = mfVar.d();
        acaVar.b = nfVarD;
        nfVarD.setOnDismissListener(acaVar);
        WindowManager.LayoutParams attributes = acaVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        acaVar.b.show();
        oca ocaVar = this.e;
        if (ocaVar == null) {
            return true;
        }
        ocaVar.m(g7hVar);
        return true;
    }

    @Override // defpackage.pca
    public final boolean c(cca ccaVar) {
        return false;
    }

    @Override // defpackage.pca
    public final void d(oca ocaVar) {
        this.e = ocaVar;
    }

    @Override // defpackage.pca
    public final void e() {
        m79 m79Var = this.f;
        if (m79Var != null) {
            m79Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.pca
    public final void f(yba ybaVar, boolean z) {
        oca ocaVar = this.e;
        if (ocaVar != null) {
            ocaVar.f(ybaVar, z);
        }
    }

    @Override // defpackage.pca
    public final boolean g() {
        return false;
    }

    @Override // defpackage.pca
    public final boolean h(cca ccaVar) {
        return false;
    }

    @Override // defpackage.pca
    public final void i(Context context, yba ybaVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = ybaVar;
        m79 m79Var = this.f;
        if (m79Var != null) {
            m79Var.notifyDataSetChanged();
        }
    }

    public final rca j(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f == null) {
                this.f = new m79(this);
            }
            this.d.setAdapter((ListAdapter) this.f);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.r(this.f.getItem(i), this, 0);
    }
}
