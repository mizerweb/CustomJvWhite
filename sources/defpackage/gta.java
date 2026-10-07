package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class gta extends rn8 implements eph {
    public final /* synthetic */ MessagesListWidget C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gta(MessagesListWidget messagesListWidget, seh sehVar) {
        super(sehVar);
        this.C = messagesListWidget;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        seh sehVar = this.C.E;
        if (sehVar == null) {
            sehVar = null;
        }
        sehVar.onThemeChanged(kbcVar);
    }
}
