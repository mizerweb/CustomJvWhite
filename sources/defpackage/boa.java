package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class boa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ toa e;
    public final /* synthetic */ wja f;

    public /* synthetic */ boa(int i, long j, long j2, long j3, wja wjaVar, toa toaVar) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = toaVar;
        this.f = wjaVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        long j;
        int i = this.a;
        wja wjaVar = this.f;
        toa toaVar = this.e;
        long j2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time > ? AND sender != ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL");
                try {
                    vxeVarO0.c(1, j4);
                    vxeVarO0.c(2, j3);
                    vxeVarO0.c(3, j2);
                    toaVar.e().getClass();
                    vxeVarO0.c(4, wjaVar.a);
                    j = vxeVarO0.M0() ? vxeVarO0.getLong(0) : 0L;
                } finally {
                    vxeVarO0.close();
                }
                break;
            default:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = ? AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL");
                try {
                    vxeVarO1.c(1, j4);
                    vxeVarO1.c(2, j3);
                    vxeVarO1.c(3, j2);
                    vxeVarO1.c(4, 0L);
                    toaVar.e().getClass();
                    vxeVarO1.c(5, wjaVar.a);
                    j = vxeVarO1.M0() ? vxeVarO1.getLong(0) : 0L;
                } finally {
                    vxeVarO1.close();
                }
                break;
        }
        return Long.valueOf(j);
    }
}
