package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q4c implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ q4c(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(i2);
            case 1:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    vxeVarO0.c(1, i2);
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "state");
                    int iE3 = qyj.E(vxeVarO0, "worker_class_name");
                    int iE4 = qyj.E(vxeVarO0, "input_merger_class_name");
                    int iE5 = qyj.E(vxeVarO0, "input");
                    int iE6 = qyj.E(vxeVarO0, "output");
                    int iE7 = qyj.E(vxeVarO0, "initial_delay");
                    int iE8 = qyj.E(vxeVarO0, "interval_duration");
                    int iE9 = qyj.E(vxeVarO0, "flex_duration");
                    int iE10 = qyj.E(vxeVarO0, "run_attempt_count");
                    int iE11 = qyj.E(vxeVarO0, "backoff_policy");
                    int iE12 = qyj.E(vxeVarO0, "backoff_delay_duration");
                    int iE13 = qyj.E(vxeVarO0, "last_enqueue_time");
                    int iE14 = qyj.E(vxeVarO0, "minimum_retention_duration");
                    int iE15 = qyj.E(vxeVarO0, "schedule_requested_at");
                    int iE16 = qyj.E(vxeVarO0, "run_in_foreground");
                    int iE17 = qyj.E(vxeVarO0, "out_of_quota_policy");
                    int iE18 = qyj.E(vxeVarO0, "period_count");
                    int iE19 = qyj.E(vxeVarO0, "generation");
                    int iE20 = qyj.E(vxeVarO0, "next_schedule_time_override");
                    int iE21 = qyj.E(vxeVarO0, "next_schedule_time_override_generation");
                    int iE22 = qyj.E(vxeVarO0, "stop_reason");
                    int iE23 = qyj.E(vxeVarO0, "trace_tag");
                    int iE24 = qyj.E(vxeVarO0, "backoff_on_system_interruptions");
                    int iE25 = qyj.E(vxeVarO0, "required_network_type");
                    int iE26 = qyj.E(vxeVarO0, "required_network_request");
                    int iE27 = qyj.E(vxeVarO0, "requires_charging");
                    int iE28 = qyj.E(vxeVarO0, "requires_device_idle");
                    int iE29 = qyj.E(vxeVarO0, "requires_battery_not_low");
                    int iE30 = qyj.E(vxeVarO0, "requires_storage_not_low");
                    int iE31 = qyj.E(vxeVarO0, "trigger_content_update_delay");
                    int iE32 = qyj.E(vxeVarO0, "trigger_max_content_delay");
                    int iE33 = qyj.E(vxeVarO0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        String strB0 = vxeVarO0.B0(iE);
                        int i3 = iE13;
                        int i4 = iE14;
                        kyj kyjVarN = rx8.N((int) vxeVarO0.getLong(iE2));
                        String strB1 = vxeVarO0.B0(iE3);
                        String strB2 = vxeVarO0.B0(iE4);
                        byte[] blob = vxeVarO0.getBlob(iE5);
                        d25 d25Var = d25.b;
                        d25 d25VarI = f55.i(blob);
                        d25 d25VarI2 = f55.i(vxeVarO0.getBlob(iE6));
                        long j = vxeVarO0.getLong(iE7);
                        long j2 = vxeVarO0.getLong(iE8);
                        long j3 = vxeVarO0.getLong(iE9);
                        int i5 = (int) vxeVarO0.getLong(iE10);
                        int i6 = iE;
                        int i7 = iE2;
                        rn0 rn0VarK = rx8.K((int) vxeVarO0.getLong(iE11));
                        long j4 = vxeVarO0.getLong(iE12);
                        long j5 = vxeVarO0.getLong(i3);
                        long j6 = vxeVarO0.getLong(i4);
                        int i8 = iE15;
                        long j7 = vxeVarO0.getLong(i8);
                        iE15 = i8;
                        int i9 = iE16;
                        int i10 = iE3;
                        boolean z = ((int) vxeVarO0.getLong(i9)) != 0;
                        int i11 = iE17;
                        int i12 = iE4;
                        yic yicVarM = rx8.M((int) vxeVarO0.getLong(i11));
                        int i13 = iE18;
                        int i14 = (int) vxeVarO0.getLong(i13);
                        int i15 = iE19;
                        int i16 = (int) vxeVarO0.getLong(i15);
                        int i17 = iE20;
                        long j8 = vxeVarO0.getLong(i17);
                        int i18 = iE21;
                        int i19 = (int) vxeVarO0.getLong(i18);
                        iE21 = i18;
                        iE22 = iE22;
                        int i20 = (int) vxeVarO0.getLong(iE22);
                        int i21 = iE23;
                        Boolean boolValueOf = null;
                        String strB3 = vxeVarO0.isNull(i21) ? null : vxeVarO0.B0(i21);
                        int i22 = iE24;
                        Integer numValueOf = vxeVarO0.isNull(i22) ? null : Integer.valueOf((int) vxeVarO0.getLong(i22));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i23 = iE25;
                        int iL = rx8.L((int) vxeVarO0.getLong(i23));
                        int i24 = iE26;
                        adb adbVarK0 = rx8.k0(vxeVarO0.getBlob(i24));
                        int i25 = iE27;
                        boolean z2 = ((int) vxeVarO0.getLong(i25)) != 0;
                        int i26 = iE28;
                        boolean z3 = ((int) vxeVarO0.getLong(i26)) != 0;
                        int i27 = iE29;
                        boolean z4 = ((int) vxeVarO0.getLong(i27)) != 0;
                        iE29 = i27;
                        int i28 = iE30;
                        int i29 = iE31;
                        int i30 = iE32;
                        iE31 = i29;
                        int i31 = iE33;
                        arrayList.add(new mzj(strB0, kyjVarN, strB1, strB2, d25VarI, d25VarI2, j, j2, j3, new kg4(adbVarK0, iL, z2, z3, z4, ((int) vxeVarO0.getLong(i28)) != 0, vxeVarO0.getLong(i29), vxeVarO0.getLong(i30), rx8.k(vxeVarO0.getBlob(i31))), i5, rn0VarK, j4, j5, j6, j7, z, yicVarM, i14, i16, j8, i19, i20, strB3, bool));
                        iE28 = i26;
                        iE4 = i12;
                        iE17 = i11;
                        iE18 = i13;
                        iE19 = i15;
                        iE20 = i17;
                        iE23 = i21;
                        iE24 = i22;
                        iE25 = i23;
                        iE26 = i24;
                        iE27 = i25;
                        iE33 = i31;
                        iE32 = i30;
                        iE30 = i28;
                        iE = i6;
                        iE3 = i10;
                        iE13 = i3;
                        iE14 = i4;
                        iE2 = i7;
                        iE16 = i9;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            default:
                return Integer.valueOf(WorkersQueueDao_Impl.count$lambda$0("SELECT COUNT(*) FROM WorkerQueueItem WHERE state = ?", i2, (qxe) obj));
        }
    }
}
