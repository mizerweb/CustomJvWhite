package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zv2 implements tg4, r89, r4a {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ zv2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                tw2 tw2Var = (tw2) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    tw2Var.c().put((Long) it.next(), 0L);
                }
                break;
            case 1:
                tw2 tw2Var2 = (tw2) obj;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    tw2Var2.c().remove((Long) it2.next());
                }
                break;
            case 2:
                tw2 tw2Var3 = (tw2) obj;
                tw2Var3.getClass();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    tw2Var3.T.remove((Long) it3.next());
                }
                break;
            default:
                ((f70) obj).a = list;
                break;
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((j3d) obj).M(this.b);
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        int i2 = this.a;
        List list = this.b;
        switch (i2) {
            case 4:
                break;
        }
        return d3aVar.l(i2aVar, list);
    }
}
