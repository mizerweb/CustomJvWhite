package defpackage;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes3.dex */
public final class fzb implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ izb b;
    public final /* synthetic */ cf7 c;

    public /* synthetic */ fzb(izb izbVar, cf7 cf7Var, int i) {
        this.a = i;
        this.b = izbVar;
        this.c = cf7Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        cf7 cf7Var = this.c;
        izb izbVar = this.b;
        switch (i) {
            case 0:
                izbVar.setItemSelected(z);
                cf7Var.invoke(Boolean.valueOf(z));
                break;
            default:
                izbVar.setItemSelected(z);
                cf7Var.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
