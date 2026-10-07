package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class epb implements cf7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ epb(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM notifications_tracker_messages WHERE chat_id=? AND message_id=? AND post_id=?");
        try {
            vxeVarO0.c(1, j);
            vxeVarO0.c(2, j2);
            vxeVarO0.c(3, j3);
            int iE = qyj.E(vxeVarO0, "message_id");
            int iE2 = qyj.E(vxeVarO0, "time");
            int iE3 = qyj.E(vxeVarO0, "push_source");
            int iE4 = qyj.E(vxeVarO0, "drop_reason");
            int iE5 = qyj.E(vxeVarO0, "push_type");
            int iE6 = qyj.E(vxeVarO0, "show_analytics_sent");
            int iE7 = qyj.E(vxeVarO0, "chat_id");
            int iE8 = qyj.E(vxeVarO0, "post_id");
            Object dpbVar = null;
            if (vxeVarO0.M0()) {
                long j4 = vxeVarO0.getLong(iE);
                long j5 = vxeVarO0.getLong(iE2);
                Integer numValueOf = vxeVarO0.isNull(iE3) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE3));
                String strB0 = vxeVarO0.isNull(iE4) ? null : vxeVarO0.B0(iE4);
                qv5[] qv5VarArr = qv5.b;
                dpbVar = new dpb(new ilb(vxeVarO0.getLong(iE7), vxeVarO0.getLong(iE8)), j4, j5, numValueOf, vd7.y(strB0), vxeVarO0.isNull(iE5) ? null : vxeVarO0.B0(iE5), ((int) vxeVarO0.getLong(iE6)) != 0);
            }
            return dpbVar;
        } finally {
            vxeVarO0.close();
        }
    }
}
