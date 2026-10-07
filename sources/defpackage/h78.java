package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h78 implements v97 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l78 b;

    public /* synthetic */ h78(l78 l78Var, l78 l78Var2, int i) {
        this.a = i;
        this.b = l78Var2;
    }

    @Override // defpackage.v97
    public final void a(w97 w97Var) throws Exception {
        int i = this.a;
        l78 l78Var = this.b;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                if (l78Var != null) {
                    l78Var.close();
                }
                break;
            default:
                int i3 = ImageProcessingUtil.a;
                l78Var.close();
                break;
        }
    }
}
