package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mvd implements ys5 {
    public final Executor a;
    public final a35 b;
    public final k71 c;
    public final e81 d;
    public xs5 e;
    public volatile lvd f;
    public volatile boolean g;

    public mvd(ry9 ry9Var, j71 j71Var, Executor executor, long j, long j2) {
        executor.getClass();
        this.a = executor;
        jy9 jy9Var = ry9Var.b;
        jy9Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = jy9Var.a;
        String str = jy9Var.f;
        lvb.W(uri, "The uri must be set.");
        a35 a35Var = new a35(uri, 0L, 1, null, map, j, j2, str, 4, null);
        this.b = a35Var;
        k71 k71VarC = j71Var.c();
        this.c = k71VarC;
        this.d = new e81(k71VarC, a35Var, null, new qyb(13, this));
    }

    @Override // defpackage.ys5
    public final void a(xs5 xs5Var) {
        this.e = xs5Var;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new lvd(this);
                this.a.execute(this.f);
                try {
                    this.f.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        String str = vqi.a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                lvd lvdVar = this.f;
                lvdVar.getClass();
                lvdVar.c();
                throw th;
            }
        }
        lvd lvdVar2 = this.f;
        lvdVar2.getClass();
        lvdVar2.c();
    }

    @Override // defpackage.ys5
    public final void cancel() {
        this.g = true;
        lvd lvdVar = this.f;
        if (lvdVar != null) {
            lvdVar.cancel(true);
        }
    }

    @Override // defpackage.ys5
    public final void remove() {
        k71 k71Var = this.c;
        k71Var.a.n(k71Var.e.c(this.b));
    }
}
