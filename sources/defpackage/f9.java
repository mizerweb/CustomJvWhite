package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;

/* JADX INFO: loaded from: classes.dex */
public final class f9 {
    public final AtomicReference a = new AtomicReference();

    public final Conversation a() {
        ms4 ms4Var = (ms4) this.a.get();
        if (ms4Var != null) {
            return ms4Var.a();
        }
        return null;
    }

    public final void b(ms4 ms4Var) {
        this.a.set(ms4Var);
    }
}
