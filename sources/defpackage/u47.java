package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class u47 implements zee {
    @Override // defpackage.zee
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.zee
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @Override // defpackage.zee
    public final void e(boolean z) {
    }
}
