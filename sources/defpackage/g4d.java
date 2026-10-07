package defpackage;

import android.view.MotionEvent;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes2.dex */
public final class g4d extends SeekBar {
    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
