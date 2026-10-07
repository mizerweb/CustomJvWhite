package ru.ok.tamtam.chats;

import defpackage.c76;
import defpackage.cid;
import defpackage.gq0;
import defpackage.kfi;
import defpackage.l7h;
import defpackage.mg5;
import defpackage.pw;
import defpackage.qh3;
import defpackage.t51;
import defpackage.wo3;
import defpackage.xhh;
import java.util.Collection;
import java.util.Collections;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/tamtam/chats/ChatsEventsByBus;", "Lgq0;", "Lkfi;", "updateMessageEvent", "Lsbi;", "onEvent", "(Lkfi;)V", "Lwo3;", "chatsUpdateEvent", "(Lwo3;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class ChatsEventsByBus extends gq0 {
    public final t51 c;

    public ChatsEventsByBus(t51 t51Var, xhh xhhVar) {
        super(xhhVar);
        this.c = t51Var;
        t51Var.d(this);
    }

    @Override // defpackage.gq0
    public final void a(qh3 qh3Var) {
        this.c.c(new wo3((Collection) qh3Var.a, qh3Var.b, false, (mg5) null, (cid) null, qh3Var.c, 60));
    }

    @l7h
    public final void onEvent(kfi updateMessageEvent) {
        if (updateMessageEvent.d) {
            b(new qh3(Collections.singleton(Long.valueOf(updateMessageEvent.b)), false, c76.a, false));
        }
    }

    @l7h
    public final void onEvent(wo3 chatsUpdateEvent) {
        b(new qh3(new pw(chatsUpdateEvent.b), chatsUpdateEvent.c, chatsUpdateEvent.h, false));
    }
}
