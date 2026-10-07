package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.contactlist.ContactListWidget;
import one.me.startconversation.StartConversationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ck3 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ck3(sfe sfeVar, yx6 yx6Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = sfeVar;
        this.d = obj;
        this.e = obj2;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x028a  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        bk3 bk3Var;
        int i;
        el4 el4Var;
        int i2;
        cyc cycVar;
        qxc qxcVar;
        whg whgVar;
        int i3 = 3;
        int i4 = 1;
        switch (this.a) {
            case 0:
                fk3 fk3Var = (fk3) this.e;
                sfe sfeVar = (sfe) this.c;
                if (lq4Var instanceof bk3) {
                    bk3Var = (bk3) lq4Var;
                    int i5 = bk3Var.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bk3Var.e = i5 - Integer.MIN_VALUE;
                    } else {
                        bk3Var = new bk3(this, lq4Var);
                    }
                } else {
                    bk3Var = new bk3(this, lq4Var);
                }
                Object obj2 = bk3Var.d;
                hu4 hu4Var = hu4.a;
                int i6 = bk3Var.e;
                if (i6 == 0) {
                    ch3.d0(obj2);
                    if (sfeVar.a || ((Boolean) obj).booleanValue()) {
                        i = 1;
                    } else {
                        s9e s9eVar = (s9e) this.d;
                        s9eVar.getClass();
                        if (s9eVar.g) {
                            a8j.x(fk3Var.J, zm3.z(zm3.b, s9eVar.a, bdj.FROM_SEARCH, null, null, 20));
                        } else {
                            fk3Var.I(s9eVar.a);
                        }
                        i = 1;
                        sfeVar.a = true;
                    }
                    yx6 yx6Var = (yx6) this.b;
                    bk3Var.e = i;
                    if (yx6Var.emit(obj, bk3Var) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            case 1:
                sfe sfeVar2 = (sfe) this.c;
                ContactListWidget contactListWidget = (ContactListWidget) this.d;
                if (lq4Var instanceof el4) {
                    el4Var = (el4) lq4Var;
                    int i7 = el4Var.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        el4Var.e = i7 - Integer.MIN_VALUE;
                    } else {
                        el4Var = new el4(this, lq4Var);
                    }
                } else {
                    el4Var = new el4(this, lq4Var);
                }
                Object obj3 = el4Var.d;
                hu4 hu4Var2 = hu4.a;
                int i8 = el4Var.e;
                if (i8 == 0) {
                    ch3.d0(obj3);
                    if (sfeVar2.a || ((Boolean) obj).booleanValue()) {
                        i2 = 1;
                    } else {
                        if (contactListWidget.getView() != null) {
                            ((uj4) contactListWidget.H.getValue()).a(contactListWidget.requireActivity(), ((g2g) this.e).a);
                        }
                        i2 = 1;
                        sfeVar2.a = true;
                    }
                    yx6 yx6Var2 = (yx6) this.b;
                    el4Var.e = i2;
                    if (yx6Var2.emit(obj, el4Var) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i8 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            case 2:
                efg efgVar = (efg) obj;
                hu4 hu4Var3 = hu4.a;
                je9 je9Var = je9.d;
                sbi sbiVar = sbi.a;
                if (efgVar instanceof dfg) {
                    ((njd) this.b).f.c(new uxg(((dfg) efgVar).a));
                } else if (efgVar instanceof cfg) {
                    njd njdVar = (njd) this.b;
                    yab.i0(njdVar, null, 0, new h30((ae5) this.c, efgVar, (axg) this.d, (ArrayList) this.e, njdVar, null), 3);
                } else if (efgVar instanceof afg) {
                    String str = ((ae5) this.c).f;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Video story was rendered successfully", null);
                    }
                    Object objA = ((njd) this.b).f.a(lq4Var, new rxg(((afg) efgVar).a));
                    if (objA == hu4Var3) {
                        return objA;
                    }
                } else {
                    if (!(efgVar instanceof bfg)) {
                        ore.o();
                        return null;
                    }
                    String str2 = ((ae5) this.c).f;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "Video story rendering was failed", null);
                    }
                    Object objA2 = ((njd) this.b).f.a(lq4Var, sxg.a);
                    if (objA2 == hu4Var3) {
                        return objA2;
                    }
                }
                return sbiVar;
            case 3:
                dyc dycVar = (dyc) this.d;
                et3 et3Var = dycVar.f;
                py2 py2Var = dycVar.h;
                if (lq4Var instanceof cyc) {
                    cycVar = (cyc) lq4Var;
                    int i9 = cycVar.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        cycVar.e = i9 - Integer.MIN_VALUE;
                    } else {
                        cycVar = new cyc(this, lq4Var);
                    }
                } else {
                    cycVar = new cyc(this, lq4Var);
                }
                Object obj4 = cycVar.d;
                hu4 hu4Var4 = hu4.a;
                int i10 = cycVar.e;
                if (i10 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var3 = (yx6) this.b;
                    List list = (List) obj;
                    if (list == null) {
                        list = r66.a;
                    }
                    qu6 qu6VarN0 = yhf.n0(new sw(1, list), new w62(dycVar, 8, (Long) this.e));
                    mu1 mu1Var = (mu1) this.c;
                    ArrayList arrayList = new ArrayList(list.size());
                    ArrayList arrayList2 = new ArrayList();
                    yhf.v0(qu6VarN0, arrayList2);
                    bx3.Y0(arrayList2, mu1Var);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ek4 ek4Var = (ek4) it.next();
                        boolean zBooleanValue = ((Boolean) ((e5d) dycVar.o.getValue()).G6.a(e5d.S6[399]).i()).booleanValue();
                        boolean z = ek4Var.s;
                        boolean z2 = ek4Var.u;
                        boolean z3 = ek4Var.t;
                        if (py2Var == py2.b && zBooleanValue && (z || !z2 || z3)) {
                            qxcVar = null;
                        } else {
                            int i11 = ek4Var.q ? 5 : i3;
                            int iOrdinal = py2Var.ordinal();
                            boolean z4 = (iOrdinal == i4 ? ek4Var.s : (iOrdinal == 2 || iOrdinal == i3) && ek4Var.r) ? 0 : i4;
                            long j = ek4Var.a;
                            qxcVar = new qxc(j, new Long(j ^ ((s7f) et3Var).t()), new xnh(ek4Var.b), ek4Var.e, ek4Var.g, ek4Var.h, ek4Var.i, new xyc(4, i11, ek4Var.a ^ ((s7f) et3Var).t()), ek4Var.j, (Integer) null, z4, 1536);
                        }
                        if (qxcVar != null) {
                            arrayList.add(qxcVar);
                        }
                        it = it;
                        dycVar = dycVar;
                        i3 = 3;
                        i4 = 1;
                    }
                    cycVar.e = i4;
                    if (yx6Var3.emit(arrayList, cycVar) == hu4Var4) {
                        return hu4Var4;
                    }
                } else {
                    if (i10 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
            default:
                StartConversationScreen startConversationScreen = (StartConversationScreen) this.d;
                sfe sfeVar3 = (sfe) this.c;
                if (lq4Var instanceof whg) {
                    whgVar = (whg) lq4Var;
                    int i12 = whgVar.e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        whgVar.e = i12 - Integer.MIN_VALUE;
                    } else {
                        whgVar = new whg(this, lq4Var);
                    }
                } else {
                    whgVar = new whg(this, lq4Var);
                }
                Object obj5 = whgVar.d;
                hu4 hu4Var5 = hu4.a;
                int i13 = whgVar.e;
                if (i13 == 0) {
                    ch3.d0(obj5);
                    if (!sfeVar3.a && !((Boolean) obj).booleanValue()) {
                        ((uj4) startConversationScreen.j.getValue()).a(startConversationScreen.requireActivity(), ((lhg) ((nhg) this.e)).a);
                        sfeVar3.a = true;
                    }
                    yx6 yx6Var4 = (yx6) this.b;
                    whgVar.e = 1;
                    if (yx6Var4.emit(obj, whgVar) == hu4Var5) {
                        return hu4Var5;
                    }
                } else {
                    if (i13 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj5);
                }
                return sbi.a;
        }
    }

    public /* synthetic */ ck3(Object obj, Object obj2, Object obj3, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = serializable;
    }
}
