package defpackage;

import java.util.ArrayList;
import one.me.android.concurrent.ThreadExecutorException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jqh implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ jqh(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        vxe vxeVar;
        Boolean boolValueOf;
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                int i2 = ThreadExecutorException.a;
                return ((mcj) obj).b(j);
            case 1:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM uploads WHERE attach_id=?");
                try {
                    vxeVarO0.c(1, j);
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            case 2:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM webapp_biometry WHERE user_id = ?");
                try {
                    vxeVarO1.c(1, j);
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "user_id");
                    int iE3 = qyj.E(vxeVarO1, "bot_id");
                    int iE4 = qyj.E(vxeVarO1, ApiProtocol.KEY_TOKEN);
                    int iE5 = qyj.E(vxeVarO1, "access_requested");
                    int iE6 = qyj.E(vxeVarO1, "access_granted");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList.add(new sej(vxeVarO1.getLong(iE), vxeVarO1.getLong(iE2), vxeVarO1.getLong(iE3), vxeVarO1.isNull(iE4) ? null : vxeVarO1.B0(iE4), ((int) vxeVarO1.getLong(iE5)) != 0, ((int) vxeVarO1.getLong(iE6)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
            default:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    vxeVarO2.c(1, j);
                    int iE7 = qyj.E(vxeVarO2, "id");
                    int iE8 = qyj.E(vxeVarO2, "state");
                    int iE9 = qyj.E(vxeVarO2, "worker_class_name");
                    int iE10 = qyj.E(vxeVarO2, "input_merger_class_name");
                    int iE11 = qyj.E(vxeVarO2, "input");
                    int iE12 = qyj.E(vxeVarO2, "output");
                    int iE13 = qyj.E(vxeVarO2, "initial_delay");
                    int iE14 = qyj.E(vxeVarO2, "interval_duration");
                    int iE15 = qyj.E(vxeVarO2, "flex_duration");
                    int iE16 = qyj.E(vxeVarO2, "run_attempt_count");
                    int iE17 = qyj.E(vxeVarO2, "backoff_policy");
                    int iE18 = qyj.E(vxeVarO2, "backoff_delay_duration");
                    int iE19 = qyj.E(vxeVarO2, "last_enqueue_time");
                    int iE20 = qyj.E(vxeVarO2, "minimum_retention_duration");
                    int iE21 = qyj.E(vxeVarO2, "schedule_requested_at");
                    int iE22 = qyj.E(vxeVarO2, "run_in_foreground");
                    int iE23 = qyj.E(vxeVarO2, "out_of_quota_policy");
                    int iE24 = qyj.E(vxeVarO2, "period_count");
                    int iE25 = qyj.E(vxeVarO2, "generation");
                    int iE26 = qyj.E(vxeVarO2, "next_schedule_time_override");
                    int iE27 = qyj.E(vxeVarO2, "next_schedule_time_override_generation");
                    int iE28 = qyj.E(vxeVarO2, "stop_reason");
                    int iE29 = qyj.E(vxeVarO2, "trace_tag");
                    int iE30 = qyj.E(vxeVarO2, "backoff_on_system_interruptions");
                    int iE31 = qyj.E(vxeVarO2, "required_network_type");
                    int iE32 = qyj.E(vxeVarO2, "required_network_request");
                    int iE33 = qyj.E(vxeVarO2, "requires_charging");
                    int iE34 = qyj.E(vxeVarO2, "requires_device_idle");
                    int iE35 = qyj.E(vxeVarO2, "requires_battery_not_low");
                    int iE36 = qyj.E(vxeVarO2, "requires_storage_not_low");
                    int iE37 = qyj.E(vxeVarO2, "trigger_content_update_delay");
                    int iE38 = qyj.E(vxeVarO2, "trigger_max_content_delay");
                    int iE39 = qyj.E(vxeVarO2, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO2.M0()) {
                        String strB0 = vxeVarO2.B0(iE7);
                        int i3 = iE20;
                        ArrayList arrayList3 = arrayList2;
                        kyj kyjVarN = rx8.N((int) vxeVarO2.getLong(iE8));
                        String strB1 = vxeVarO2.B0(iE9);
                        String strB2 = vxeVarO2.B0(iE10);
                        byte[] blob = vxeVarO2.getBlob(iE11);
                        d25 d25Var = d25.b;
                        d25 d25VarI = f55.i(blob);
                        d25 d25VarI2 = f55.i(vxeVarO2.getBlob(iE12));
                        long j2 = vxeVarO2.getLong(iE13);
                        long j3 = vxeVarO2.getLong(iE14);
                        long j4 = vxeVarO2.getLong(iE15);
                        int i4 = (int) vxeVarO2.getLong(iE16);
                        rn0 rn0VarK = rx8.K((int) vxeVarO2.getLong(iE17));
                        long j5 = vxeVarO2.getLong(iE18);
                        long j6 = vxeVarO2.getLong(iE19);
                        long j7 = vxeVarO2.getLong(i3);
                        int i5 = iE21;
                        long j8 = vxeVarO2.getLong(i5);
                        int i6 = iE7;
                        int i7 = iE19;
                        int i8 = iE22;
                        int i9 = iE8;
                        boolean z = ((int) vxeVarO2.getLong(i8)) != 0;
                        int i10 = iE23;
                        yic yicVarM = rx8.M((int) vxeVarO2.getLong(i10));
                        int i11 = iE24;
                        int i12 = (int) vxeVarO2.getLong(i11);
                        int i13 = iE25;
                        int i14 = (int) vxeVarO2.getLong(i13);
                        int i15 = iE26;
                        long j9 = vxeVarO2.getLong(i15);
                        int i16 = iE27;
                        int i17 = (int) vxeVarO2.getLong(i16);
                        int i18 = iE28;
                        int i19 = (int) vxeVarO2.getLong(i18);
                        int i20 = iE29;
                        String strB3 = vxeVarO2.isNull(i20) ? null : vxeVarO2.B0(i20);
                        int i21 = iE30;
                        Integer numValueOf = vxeVarO2.isNull(i21) ? null : Integer.valueOf((int) vxeVarO2.getLong(i21));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i22 = iE31;
                        int iL = rx8.L((int) vxeVarO2.getLong(i22));
                        int i23 = iE32;
                        adb adbVarK0 = rx8.k0(vxeVarO2.getBlob(i23));
                        iE31 = i22;
                        iE32 = i23;
                        int i24 = iE33;
                        boolean z2 = ((int) vxeVarO2.getLong(i24)) != 0;
                        iE33 = i24;
                        int i25 = iE34;
                        boolean z3 = ((int) vxeVarO2.getLong(i25)) != 0;
                        int i26 = iE35;
                        boolean z4 = ((int) vxeVarO2.getLong(i26)) != 0;
                        iE35 = i26;
                        int i27 = iE36;
                        int i28 = iE37;
                        int i29 = iE38;
                        int i30 = iE39;
                        iE39 = i30;
                        vxeVar = vxeVarO2;
                        try {
                            arrayList3.add(new mzj(strB0, kyjVarN, strB1, strB2, d25VarI, d25VarI2, j2, j3, j4, new kg4(adbVarK0, iL, z2, z3, z4, ((int) vxeVarO2.getLong(i27)) != 0, vxeVarO2.getLong(i28), vxeVarO2.getLong(i29), rx8.k(vxeVarO2.getBlob(i30))), i4, rn0VarK, j5, j6, j7, j8, z, yicVarM, i12, i14, j9, i17, i19, strB3, boolValueOf));
                            iE8 = i9;
                            iE22 = i8;
                            iE26 = i15;
                            iE27 = i16;
                            iE29 = i20;
                            iE34 = i25;
                            arrayList2 = arrayList3;
                            vxeVarO2 = vxeVar;
                            iE37 = i28;
                            iE36 = i27;
                            iE20 = i3;
                            iE23 = i10;
                            iE25 = i13;
                            iE28 = i18;
                            iE30 = i21;
                            iE7 = i6;
                            iE38 = i29;
                            iE21 = i5;
                            iE19 = i7;
                            iE24 = i11;
                        } catch (Throwable th) {
                            th = th;
                            vxeVar.close();
                            throw th;
                        }
                        break;
                    }
                    vxe vxeVar2 = vxeVarO2;
                    ArrayList arrayList4 = arrayList2;
                    vxeVar2.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    th = th2;
                    vxeVar = vxeVarO2;
                }
                break;
        }
    }
}
