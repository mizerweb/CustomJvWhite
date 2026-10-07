package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class pad {
    public static final oad Companion = new oad();
    public static final pad d = new pad();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ pad(int i, long j, long j2, long j3) {
        this.a = (i & 1) == 0 ? 5000L : j;
        if ((i & 2) == 0) {
            this.b = BuildConfig.SILENCE_TIME_TO_UPLOAD;
        } else {
            this.b = j2;
        }
        if ((i & 4) == 0) {
            this.c = 25000L;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pad)) {
            return false;
        }
        pad padVar = (pad) obj;
        return this.a == padVar.a && this.b == padVar.b && this.c == padVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "PollsTtlConfig(chatMs=", ", bigchatMs=");
        sbS.append(this.b);
        return zo5.k(this.c, ", channelMs=", ")", sbS);
    }

    public pad() {
        this.a = 5000L;
        this.b = BuildConfig.SILENCE_TIME_TO_UPLOAD;
        this.c = 25000L;
    }
}
