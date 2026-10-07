package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class m89 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public m89(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public abstract u72 a();

    public void b() {
    }

    public abstract u72 c();
}
