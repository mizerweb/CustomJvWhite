package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class pda extends LinearLayout implements eph {
    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        y1 y1Var = new y1(2, this);
        while (y1Var.hasNext()) {
            KeyEvent.Callback callback = (View) y1Var.next();
            eph ephVar = callback instanceof eph ? (eph) callback : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(kbcVar);
            }
        }
    }
}
