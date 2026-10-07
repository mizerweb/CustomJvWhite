package defpackage;

import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iy0 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly0 b;

    public /* synthetic */ iy0(ly0 ly0Var, int i) {
        this.a = i;
        this.b = ly0Var;
    }

    @Override // defpackage.pwi
    public final void run() throws GlUtil$GlException {
        int i = this.a;
        ly0 ly0Var = this.b;
        switch (i) {
            case 0:
                if (!ly0Var.e.isEmpty()) {
                    ly0Var.k = true;
                } else {
                    md5 md5Var = ly0Var.h;
                    md5Var.getClass();
                    md5Var.a();
                    g55.a();
                }
                break;
            case 1:
                ly0Var.j++;
                ly0Var.D();
                break;
            default:
                dn7 dn7Var = ly0Var.i;
                if (dn7Var != null) {
                    dn7Var.a();
                }
                ly0Var.e.clear();
                break;
        }
    }
}
