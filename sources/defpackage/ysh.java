package defpackage;

import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ysh extends s3f implements Runnable {
    public final long g;

    public ysh(long j, nq4 nq4Var) {
        super(nq4Var, nq4Var.getContext());
        this.g = j;
    }

    @Override // defpackage.up8
    public final String S() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.S());
        sb.append("(timeMillis=");
        return zo5.u(sb, this.g, ')');
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        rx8.D(this.e);
        q(new TimeoutCancellationException("Timed out waiting for " + this.g + " ms", this));
    }
}
