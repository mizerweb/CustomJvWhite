package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class zsa implements zee {
    public final /* synthetic */ MessagesListWidget a;

    public zsa(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    @Override // defpackage.zee
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.zee
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.a.K.set(motionEvent.getRawX(), motionEvent.getRawY());
        return false;
    }

    @Override // defpackage.zee
    public final void e(boolean z) {
    }
}
