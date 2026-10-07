package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class eca extends FrameLayout implements mw3 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public eca(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }
}
