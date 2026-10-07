package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a6b implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6b b;

    public /* synthetic */ a6b(c6b c6bVar, int i) {
        this.a = i;
        this.b = c6bVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.a;
        c6b c6bVar = this.b;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                w5b w5bVar = c6bVar.c;
                List listT1 = ww3.T1(((q5b) w5bVar.d.getValue()).b);
                if (listT1.isEmpty()) {
                    w5bVar.a();
                } else {
                    w5bVar.c.invoke(listT1, num);
                }
                return sbi.a;
            default:
                int iIntValue = num.intValue();
                if (c6bVar.b.l() < iIntValue || iIntValue < 0) {
                    zContains = false;
                } else {
                    tlg tlgVar = (tlg) ((k79) c6bVar.b.F(iIntValue));
                    zContains = ((q5b) c6bVar.c.e.a.getValue()).b.contains(Long.valueOf(tlgVar.a));
                }
                return Boolean.valueOf(zContains);
        }
    }
}
