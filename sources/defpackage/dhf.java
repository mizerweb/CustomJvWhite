package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class dhf extends sr implements fhf {
    public dhf() {
        super(new chf(0));
    }

    public final int Z() {
        if (!n7j.o((ny8) this.b)) {
            return 0;
        }
        return zo5.b(4.0f, yl5.d().getDisplayMetrics().density, L());
    }

    @Override // defpackage.fhf
    public final void setAlias(Layout layout) {
        if (layout != null) {
            ((ehf) Q()).setLayout(layout);
            Q().setVisibility(0);
            r();
        } else {
            ny8 ny8Var = (ny8) this.b;
            if (ny8Var.d()) {
                ((ehf) ny8Var.getValue()).setVisibility(8);
            }
        }
    }

    @Override // defpackage.fhf
    public final void setAliasColor(int i) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((ehf) ny8Var.getValue()).setTextColor(i);
        }
    }
}
