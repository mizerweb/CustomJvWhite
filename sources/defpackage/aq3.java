package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class aq3 extends mwl {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void d(int i) {
    }

    @Override // defpackage.mwl
    public final void b(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                gmh gmhVar = (gmh) this.b;
                gmhVar.e = true;
                fmh fmhVar = (fmh) gmhVar.f.get();
                if (fmhVar != null) {
                    fmhVar.a();
                }
                break;
        }
    }

    @Override // defpackage.mwl
    public final void c(Typeface typeface, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cq3 cq3Var = (cq3) obj;
                dq3 dq3Var = cq3Var.e;
                cq3Var.setText(dq3Var.c2 ? dq3Var.F : cq3Var.getText());
                cq3Var.requestLayout();
                cq3Var.invalidate();
                break;
            default:
                if (!z) {
                    gmh gmhVar = (gmh) obj;
                    gmhVar.e = true;
                    fmh fmhVar = (fmh) gmhVar.f.get();
                    if (fmhVar != null) {
                        fmhVar.a();
                    }
                    break;
                }
                break;
        }
    }
}
