package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ba0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha0 b;

    public /* synthetic */ ba0(ha0 ha0Var, int i) {
        this.a = i;
        this.b = ha0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        ha0 ha0Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return ha0Var.performLongClick();
    }
}
