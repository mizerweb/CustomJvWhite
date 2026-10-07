package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes2.dex */
public final class d8a extends FrameLayout implements eph {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8a(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        switch (this.a) {
            case 0:
                y1 y1Var = new y1(2, this);
                while (y1Var.hasNext()) {
                    KeyEvent.Callback callback = (View) y1Var.next();
                    eph ephVar = callback instanceof eph ? (eph) callback : null;
                    if (ephVar != null) {
                        ephVar.onThemeChanged(kbcVar);
                    }
                }
                break;
            default:
                View childAt = getChildAt(0);
                ProgressBar progressBar = childAt instanceof ProgressBar ? (ProgressBar) childAt : null;
                if (progressBar != null) {
                    int i = kbcVar.getIcon().c;
                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                    if (indeterminateDrawable == null) {
                        indeterminateDrawable = progressBar.getProgressDrawable();
                    }
                    if (indeterminateDrawable != null) {
                        sb8.m0(i, indeterminateDrawable);
                    }
                }
                break;
        }
    }
}
