package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mka implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ mka(long j, long j2, String str) {
        this.c = j;
        this.d = j2;
        this.b = str;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        long j = this.d;
        long j2 = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM message_uploads WHERE message_id=? AND chat_id=? AND attach_id=?");
                try {
                    vxeVarO0.c(1, j2);
                    vxeVarO0.c(2, j);
                    vxeVarO0.B(3, str);
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            default:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO1 = qxeVar.O0("UPDATE webapp_biometry SET token = ? WHERE user_id = ? AND bot_id = ?");
                try {
                    if (str == null) {
                        vxeVarO1.e(1);
                    } else {
                        vxeVarO1.B(1, str);
                    }
                    vxeVarO1.c(2, j2);
                    vxeVarO1.c(3, j);
                    vxeVarO1.M0();
                    int iE0 = e9i.e0(qxeVar);
                    vxeVarO1.close();
                    return Integer.valueOf(iE0);
                } catch (Throwable th) {
                    vxeVarO1.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ mka(String str, long j, long j2) {
        this.b = str;
        this.c = j;
        this.d = j2;
    }
}
