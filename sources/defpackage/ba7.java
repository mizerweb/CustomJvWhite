package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ba7 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga7 b;
    public final /* synthetic */ aec c;

    public /* synthetic */ ba7(ga7 ga7Var, aec aecVar, int i) {
        this.a = i;
        this.b = ga7Var;
        this.c = aecVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        aec aecVar = this.c;
        ga7 ga7Var = this.b;
        switch (i) {
            case 0:
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).e(aecVar);
                }
                break;
            case 1:
                Iterator it2 = ga7Var.b.iterator();
                while (it2.hasNext()) {
                    ((xdc) it2.next()).k(aecVar);
                }
                break;
            case 2:
                Iterator it3 = ga7Var.b.iterator();
                while (it3.hasNext()) {
                    ((xdc) it3.next()).l(aecVar);
                }
                break;
            case 3:
                Iterator it4 = ga7Var.b.iterator();
                while (it4.hasNext()) {
                    ((xdc) it4.next()).a(aecVar);
                }
                break;
            case 4:
                Iterator it5 = ga7Var.b.iterator();
                while (it5.hasNext()) {
                    ((xdc) it5.next()).y(aecVar);
                }
                break;
            case 5:
                Iterator it6 = ga7Var.b.iterator();
                while (it6.hasNext()) {
                    ((xdc) it6.next()).p(aecVar);
                }
                break;
            case 6:
                Iterator it7 = ga7Var.b.iterator();
                while (it7.hasNext()) {
                    ((xdc) it7.next()).w(aecVar);
                }
                break;
            case 7:
                Iterator it8 = ga7Var.b.iterator();
                while (it8.hasNext()) {
                    ((xdc) it8.next()).d(aecVar);
                }
                break;
            case 8:
                Iterator it9 = ga7Var.b.iterator();
                while (it9.hasNext()) {
                    ((xdc) it9.next()).g(aecVar);
                }
                break;
            default:
                Iterator it10 = ga7Var.b.iterator();
                while (it10.hasNext()) {
                    ((xdc) it10.next()).b(aecVar);
                }
                break;
        }
        return sbiVar;
    }
}
