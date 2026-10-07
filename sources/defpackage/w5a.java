package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import one.me.sdk.media.transformer.impl.IllegalMediaTransformException;

/* JADX INFO: loaded from: classes3.dex */
public final class w5a {
    public final Context a;
    public String c;
    public float e;
    public long g;
    public boolean h;
    public Bitmap i;
    public x5a j;
    public boolean k;
    public boolean l;
    public b6a m;
    public final ArrayList b = new ArrayList();
    public prk d = new sx9(0, 0, 0, 0, false, false, false, false, false, 7679);
    public float f = 1.0f;
    public long n = 500;
    public long o = 300000;
    public long p = -9223372036854775807L;

    public w5a(Context context) {
        this.a = context;
    }

    public final void a(Uri uri) {
        this.b.add(uri);
    }

    public final r6a b() throws IllegalMediaTransformException {
        String str;
        long j = this.n;
        String str2 = this.c;
        this.c = str2 != null ? r5h.y1(str2).toString() : null;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || (str = this.c) == null || str.length() == 0) {
            throw new IllegalMediaTransformException("Illegal input/output=" + arrayList + "/" + this.c);
        }
        float f = this.e;
        if (f >= 0.0f && f < 1.0f) {
            float f2 = this.f;
            if (f2 > f && 1.0d >= f2) {
                if (!this.d.b()) {
                    throw new IllegalMediaTransformException("Illegal encoder config=" + this.d);
                }
                if (this.g < 0) {
                    throw new IllegalMediaTransformException(nbh.s(this.g, "Illegal max output duration=", " mcs"));
                }
                if (j <= 0) {
                    throw new IllegalMediaTransformException(nbh.s(j, "Illegal ping delay=", " ms"));
                }
                long j2 = this.p;
                if (j2 != -9223372036854775807L && j2 <= 0) {
                    throw new IllegalMediaTransformException(nbh.s(this.p, "Illegal max delay between muxer samples=", " ms"));
                }
                w5a w5aVar = new w5a(this.a);
                w5aVar.b.addAll(arrayList);
                w5aVar.c = this.c;
                w5aVar.d = this.d;
                w5aVar.h = this.h;
                w5aVar.i = this.i;
                w5aVar.j = this.j;
                w5aVar.f = this.f;
                w5aVar.e = this.e;
                w5aVar.g = this.g;
                w5aVar.m = this.m;
                w5aVar.n = j;
                w5aVar.o = this.o;
                w5aVar.k = this.k;
                w5aVar.l = this.l;
                w5aVar.p = this.p;
                r6a r6aVar = new r6a();
                r6aVar.a = w5aVar;
                r6aVar.b = r6a.class.getName();
                r6aVar.c = w5aVar.a.getApplicationContext();
                return r6aVar;
            }
        }
        throw new IllegalMediaTransformException("Illegal requested position range=[" + this.e + ", " + this.f + "]");
    }

    public final void c(tx9 tx9Var) {
        this.d = tx9Var;
    }

    public final void d(boolean z) {
        this.l = z;
    }

    public final void e(boolean z) {
        this.k = z;
    }

    public final void f(String str) {
        this.c = str;
    }

    public final void g(f4c f4cVar) {
        this.m = f4cVar;
    }

    public final void h(boolean z) {
        this.h = z;
    }

    public final void i(float f, float f2) {
        this.e = f;
        this.f = f2;
    }
}
