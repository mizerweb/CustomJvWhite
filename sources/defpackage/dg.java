package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.media.service.OneMeMediaSessionService;

/* JADX INFO: loaded from: classes2.dex */
public final class dg {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final e6 b;
    public final Executor c;
    public final cg d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public dg(OneMeMediaSessionService oneMeMediaSessionService, e6 e6Var) {
        this.a = oneMeMediaSessionService.getApplicationContext();
        this.b = e6Var;
        Executor executorT = gm0.t();
        this.c = executorT;
        this.d = new cg(0, this);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        executorT.execute(new bg(this, 1));
    }

    public final boolean a() {
        return this.e.get();
    }

    public final void b() {
        if (this.f.getAndSet(true)) {
            return;
        }
        this.c.execute(new bg(this, 0));
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.e;
        boolean z = atomicBoolean.get();
        boolean z2 = false;
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(g, new String[]{"CarConnectionState"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("CarConnectionState");
                    if (columnIndex != -1 && cursorQuery.moveToNext()) {
                        boolean z3 = cursorQuery.getInt(columnIndex) != 0;
                        cursorQuery.close();
                        z2 = z3;
                    } else {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        atomicBoolean.set(z2);
        if (z == z2 || this.f.get()) {
            return;
        }
        this.b.run();
    }
}
