package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class wk5 extends o8g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wk5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((xk5) obj).a;
            case 1:
                return new hy0((w4) obj, h5Var.d(702), h5Var.d(1019));
            case 2:
                return new qj8((Context) h5Var.c(7), (ek5) h5Var.c(76), (i94) obj);
            default:
                return new wfg((af7) obj);
        }
    }
}
