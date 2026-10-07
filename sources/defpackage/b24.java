package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public final class b24 extends ha6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b24(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ha6
    public final void a(vxe vxeVar, Object obj) {
        int i = this.a;
        String strB = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                uy3 uy3Var = (uy3) obj;
                g24 g24Var = (g24) obj2;
                vxeVar.c(1, uy3Var.a);
                vxeVar.c(2, uy3Var.c);
                vxeVar.c(3, uy3Var.d);
                vxeVar.c(4, uy3Var.e);
                vxeVar.c(5, uy3Var.f);
                vxeVar.c(6, uy3Var.g);
                String str = uy3Var.h;
                if (str == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, str);
                }
                dwa dwaVarA = g24Var.a();
                xfa xfaVar = uy3Var.i;
                dwaVarA.getClass();
                vxeVar.c(8, xfaVar.a);
                dwa dwaVarA2 = g24Var.a();
                wja wjaVar = uy3Var.j;
                dwaVarA2.getClass();
                vxeVar.c(9, wjaVar.a);
                vxeVar.c(10, uy3Var.k ? 1L : 0L);
                vxeVar.c(11, uy3Var.l);
                String str2 = uy3Var.m;
                if (str2 == null) {
                    vxeVar.e(12);
                } else {
                    vxeVar.B(12, str2);
                }
                String str3 = uy3Var.n;
                if (str3 == null) {
                    vxeVar.e(13);
                } else {
                    vxeVar.B(13, str3);
                }
                c46 c46Var = uy3Var.o;
                g24Var.a().getClass();
                byte[] byteArray = c46Var != null ? sia.toByteArray(a.f(c46Var)) : null;
                if (byteArray == null) {
                    vxeVar.e(14);
                } else {
                    vxeVar.d(14, byteArray);
                }
                vxeVar.c(15, uy3Var.p);
                dwa dwaVarA3 = g24Var.a();
                int i2 = uy3Var.q;
                dwaVarA3.getClass();
                vxeVar.c(16, r5a.e(i2));
                vxeVar.c(17, uy3Var.r ? 1L : 0L);
                vxeVar.c(18, uy3Var.s);
                vxeVar.c(19, uy3Var.t);
                vxeVar.c(20, uy3Var.u ? 1L : 0L);
                vxeVar.c(21, uy3Var.v);
                vxeVar.c(22, uy3Var.w);
                vxeVar.c(23, uy3Var.x);
                vxeVar.c(24, uy3Var.y);
                dwa dwaVarA4 = g24Var.a();
                List list = uy3Var.z;
                dwaVarA4.getClass();
                vxeVar.d(25, dga.b(list));
                kja kjaVar = uy3Var.A;
                g24Var.a().getClass();
                byte[] bArrX = pm9.x(kjaVar);
                if (bArrX == null) {
                    vxeVar.e(26);
                } else {
                    vxeVar.d(26, bArrX);
                }
                vxeVar.c(27, uy3Var.B);
                q24 q24Var = uy3Var.b;
                vxeVar.c(28, q24Var.a);
                vxeVar.c(29, q24Var.b);
                break;
            default:
                zhc zhcVar = (zhc) obj;
                vxeVar.c(1, zhcVar.a);
                vxeVar.B(2, zhcVar.b);
                String str4 = zhcVar.c;
                if (str4 == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, str4);
                }
                Long l = zhcVar.d;
                if (l == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.c(4, l.longValue());
                }
                Long l2 = zhcVar.e;
                if (l2 == null) {
                    vxeVar.e(5);
                } else {
                    vxeVar.c(5, l2.longValue());
                }
                vxeVar.c(6, zhcVar.f);
                String str5 = zhcVar.g;
                if (str5 == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, str5);
                }
                List list2 = zhcVar.h;
                shc shcVar = (shc) ((kic) obj2).c.getValue();
                if (list2 == null) {
                    shcVar.getClass();
                } else {
                    qs8 qs8Var = (qs8) shcVar.a.getValue();
                    qs8Var.getClass();
                    strB = qs8Var.b(new fw(rhc.Companion.serializer()), list2);
                }
                if (strB != null) {
                    vxeVar.B(8, strB);
                } else {
                    vxeVar.e(8);
                }
                break;
        }
    }

    @Override // defpackage.ha6
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `comments` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`status_in_process`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`message_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_out_chat_id`,`msg_link_out_post_id`,`msg_link_out_msg_id`,`options`,`elements`,`reactions`,`reactions_update_time`,`parent_chat_server_id`,`parent_message_server_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `organizations` (`id`,`name`,`description`,`parentId`,`folderTemplateId`,`updateTime`,`iconUrl`,`links`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }
}
