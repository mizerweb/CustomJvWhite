package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class a85 implements zd6 {
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;
    public Object c;

    @Override // defpackage.zd6
    public long a() {
        return this.b;
    }

    @Override // defpackage.zd6
    public long b() {
        return this.a;
    }

    @Override // defpackage.zd6
    public void c(Collection collection) {
        ((a2c) this.c).a.i.invoke(collection);
    }

    @Override // defpackage.zd6
    public void d(ArrayList arrayList) {
        ((a2c) this.c).a.h.invoke(arrayList);
    }

    public void e(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L && b85.c0.get() <= 0) {
            this.a = 200 + jElapsedRealtime;
        }
        long j = this.a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }
}
