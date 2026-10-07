package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w9h implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9h b;

    public /* synthetic */ w9h(x9h x9hVar, int i) {
        this.a = i;
        this.b = x9hVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        x9h x9hVar = this.b;
        View view = (View) obj;
        u9h u9hVar = (u9h) obj2;
        switch (i) {
            case 0:
                uv2 uv2Var = x9hVar.I;
                if (uv2Var != null) {
                    uv2Var.invoke(view, u9hVar);
                }
                break;
            default:
                uv2 uv2Var2 = x9hVar.I;
                if (uv2Var2 != null) {
                    uv2Var2.invoke(view, u9hVar);
                }
                break;
        }
        return sbiVar;
    }
}
