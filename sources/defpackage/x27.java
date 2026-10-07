package defpackage;

import android.graphics.Color;
import java.math.BigInteger;
import java.util.Map;
import kotlin.collections.a;
import one.me.folders.list.FoldersListScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.api.request.GetExternalIdsByOkIds;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x27 implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ x27(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return Boolean.valueOf(i37.e.contains((i37) obj));
            case 1:
                zv8[] zv8VarArr = FoldersListScreen.h;
                return Boolean.valueOf(((lfe) obj).f == R.id.oneme_folders_list_user_folder_view_type);
            case 2:
                return GetExternalIdsByOkIds.Companion.mapToStringApiParam$lambda$0((yt1) obj);
            case 3:
                return -1;
            case 4:
                return Integer.valueOf(mx3.e(Color.parseColor("#0D0D0D"), 163));
            case 5:
                return "- " + ((cn8) obj);
            case 6:
                return String.valueOf(((s9e) obj).a);
            case 7:
                return ((y8f) obj).r();
            case 8:
                return String.valueOf(((ek4) obj).a);
            case 9:
                dgg dggVar = (dgg) obj;
                dggVar.getClass();
                BigInteger bigInteger = dggVar.i;
                if (bigInteger != null) {
                    return Long.valueOf(bigInteger.longValue());
                }
                return null;
            case 10:
                dgg dggVar2 = (dgg) obj;
                dggVar2.getClass();
                BigInteger bigInteger2 = dggVar2.h;
                if (bigInteger2 != null) {
                    return Long.valueOf(bigInteger2.longValue());
                }
                return null;
            case 11:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM informer_banner");
                try {
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 12:
                return tok.a(((TamErrorException) obj).a);
            case 13:
                return Boolean.valueOf(z5h.K0((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 14:
                return new cp6(3, (String) ((Map.Entry) obj).getValue());
            case 15:
                ou7 ou7Var = gm8.u;
                yhh yhhVar = ((TamErrorException) obj).a;
                ou7Var.getClass();
                if (yhhVar instanceof thh) {
                    String str = ((thh) yhhVar).b;
                    return (cqk.d(str, "service.unavailable") || cqk.d(str, "service.timeout")) ? new ul8(new tnh(R.string.oneme_connection_server_error_title), new tnh(R.string.oneme_connection_server_error_description)) : new ul8(new tnh(R.string.snack_network_error_title), new tnh(R.string.snack_network_error_description));
                }
                String str2 = yhhVar.b;
                String str3 = yhhVar.d;
                if (cqk.d(str2, "contact.not.found") || cqk.d(str2, "not.found")) {
                    return vl8.a;
                }
                if (cqk.d(str2, "too.many.requests")) {
                    return wl8.a;
                }
                return new tl8((str3 == null || str3.length() == 0) ? new tnh(R.string.common_error_base_retry) : new xnh(str3));
            case 16:
                tr3 tr3Var = (tr3) obj;
                tr3.a(tr3Var, "JsonPrimitive", new nt8(new q38(15)));
                tr3.a(tr3Var, "JsonNull", new nt8(new q38(16)));
                tr3.a(tr3Var, "JsonLiteral", new nt8(new q38(17)));
                tr3.a(tr3Var, "JsonObject", new nt8(new q38(18)));
                tr3.a(tr3Var, "JsonArray", new nt8(new q38(19)));
                return sbiVar;
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                String str4 = (String) entry.getKey();
                jt8 jt8Var = (jt8) entry.getValue();
                StringBuilder sb = new StringBuilder();
                m5h.a(sb, str4);
                sb.append(':');
                sb.append(jt8Var);
                return sb.toString();
            case 18:
                ((String) obj).getClass();
                return new fi9();
            case 19:
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((di4) obj).j = 3;
                return sbiVar;
            case 21:
                ((di4) obj).j = 3;
                return sbiVar;
            case 22:
                vxe vxeVarO1 = ((qxe) obj).O0("DELETE FROM media_cache");
                try {
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 23:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM media_cache WHERE type = ?");
                try {
                    vxeVarO2.c(1, 0L);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 24:
                return "video_tracks=" + ((b87) obj);
            case 25:
                return "audio_tracks=" + ((b87) obj);
            case 26:
                return "other_tracks=" + ((b87) obj);
            case 27:
                return a.K0(((xx9) obj).e);
            case 28:
                return Float.valueOf(((b87) obj).y);
            default:
                return Boolean.valueOf(((Float) obj).floatValue() > 0.0f);
        }
    }
}
