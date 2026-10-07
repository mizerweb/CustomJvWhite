package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* JADX INFO: loaded from: classes3.dex */
public final class im7 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final String j = im7.class.getName();

    public im7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ny8Var7;
        this.h = ny8Var8;
        this.i = ny8Var9;
    }

    public final Context a() {
        return (Context) this.a.getValue();
    }

    public final Object b(b0e b0eVar, boolean z, int i, mdh mdhVar) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        kbc kbcVar;
        szd szdVar;
        int iD = wk8.D(a());
        if (!z) {
            je9 je9Var = je9.e;
            ylc ylcVar = QrCodeGenerator.e;
            szd szdVar2 = null;
            if (cqk.d(ylcVar != null ? (b0e) ylcVar.a : null, b0eVar)) {
                a8g a8gVar = pq3.j;
                kbc kbcVarM = a8gVar.e(a()).m();
                ylc ylcVar2 = QrCodeGenerator.e;
                szd szdVar3 = ylcVar2 != null ? (szd) ylcVar2.b : null;
                if (!kbcVarM.equals((ylcVar2 == null || (szdVar = (szd) ylcVar2.b) == null) ? null : szdVar.c)) {
                    String str = this.j;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        String name = (szdVar3 == null || (kbcVar = szdVar3.c) == null) ? null : kbcVar.getName();
                        a4cVar.c(je9Var, str, s5h.x0("\n                    Try to return cached qr code, but it has incorrect theme.\n                    Qr theme=" + name + "; Correct theme = " + a8gVar.e(a()).m().getName() + ";\n                    Recreate it.\n                    "), null);
                    }
                } else if (szdVar3 != null && (bitmap3 = szdVar3.b) != null && bitmap3.isRecycled()) {
                    String str2 = this.j;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "Try to return cached qr code, but it has recycled.\nRecreate it.", null);
                    }
                } else if (szdVar3 == null || (bitmap2 = szdVar3.b) == null || bitmap2.getWidth() != iD) {
                    String str3 = this.j;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, s5h.x0("\n                    Try to return cached qr code, but it has incorrect width.\n                    Qr width=" + ((szdVar3 == null || (bitmap = szdVar3.b) == null) ? null : Integer.valueOf(bitmap.getWidth())) + "; Correct width = " + iD + ";\n                    Recreate it.\n                    "), null);
                    }
                } else {
                    szdVar2 = szdVar3;
                }
            }
            if (szdVar2 != null) {
                return szdVar2;
            }
        }
        return yab.K0(((n0c) ((xhh) this.f.getValue())).b(), new hm7(b0eVar, this, iD, i, null), mdhVar);
    }
}
