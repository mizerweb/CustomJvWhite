package defpackage;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sa3 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                mjg mjgVar = ((ez9) obj).i;
                Integer numValueOf = Integer.valueOf(i);
                mjgVar.getClass();
                mjgVar.j(null, numValueOf);
                break;
            default:
                bg6 bg6Var = (bg6) ((dc9) obj).d;
                if (!bg6Var.m0) {
                    bg6Var.x0(1, 19, Integer.valueOf(i));
                    break;
                }
                break;
        }
    }
}
