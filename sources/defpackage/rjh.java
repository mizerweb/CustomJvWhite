package defpackage;

import bolts.Task;

/* JADX INFO: loaded from: classes.dex */
public class rjh {
    public final Task a = new Task();

    public final void a() {
        if (this.a.trySetCancelled()) {
            return;
        }
        ore.k("Cannot cancel a completed task.");
    }

    public final void b(Exception exc) {
        if (this.a.trySetError(exc)) {
            return;
        }
        ore.k("Cannot set the error on a completed task.");
    }

    public final void c(Object obj) {
        if (this.a.trySetResult(obj)) {
            return;
        }
        ore.k("Cannot set the result of a completed task.");
    }
}
