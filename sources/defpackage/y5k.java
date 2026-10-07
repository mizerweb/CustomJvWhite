package defpackage;

import java.time.Instant;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class y5k {
    public volatile long a;
    public final hak c;
    public volatile long b = 12000;
    public long d = BuildConfig.MAX_TIME_TO_UPLOAD;
    public Instant e = Instant.MIN;

    public y5k(ku8 ku8Var, hak hakVar) {
        this.c = hakVar;
    }

    public final synchronized void a(List list) {
        int iSum = list.stream().map(new f05(24)).mapToInt(new ao8(9)).sum();
        if (iSum > 0) {
            this.a -= (long) iSum;
            this.c.h();
            c();
            list.size();
        }
    }

    public final synchronized void b(List list) {
        long jSum = list.stream().map(new f05(26)).mapToInt(new ao8(11)).sum();
        this.a -= jSum;
        this.c.h();
        if (jSum > 0) {
            c();
            list.size();
        }
    }

    public final void c() {
        if (this.a < 0) {
            this.a = 0L;
            this.c.h();
        }
    }
}
