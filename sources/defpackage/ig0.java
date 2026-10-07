package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ig0 extends ha6 {
    public final /* synthetic */ int a;

    public ig0(sxa sxaVar) {
        this.a = 7;
    }

    @Override // defpackage.ha6
    public final void a(vxe vxeVar, Object obj) throws JSONException {
        switch (this.a) {
            case 0:
                fg0 fg0Var = (fg0) obj;
                vxeVar.c(1, fg0Var.a);
                vxeVar.c(2, fg0Var.b);
                break;
            case 1:
                kb1 kb1Var = (kb1) obj;
                vxeVar.B(1, kb1Var.a);
                vxeVar.c(2, kb1Var.b);
                vxeVar.c(3, kb1Var.c);
                vxeVar.c(4, kb1Var.d);
                Long l = kb1Var.e;
                if (l == null) {
                    vxeVar.e(5);
                } else {
                    vxeVar.c(5, l.longValue());
                }
                String str = kb1Var.f;
                if (str == null) {
                    vxeVar.e(6);
                } else {
                    vxeVar.B(6, str);
                }
                Long l2 = kb1Var.g;
                if (l2 == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.c(7, l2.longValue());
                }
                Long l3 = kb1Var.h;
                if (l3 == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.c(8, l3.longValue());
                }
                Long l4 = kb1Var.i;
                if (l4 == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.c(9, l4.longValue());
                }
                String str2 = kb1Var.j;
                if (str2 == null) {
                    vxeVar.e(10);
                } else {
                    vxeVar.B(10, str2);
                }
                vxeVar.c(11, kb1Var.k);
                break;
            case 2:
                m54 m54Var = (m54) obj;
                vxeVar.c(1, m54Var.a);
                vxeVar.c(2, m54Var.b);
                List<h54> list = m54Var.c;
                JSONArray jSONArray = new JSONArray();
                for (h54 h54Var : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (int) h54Var.a);
                    jSONObject.put("title", h54Var.b);
                    jSONArray.put(jSONObject);
                }
                vxeVar.B(3, jSONArray.toString());
                break;
            case 3:
                hn6 hn6Var = (hn6) obj;
                vxeVar.c(1, hn6Var.i());
                vxeVar.c(2, hn6Var.h());
                int iB = hn6Var.b();
                vxeVar.c(3, iB != 0 ? qt4.D(iB) : 0);
                Long l5 = hn6Var.l();
                if (l5 == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.c(4, l5.longValue());
                }
                vxeVar.c(5, hn6Var.d());
                Long lM = hn6Var.m();
                if (lM == null) {
                    vxeVar.e(6);
                } else {
                    vxeVar.c(6, lM.longValue());
                }
                String strF = hn6Var.f();
                if (strF == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, strF);
                }
                vxeVar.c(8, hn6Var.g());
                vxeVar.c(9, hn6Var.k());
                vxeVar.B(10, hn6Var.j());
                vxeVar.c(11, hn6Var.n());
                vxeVar.c(12, hn6Var.e());
                ilb ilbVarC = hn6Var.c();
                vxeVar.c(13, ilbVarC.a);
                vxeVar.c(14, ilbVarC.b);
                break;
            case 4:
                ao6 ao6Var = (ao6) obj;
                vxeVar.c(1, ao6Var.b());
                ilb ilbVarA = ao6Var.a();
                vxeVar.c(2, ilbVarA.a);
                vxeVar.c(3, ilbVarA.b);
                break;
            case 5:
                zs9 zs9Var = (zs9) obj;
                vxeVar.c(1, zs9Var.a);
                vxeVar.c(2, zs9Var.b);
                vxeVar.c(3, zs9Var.c);
                vxeVar.c(4, zs9Var.d);
                vxeVar.c(5, zs9Var.e);
                vxeVar.c(6, zs9Var.f);
                break;
            case 6:
                zea zeaVar = (zea) obj;
                vxeVar.c(1, zeaVar.a);
                vxeVar.c(2, zeaVar.b);
                vxeVar.c(3, zeaVar.c);
                break;
            case 7:
                txa txaVar = (txa) obj;
                vxeVar.B(1, txaVar.a);
                vxeVar.B(2, txaVar.b);
                vxeVar.c(3, txaVar.c);
                vxeVar.d(4, sia.toByteArray(txaVar.d));
                vxeVar.c(5, txaVar.e);
                vxeVar.c(6, txaVar.f ? 1L : 0L);
                break;
            case 8:
                xn6 xn6Var = (xn6) obj;
                vxeVar.c(1, xn6Var.h());
                vxeVar.B(2, xn6Var.e().a);
                String strC = xn6Var.c();
                if (strC == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, strC);
                }
                String strK = xn6Var.k();
                if (strK == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, strK);
                }
                vxeVar.c(5, xn6Var.j());
                vxeVar.c(6, xn6Var.n());
                vxeVar.B(7, xn6Var.m());
                vxeVar.c(8, xn6Var.i());
                String strD = xn6Var.d();
                if (strD == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.B(9, strD);
                }
                String strG = xn6Var.g();
                if (strG == null) {
                    vxeVar.e(10);
                } else {
                    vxeVar.B(10, strG);
                }
                vxeVar.c(11, xn6Var.q() ? 1L : 0L);
                vxeVar.c(12, xn6Var.f() ? 1L : 0L);
                String strO = xn6Var.o();
                if (strO == null) {
                    vxeVar.e(13);
                } else {
                    vxeVar.B(13, strO);
                }
                String strA = xn6Var.a();
                if (strA == null) {
                    vxeVar.e(14);
                } else {
                    vxeVar.B(14, strA);
                }
                vxeVar.c(15, lml.a(xn6Var.l()));
                ilb ilbVarB = xn6Var.b();
                vxeVar.c(16, ilbVarB.a);
                vxeVar.c(17, ilbVarB.b);
                break;
            case 9:
                xmb xmbVar = (xmb) obj;
                vxeVar.c(1, xmbVar.b());
                ilb ilbVarA2 = xmbVar.a();
                vxeVar.c(2, ilbVarA2.a);
                vxeVar.c(3, ilbVarA2.b);
                break;
            case 10:
                bae baeVar = (bae) obj;
                vxeVar.c(1, baeVar.a);
                vxeVar.c(2, baeVar.b.a);
                vxeVar.c(3, baeVar.c);
                vxeVar.c(4, baeVar.d);
                s8 s8Var = baeVar.e;
                if (s8Var != null) {
                    vxeVar.c(5, s8Var.a);
                } else {
                    vxeVar.e(5);
                }
                ye6 ye6Var = baeVar.f;
                if (ye6Var != null) {
                    vxeVar.B(6, ye6Var.a);
                } else {
                    vxeVar.e(6);
                }
                gj2 gj2Var = baeVar.g;
                if (gj2Var != null) {
                    vxeVar.d(7, (byte[]) gj2Var.c);
                    vxeVar.c(8, gj2Var.b);
                } else {
                    vxeVar.e(7);
                    vxeVar.e(8);
                }
                break;
            case 11:
                yui yuiVar = (yui) obj;
                vxeVar.c(1, yuiVar.b ? 1L : 0L);
                String str3 = yuiVar.c;
                if (str3 == null) {
                    vxeVar.e(2);
                } else {
                    vxeVar.B(2, str3);
                }
                String str4 = yuiVar.d;
                if (str4 == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, str4);
                }
                String str5 = yuiVar.e;
                if (str5 == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, str5);
                }
                a70 a70Var = yuiVar.a;
                vxeVar.B(5, (String) a70Var.d);
                vxeVar.c(6, a70Var.a.b);
                vxeVar.a(7, a70Var.b);
                vxeVar.a(8, a70Var.c);
                vxeVar.c(9, a70Var.e ? 1L : 0L);
                break;
            case 12:
                g0j g0jVar = (g0j) obj;
                vxeVar.B(1, g0jVar.a);
                vxeVar.B(2, g0jVar.b);
                String str6 = g0jVar.c;
                if (str6 == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, str6);
                }
                break;
            default:
                sej sejVar = (sej) obj;
                vxeVar.c(1, sejVar.a);
                vxeVar.c(2, sejVar.b);
                vxeVar.c(3, sejVar.c);
                String str7 = sejVar.d;
                if (str7 == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, str7);
                }
                vxeVar.c(5, sejVar.e ? 1L : 0L);
                vxeVar.c(6, sejVar.f ? 1L : 0L);
                break;
        }
    }

    @Override // defpackage.ha6
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR IGNORE INTO `gallery_saved_index` (`attach_id`,`type`) VALUES (?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `call_notifications_analytics` (`call_id`,`chat_id`,`push_source`,`received_time`,`push_id`,`event_key`,`suid`,`sent_time`,`fcm_sent_time`,`drop_reason`,`created_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `complain_reasons` (`id`,`type_id`,`complain_reasons`) VALUES (nullif(?, 0),?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `fcm_notifications_analytics` (`push_id`,`msg_id`,`analytics_status`,`suid`,`content_length`,`sent_time`,`event_key`,`fcm_sent_time`,`received_time`,`push_type`,`time`,`created_time`,`chat_id`,`post_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `fcm_notifications_history` (`last_notify_msg_id`,`chat_id`,`post_id`) VALUES (?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `media_cache` (`id`,`chat_id`,`message_id`,`attach_id`,`type`,`size`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `message_comments` (`message_id`,`counter`,`updated_at`) VALUES (?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `metrics` (`traceId`,`metricName`,`lastUpdatedTime`,`spanAndPropertiesDump`,`attempt`,`isMarkedAsFailed`) VALUES (?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `fcm_notifications` (`message_id`,`type`,`chat_title`,`sender_user_name`,`sender_user_id`,`time`,`text`,`push_id`,`event_key`,`large_image_url`,`fire_m`,`has_any_error`,`url`,`bmd`,`source`,`chat_id`,`post_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `notifications_read_marks` (`mark`,`chat_id`,`post_id`) VALUES (?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `recent` (`id`,`recent_type`,`recent_time`,`server_id`,`sticker_id`,`emoji`,`gif`,`gif_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `video_conversions` (`finished`,`prepared_mime_type`,`prepared_path`,`result_path`,`source_uri`,`quality`,`start_trim_position`,`end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `video_message_preparations` (`attach_local_id`,`result_path`,`unrecoverable_exception`) VALUES (?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `webapp_biometry` (`id`,`user_id`,`bot_id`,`token`,`access_requested`,`access_granted`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public /* synthetic */ ig0(int i) {
        this.a = i;
    }
}
