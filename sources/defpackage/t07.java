package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t07 implements srb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t07(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.srb
    public final void a(Object obj) {
        HashMap map;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((njd) obj2).c(obj);
                return;
            case 1:
                ((ia7) obj2).k(obj);
                return;
            case 2:
                r6a r6aVar = (r6a) obj2;
                d99 d99Var = (d99) obj;
                synchronized (((HashMap) r6aVar.b)) {
                    map = new HashMap((HashMap) r6aVar.b);
                    break;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new su6(entry, 12, d99Var));
                }
                return;
            default:
                ((lh9) obj2).invoke(obj);
                return;
        }
    }
}
