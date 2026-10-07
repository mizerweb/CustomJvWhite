package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class mue {
    public final vuf a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(true);

    public mue(vuf vufVar, Executor executor) {
        this.a = vufVar;
        this.b = executor;
    }

    public final void a(int i) {
        if (this.c.get()) {
            try {
                this.b.execute(new ai(this, i, 20));
            } catch (RejectedExecutionException unused) {
                tvj.g("RotationProvider", "Failed to execute the command. Maybe the executor has been shutdown.");
            }
        }
    }
}
