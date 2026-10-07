package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eo4 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ eo4(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        cf7 cf7Var = this.b;
        di4 di4Var = (di4) obj;
        switch (i) {
            case 0:
                cf7Var.invoke(di4Var);
                break;
            default:
                cf7Var.invoke(di4Var);
                break;
        }
    }
}
