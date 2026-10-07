package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zga extends View.AccessibilityDelegate {
    public final /* synthetic */ tha a;

    public zga(tha thaVar) {
        this.a = thaVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        Object value;
        if (i == 8192) {
            tha thaVar = this.a;
            mjg mjgVar = thaVar.I;
            do {
                value = mjgVar.getValue();
                ((Number) value).intValue();
            } while (!mjgVar.h(value, Integer.valueOf(thaVar.f.getSelectionEnd())));
        }
    }
}
