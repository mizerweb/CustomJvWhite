package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class woh {
    public static final String[] b;
    public static final r51 c;
    public static final r51 d;
    public final ny8 a;

    static {
        Pattern.compile("#u([0-9a-f]{2,16})(#\\d+:\\d+)?s#");
        b = new String[]{"B", "kB", "MB", "GB", "TB"};
        c = new r51(4);
        d = new r51(5);
    }

    public woh(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public static CharSequence a(String str, vg4 vg4Var, p4c p4cVar, boolean z) {
        String strK = vg4Var.k();
        int iIndexOf = str.indexOf(strK);
        if (iIndexOf < 0) {
            return str;
        }
        int length = strK.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!z) {
            if (p4cVar.g == -1) {
                pq3.j.e(p4cVar.a).m();
                p4cVar.g = -1;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(p4cVar.g), iIndexOf, length, 33);
            spannableStringBuilder.setSpan(new zh4(vg4Var.v()), iIndexOf, length, 33);
        }
        boolean zG = vg4Var.G();
        p4cVar.getClass();
        if (zG) {
            spannableStringBuilder.insert(length, (CharSequence) "\u2060 ");
            spannableStringBuilder.setSpan(qsi.a(p4cVar.a, z), length + 1, length + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder b(String str, h60 h60Var, vg4 vg4Var, p4c p4cVar, bi4 bi4Var, boolean z) {
        int iIndexOf;
        pw pwVar = new pw(0);
        pwVar.add(Long.valueOf(vg4Var.v()));
        pwVar.addAll(h60Var.c);
        pwVar.add(Long.valueOf(h60Var.b));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (p4cVar.g == -1) {
            pq3.j.e(p4cVar.a).m();
            p4cVar.g = -1;
        }
        int i = p4cVar.g;
        hw hwVar = new hw(pwVar);
        while (hwVar.hasNext()) {
            Long l = (Long) hwVar.next();
            vg4 vg4VarF = bi4Var.f(l.longValue(), true);
            String strK = vg4VarF.k();
            if (!ch3.r(strK) && (iIndexOf = spannableStringBuilder.toString().indexOf(strK)) >= 0) {
                int length = strK.length() + iIndexOf;
                if (!z) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), iIndexOf, length, 33);
                    spannableStringBuilder.setSpan(new zh4(l.longValue()), iIndexOf, length, 33);
                }
                if (vg4VarF.G()) {
                    spannableStringBuilder.insert(length, (CharSequence) "\u2060 ");
                    spannableStringBuilder.setSpan(qsi.a(p4cVar.a, z), length + 1, length + 2, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static String c(Context context, Integer num, boolean z, rah rahVar) {
        if (num == null) {
            return "";
        }
        String strO = z ? c0a.o(" ", context.getString(R.string.attach_description_union), " ") : "";
        if (num.intValue() > 1) {
            strO = strO + num + " ";
        }
        StringBuilder sbC = nbh.C(strO);
        sbC.append((String) rahVar.get());
        return sbC.toString();
    }

    public static String d(String str, String str2) {
        return zo5.p(str, " ", str2);
    }

    public static String e(String str) {
        if (ch3.r(str)) {
            return str;
        }
        if (str.length() == 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String g(Context context, boolean z, boolean z2) {
        String string = z2 ? context.getString(R.string.tt_audio) : "";
        return z ? d("🎤", string) : z5h.D0(string);
    }

    public static String h(Context context, sfa sfaVar, boolean z, boolean z2, long j) {
        String string;
        e60 e60VarO = sfaVar.o();
        if (e60VarO == null) {
            return "";
        }
        boolean z3 = sfaVar.e != j;
        boolean z4 = z3 && (e60VarO.i() || e60VarO.g() || e60VarO.j());
        boolean z5 = !z3 && (e60VarO.j() || e60VarO.g());
        boolean z6 = e60VarO.a() == 2;
        if (z5 && z6) {
            string = z2 ? context.getString(R.string.tt_call_outgoing_canceled_video_cap) : context.getString(R.string.tt_call_outgoing_canceled_video);
        } else if (z5) {
            string = z2 ? context.getString(R.string.tt_call_outgoing_canceled_audio_cap) : context.getString(R.string.tt_call_outgoing_canceled_audio);
        } else if (z4 && z6) {
            string = z2 ? context.getString(R.string.tt_call_missed_video_cap) : context.getString(R.string.tt_call_missed_video);
        } else if (z4) {
            string = z2 ? context.getString(R.string.tt_call_missed_audio_cap) : context.getString(R.string.tt_call_missed_audio);
        } else if (z3 && z6) {
            StringBuilder sbC = nbh.C(z2 ? context.getString(R.string.tt_call_incoming_video_cap) : context.getString(R.string.tt_call_incoming_video));
            sbC.append(i(context, e60VarO));
            string = sbC.toString();
        } else if (z3) {
            StringBuilder sbC2 = nbh.C(z2 ? context.getString(R.string.tt_call_incoming_audio_cap) : context.getString(R.string.tt_call_incoming_audio));
            sbC2.append(i(context, e60VarO));
            string = sbC2.toString();
        } else if (z6) {
            StringBuilder sbC3 = nbh.C(z2 ? context.getString(R.string.tt_call_outgoing_video_cap) : context.getString(R.string.tt_call_outgoing_video));
            sbC3.append(i(context, e60VarO));
            string = sbC3.toString();
        } else {
            StringBuilder sbC4 = nbh.C(z2 ? context.getString(R.string.tt_call_outgoing_audio_cap) : context.getString(R.string.tt_call_outgoing_audio));
            sbC4.append(i(context, e60VarO));
            string = sbC4.toString();
        }
        return z ? d("📞", string) : string;
    }

    public static String i(Context context, e60 e60Var) {
        long jD = e60Var.d();
        int i = jD < 60000 ? R.string.tt_call_time_unit_sec : R.string.tt_call_time_unit_min;
        if (jD == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(" · ");
        sb.append(Long.toString(jD / (jD < 60000 ? 1000L : 60000L)));
        sb.append(" ");
        sb.append(context.getString(i));
        return sb.toString();
    }

    public static String j(Context context, f60 f60Var, ih4 ih4Var, boolean z, boolean z2) {
        String string;
        try {
            string = ih4Var.d(f60Var);
        } catch (Exception unused) {
            string = null;
        }
        if (ch3.r(string)) {
            string = context.getString(R.string.tt_contact);
        } else if (!z2) {
            string = context.getString(R.string.tt_contact_with_name, string);
        }
        return z ? d("👤", string) : z5h.D0(string);
    }

    public static CharSequence k(Context context, p4c p4cVar, bi4 bi4Var, boolean z, sfa sfaVar, vg4 vg4Var, boolean z2, boolean z3, long j) {
        vg4 vg4Var2;
        String strN;
        bi4 bi4Var2;
        String str;
        String str2;
        String str3;
        CharSequence charSequenceA;
        String str4;
        vg4 vg4Var3;
        String strN2;
        vg4 vg4Var4;
        String strN3;
        String strO;
        String str5 = "";
        if (!z) {
            h60 h60VarQ = sfaVar.q();
            boolean z4 = vg4Var.f;
            long j2 = h60VarQ.b;
            int i = h60VarQ.a;
            ArrayList arrayList = h60VarQ.c;
            boolean z5 = j2 == j || arrayList.contains(Long.valueOf(j));
            String strK = vg4Var.k();
            charSequenceA = str5;
            switch (qt4.D(i)) {
                case 1:
                    if (z4 || !z3) {
                        vg4Var2 = vg4Var;
                        strN = n(context, vg4Var2, z4, R.string.tt_control_create_chat_you, R.string.tt_control_create_chat_m, R.string.tt_control_create_chat_f, R.string.tt_control_create_chat);
                        if (!z4) {
                            strN = String.format(strN, strK);
                        }
                    } else {
                        strN = String.format(l(context, vg4Var, true, false, true, h60VarQ), vg4Var.k());
                        vg4Var2 = vg4Var;
                    }
                    String str6 = strN;
                    charSequenceA = str6;
                    if (z2) {
                        charSequenceA = a(str6, vg4Var2, p4cVar, false);
                    }
                    break;
                case 2:
                case 3:
                    ArrayList arrayList2 = new ArrayList();
                    if (!arrayList.isEmpty()) {
                        arrayList2.addAll(arrayList);
                    }
                    long j3 = h60VarQ.b;
                    if (j3 > 0) {
                        arrayList2.add(Long.valueOf(j3));
                    }
                    arrayList2.remove(Long.valueOf(vg4Var.v()));
                    int iD = qt4.D(i);
                    if (iD != 2 && iD != 3) {
                        str4 = str5;
                        str3 = str4;
                        bi4Var2 = bi4Var;
                    } else if (z5 && (arrayList2.size() == 1 || z3)) {
                        str4 = String.format(l(context, vg4Var, true, z4, true, h60VarQ), vg4Var.k());
                        str4 = str5;
                        str3 = str4;
                        bi4Var2 = bi4Var;
                    } else {
                        String strL = l(context, vg4Var, false, z4, false, h60VarQ);
                        String str7 = str5;
                        if (z5) {
                            String str8 = "" + context.getString(R.string.tt_control_you) + ", ";
                            arrayList2.remove(Long.valueOf(j));
                            str7 = str8;
                        }
                        StringBuilder sbC = nbh.C(str7);
                        bi4Var2 = bi4Var;
                        sbC.append(vol.b(arrayList2, new vuf(12, bi4Var2)));
                        String string = sbC.toString();
                        if (z4) {
                            str2 = String.format(strL, string);
                        } else {
                            str = String.format(strL, vg4Var.k(), string);
                        }
                    }
                    if (!z2) {
                        str3 = str;
                        str3 = str2;
                        charSequenceA = str3;
                    } else {
                        str3 = str;
                        str3 = str2;
                        charSequenceA = b(str3, h60VarQ, vg4Var, p4cVar, bi4Var2, false);
                    }
                    break;
                case 4:
                    String strN4 = n(context, vg4Var, z4, R.string.tt_control_leave_chat_you, R.string.tt_control_leave_chat_m, R.string.tt_control_leave_chat_f, R.string.tt_control_leave_chat);
                    if (!z4) {
                        strN4 = String.format(strN4, strK);
                    }
                    String str9 = strN4;
                    charSequenceA = str9;
                    if (z2) {
                        charSequenceA = a(str9, vg4Var, p4cVar, false);
                    }
                    break;
                case 5:
                    String str10 = h60VarQ.d;
                    String strO2 = str5;
                    if (!ch3.r(str10)) {
                        strO2 = c0a.o("«", str10, "»");
                    }
                    String str11 = strO2;
                    if (TextUtils.isEmpty(str11)) {
                        vg4Var3 = vg4Var;
                        strN2 = n(context, vg4Var3, z4, R.string.tt_control_remove_title_you, R.string.tt_control_remove_title_m, R.string.tt_control_remove_title_f, R.string.tt_control_remove_title);
                        if (!z4) {
                            strN2 = String.format(strN2, strK);
                        }
                    } else {
                        String strN5 = n(context, vg4Var, z4, R.string.tt_control_change_title_you, R.string.tt_control_change_title_m, R.string.tt_control_change_title_f, R.string.tt_control_change_title);
                        strN2 = z4 ? String.format(strN5, str11) : String.format(strN5, strK, str11);
                        vg4Var3 = vg4Var;
                    }
                    String str12 = strN2;
                    charSequenceA = str12;
                    if (z2) {
                        charSequenceA = a(str12, vg4Var3, p4cVar, false);
                    }
                    break;
                case 6:
                    if (TextUtils.isEmpty(h60VarQ.f)) {
                        vg4Var4 = vg4Var;
                        strN3 = n(context, vg4Var4, z4, R.string.tt_control_remove_icon_you, R.string.tt_control_remove_icon_m, R.string.tt_control_remove_icon_f, R.string.tt_control_remove_icon);
                    } else {
                        strN3 = n(context, vg4Var, z4, R.string.tt_control_change_icon_you, R.string.tt_control_change_icon_m, R.string.tt_control_change_icon_f, R.string.tt_control_change_icon);
                        vg4Var4 = vg4Var;
                    }
                    if (!z4) {
                        strN3 = String.format(strN3, strK);
                    }
                    String str13 = strN3;
                    charSequenceA = str13;
                    if (z2) {
                        charSequenceA = a(str13, vg4Var4, p4cVar, false);
                    }
                    break;
                case 7:
                    charSequenceA = h60VarQ.i;
                    break;
                case 8:
                    String strN6 = n(context, vg4Var, z4, R.string.tt_control_join_by_link_you, R.string.tt_control_join_by_link_m, R.string.tt_control_join_by_link_f, R.string.tt_control_join_by_link);
                    if (!z4) {
                        strN6 = String.format(strN6, strK);
                    }
                    String str14 = strN6;
                    charSequenceA = str14;
                    if (z2) {
                        charSequenceA = a(str14, vg4Var, p4cVar, false);
                    }
                    break;
                case 10:
                    charSequenceA = context.getString(R.string.tt_bot_control_welcome_message);
                    break;
                case 11:
                    charSequenceA = context.getString(R.string.comments_start);
                    break;
            }
        } else {
            h60 h60VarQ2 = sfaVar.q();
            int iD2 = qt4.D(h60VarQ2.a);
            if (iD2 == 1) {
                charSequenceA = context.getString(R.string.tt_control_create_chat_admin);
            } else if (iD2 == 5) {
                String str15 = h60VarQ2.d;
                if (!ch3.r(str15)) {
                    strO = str5;
                    strO = c0a.o("«", str15, "»");
                }
                strO = str5;
                charSequenceA = !TextUtils.isEmpty(strO) ? String.format(context.getString(R.string.tt_control_change_title_admin), strO) : context.getString(R.string.tt_control_remove_title_admin);
            } else if (iD2 == 6) {
                charSequenceA = !TextUtils.isEmpty(h60VarQ2.f) ? context.getString(R.string.tt_control_change_icon_admin) : context.getString(R.string.tt_control_remove_icon_admin);
            } else if (iD2 == 7) {
                charSequenceA = str5;
                charSequenceA = h60VarQ2.i;
            }
        }
        charSequenceA = str5;
        return ch3.r(charSequenceA) ? sfaVar.g : charSequenceA;
    }

    public static String l(Context context, vg4 vg4Var, boolean z, boolean z2, boolean z3, h60 h60Var) {
        int i = h60Var.a;
        int iD = qt4.D(i);
        if (iD != 1 && iD != 2 && iD != 3) {
            return "";
        }
        if (z || z3) {
            return (i == 3 || i == 2) ? n(context, vg4Var, false, 0, R.string.tt_control_user_add_you_m, R.string.tt_control_user_add_you_f, R.string.tt_control_user_add_you) : n(context, vg4Var, false, 0, R.string.tt_control_user_remove_you_m, R.string.tt_control_user_remove_you_f, R.string.tt_control_user_remove_you_m);
        }
        return i == 3 ? n(context, vg4Var, z2, R.string.tt_control_you_add_user, R.string.tt_control_user_add_m, R.string.tt_control_user_add_f, R.string.tt_control_user_add) : n(context, vg4Var, z2, R.string.tt_control_you_remove_user, R.string.tt_control_user_remove_m, R.string.tt_control_user_remove_f, R.string.tt_control_user_remove);
    }

    public static int m(long j) {
        if (j <= 0) {
            return 0;
        }
        int iLog10 = (int) (Math.log10(j) / Math.log10(1024.0d));
        if (iLog10 > 4) {
            return 4;
        }
        return iLog10;
    }

    public static String n(Context context, vg4 vg4Var, boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            return context.getString(i);
        }
        int i5 = vg4Var.a.b.l;
        if (i5 == 2) {
            return context.getString(i2);
        }
        return i5 == 3 ? context.getString(i3) : context.getString(i4);
    }

    public static String o(Context context, boolean z, boolean z2) {
        String string = context.getString(z ? R.string.tt_gif : R.string.tt_photo);
        return z2 ? d("📷", string) : z5h.D0(string);
    }

    public static String p(sfa sfaVar, boolean z) {
        o5d o5dVarU = sfaVar.u();
        if (o5dVarU == null) {
            return "";
        }
        return z ? d("📊", o5dVarU.f()) : o5dVarU.f();
    }

    public static String q(int i, int i2, Context context) {
        return String.format(context.getResources().getQuantityString(i, i2), Integer.valueOf(i2));
    }

    public static jeg r(Context context) {
        jeg jegVar = new jeg(z5h.D0(context.getString(R.string.oneme_unsupported_attach_message)));
        new jn8().a(jegVar, 0, jegVar.length());
        return jegVar;
    }

    public static String s(Context context, boolean z) {
        String string = context.getString(R.string.tt_video);
        return z ? d("🎬", string) : z5h.D0(string);
    }

    public static void t(HashMap map, uoh uohVar) {
        Integer num = (Integer) map.get(uohVar);
        map.put(uohVar, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    public static String u(long j, int i, boolean z, Context context) {
        String string;
        if (j <= 0) {
            return "0";
        }
        double dPow = j / Math.pow(1024.0d, i);
        String str = ((z && i == 0) || i == 1) ? ((DecimalFormat) c.get()).format(dPow) : ((DecimalFormat) d.get()).format(dPow);
        if (context == null) {
            string = b[i];
        } else if (i == 0) {
            string = context.getString(R.string.tt_file_size_unit_b);
        } else if (i == 1) {
            string = context.getString(R.string.tt_file_size_unit_kb);
        } else if (i == 2) {
            string = context.getString(R.string.tt_file_size_unit_mb);
        } else if (i != 3) {
            string = i != 4 ? context.getString(R.string.tt_file_size_unit_b) : context.getString(R.string.tt_file_size_unit_tb);
        } else {
            string = context.getString(R.string.tt_file_size_unit_gb);
        }
        return zo5.p(str, " ", string);
    }

    public static String v(long j, boolean z, Context context) {
        return j <= 0 ? "0" : u(j, m(j), z, context);
    }

    public final CharSequence f(Context context, p4c p4cVar, sfa sfaVar, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6) {
        uoh uohVar;
        uoh uohVar2;
        uoh uohVar3;
        boolean zC = sfaVar.C();
        c46 c46Var = sfaVar.n;
        if (!zC && (c46Var == null || ((kg8) c46Var.b) == null)) {
            return "";
        }
        if (sfaVar.R() || (sfaVar.Z() && !sfaVar.I())) {
            y60 y60Var = y60.c;
            if (z3) {
                boolean zR = sfaVar.R();
                boolean Z = sfaVar.Z();
                boolean zI = sfaVar.I();
                if (zR && Z) {
                    return d("📷", context.getString(R.string.tt_photo_and_video));
                }
                if (zR) {
                    return o(context, c46Var.l(y60Var).b.e, true);
                }
                return zI ? z5h.D0(context.getString(R.string.oneme_video_message)) : s(context, true);
            }
            HashMap map = new HashMap();
            int i = 0;
            while (true) {
                int i2 = c46Var.i();
                uohVar = uoh.c;
                uohVar2 = uoh.a;
                uohVar3 = uoh.b;
                if (i >= i2) {
                    break;
                }
                e70 e70VarH = c46Var.h(i);
                if (e70VarH.a != y60Var) {
                    t(map, uohVar);
                } else if (e70VarH.b.e) {
                    t(map, uohVar3);
                } else {
                    t(map, uohVar2);
                }
                i++;
            }
            if (map.isEmpty()) {
                return "";
            }
            String strC = c(context, (Integer) map.get(uoh.d), false, new dxd(1, context, z));
            String strConcat = strC.concat(c(context, (Integer) map.get(uohVar2), !ch3.r(strC), new dxd(2, context, z)));
            String strConcat2 = strConcat.concat(c(context, (Integer) map.get(uohVar3), !ch3.r(strConcat), new dxd(3, context, z)));
            return strConcat2.concat(c(context, (Integer) map.get(uohVar), true ^ ch3.r(strConcat2), new dxd(4, context, z)));
        }
        if (sfaVar.J()) {
            return g(context, z, z4);
        }
        if (sfaVar.K()) {
            return h(context, sfaVar, z, true, j);
        }
        strP = null;
        strP = null;
        String strP = null;
        if (sfaVar.W()) {
            w60 w60VarW = sfaVar.w();
            w60VarW.getClass();
            String string = p4cVar.a.getString(R.string.tt_sticker);
            if (z5) {
                List<String> listK = w60VarW.k();
                if (listK != null && !listK.isEmpty()) {
                    for (String str : listK) {
                        if (p4cVar.j(0, str)) {
                            strP = zo5.p(str, " ", string);
                            break;
                        }
                    }
                }
                if (strP != null) {
                    return z5h.D0(strP);
                }
            }
            return z ? d("🌄", string) : z5h.D0(string);
        }
        if (sfaVar.V()) {
            String string2 = context.getString(z2 ? R.string.tt_link_acs : R.string.tt_link);
            return z ? d("🔗", string2) : z5h.D0(string2);
        }
        if (sfaVar.C() && c46Var.l(y60.i) != null) {
            String string3 = context.getString(R.string.tt_game);
            return z ? d("🎮", string3) : string3;
        }
        if (sfaVar.P()) {
            String str2 = sfaVar.r().c;
            return z ? d("📄", str2) : str2;
        }
        if (sfaVar.L()) {
            return j(context, sfaVar.p(), (ih4) this.a.getValue(), z, false);
        }
        if (sfaVar.U()) {
            String string4 = context.getString((sfaVar.U() ? c46Var.l(y60.l).l : null).g() == 4 ? R.string.tt_present_accepted : R.string.tt_present);
            return z ? d("🎁", string4) : string4;
        }
        if (sfaVar.Q()) {
            String string5 = context.getString(R.string.tt_location);
            return z ? d("📍", string5) : z5h.D0(string5);
        }
        if (c46Var != null && ((kg8) c46Var.b) != null) {
            return context.getString(R.string.tt_keyboard);
        }
        if (sfaVar.I()) {
            return z5h.D0(context.getString(R.string.oneme_video_message));
        }
        if (!sfaVar.a0()) {
            return (sfaVar.S() && z6) ? p(sfaVar, z) : r(context);
        }
        qvj qvjVarA = sfaVar.A();
        if (qvjVarA == null) {
            return r(context);
        }
        String strS = qvjVarA.c().s();
        if (ch3.r(strS)) {
            return r(context);
        }
        StringBuilder sb = new StringBuilder(strS);
        kvj kvjVarB = qvjVarA.b();
        if (kvjVarB == null) {
            return sb.toString();
        }
        String strD = kvjVarB.d();
        if (ch3.s(strD)) {
            sb.append(". ");
            sb.append(strD);
        }
        return sb.toString();
    }
}
