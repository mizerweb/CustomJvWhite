package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class t99 {
    public static final AtomicLong g = new AtomicLong();
    public final a35 a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public t99(a35 a35Var, Uri uri, Map map, long j, long j2, long j3) {
        this.a = a35Var;
        this.b = uri;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public t99(long j, a35 a35Var) {
        this(a35Var, a35Var.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }
}
