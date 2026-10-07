package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gkf extends mjf {
    public final long b;
    public final List c;
    public final boolean d;
    public final mg5 e;
    public final String f = gkf.class.getName();

    public gkf(long j, List list, boolean z, mg5 mg5Var) {
        this.b = j;
        this.c = list;
        this.d = z;
        this.e = mg5Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0159  */
    @Override // defpackage.mjf
    public final void B() {
        wja wjaVar = wja.DELETED;
        rt2 rt2VarN = i().N(this.b);
        if (rt2VarN == null) {
            njf njfVar = this.a;
            ((t1c) ((ed6) (njfVar != null ? njfVar : null).p.getValue())).a(new IllegalStateException("chat is null"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<sfa> arrayList2 = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sfa sfaVarL = s().l(((Number) it.next()).longValue());
            if (sfaVarL != null) {
                if (sfaVarL.b == 0) {
                    arrayList2.add(sfaVarL);
                    q().getClass();
                } else {
                    arrayList.add(sfaVarL);
                }
            }
        }
        long j = rt2VarN.b.a;
        if (arrayList.isEmpty()) {
            gm0.Y(gkf.class.getName(), "Early return in deleteServerMessages cuz of messageDbs.isEmpty()");
        } else {
            gm0.n(this.f, zo5.g(arrayList.size(), this.b, "deleteServerMessages: chatId = ", ", messages.size() = "));
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((sfa) it2.next()).a));
                } catch (Throwable th) {
                    qr7.o(th);
                    return;
                }
            }
            s().q(this.b, arrayList3, wjaVar, true);
            pvb pvbVarB = b();
            long j2 = this.b;
            ArrayList arrayList4 = new ArrayList(arrayList.size());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                try {
                    ArrayList arrayList5 = arrayList;
                    arrayList4.add(Long.valueOf(((sfa) it3.next()).b));
                    arrayList = arrayList5;
                } catch (Throwable th2) {
                    qr7.o(th2);
                    return;
                }
            }
            pvbVarB.w(j2, j, arrayList3, arrayList4, this.d, this.e);
            C(arrayList);
        }
        if (arrayList2.isEmpty()) {
            gm0.Y(gkf.class.getName(), "Early return in deleteLocalMessages cuz of messageDbs.isEmpty()");
        } else {
            gm0.n(this.f, zo5.g(arrayList2.size(), this.b, "deleteLocalMessages: chatId = ", ", messages.size() = "));
            for (sfa sfaVar : arrayList2) {
                njf njfVar2 = this.a;
                if (njfVar2 == null) {
                    njfVar2 = null;
                }
                ika ikaVar = (ika) njfVar2.G.getValue();
                long j3 = sfaVar.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    ikaVar.getClass();
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "ika", zo5.j(j3, "cancel: messageId="), null);
                    }
                }
                ((cq6) ikaVar.d.getValue()).a(j3, true);
            }
            qfa qfaVarS = s();
            long j4 = this.b;
            ArrayList arrayList6 = new ArrayList(arrayList2.size());
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                try {
                    arrayList6.add(Long.valueOf(((sfa) it4.next()).a));
                } catch (Throwable th3) {
                    qr7.o(th3);
                    return;
                }
            }
            qfaVarS.q(j4, arrayList6, wjaVar, false);
            C(arrayList2);
        }
        gm0.n(this.f, "Send MsgDeleteEvent");
        w().c(new j3b(this.b, this.c, this.e));
        if (this.c.contains(Long.valueOf(rt2VarN.b.j))) {
            i().I(this.b);
        }
        if (this.c.contains(Long.valueOf(rt2VarN.b.y))) {
            i().G(this.b, null, 0L);
        }
    }

    public final void C(ArrayList arrayList) {
        rt2 rt2VarN;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sfa sfaVar = (sfa) it.next();
            if (sfaVar != null && (rt2VarN = i().N(sfaVar.h)) != null) {
                njf njfVar = this.a;
                if (njfVar == null) {
                    njfVar = null;
                }
                ((hjc) njfVar.x.getValue()).c(rt2VarN.b.a, sfaVar.a);
            }
        }
    }
}
