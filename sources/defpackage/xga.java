package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xga implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ xga(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                cf7Var.invoke(Boolean.valueOf(z));
                break;
            default:
                cf7Var.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
