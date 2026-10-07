package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class uji {
    public static final tji Companion = new tji();
    public final boolean a;
    public final int b;
    public final boolean c;
    public final long d;

    public /* synthetic */ uji(int i, int i2, long j, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        this.b = (i & 2) == 0 ? 1 : i2;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = BuildConfig.MAX_TIME_TO_UPLOAD;
        } else {
            this.d = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uji)) {
            return false;
        }
        uji ujiVar = (uji) obj;
        return this.a == ujiVar.a && this.b == ujiVar.b && this.c == ujiVar.c && this.d == ujiVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + nbh.n(zo5.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "ConnectionBasedValues(isEnabled=" + this.a + ", parallelism=" + this.b + ", parallelHeaderDisabled=" + this.c + ", chunkSize=" + this.d + ")";
    }

    public uji() {
        this.a = false;
        this.b = 1;
        this.c = false;
        this.d = BuildConfig.MAX_TIME_TO_UPLOAD;
    }
}
