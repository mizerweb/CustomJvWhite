package defpackage;

import java.util.ArrayList;
import one.me.sdk.arch.Widget;
import one.me.webapp.util.WebAppDelegateFreezeException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hfj implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ hfj(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                WebAppDelegateFreezeException webAppDelegateFreezeException = new WebAppDelegateFreezeException("Handle freeze 10 seconds in Js delegate scope");
                gm0.V(sfj.class.getName(), webAppDelegateFreezeException.getMessage(), webAppDelegateFreezeException);
                return sbiVar;
            case 1:
                return sbiVar;
            case 2:
                return Widget.findWidgetByScopeId$lambda$4$0((lve) obj);
            case 3:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
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
                        int i2 = iE13;
                        int i3 = iE14;
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
                        int i4 = (int) vxeVarO0.getLong(iE10);
                        int i5 = iE2;
                        int i6 = iE3;
                        rn0 rn0VarK = rx8.K((int) vxeVarO0.getLong(iE11));
                        long j4 = vxeVarO0.getLong(iE12);
                        long j5 = vxeVarO0.getLong(i2);
                        long j6 = vxeVarO0.getLong(i3);
                        int i7 = iE;
                        int i8 = iE15;
                        long j7 = vxeVarO0.getLong(i8);
                        iE15 = i8;
                        int i9 = iE16;
                        boolean z = ((int) vxeVarO0.getLong(i9)) != 0;
                        int i10 = iE17;
                        int i11 = iE4;
                        yic yicVarM = rx8.M((int) vxeVarO0.getLong(i10));
                        int i12 = iE18;
                        int i13 = iE5;
                        int i14 = (int) vxeVarO0.getLong(i12);
                        int i15 = iE19;
                        int i16 = (int) vxeVarO0.getLong(i15);
                        int i17 = iE20;
                        long j8 = vxeVarO0.getLong(i17);
                        int i18 = iE21;
                        int i19 = (int) vxeVarO0.getLong(i18);
                        int i20 = iE22;
                        int i21 = (int) vxeVarO0.getLong(i20);
                        int i22 = iE23;
                        Boolean boolValueOf = null;
                        String strB3 = vxeVarO0.isNull(i22) ? null : vxeVarO0.B0(i22);
                        int i23 = iE24;
                        Integer numValueOf = vxeVarO0.isNull(i23) ? null : Integer.valueOf((int) vxeVarO0.getLong(i23));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i24 = iE25;
                        Boolean bool = boolValueOf;
                        int iL = rx8.L((int) vxeVarO0.getLong(i24));
                        int i25 = iE26;
                        adb adbVarK0 = rx8.k0(vxeVarO0.getBlob(i25));
                        iE25 = i24;
                        iE26 = i25;
                        int i26 = iE27;
                        boolean z2 = ((int) vxeVarO0.getLong(i26)) != 0;
                        iE27 = i26;
                        int i27 = iE28;
                        boolean z3 = ((int) vxeVarO0.getLong(i27)) != 0;
                        int i28 = iE29;
                        boolean z4 = ((int) vxeVarO0.getLong(i28)) != 0;
                        iE29 = i28;
                        int i29 = iE30;
                        int i30 = iE31;
                        int i31 = iE32;
                        int i32 = iE33;
                        arrayList.add(new mzj(strB0, kyjVarN, strB1, strB2, d25VarI, d25VarI2, j, j2, j3, new kg4(adbVarK0, iL, z2, z3, z4, ((int) vxeVarO0.getLong(i29)) != 0, vxeVarO0.getLong(i30), vxeVarO0.getLong(i31), rx8.k(vxeVarO0.getBlob(i32))), i4, rn0VarK, j4, j5, j6, j7, z, yicVarM, i14, i16, j8, i19, i21, strB3, bool));
                        iE30 = i29;
                        iE4 = i11;
                        iE17 = i10;
                        iE19 = i15;
                        iE22 = i20;
                        iE24 = i23;
                        iE33 = i32;
                        iE31 = i30;
                        iE32 = i31;
                        iE2 = i5;
                        iE13 = i2;
                        iE16 = i9;
                        iE20 = i17;
                        iE21 = i18;
                        iE23 = i22;
                        iE = i7;
                        iE14 = i3;
                        iE3 = i6;
                        iE28 = i27;
                        iE5 = i13;
                        iE18 = i12;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = ((qxe) obj).O0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    return Integer.valueOf(vxeVarO1.M0() ? (int) vxeVarO1.getLong(0) : 0);
                } finally {
                    vxeVarO1.close();
                }
        }
    }

    public /* synthetic */ hfj(int i, Object obj) {
        this.a = i;
    }
}
