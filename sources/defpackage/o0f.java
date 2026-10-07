package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0f implements cf7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;

    public /* synthetic */ o0f(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        long j = this.a;
        long j2 = this.b;
        vxe vxeVarO0 = ((qxe) obj).O0("INSERT OR REPLACE INTO saved_msg_chat(user_id, chat_id) VALUES(?, ?)");
        try {
            vxeVarO0.c(1, j);
            vxeVarO0.c(2, j2);
            vxeVarO0.M0();
            return sbi.a;
        } finally {
            vxeVarO0.close();
        }
    }
}
