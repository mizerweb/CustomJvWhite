package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n94 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ n94(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                cf7Var.invoke(((Map.Entry) obj).getValue());
                return Boolean.TRUE;
            case 1:
                return Long.valueOf(rx8.e0(((ew5) cf7Var.invoke(obj)).a));
            default:
                Integer num = (Integer) obj;
                num.getClass();
                Boolean bool = (Boolean) cf7Var.invoke(num);
                bool.getClass();
                return bool;
        }
    }
}
