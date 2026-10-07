package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q95 implements u25 {
    public final Context a;
    public final ArrayList b;
    public final u25 c;
    public nq6 d;
    public zx e;
    public uo4 f;
    public u25 g;
    public pai h;
    public r25 i;
    public j5e j;
    public u25 k;

    public q95(Context context, u25 u25Var) {
        this.a = context.getApplicationContext();
        u25Var.getClass();
        this.c = u25Var;
        this.b = new ArrayList();
    }

    public static void b(u25 u25Var, v1i v1iVar) {
        if (u25Var != null) {
            u25Var.w(v1iVar);
        }
    }

    public final void a(u25 u25Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            u25Var.w((v1i) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.u25
    public final void close() {
        u25 u25Var = this.k;
        if (u25Var != null) {
            try {
                u25Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        lvb.b0(this.k == null);
        Uri uri = a35Var.a;
        String scheme = uri.getScheme();
        boolean zR = vqi.R(uri);
        Context context = this.a;
        if (zR) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    nq6 nq6Var = new nq6(false);
                    this.d = nq6Var;
                    a(nq6Var);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    zx zxVar = new zx(context);
                    this.e = zxVar;
                    a(zxVar);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                zx zxVar2 = new zx(context);
                this.e = zxVar2;
                a(zxVar2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                uo4 uo4Var = new uo4(context);
                this.f = uo4Var;
                a(uo4Var);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            u25 u25Var = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        int i = dwe.g;
                        u25 u25Var2 = (u25) dwe.class.getConstructor(null).newInstance(null);
                        this.g = u25Var2;
                        a(u25Var2);
                    } catch (ClassNotFoundException unused) {
                        lvb.G0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        ore.h("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.g == null) {
                        this.g = u25Var;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    pai paiVar = new pai();
                    this.h = paiVar;
                    a(paiVar);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    r25 r25Var = new r25(false);
                    this.i = r25Var;
                    a(r25Var);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    j5e j5eVar = new j5e(context);
                    this.j = j5eVar;
                    a(j5eVar);
                }
                this.k = this.j;
            } else {
                this.k = u25Var;
            }
        }
        return this.k.f(a35Var);
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        u25 u25Var = this.k;
        if (u25Var == null) {
            return null;
        }
        return u25Var.getUri();
    }

    @Override // defpackage.u25
    public final Map p() {
        u25 u25Var = this.k;
        return u25Var == null ? Collections.EMPTY_MAP : u25Var.p();
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        u25 u25Var = this.k;
        u25Var.getClass();
        return u25Var.read(bArr, i, i2);
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        v1iVar.getClass();
        this.c.w(v1iVar);
        this.b.add(v1iVar);
        b(this.d, v1iVar);
        b(this.e, v1iVar);
        b(this.f, v1iVar);
        b(this.g, v1iVar);
        b(this.h, v1iVar);
        b(this.i, v1iVar);
        b(this.j, v1iVar);
    }
}
