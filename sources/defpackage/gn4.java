package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn4 implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gn4(in4 in4Var, long j, ki4 ki4Var, ConcurrentHashMap concurrentHashMap) {
        this.b = in4Var;
        this.c = ki4Var;
        this.d = concurrentHashMap;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i;
        long j;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4 = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i4) {
            case 0:
                rre rreVar = ((in4) obj4).a;
                ki4 ki4Var = (ki4) obj3;
                List list = ki4Var.f;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                long j2 = ki4Var.a;
                int i5 = ki4Var.j;
                if (i5 == 0) {
                    i5 = 1;
                }
                if (i5 == 1) {
                    Object obj5 = concurrentHashMap.get(Long.valueOf(j2));
                    if (!(obj5 == null ? false : obj5.equals(Integer.valueOf(list.hashCode())))) {
                        concurrentHashMap.remove(Long.valueOf(j2));
                        lge lgeVar = ve7.a;
                        te7 te7VarB = ve7.b(list);
                        if (te7VarB != null) {
                            String strB = xoh.b(ki4Var.o);
                            if (ch3.r(strB)) {
                                strB = "";
                            }
                            String strJ = daf.j(strB);
                            String str = te7VarB.a;
                            String str2 = te7VarB.b;
                            te7 te7Var = te7VarB.c;
                            ch3.G(rreVar, false, true, new en4(j2, strJ, str, str2, te7Var != null ? te7Var.a : null, te7Var != null ? te7Var.b : null));
                            concurrentHashMap.put(Long.valueOf(j2), Integer.valueOf(list.hashCode()));
                        }
                    }
                } else {
                    ch3.G(rreVar, false, true, new aa2(j2, 7));
                }
                return sbi.a;
            default:
                p3c p3cVar = (p3c) obj3;
                r5e r5eVar = (r5e) obj2;
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0((String) obj4);
                try {
                    ((yre) p3cVar.b).invoke(vxeVarO0);
                    int iN = qyj.n(vxeVarO0, "id");
                    int iN2 = qyj.n(vxeVarO0, "state");
                    int iN3 = qyj.n(vxeVarO0, "output");
                    int iN4 = qyj.n(vxeVarO0, "initial_delay");
                    int iN5 = qyj.n(vxeVarO0, "interval_duration");
                    int iN6 = qyj.n(vxeVarO0, "flex_duration");
                    int iN7 = qyj.n(vxeVarO0, "run_attempt_count");
                    int iN8 = qyj.n(vxeVarO0, "backoff_policy");
                    int iN9 = qyj.n(vxeVarO0, "backoff_delay_duration");
                    int iN10 = qyj.n(vxeVarO0, "last_enqueue_time");
                    int iN11 = qyj.n(vxeVarO0, "period_count");
                    int iN12 = qyj.n(vxeVarO0, "generation");
                    int iN13 = qyj.n(vxeVarO0, "next_schedule_time_override");
                    int iN14 = qyj.n(vxeVarO0, "stop_reason");
                    int iN15 = qyj.n(vxeVarO0, "required_network_type");
                    int iN16 = qyj.n(vxeVarO0, "required_network_request");
                    int iN17 = qyj.n(vxeVarO0, "requires_charging");
                    int iN18 = qyj.n(vxeVarO0, "requires_device_idle");
                    int iN19 = qyj.n(vxeVarO0, "requires_battery_not_low");
                    int iN20 = qyj.n(vxeVarO0, "requires_storage_not_low");
                    int iN21 = qyj.n(vxeVarO0, "trigger_content_update_delay");
                    int iN22 = qyj.n(vxeVarO0, "trigger_max_content_delay");
                    int iN23 = qyj.n(vxeVarO0, "content_uri_triggers");
                    int i6 = iN12;
                    mw mwVar = new mw(0);
                    int i7 = iN11;
                    mw mwVar2 = new mw(0);
                    while (vxeVarO0.M0()) {
                        String strB0 = vxeVarO0.B0(iN);
                        if (!mwVar.containsKey(strB0)) {
                            mwVar.put(strB0, new ArrayList());
                        }
                        String strB1 = vxeVarO0.B0(iN);
                        if (!mwVar2.containsKey(strB1)) {
                            mwVar2.put(strB1, new ArrayList());
                        }
                        iN10 = iN10;
                    }
                    int i8 = iN10;
                    vxeVarO0.reset();
                    r5eVar.b(qxeVar, mwVar);
                    r5eVar.a(qxeVar, mwVar2);
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        if (iN == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        String strB2 = vxeVarO0.B0(iN);
                        if (iN2 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        kyj kyjVarN = rx8.N((int) vxeVarO0.getLong(iN2));
                        if (iN3 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        byte[] blob = vxeVarO0.getBlob(iN3);
                        d25 d25Var = d25.b;
                        d25 d25VarI = f55.i(blob);
                        long j3 = iN4 == -1 ? 0L : vxeVarO0.getLong(iN4);
                        long j4 = iN5 == -1 ? 0L : vxeVarO0.getLong(iN5);
                        long j5 = iN6 == -1 ? 0L : vxeVarO0.getLong(iN6);
                        int i9 = iN7 == -1 ? 0 : (int) vxeVarO0.getLong(iN7);
                        if (iN8 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        mw mwVar3 = mwVar2;
                        rn0 rn0VarK = rx8.K((int) vxeVarO0.getLong(iN8));
                        long j6 = iN9 == -1 ? 0L : vxeVarO0.getLong(iN9);
                        i8 = i8;
                        if (i8 == -1) {
                            i = i7;
                            j = 0;
                        } else {
                            i = i7;
                            j = vxeVarO0.getLong(i8);
                        }
                        if (i == -1) {
                            i2 = 0;
                            i3 = -1;
                        } else {
                            i2 = (int) vxeVarO0.getLong(i);
                            i3 = -1;
                        }
                        int i10 = i6;
                        int i11 = i10 == i3 ? 0 : (int) vxeVarO0.getLong(i10);
                        int i12 = iN13;
                        long j7 = i12 == i3 ? 0L : vxeVarO0.getLong(i12);
                        int i13 = iN14;
                        int i14 = i13 == i3 ? 0 : (int) vxeVarO0.getLong(i13);
                        int i15 = iN15;
                        if (i15 == i3) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        int iL = rx8.L((int) vxeVarO0.getLong(i15));
                        int i16 = iN16;
                        if (i16 == i3) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        adb adbVarK0 = rx8.k0(vxeVarO0.getBlob(i16));
                        int i17 = iN17;
                        if (i17 == i3) {
                            z = false;
                        } else {
                            z = ((int) vxeVarO0.getLong(i17)) != 0;
                        }
                        int i18 = iN18;
                        if (i18 == i3) {
                            z2 = false;
                        } else {
                            z2 = ((int) vxeVarO0.getLong(i18)) != 0;
                        }
                        int i19 = iN19;
                        if (i19 == i3) {
                            z3 = false;
                        } else {
                            z3 = ((int) vxeVarO0.getLong(i19)) != 0;
                        }
                        int i20 = iN20;
                        if (i20 == i3) {
                            z4 = false;
                        } else {
                            z4 = ((int) vxeVarO0.getLong(i20)) != 0;
                        }
                        int i21 = iN21;
                        long j8 = i21 == i3 ? 0L : vxeVarO0.getLong(i21);
                        int i22 = iN22;
                        long j9 = i22 == i3 ? 0L : vxeVarO0.getLong(i22);
                        int i23 = iN23;
                        if (i23 == i3) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        arrayList.add(new lzj(strB2, kyjVarN, d25VarI, j3, j4, j5, new kg4(adbVarK0, iL, z, z2, z3, z4, j8, j9, rx8.k(vxeVarO0.getBlob(i23))), i9, rn0VarK, j6, j, i2, i11, j7, i14, (List) wm9.N0(mwVar, vxeVarO0.B0(iN)), (List) wm9.N0(mwVar3, vxeVarO0.B0(iN))));
                        iN3 = iN3;
                        iN13 = i12;
                        iN17 = i17;
                        iN18 = i18;
                        iN2 = iN2;
                        iN19 = i19;
                        iN21 = i21;
                        mwVar2 = mwVar3;
                        iN23 = i23;
                        i6 = i10;
                        iN = iN;
                        i7 = i;
                        iN22 = i22;
                        iN4 = iN4;
                        iN14 = i13;
                        iN15 = i15;
                        iN16 = i16;
                        iN20 = i20;
                    }
                    vxeVarO0.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ gn4(String str, p3c p3cVar, r5e r5eVar) {
        this.b = str;
        this.c = p3cVar;
        this.d = r5eVar;
    }
}
