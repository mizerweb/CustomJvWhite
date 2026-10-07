package defpackage;

import androidx.work.WorkRequest;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class e14 {
    public static final d14 Companion = new d14();
    public static final e14 d = new e14();
    public final long a;
    public final long b;
    public final int c;

    public /* synthetic */ e14(int i, int i2, long j, long j2) {
        this.a = (i & 1) == 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j;
        if ((i & 2) == 0) {
            this.b = 60000L;
        } else {
            this.b = j2;
        }
        if ((i & 4) == 0) {
            this.c = BuildConfig.FILE_LENGTH_TO_UPLOAD;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e14)) {
            return false;
        }
        e14 e14Var = (e14) obj;
        return this.a == e14Var.a && this.b == e14Var.b && this.c == e14Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "CommentsCountersTtlConfig(channelMs=", ", bigchannelMs=");
        c0a.w(sbS, this.b, ", participantsCount=", this.c);
        sbS.append(")");
        return sbS.toString();
    }

    public e14() {
        this.a = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.b = 60000L;
        this.c = BuildConfig.FILE_LENGTH_TO_UPLOAD;
    }
}
