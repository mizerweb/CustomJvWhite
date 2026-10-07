package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cpl implements g1m {
    public final Executor a;
    public final Object b = new Object();
    public final ttb c;

    public cpl(Executor executor, ttb ttbVar) {
        this.a = executor;
        this.c = ttbVar;
    }

    @Override // defpackage.g1m
    public final void b(Task task) {
        if (task.j() || ((kam) task).d) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new p0(this, 9, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
