package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class ubj implements z62 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.z62
    public final void onAttendee(i62 i62Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((z62) it.next()).onAttendee(i62Var);
        }
    }

    @Override // defpackage.z62
    public final void onFeedback(j62 j62Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((z62) it.next()).onFeedback(j62Var);
        }
    }

    @Override // defpackage.z62
    public final void onHandUp(k62 k62Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((z62) it.next()).onHandUp(k62Var);
        }
    }

    @Override // defpackage.z62
    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((z62) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    @Override // defpackage.z62
    public final void onPromotionUpdated(l62 l62Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((z62) it.next()).onPromotionUpdated(l62Var);
        }
    }
}
