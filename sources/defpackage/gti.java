package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class gti {
    public static final byte[] h = {0, 0, 0, 0, 0, 0, 19, 48, 90, 92, 97, 104, 119, 115, 107, 71, 0, 56, 108, 70, 19, 19, 19, 0, 0, 0, 0, 0, 101, 100, 90, 79, 73, 127, 86, 89, 117, 80, 101, 126, 114, 111, 110, 116, 115, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 80, 90, 90, 89, 112, 117, 121, 96, 62, 39, 33, 19, 73, 124, 122, 115, 95, 108, 95, 85, 96, 112, 90, 19, 0};
    public final vvc a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ifh f;
    public final ifh g = new ifh(new vbi(7, this));

    public gti(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, vvc vvcVar) {
        this.a = vvcVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = new ifh(new twf(context, 16));
    }

    public final fti a(d70 d70Var, e70 e70Var, String str) {
        Uri uri;
        boolean zA;
        int i = d70Var.g;
        int i2 = d70Var.f;
        long j = d70Var.c;
        y60 y60Var = e70Var.a;
        Uri uriK = sb8.K(e70Var.u);
        Uri uriK2 = sb8.K(d70Var.e);
        Uri uriB = ((t75) this.b.getValue()).b(e70Var, true);
        if (uriK2 == null && uriK != null) {
            uri = uriK;
        } else if (uriK2 != null) {
            uri = uriK2;
        } else if (uriB != null) {
            uri = uriB;
        } else {
            uriK = null;
            uri = uriK;
        }
        ifh ifhVar = this.g;
        vvc vvcVar = this.a;
        lw5 lw5Var = lw5.MILLISECONDS;
        if (uri == null) {
            fti ftiVar = fti.n;
            long j2 = d70Var.a;
            int i3 = d70Var.f;
            int i4 = d70Var.g;
            int iIntValue = ((Number) ifhVar.getValue()).intValue();
            ghb ghbVar = ew5.b;
            return new fti(j2, ftiVar.b, i3, i4, iIntValue, qe7.P(j, lw5Var), ftiVar.g, str, uriB, vvcVar.a(i2, i), ftiVar.k, ftiVar.l, ftiVar.m);
        }
        int i5 = d70Var.b;
        ny8 ny8Var = this.c;
        y60 y60Var2 = y60.d;
        if (i5 == 2 && y60Var == y60Var2) {
            u4a u4aVar = (u4a) ny8Var.getValue();
            zA = u4aVar.a(u4aVar.b().c.d.getInt("app.media.load.video_messages", 0));
        } else if (y60Var == y60Var2) {
            xb9 xb9Var = (xb9) ((et3) this.e.getValue());
            if (!((Boolean) xb9Var.e1.m(xb9Var, xb9.g1[50])).booleanValue()) {
                if (((u4a) ny8Var.getValue()).c()) {
                    long j3 = d70Var.d;
                    if (j3 <= 0 || j3 > gm0.J(Integer.valueOf(((nni) this.d.getValue()).d.getInt("app.video.auto.load.size", 10)).doubleValue() * 1048576.0d)) {
                    }
                }
                zA = false;
            }
            zA = true;
        } else {
            zA = false;
        }
        byte[] bArr = d70Var.t;
        long j4 = d70Var.a;
        int i6 = d70Var.f;
        int i7 = d70Var.g;
        int iIntValue2 = ((Number) ifhVar.getValue()).intValue();
        ghb ghbVar2 = ew5.b;
        long jP = qe7.P(j, lw5Var);
        bne bneVarA = vvcVar.a(i2, i);
        long j5 = e70Var.w;
        if (bArr == null || bArr.length == 0) {
            bArr = h;
        }
        return new fti(j4, uri, i6, i7, iIntValue2, jP, j5, str, uriB, bneVarA, zA, bArr, 1024);
    }
}
