package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zna implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ zna(long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        long j = this.d;
        int i2 = this.c;
        int i3 = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                vxe vxeVarO0 = qxeVar.O0("UPDATE messages SET channel_views = ?, channel_forwards = ? WHERE server_id = ?");
                try {
                    vxeVarO0.c(1, i3);
                    vxeVarO0.c(2, i2);
                    vxeVarO0.c(3, j);
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = qxeVar.O0("UPDATE messages SET channel_views = ?, channel_forwards = ? WHERE server_id = ?");
                try {
                    vxeVarO1.c(1, i3);
                    vxeVarO1.c(2, i2);
                    vxeVarO1.c(3, j);
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
        }
    }
}
