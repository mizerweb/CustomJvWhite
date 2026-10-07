package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class qka implements oka {
    public final gjg a;
    public final xhh b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ifh f;
    public final p41 g;
    public final ConcurrentHashMap.KeySetView h;

    public qka(r8e r8eVar, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = r8eVar;
        this.b = xhhVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        ifh ifhVar = new ifh(new vx9(this, 7, ny8Var4));
        this.f = ifhVar;
        this.g = yab.b(32, 0, null, 6);
        this.h = ConcurrentHashMap.newKeySet();
        yab.i0((gu4) ifhVar.getValue(), null, 0, new pka(this, null), 3);
    }

    @Override // defpackage.oka
    public final Object a(ArrayList arrayList, lq4 lq4Var) {
        rt2 rt2Var = (rt2) this.a.getValue();
        if (rt2Var != null && rt2Var.d0()) {
            ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MessageModel messageModel = (MessageModel) it.next();
                arrayList2.add(new ylc(new Long(messageModel.b), new Long(messageModel.a)));
            }
            Object objA = this.g.a(lq4Var, arrayList2);
            if (objA == hu4.a) {
                return objA;
            }
        }
        return sbi.a;
    }

    @Override // defpackage.oka
    public final void clear() {
        cqk.g((gu4) this.f.getValue());
    }
}
