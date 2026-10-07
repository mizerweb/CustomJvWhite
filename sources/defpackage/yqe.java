package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yqe implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ yqe(int i, String str, int i2) {
        this.a = i2;
        this.c = i;
        this.b = str;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        tfh tfhVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        String str = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE chat_folder SET `order` = ? WHERE id = ?");
                try {
                    vxeVarO0.c(1, i2);
                    vxeVarO0.B(2, str);
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    vxeVarO1.B(1, str);
                    vxeVarO1.c(2, i2);
                    int iE = qyj.E(vxeVarO1, "work_spec_id");
                    int iE2 = qyj.E(vxeVarO1, "generation");
                    int iE3 = qyj.E(vxeVarO1, "system_id");
                    if (vxeVarO1.M0()) {
                        tfhVar = new tfh(vxeVarO1.B0(iE), (int) vxeVarO1.getLong(iE2), (int) vxeVarO1.getLong(iE3));
                        break;
                    } else {
                        tfhVar = null;
                    }
                    return tfhVar;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                vxe vxeVarO2 = ((qxe) obj).O0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    vxeVarO2.B(1, str);
                    vxeVarO2.c(2, i2);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            default:
                vxe vxeVarO3 = ((qxe) obj).O0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    vxeVarO3.c(1, i2);
                    vxeVarO3.B(2, str);
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
        }
    }

    public /* synthetic */ yqe(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }
}
