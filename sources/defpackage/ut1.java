package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class ut1 implements tt1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.tt1
    public final void onAdminInCallChanged() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tt1) it.next()).onAdminInCallChanged();
        }
    }

    @Override // defpackage.tt1
    public final void onAnonJoinForbiddenChanged() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tt1) it.next()).onAnonJoinForbiddenChanged();
        }
    }

    @Override // defpackage.tt1
    public final void onAsrOnlineAvailableChanged() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tt1) it.next()).onAsrOnlineAvailableChanged();
        }
    }

    @Override // defpackage.tt1
    public final void onFeedbackEnabledChanged() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tt1) it.next()).onFeedbackEnabledChanged();
        }
    }

    @Override // defpackage.tt1
    public final void onRecurringChanged() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tt1) it.next()).onRecurringChanged();
        }
    }

    @Override // defpackage.tt1
    public final void onWaitForAdminChanged() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tt1) it.next()).onWaitForAdminChanged();
        }
    }

    @Override // defpackage.tt1
    public final void onWaitingHallEnabledChanged() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tt1) it.next()).onWaitingHallEnabledChanged();
        }
    }
}
