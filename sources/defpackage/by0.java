package defpackage;

import android.util.Pair;
import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class by0 implements mjd {
    public final HashMap a;
    public final mjd b;
    public final String c;
    public final String d;
    public final /* synthetic */ int e;
    public final j85 f;

    public by0(mjd mjdVar, String str, String str2) {
        this.b = mjdVar;
        this.a = new HashMap();
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        Pair pairCreate;
        o7b o7bVar;
        int i;
        boolean z;
        try {
            qe7.v();
            es0Var.c.a(es0Var, this.c);
            switch (this.e) {
                case 0:
                    pairCreate = Pair.create(this.f.m(es0Var.a, es0Var.d), es0Var.e);
                    break;
                default:
                    j85 j85Var = this.f;
                    v78 v78Var = es0Var.a;
                    j85Var.getClass();
                    pairCreate = Pair.create(j85Var.o(v78Var.b), es0Var.e);
                    break;
            }
            do {
                synchronized (this) {
                    synchronized (this) {
                        o7bVar = (o7b) this.a.get(pairCreate);
                    }
                }
                i = 1;
                if (o7bVar == null) {
                    synchronized (this) {
                        o7bVar = new o7b(this, pairCreate);
                        this.a.put(pairCreate, o7bVar);
                        z = true;
                    }
                } else {
                    z = false;
                }
            } while (!o7bVar.a(lq0Var, es0Var));
            if (z) {
                if (!es0Var.g()) {
                    i = 2;
                }
                o7bVar.i(i);
            }
            qe7.v();
        } catch (Throwable th) {
            qe7.v();
            throw th;
        }
    }

    public final Closeable c(Closeable closeable) {
        switch (this.e) {
            case 0:
                return au3.A((au3) closeable);
            default:
                return p76.b((p76) closeable);
        }
    }

    public final synchronized void d(Object obj, o7b o7bVar) {
        if (this.a.get(obj) == o7bVar) {
            this.a.remove(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public by0(j85 j85Var, mjd mjdVar) {
        this(mjdVar, "EncodedCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_ENCODED_COUNT);
        this.e = 1;
        this.f = j85Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public by0(j85 j85Var, dy0 dy0Var) {
        this(dy0Var, "BitmapMemoryCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_BITMAP_COUNT);
        this.e = 0;
        this.f = j85Var;
    }
}
