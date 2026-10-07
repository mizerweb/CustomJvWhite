package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class vx {
    public final boolean a = false;

    public vx(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vx) && this.a == ((vx) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(1000) + qt4.g(Boolean.hashCode(this.a) * 31, 31, BuildConfig.SILENCE_TIME_TO_UPLOAD);
    }

    public final String toString() {
        return qv1.m("Config(throwAssertionError=", ", sendTimeout=15000, maxEvents=1000)", this.a);
    }
}
