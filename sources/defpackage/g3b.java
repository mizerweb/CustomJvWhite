package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class g3b extends aq implements qih, btc {
    public static final /* synthetic */ int n = 0;
    public final long f;
    public final long g;
    public final List h;
    public final List i;
    public final int j;
    public final boolean k;
    public final mg5 l;
    public final boolean m;

    public g3b(long j, long j2, long j3, List list, List list2, int i, boolean z, mg5 mg5Var, boolean z2) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = list;
        this.i = list2;
        this.j = i;
        this.k = z;
        this.l = mg5Var;
        this.m = z2;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    @Override // defpackage.qih
    public final void b(kih kihVar) {
        List list;
        long j;
        Object next;
        LinkedHashSet linkedHashSet = ((i3b) kihVar).d;
        ArrayList arrayList = new ArrayList(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            list = this.h;
            if (!zHasNext) {
                break;
            }
            int iIndexOf = this.i.indexOf(Long.valueOf(((Number) it.next()).longValue()));
            Long l = iIndexOf >= 0 ? (Long) list.get(iIndexOf) : null;
            if (l != null) {
                arrayList.add(l);
            }
        }
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.removeAll(arrayList);
        boolean zIsEmpty = arrayList2.isEmpty();
        long j2 = this.f;
        if (!zIsEmpty) {
            x(arrayList2);
            mg5 mg5Var = mg5.REGULAR;
            mg5 mg5Var2 = this.l;
            if (mg5Var2 == mg5Var) {
                bq bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                sfa sfaVarK = bqVar.i().k(j2, mg5Var2);
                bq bqVar2 = this.e;
                if (bqVar2 == null) {
                    bqVar2 = null;
                }
                bqVar2.c().g0(this.f, sfaVarK, true, null);
            }
        }
        boolean zIsEmpty2 = arrayList.isEmpty();
        boolean z = this.m;
        if (!zIsEmpty2) {
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            rt2 rt2VarN = bqVar3.c().N(j2);
            if (rt2VarN != null) {
                nx2 nx2Var = rt2VarN.b;
                long j3 = 0;
                if (arrayList.contains(Long.valueOf(nx2Var.y))) {
                    bq bqVar4 = this.e;
                    if (bqVar4 == null) {
                        bqVar4 = null;
                    }
                    qw2 qw2VarC = bqVar4.c();
                    qw2VarC.getClass();
                    qw2VarC.v(j2, false, new x50(j3, 5));
                }
                if (z) {
                    return;
                }
                bq bqVar5 = this.e;
                if (bqVar5 == null) {
                    bqVar5 = null;
                }
                if (((f5d) ((wo6) bqVar5.V.getValue())).s()) {
                    bq bqVar6 = this.e;
                    if (bqVar6 == null) {
                        bqVar6 = null;
                    }
                    ArrayList arrayListY = ((ose) ((n25) bqVar6.T.getValue()).c()).y(j2, arrayList);
                    if (arrayListY.isEmpty()) {
                        arrayListY = null;
                    }
                    if (arrayListY != null) {
                        bq bqVar7 = this.e;
                        if (bqVar7 == null) {
                            bqVar7 = null;
                        }
                        uoa uoaVarC = ((n25) bqVar7.T.getValue()).c();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayListY.iterator();
                        while (it2.hasNext()) {
                            sfa sfaVar = ((sfa) it2.next()).q;
                            long j4 = j3;
                            Long lValueOf = sfaVar != null ? Long.valueOf(sfaVar.a) : null;
                            if (lValueOf != null) {
                                arrayList3.add(lValueOf);
                            }
                            j3 = j4;
                        }
                        j = j3;
                        ((ose) uoaVarC).A(j2, ww3.X1(arrayList3));
                        t51 t51VarO = o();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : arrayListY) {
                            if (!arrayList.contains(Long.valueOf(((sfa) obj).a))) {
                                arrayList4.add(obj);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(yw3.W0(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(Long.valueOf(((sfa) it3.next()).a));
                        }
                        t51VarO.c(new lfi(j2, arrayList5));
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    long jLongValue = ((Number) it4.next()).longValue();
                    bq bqVar8 = this.e;
                    if (bqVar8 == null) {
                        bqVar8 = null;
                    }
                    ose oseVar = (ose) bqVar8.i().b.c();
                    toa toaVar = (toa) oseVar.h();
                    List list2 = (List) ch3.G(toaVar.a, true, false, new hoa(jLongValue, toaVar, 0));
                    ArrayList arrayList7 = new ArrayList(yw3.W0(list2, 10));
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(oseVar.b((gga) it5.next()));
                    }
                    if (!arrayList7.isEmpty()) {
                        arrayList6.add(Long.valueOf(jLongValue));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    w(arrayList6);
                    arrayList.removeAll(arrayList6);
                }
                long j5 = nx2Var.M;
                if (j5 != j) {
                    Iterator it6 = arrayList.iterator();
                    do {
                        if (!it6.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it6.next();
                    } while (j5 != ((Number) next).longValue());
                    Long l2 = (Long) next;
                    if (l2 != null) {
                        w(Collections.singletonList(l2));
                        arrayList.remove(l2);
                    }
                }
            }
        }
        if (z || arrayList.isEmpty()) {
            return;
        }
        bq bqVar9 = this.e;
        if (bqVar9 == null) {
            bqVar9 = null;
        }
        bqVar9.i().c(j2, arrayList);
        bq bqVar10 = this.e;
        ((tr6) (bqVar10 != null ? bqVar10 : null).v0.getValue()).b(arrayList);
    }

    @Override // defpackage.btc
    public final void d() {
        gm0.n("g3b", "onMaxFailCount");
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.k().d(this.a);
        x(this.h);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.b().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.MsgDelete msgDelete = new Tasks.MsgDelete();
        msgDelete.requestId = this.a;
        msgDelete.chatId = this.f;
        msgDelete.chatServerId = this.g;
        msgDelete.messagesId = p90.i(this.h);
        msgDelete.messagesServerId = p90.i(this.i);
        msgDelete.forMe = this.k;
        msgDelete.itemTypeId = this.l.a;
        msgDelete.notDeleteMessageFromDb = this.m;
        int i = this.j;
        if (i != 0) {
            msgDelete.complaint = tt2.b(i);
        }
        return sia.toByteArray(msgDelete);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_MSG_DELETE;
    }

    @Override // defpackage.btc
    public final atc j() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return bqVar.c().N(this.f) != null ? atc.a : atc.c;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        rt2 rt2VarN = bqVar.c().N(this.f);
        if (rt2VarN == null) {
            return null;
        }
        return new h3b(this.g, this.i, this.j, !rt2VarN.d0() && this.k, this.l, null, 32);
    }

    public final void w(List list) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        toa toaVar = (toa) ((ose) bqVar.i().b.c()).h();
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE messages SET status_in_process = ? WHERE chat_id = ? AND id in (");
        ch3.G(toaVar.a, false, true, new goa(0, this.f, nbh.x(")", sb, list), list));
    }

    public final void x(List list) {
        gm0.n("g3b", "returnToActiveMessages, messageIds = " + list.size());
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.i().q(this.f, list, wja.ACTIVE, false);
    }
}
