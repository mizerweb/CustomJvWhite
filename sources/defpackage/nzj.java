package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nzj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ nzj(long j, String str, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        String str = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    vxeVarO0.c(1, j);
                    vxeVarO0.B(2, str);
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = ((qxe) obj).O0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    vxeVarO1.c(1, j);
                    vxeVarO1.B(2, str);
                    vxeVarO1.M0();
                    return sbi.a;
                } finally {
                    vxeVarO1.close();
                }
        }
    }
}
