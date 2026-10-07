package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h4c implements c2a {
    public final Context a;
    public final rs6 b;
    public final gjf c;
    public final is6 d;
    public final ks6 e;
    public final Handler f;
    public final CopyOnWriteArraySet g;
    public final ed6 h;
    public final v3f i;
    public final xhh j;
    public final wmi k;
    public final String l;
    public final ny8 m;
    public final ny8 n;
    public final ifh o;
    public final ifh p;
    public final AtomicBoolean q;

    public h4c(Context context, ed6 ed6Var, ju6 ju6Var, gjf gjfVar, wwb wwbVar, v3f v3fVar, xhh xhhVar, wmi wmiVar, ny8 ny8Var, ny8 ny8Var2) {
        is6 is6Var = ju6Var.b;
        this.f = new Handler(Looper.getMainLooper());
        this.g = new CopyOnWriteArraySet();
        this.a = context;
        this.d = is6Var;
        this.b = ju6Var;
        this.c = gjfVar;
        this.e = new ks6(context, wwbVar, ed6Var);
        this.h = ed6Var;
        this.i = v3fVar;
        this.j = xhhVar;
        this.k = wmiVar;
        this.l = h4c.class.getName();
        this.m = ny8Var;
        this.n = ny8Var2;
        final int i = 0;
        this.o = new ifh(new af7(this) { // from class: e4c
            public final /* synthetic */ h4c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                h4c h4cVar = this.b;
                switch (i2) {
                    case 0:
                        return new k0f(h4cVar.i, ((n0c) h4cVar.j).b());
                    default:
                        return new hze(h4cVar.i, ((n0c) h4cVar.j).b());
                }
            }
        });
        final int i2 = 1;
        this.p = new ifh(new af7(this) { // from class: e4c
            public final /* synthetic */ h4c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                h4c h4cVar = this.b;
                switch (i3) {
                    case 0:
                        return new k0f(h4cVar.i, ((n0c) h4cVar.j).b());
                    default:
                        return new hze(h4cVar.i, ((n0c) h4cVar.j).b());
                }
            }
        });
        this.q = new AtomicBoolean();
    }

    public final List a(String str) {
        Uri uriM = l21.m(str);
        if (uriM != null) {
            return ((h1e) this.n.getValue()).b(uriM);
        }
        String str2 = this.l;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qv1.k("getAvailableQualitiesForVideo: can't parse uri->", str), null);
            }
        }
        return null;
    }

    public final kp4 b(String str) {
        return l21.f(this.a, str, this.d);
    }

    public final String c(String str, String str2) throws Throwable {
        Uri uri = Uri.parse(str);
        is6 is6Var = this.d;
        Context context = this.a;
        String strJ = l21.j(context, uri, is6Var);
        if (rx8.x(strJ)) {
            return strJ;
        }
        gm0.q("h4c", "process: failed to get path from uri: " + str);
        String strC = l21.c(context, this.b, str, str2);
        if (rx8.x(strC)) {
            return strC;
        }
        gm0.q("h4c", "process: failed to get path with copy");
        return null;
    }

    public final void d() {
        this.q.set(false);
        if (this.g.isEmpty()) {
            return;
        }
        this.f.post(new tr0(this, 0));
    }

    public final void e(String str, boolean z) {
        if (z) {
            vd7.A().e(v78.b(str));
        } else {
            vd7.A().d(v78.b(str), null);
        }
    }

    public final tx9 f(String str, d1e d1eVar) {
        int i;
        h6a h6aVar = (h6a) ((e5d) this.m.getValue()).E1.a(e5d.S6[133]).i();
        int iOrdinal = lvb.w0(this.a).ordinal();
        if (iOrdinal == 0) {
            i = h6aVar.g.a;
        } else if (iOrdinal == 1) {
            i = h6aVar.g.b;
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return null;
            }
            i = h6aVar.g.c;
        }
        int i2 = i;
        boolean z = h6aVar.a;
        boolean z2 = h6aVar.d;
        if (!z || !cqk.d(str, "video/mp4")) {
            int i3 = d1eVar.b;
            int i4 = d1eVar.c;
            return new rx9(i3, i4, d1eVar.d, i2, 0, z2 && i4 > i3, false, false, h6aVar.b, h6aVar.c, h6aVar.i, h6aVar.j, 464);
        }
        int i5 = d1eVar.b;
        int i6 = d1eVar.c;
        boolean z3 = false;
        int i7 = d1eVar.d;
        if (z2 && i6 > i5) {
            z3 = true;
        }
        return new sx9(i5, i6, i7, i2, z3, h6aVar.b, h6aVar.c, h6aVar.i, h6aVar.j, 432);
    }

    public final v2j g(String str) throws Throwable {
        String absolutePath;
        mf5 mf5VarD = y3m.d(this.a, Uri.parse(str));
        Bitmap bitmap = (Bitmap) mf5VarD.c;
        if (bitmap != null) {
            absolutePath = new File(((ju6) this.b).n(), String.valueOf(System.currentTimeMillis())).getAbsolutePath();
            gjf gjfVar = this.c;
            int i = sb8.j;
            try {
                sb8.l0(absolutePath, bitmap, ((g5d) gjfVar).n(), Bitmap.CompressFormat.JPEG);
            } catch (IOException unused) {
            }
            bitmap.recycle();
        } else {
            absolutePath = null;
        }
        String str2 = absolutePath;
        Point point = (Point) mf5VarD.d;
        int i2 = point.x;
        if (i2 == 0) {
            i2 = 480;
        }
        int i3 = i2;
        int i4 = point.y;
        if (i4 == 0) {
            i4 = 270;
        }
        return new v2j(mf5VarD.a, str2, i3, i4);
    }

    public final xzh h(String str, Uri uri, String str2, float f, float f2, d1e d1eVar, boolean z, f4c f4cVar) {
        boolean z2;
        je9 je9Var = je9.f;
        h6a h6aVar = (h6a) ((e5d) this.m.getValue()).E1.a(e5d.S6[133]).i();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, "h4c", "transformMedia, config->" + h6aVar, null);
            }
        }
        w5a w5aVar = new w5a(this.a);
        w5aVar.a(uri);
        w5aVar.f(str2);
        w5aVar.i(f, f2);
        w5aVar.h(z);
        w5aVar.e(h6aVar.e);
        w5aVar.d(h6aVar.f);
        w5aVar.g(f4cVar);
        tx9 tx9VarF = f(str, d1eVar);
        w5aVar.c(tx9VarF);
        m6a m6aVarZ = w5aVar.b().z();
        int i = 0;
        while (true) {
            z2 = m6aVarZ instanceof k6a;
            if (z2 && i < 3) {
                k6a k6aVar = (k6a) m6aVarZ;
                if (!k6aVar.c().a(0, 1)) {
                    break;
                }
                i++;
                y5a y5aVarC = k6aVar.c();
                if (y5aVarC.b()) {
                    if (tx9VarF instanceof rx9) {
                        tx9VarF = rx9.q((rx9) tx9VarF, 7807);
                    } else {
                        if (!(tx9VarF instanceof sx9)) {
                            ore.o();
                            return null;
                        }
                        tx9VarF = sx9.q((sx9) tx9VarF, 7807);
                    }
                }
                if (y5aVarC.c()) {
                    if (tx9VarF instanceof rx9) {
                        tx9VarF = rx9.q((rx9) tx9VarF, 7167);
                    } else {
                        if (!(tx9VarF instanceof sx9)) {
                            ore.o();
                            return null;
                        }
                        tx9VarF = sx9.q((sx9) tx9VarF, 7167);
                    }
                }
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "h4c", "transformMedia, retry #" + i + " after fallback=" + k6aVar.c(), null);
                }
                w5aVar.c(tx9VarF);
                m6aVarZ = w5aVar.b().z();
            } else {
                break;
            }
        }
        if (m6aVarZ instanceof l6a) {
            l6a l6aVar = (l6a) m6aVarZ;
            long jD = l6aVar.d();
            long jA = m6aVarZ.a();
            int iH = l6aVar.h();
            int iG = l6aVar.g();
            int iE = l6aVar.e();
            l6aVar.f();
            return new xzh(true, jD, jA, iH, iG, iE, l6aVar.b());
        }
        if (!z2) {
            ore.o();
            return null;
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, "h4c", c0a.k(i, "transformMedia, failed after ", " retries"), null);
        }
        ((t1c) this.h).a(new j56(((k6a) m6aVarZ).b()));
        return qyl.c();
    }
}
