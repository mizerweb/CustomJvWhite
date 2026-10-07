package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class q6f extends ycc implements dcb {
    public static final /* synthetic */ int e = 0;
    public boolean d;

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        this.d = i2 <= 0 && z2;
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // defpackage.ycc, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 0) {
            return zOnTouchEvent;
        }
        this.d = false;
        return zOnTouchEvent;
    }
}
