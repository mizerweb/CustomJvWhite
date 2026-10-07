package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class qa8 implements Thread.UncaughtExceptionHandler {
    public final ny8 a;
    public final ny8 b;
    public final ifh c;
    public final SharedPreferences d;
    public final Thread.UncaughtExceptionHandler e = Thread.getDefaultUncaughtExceptionHandler();

    public qa8(Context context, ny8 ny8Var, ny8 ny8Var2, ifh ifhVar) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ifhVar;
        this.d = context.getSharedPreferences("app_crash_prefs", 0);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        this.d.edit().putLong("pref_last_crash_time", System.currentTimeMillis()).apply();
        u9c u9cVar = (u9c) this.a.getValue();
        if (((gue) this.b.getValue()).e() && (th instanceof OutOfMemoryError)) {
            i = 3;
        } else {
            i = th instanceof OutOfMemoryError ? 2 : 1;
        }
        u9cVar.i.B(u9cVar, u9c.l[5], Integer.valueOf(i));
        if (th instanceof OutOfMemoryError) {
            ((lba) this.c.getValue()).d(oba.CRASH, Integer.MIN_VALUE);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
