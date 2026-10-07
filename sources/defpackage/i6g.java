package defpackage;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes.dex */
public final class i6g extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ j6g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6g(j6g j6gVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = j6gVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            j6g.a(this.b);
            this.b.b.getClass();
        }
    }
}
