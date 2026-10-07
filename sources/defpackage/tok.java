package defpackage;

import java.lang.reflect.Method;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tok {
    public static final Object a = new Object();
    public static Method b;
    public static boolean c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127  */
    public static ag9 a(yhh yhhVar) {
        eih eihVar;
        String str;
        String str2;
        int i;
        ynh tnhVar;
        String str3;
        String str4;
        String str5 = yhhVar.b;
        if (cqk.d(str5, "service.unavailable") || cqk.d(str5, "service.timeout") || cqk.d(str5, "errors.event.unavailable")) {
            eihVar = yhhVar instanceof eih ? (eih) yhhVar : null;
            return new zf9((eihVar == null || (str2 = eihVar.e) == null) ? new tnh(R.string.oneme_connection_server_error_title) : new xnh(str2), (eihVar == null || (str = eihVar.f) == null) ? new tnh(R.string.oneme_connection_server_error_description) : new xnh(str), 2);
        }
        boolean z = true;
        if (yhhVar instanceof thh) {
            return new zf9(new tnh(R.string.snack_network_error_title), new tnh(R.string.snack_network_error_description), 1);
        }
        if (cqk.d(str5, "error.profile.suspended")) {
            return new wf9(new tnh(R.string.oneme_login_profile_suspended));
        }
        if (cqk.d(str5, "auth.blocked") || cqk.d(str5, "error.profile.blocked")) {
            return new vf9(new tnh(R.string.oneme_login_profile_suspended));
        }
        if (cqk.d(str5, "error.limit.violate")) {
            eihVar = yhhVar instanceof eih ? (eih) yhhVar : null;
            return new xf9((eihVar == null || (str4 = eihVar.e) == null) ? new tnh(R.string.oneme_login_sms_count_exceeded_title) : new xnh(str4), (eihVar == null || (str3 = eihVar.f) == null) ? new tnh(R.string.oneme_login_sms_count_exceeded_description) : new xnh(str3));
        }
        if (cqk.d(str5, "error.profile.active.session.no2fa")) {
            return tf9.d;
        }
        String str6 = yhhVar.d;
        if (str6 == null || str6.length() == 0) {
            switch (str5) {
                case "phone.wrong":
                    i = R.string.auth_error_wrong_phone;
                    break;
                case "code.limit":
                    i = R.string.auth_error_sms_limit;
                    break;
                case "auth.blocked":
                    i = R.string.auth_blocked;
                    break;
                case "error.code.attempt.limit":
                    i = R.string.auth_error_sms_limit;
                    break;
                case "verify.code.wrong":
                    i = R.string.auth_error_invalid_sms;
                    break;
                case "error.phone.blacklisted":
                    i = R.string.auth_error_phone_blacklisted;
                    break;
                case "verify.code.expired":
                    i = R.string.auth_error_sms_code_expired;
                    break;
                case "login.token":
                    i = R.string.auth_error_wrong_login_pass;
                    break;
                case "error.limit.violate":
                    i = R.string.auth_error_sms_limit;
                    break;
                default:
                    i = R.string.common_error_base_retry;
                    break;
            }
            tnhVar = new tnh(i);
        } else {
            tnhVar = new xnh(str6);
        }
        if (!cqk.d(str5, "verify.code.wrong") && !cqk.d(str5, "error.code.attempt.limit")) {
            z = false;
        }
        return new uf9(tnhVar, new TamErrorException(yhhVar), z);
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
