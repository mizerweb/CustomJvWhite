package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class lw6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FitFontImageSpan b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ow6 d;

    public /* synthetic */ lw6(FitFontImageSpan fitFontImageSpan, View view, ow6 ow6Var, int i) {
        this.a = i;
        this.b = fitFontImageSpan;
        this.c = view;
        this.d = ow6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.c;
        FitFontImageSpan fitFontImageSpan = this.b;
        ow6 ow6Var = this.d;
        switch (i) {
            case 0:
                if (!fitFontImageSpan.shouldInvalidateSpan) {
                    view.invalidate();
                    ow6Var.a();
                } else {
                    bdc.a(view, new xz8(view, view, fitFontImageSpan, ow6Var));
                }
                break;
            default:
                if (!fitFontImageSpan.shouldInvalidateSpan) {
                    view.invalidate();
                    ow6Var.a();
                } else {
                    bdc.a(view, new xz8(view, view, fitFontImageSpan, ow6Var));
                }
                break;
        }
    }
}
