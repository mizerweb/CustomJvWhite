package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class p79 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ w79 a;

    public p79(w79 w79Var) {
        this.a = w79Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        kv5 kv5Var;
        if (i == -1 || (kv5Var = this.a.c) == null) {
            return;
        }
        kv5Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
