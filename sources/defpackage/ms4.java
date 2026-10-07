package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;

/* JADX INFO: loaded from: classes.dex */
public final class ms4 {
    public final AtomicReference a = new AtomicReference();

    public final Conversation a() {
        return (Conversation) this.a.get();
    }
}
