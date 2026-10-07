package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class soa extends qyj {
    public final /* synthetic */ int e;
    public final /* synthetic */ toa f;

    public /* synthetic */ soa(toa toaVar, int i) {
        this.e = i;
        this.f = toaVar;
    }

    @Override // defpackage.qyj
    public final void c(vxe vxeVar, Object obj) {
        int i = this.e;
        toa toaVar = this.f;
        switch (i) {
            case 0:
                zia ziaVar = (zia) obj;
                vxeVar.c(1, ziaVar.e());
                vxeVar.c(2, ziaVar.s());
                vxeVar.c(3, ziaVar.v());
                vxeVar.c(4, ziaVar.b());
                vxeVar.c(5, ziaVar.y());
                vxeVar.c(6, ziaVar.r());
                vxeVar.c(7, ziaVar.c());
                String strU = ziaVar.u();
                if (strU == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.B(8, strU);
                }
                dwa dwaVarE = toaVar.e();
                List listD = ziaVar.d();
                dwaVarE.getClass();
                vxeVar.d(9, dga.b(listD));
                kja kjaVarQ = ziaVar.q();
                toaVar.e().getClass();
                byte[] bArrX = pm9.x(kjaVarQ);
                if (bArrX == null) {
                    vxeVar.e(10);
                } else {
                    vxeVar.d(10, bArrX);
                }
                vxeVar.c(11, ziaVar.n());
                vxeVar.c(12, ziaVar.m());
                vxeVar.c(13, ziaVar.f() ? 1L : 0L);
                vxeVar.c(14, ziaVar.l());
                String strK = ziaVar.k();
                if (strK == null) {
                    vxeVar.e(15);
                } else {
                    vxeVar.B(15, strK);
                }
                String strJ = ziaVar.j();
                if (strJ == null) {
                    vxeVar.e(16);
                } else {
                    vxeVar.B(16, strJ);
                }
                String strI = ziaVar.i();
                if (strI == null) {
                    vxeVar.e(17);
                } else {
                    vxeVar.B(17, strI);
                }
                int iH = ziaVar.h();
                toaVar.d().getClass();
                Integer numB = vo3.b(iH);
                if (numB == null) {
                    vxeVar.e(18);
                } else {
                    vxeVar.c(18, numB.intValue());
                }
                dwa dwaVarE2 = toaVar.e();
                wja wjaVarT = ziaVar.t();
                dwaVarE2.getClass();
                vxeVar.c(19, wjaVarT.a);
                dwa dwaVarE3 = toaVar.e();
                int iX = ziaVar.x();
                dwaVarE3.getClass();
                vxeVar.c(20, r5a.e(iX));
                vxeVar.c(21, ziaVar.z());
                vxeVar.c(22, ziaVar.p());
                vxeVar.c(23, ziaVar.g());
                Long lW = ziaVar.w();
                if (lW == null) {
                    vxeVar.e(24);
                } else {
                    vxeVar.c(24, lW.longValue());
                }
                Boolean boolO = ziaVar.o();
                Integer numValueOf = boolO != null ? Integer.valueOf(boolO.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    vxeVar.e(25);
                } else {
                    vxeVar.c(25, numValueOf.intValue());
                }
                vxeVar.c(26, ziaVar.e());
                break;
            case 1:
                gga ggaVar = (gga) obj;
                long j = ggaVar.a;
                vxeVar.c(1, j);
                vxeVar.c(2, ggaVar.b);
                vxeVar.c(3, ggaVar.c);
                vxeVar.c(4, ggaVar.d);
                vxeVar.c(5, ggaVar.e);
                vxeVar.c(6, ggaVar.f);
                String str = ggaVar.g;
                if (str == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, str);
                }
                dwa dwaVarE4 = toaVar.e();
                xfa xfaVar = ggaVar.h;
                dwaVarE4.getClass();
                vxeVar.c(8, xfaVar.a);
                dwa dwaVarE5 = toaVar.e();
                wja wjaVar = ggaVar.i;
                dwaVarE5.getClass();
                vxeVar.c(9, wjaVar.a);
                vxeVar.c(10, ggaVar.j ? 1L : 0L);
                vxeVar.c(11, ggaVar.k);
                String str2 = ggaVar.l;
                if (str2 == null) {
                    vxeVar.e(12);
                } else {
                    vxeVar.B(12, str2);
                }
                String str3 = ggaVar.m;
                if (str3 == null) {
                    vxeVar.e(13);
                } else {
                    vxeVar.B(13, str3);
                }
                c46 c46Var = ggaVar.n;
                toaVar.e().getClass();
                byte[] byteArray = c46Var != null ? sia.toByteArray(a.f(c46Var)) : null;
                if (byteArray == null) {
                    vxeVar.e(14);
                } else {
                    vxeVar.d(14, byteArray);
                }
                vxeVar.c(15, ggaVar.o);
                vxeVar.c(16, ggaVar.p ? 1L : 0L);
                vxeVar.c(17, ggaVar.q);
                vxeVar.c(18, ggaVar.r);
                vxeVar.c(19, ggaVar.s ? 1L : 0L);
                vxeVar.c(20, ggaVar.t);
                String str4 = ggaVar.u;
                if (str4 == null) {
                    vxeVar.e(21);
                } else {
                    vxeVar.B(21, str4);
                }
                String str5 = ggaVar.v;
                if (str5 == null) {
                    vxeVar.e(22);
                } else {
                    vxeVar.B(22, str5);
                }
                String str6 = ggaVar.w;
                if (str6 == null) {
                    vxeVar.e(23);
                } else {
                    vxeVar.B(23, str6);
                }
                int i2 = ggaVar.K;
                toaVar.d().getClass();
                Integer numB2 = vo3.b(i2);
                if (numB2 == null) {
                    vxeVar.e(24);
                } else {
                    vxeVar.c(24, numB2.intValue());
                }
                vxeVar.c(25, ggaVar.x);
                vxeVar.c(26, ggaVar.y);
                dwa dwaVarE6 = toaVar.e();
                int i3 = ggaVar.L;
                dwaVarE6.getClass();
                vxeVar.c(27, r5a.e(i3));
                vxeVar.c(28, ggaVar.z);
                vxeVar.c(29, ggaVar.A);
                vxeVar.c(30, ggaVar.B);
                vxeVar.c(31, ggaVar.C);
                vxeVar.c(32, ggaVar.D);
                vxeVar.c(33, ggaVar.E);
                dwa dwaVarE7 = toaVar.e();
                List list = ggaVar.F;
                dwaVarE7.getClass();
                vxeVar.d(34, dga.b(list));
                kja kjaVar = ggaVar.G;
                toaVar.e().getClass();
                byte[] bArrX2 = pm9.x(kjaVar);
                if (bArrX2 == null) {
                    vxeVar.e(35);
                } else {
                    vxeVar.d(35, bArrX2);
                }
                Long l = ggaVar.H;
                if (l == null) {
                    vxeVar.e(36);
                } else {
                    vxeVar.c(36, l.longValue());
                }
                Boolean bool = ggaVar.I;
                Integer numValueOf2 = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    vxeVar.e(37);
                } else {
                    vxeVar.c(37, numValueOf2.intValue());
                }
                vxeVar.c(38, ggaVar.J);
                vxeVar.c(39, j);
                break;
            case 2:
                jfi jfiVar = (jfi) obj;
                vxeVar.c(1, jfiVar.c());
                vxeVar.c(2, jfiVar.i());
                vxeVar.c(3, jfiVar.a());
                vxeVar.c(4, jfiVar.k());
                vxeVar.c(5, jfiVar.l());
                vxeVar.c(6, jfiVar.n());
                vxeVar.c(7, jfiVar.h());
                vxeVar.c(8, jfiVar.d());
                dwa dwaVarE8 = toaVar.e();
                xfa xfaVarB = jfiVar.b();
                dwaVarE8.getClass();
                vxeVar.c(9, xfaVarB.a);
                dwa dwaVarE9 = toaVar.e();
                wja wjaVarJ = jfiVar.j();
                dwaVarE9.getClass();
                vxeVar.c(10, wjaVarJ.a);
                Long lM = jfiVar.m();
                if (lM == null) {
                    vxeVar.e(11);
                } else {
                    vxeVar.c(11, lM.longValue());
                }
                Boolean boolG = jfiVar.g();
                Integer numValueOf3 = boolG != null ? Integer.valueOf(boolG.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    vxeVar.e(12);
                } else {
                    vxeVar.c(12, numValueOf3.intValue());
                }
                vxeVar.c(13, jfiVar.e());
                vxeVar.c(14, jfiVar.f());
                vxeVar.c(15, jfiVar.c());
                break;
            case 3:
                cei ceiVar = (cei) obj;
                vxeVar.c(1, ceiVar.b());
                c46 c46VarA = ceiVar.a();
                toaVar.e().getClass();
                byte[] byteArray2 = c46VarA != null ? sia.toByteArray(a.f(c46VarA)) : null;
                if (byteArray2 == null) {
                    vxeVar.e(2);
                } else {
                    vxeVar.d(2, byteArray2);
                }
                vxeVar.c(3, ceiVar.c());
                vxeVar.c(4, ceiVar.b());
                break;
            default:
                rfi rfiVar = (rfi) obj;
                vxeVar.c(1, rfiVar.b());
                String strD = rfiVar.d();
                if (strD == null) {
                    vxeVar.e(2);
                } else {
                    vxeVar.B(2, strD);
                }
                dwa dwaVarE10 = toaVar.e();
                List listA = rfiVar.a();
                dwaVarE10.getClass();
                vxeVar.d(3, dga.b(listA));
                dwa dwaVarE11 = toaVar.e();
                wja wjaVarC = rfiVar.c();
                dwaVarE11.getClass();
                vxeVar.c(4, wjaVarC.a);
                vxeVar.c(5, rfiVar.b());
                break;
        }
    }

    @Override // defpackage.qyj
    public final String s() {
        switch (this.e) {
            case 0:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`time` = ?,`chat_id` = ?,`update_time` = ?,`sender` = ?,`cid` = ?,`text` = ?,`elements` = ?,`reactions` = ?,`msg_link_type` = ?,`msg_link_id` = ?,`inserted_from_msg_link` = ?,`msg_link_chat_id` = ?,`msg_link_chat_name` = ?,`msg_link_chat_link` = ?,`msg_link_chat_icon_url` = ?,`msg_link_chat_access_type` = ?,`status` = ?,`type` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`time` = ?,`update_time` = ?,`sender` = ?,`cid` = ?,`text` = ?,`delivery_status` = ?,`status` = ?,`status_in_process` = ?,`time_local` = ?,`error` = ?,`localized_error` = ?,`attaches` = ?,`media_type` = ?,`detect_share` = ?,`msg_link_type` = ?,`msg_link_id` = ?,`inserted_from_msg_link` = ?,`msg_link_chat_id` = ?,`msg_link_chat_name` = ?,`msg_link_chat_link` = ?,`msg_link_chat_icon_url` = ?,`msg_link_chat_access_type` = ?,`msg_link_out_chat_id` = ?,`msg_link_out_msg_id` = ?,`type` = ?,`chat_id` = ?,`channel_views` = ?,`channel_forwards` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`elements` = ?,`reactions` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ?,`reactions_update_time` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`cid` = ?,`time` = ?,`time_local` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`delivery_status` = ?,`status` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ?,`msg_link_out_chat_id` = ?,`msg_link_out_msg_id` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`attaches` = ?,`media_type` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`text` = ?,`elements` = ?,`status` = ? WHERE `id` = ?";
        }
    }
}
