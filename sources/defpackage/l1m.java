package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class l1m {
    private Long a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;

    public final l1m a(Long l) {
        this.c = Long.valueOf(l.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD);
        return this;
    }

    public final l1m b(Long l) {
        this.d = Long.valueOf(l.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD);
        return this;
    }

    public final l1m c(Long l) {
        this.a = Long.valueOf(l.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD);
        return this;
    }

    public final l1m d(Long l) {
        this.e = Long.valueOf(l.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD);
        return this;
    }

    public final l1m e(Long l) {
        this.b = Long.valueOf(l.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD);
        return this;
    }

    public final l1m f(Long l) {
        this.f = Long.valueOf(l.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD);
        return this;
    }

    public final p1m g() {
        return new p1m(this, null);
    }
}
