package defpackage;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class kh6 {
    public final long a;
    public final float b;

    public kh6(int i) {
        long j = (i & 1) != 0 ? 500L : 1000L;
        float f = (i & 4) != 0 ? 1.5f : 2.0f;
        this.a = j;
        this.b = f;
        if (j < 1) {
            ore.p("Interval is invalid. Must be greater than 1.");
            throw null;
        }
        if (WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS < j) {
            ore.p("maxInterval is invalid. Must be greater or equal than Interval.");
            throw null;
        }
        if (f >= 1.0d) {
            return;
        }
        ore.p("Multiplier is invalid. Must be greater than 1.0.");
        throw null;
    }
}
