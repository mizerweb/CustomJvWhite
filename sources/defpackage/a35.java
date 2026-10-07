package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;

/* JADX INFO: loaded from: classes2.dex */
public final class a35 {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        sz9.a("media3.datasource");
    }

    public a35(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        lvb.R(j + j2 >= 0);
        lvb.R(j2 >= 0);
        lvb.R(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }

    public static String b(int i) {
        if (i == 1) {
            return HttpGet.METHOD_NAME;
        }
        if (i == 2) {
            return HttpPost.METHOD_NAME;
        }
        if (i == 3) {
            return HttpHead.METHOD_NAME;
        }
        c.t();
        return null;
    }

    public final z25 a() {
        z25 z25Var = new z25();
        z25Var.a = this.a;
        z25Var.b = this.b;
        z25Var.c = this.c;
        z25Var.d = this.d;
        z25Var.e = this.e;
        z25Var.f = this.f;
        z25Var.g = this.g;
        z25Var.h = this.h;
        z25Var.i = this.i;
        z25Var.j = this.j;
        return z25Var;
    }

    public final boolean c(int i) {
        return (this.i & i) == i;
    }

    public final a35 d(long j) {
        long j2 = this.g;
        return e(j, j2 != -1 ? j2 - j : -1L);
    }

    public final a35 e(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new a35(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return zo5.t(sb, this.i, "]");
    }

    public a35(long j, long j2, Uri uri) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }

    public a35(Uri uri) {
        this(0L, -1L, uri);
    }
}
