package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kbc b;

    public /* synthetic */ z9(int i, kbc kbcVar) {
        this.a = i;
        this.b = kbcVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        kbc kbcVar = this.b;
        switch (i) {
            case 0:
                View view = (View) obj;
                if (view instanceof eph) {
                    gm0.i(view, kbcVar);
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                gm0.i((View) obj, kbcVar);
                return sbi.a;
            case 2:
                return new int[][]{((rac) kbcVar.a().f).c, ((rac) kbcVar.a().g).c, ((rac) kbcVar.a().c).c, ((rac) kbcVar.a().d).c, ((rac) kbcVar.a().e).c};
            case 3:
                return Integer.valueOf(kbcVar.getIcon().e);
            default:
                return Integer.valueOf(kbcVar.b().e);
        }
    }
}
