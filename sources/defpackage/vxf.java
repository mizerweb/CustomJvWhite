package defpackage;

import android.net.Uri;
import java.util.List;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vxf implements dzc {
    public ShareData a;
    public final v63 b;
    public final xde c;
    public final iyf d;
    public final ynh e;
    public final boolean f;
    public final String g;
    public boolean h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final mjg p;
    public final r8e q;
    public final pzf r;
    public final q8e s;
    public final o56 t;
    public gu4 u;
    public boolean v;

    public vxf(ShareData shareData, v63 v63Var, xde xdeVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, iyf iyfVar, xnh xnhVar, boolean z, String str, boolean z2) {
        this.a = shareData;
        this.b = v63Var;
        this.c = xdeVar;
        this.d = iyfVar;
        this.e = xnhVar;
        this.f = z;
        this.g = str;
        this.h = z2;
        this.i = ny8Var;
        this.j = ny8Var2;
        this.k = ny8Var3;
        this.l = ny8Var4;
        this.m = ny8Var5;
        this.n = ny8Var6;
        this.o = ny8Var7;
        mjg mjgVarA = p90.a(null);
        this.p = mjgVarA;
        this.q = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.r = pzfVarB;
        this.s = new q8e(pzfVarB);
        this.t = new o56();
    }

    @Override // defpackage.dzc
    public final void a(dq4 dq4Var) {
        this.u = dq4Var;
        i();
        if (this.h && f()) {
            h();
        }
    }

    @Override // defpackage.dzc
    public final void b() {
        this.u = null;
    }

    @Override // defpackage.dzc
    public final void c(xyc xycVar) {
        if (this.d == iyf.DEFAULT) {
            this.r.a(ayf.a);
        }
        this.c.L(xycVar);
    }

    @Override // defpackage.dzc
    public final void e(long j) {
        this.c.H(j);
    }

    public final boolean f() {
        ny8 ny8Var = this.o;
        if (!((Boolean) ((e5d) ny8Var.getValue()).B().i()).booleanValue() || !((Boolean) ((e5d) ny8Var.getValue()).O4.a(e5d.S6[302]).i()).booleanValue()) {
            return false;
        }
        ShareData shareData = this.a;
        int i = shareData.type;
        return (i == 1 || i == 2) && shareData.isSingleMedia();
    }

    public final void g(CharSequence charSequence, m8b m8bVar) {
        if (m8bVar.i() || this.v) {
            return;
        }
        int i = m8bVar.d;
        boolean z = i == 1;
        g4b g4bVarJ = ((h4b) this.l.getValue()).J(4);
        this.v = true;
        ShareData shareData = this.a;
        if (this.f) {
            this.r.a(new dyf(new tnh(R.string.share_success_link_send)));
        }
        gu4 gu4Var = this.u;
        if (gu4Var != null) {
            yab.h0(gu4Var, ((n0c) ((xhh) this.i.getValue())).a(), 3, new t85(this, charSequence, i, shareData, g4bVarJ, z, null));
        }
    }

    public final void h() {
        Uri uri;
        ShareData shareData = this.a;
        List<Uri> list = shareData.images;
        if (list == null || (uri = (Uri) ww3.t1(list)) == null) {
            List<Uri> list2 = shareData.videos;
            uri = list2 != null ? (Uri) ww3.t1(list2) : null;
        }
        if (uri == null) {
            return;
        }
        int i = shareData.type == 2 ? 3 : 1;
        String string = uri.toString();
        gu4 gu4Var = this.u;
        if (gu4Var == null) {
            this.r.a(new byf(string, i));
        } else {
            yab.i0(gu4Var, null, 0, new ht1(this, string, i, (lq4) null, 16), 3);
        }
    }

    public final void i() {
        if (this.d != iyf.DEFAULT) {
            return;
        }
        ShareData shareData = this.a;
        gu4 gu4Var = this.u;
        if (gu4Var != null) {
            yab.i0(gu4Var, ((n0c) ((xhh) this.i.getValue())).a(), 0, new voc(this, shareData, (lq4) null, 29), 2);
        }
    }
}
