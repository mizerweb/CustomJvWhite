package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class onb extends qyj {
    public final /* synthetic */ int e;

    public /* synthetic */ onb(int i) {
        this.e = i;
    }

    @Override // defpackage.qyj
    public final void c(vxe vxeVar, Object obj) {
        switch (this.e) {
            case 0:
                qt4.A(obj);
                throw null;
            case 1:
                vxeVar.c(1, ((bae) obj).a);
                return;
            default:
                sej sejVar = (sej) obj;
                long j = sejVar.a;
                vxeVar.c(1, j);
                vxeVar.c(2, sejVar.b);
                vxeVar.c(3, sejVar.c);
                String str = sejVar.d;
                if (str == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, str);
                }
                vxeVar.c(5, sejVar.e ? 1L : 0L);
                vxeVar.c(6, sejVar.f ? 1L : 0L);
                vxeVar.c(7, j);
                return;
        }
    }

    @Override // defpackage.qyj
    public final String s() {
        switch (this.e) {
            case 0:
                return "DELETE FROM `fcm_notifications` WHERE `chat_id` = ? AND `post_id` = ? AND `message_id` = ?";
            case 1:
                return "DELETE FROM `recent` WHERE `id` = ?";
            default:
                return "UPDATE OR REPLACE `webapp_biometry` SET `id` = ?,`user_id` = ?,`bot_id` = ?,`token` = ?,`access_requested` = ?,`access_granted` = ? WHERE `id` = ?";
        }
    }
}
