package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class yg0 {
    public final Executor a;
    public final Handler b;

    public yg0(Executor executor, Handler handler) {
        if (executor == null) {
            ore.n("Null cameraExecutor");
            throw null;
        }
        this.a = executor;
        if (handler != null) {
            this.b = handler;
        } else {
            ore.n("Null schedulerHandler");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yg0) {
            yg0 yg0Var = (yg0) obj;
            if (this.a.equals(yg0Var.a) && this.b.equals(yg0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
