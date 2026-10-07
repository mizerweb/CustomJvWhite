package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class k2m {
    private Long a;
    private n3m b;
    private Boolean c;
    private Boolean d;
    private Boolean e;

    public final k2m a(Boolean bool) {
        this.d = bool;
        return this;
    }

    public final k2m b(Boolean bool) {
        this.e = bool;
        return this;
    }

    public final k2m c(Long l) {
        this.a = Long.valueOf(l.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD);
        return this;
    }

    public final k2m d(n3m n3mVar) {
        this.b = n3mVar;
        return this;
    }

    public final k2m e(Boolean bool) {
        this.c = bool;
        return this;
    }

    public final o2m f() {
        return new o2m(this, null);
    }
}
