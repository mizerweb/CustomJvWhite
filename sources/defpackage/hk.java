package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hk {
    public static final ThreadLocal i = new ThreadLocal();
    public final v2a e;
    public uvc h;
    public final h6g a = new h6g(0);
    public final ArrayList b = new ArrayList();
    public final v56 c = new v56(3, this);
    public final e6 d = new e6(3, this);
    public boolean f = false;
    public float g = 1.0f;

    public hk(v2a v2aVar) {
        this.e = v2aVar;
    }

    public final boolean a() {
        v2a v2aVar = this.e;
        v2aVar.getClass();
        return Thread.currentThread() == ((Looper) v2aVar.c).getThread();
    }
}
