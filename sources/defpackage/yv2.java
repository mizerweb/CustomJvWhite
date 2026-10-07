package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yv2 implements tg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw2 b;

    public /* synthetic */ yv2(uw2 uw2Var, int i) {
        this.a = i;
        this.b = uw2Var;
    }

    @Override // defpackage.tg4
    public final void accept(Object obj) {
        int i = this.a;
        uw2 uw2Var = this.b;
        tw2 tw2Var = (tw2) obj;
        switch (i) {
            case 0:
                tw2Var.a(uw2Var);
                break;
            default:
                ArrayList arrayList = new ArrayList(tw2Var.b());
                arrayList.remove(uw2Var);
                ArrayList arrayList2 = tw2Var.C;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                if (tw2Var.C == null) {
                    tw2Var.C = new ArrayList();
                }
                tw2Var.C.addAll(arrayList);
                break;
        }
    }
}
