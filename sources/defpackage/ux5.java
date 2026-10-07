package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ux5 implements ug4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ux5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ug4
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ug4) this.b).accept(obj);
                return;
            case 1:
                g77 g77Var = (g77) obj;
                if (g77Var == null) {
                    g77Var = new g77(-3);
                }
                ((uvc) this.b).l(g77Var);
                return;
            default:
                g77 g77Var2 = (g77) obj;
                synchronized (h77.c) {
                    try {
                        h6g h6gVar = h77.d;
                        ArrayList arrayList = (ArrayList) h6gVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        h6gVar.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((ug4) arrayList.get(i)).accept(g77Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
