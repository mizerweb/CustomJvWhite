package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c24 extends qyj {
    public final /* synthetic */ int e;
    public final /* synthetic */ g24 f;

    public /* synthetic */ c24(g24 g24Var, int i) {
        this.e = i;
        this.f = g24Var;
    }

    @Override // defpackage.qyj
    public final void c(vxe vxeVar, Object obj) {
        int i = this.e;
        byte[] byteArray = null;
        g24 g24Var = this.f;
        switch (i) {
            case 0:
                dz3 dz3Var = (dz3) obj;
                long j = dz3Var.a;
                vxeVar.c(1, j);
                vxeVar.c(2, dz3Var.b);
                vxeVar.c(3, dz3Var.c);
                vxeVar.c(4, dz3Var.e);
                vxeVar.c(5, dz3Var.f);
                vxeVar.c(6, dz3Var.g);
                String str = dz3Var.h;
                if (str == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, str);
                }
                dwa dwaVarA = g24Var.a();
                List list = dz3Var.i;
                dwaVarA.getClass();
                vxeVar.d(8, dga.b(list));
                kja kjaVar = dz3Var.j;
                g24Var.a().getClass();
                byte[] bArrX = pm9.x(kjaVar);
                if (bArrX == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.d(9, bArrX);
                }
                dwa dwaVarA2 = g24Var.a();
                int i2 = dz3Var.k;
                dwaVarA2.getClass();
                vxeVar.c(10, r5a.e(i2));
                vxeVar.c(11, dz3Var.l);
                vxeVar.c(12, dz3Var.m);
                vxeVar.c(13, dz3Var.n ? 1L : 0L);
                dwa dwaVarA3 = g24Var.a();
                wja wjaVar = dz3Var.o;
                dwaVarA3.getClass();
                vxeVar.c(14, wjaVar.a);
                vxeVar.c(15, dz3Var.p);
                q24 q24Var = dz3Var.d;
                vxeVar.c(16, q24Var.a);
                vxeVar.c(17, q24Var.b);
                vxeVar.c(18, j);
                break;
            case 1:
                cei ceiVar = (cei) obj;
                long j2 = ceiVar.a;
                vxeVar.c(1, j2);
                c46 c46Var = ceiVar.b;
                g24Var.a().getClass();
                byteArray = c46Var != null ? sia.toByteArray(a.f(c46Var)) : null;
                if (byteArray == null) {
                    vxeVar.e(2);
                } else {
                    vxeVar.d(2, byteArray);
                }
                vxeVar.c(3, ceiVar.c);
                vxeVar.c(4, j2);
                break;
            default:
                qei qeiVar = (qei) obj;
                long j3 = qeiVar.a;
                vxeVar.c(1, j3);
                String str2 = qeiVar.b;
                if (str2 == null) {
                    vxeVar.e(2);
                } else {
                    vxeVar.B(2, str2);
                }
                List list2 = qeiVar.c;
                if (list2 != null) {
                    g24Var.a().getClass();
                    byteArray = dga.b(list2);
                }
                if (byteArray == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.d(3, byteArray);
                }
                dwa dwaVarA4 = g24Var.a();
                wja wjaVar2 = qeiVar.d;
                dwaVarA4.getClass();
                vxeVar.c(4, wjaVar2.a);
                vxeVar.c(5, qeiVar.e);
                vxeVar.c(6, j3);
                break;
        }
    }

    @Override // defpackage.qyj
    public final String s() {
        switch (this.e) {
            case 0:
                return "UPDATE OR ABORT `comments` SET `id` = ?,`server_id` = ?,`time` = ?,`update_time` = ?,`sender` = ?,`cid` = ?,`text` = ?,`elements` = ?,`reactions` = ?,`message_type` = ?,`msg_link_type` = ?,`msg_link_id` = ?,`inserted_from_msg_link` = ?,`status` = ?,`options` = ?,`parent_chat_server_id` = ?,`parent_message_server_id` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `comments` SET `id` = ?,`attaches` = ?,`media_type` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `comments` SET `id` = ?,`text` = ?,`elements` = ?,`status` = ?,`update_time` = ? WHERE `id` = ?";
        }
    }
}
