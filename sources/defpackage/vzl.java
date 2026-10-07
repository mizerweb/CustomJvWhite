package defpackage;

import android.content.Context;
import java.io.IOException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vzl {
    public static ynh a(yhh yhhVar) {
        dih dihVarA = svl.a(yhhVar);
        if (dihVarA.equals(zhh.a)) {
            return new tnh(R.string.common_error_base_retry);
        }
        if (dihVarA.equals(aih.a)) {
            return new tnh(R.string.common_network_error);
        }
        if (dihVarA.equals(bih.a)) {
            return new tnh(R.string.common_service_error);
        }
        if (dihVarA instanceof cih) {
            return new xnh(((cih) dihVarA).a);
        }
        ore.o();
        return null;
    }

    public static ynh b(Throwable th) {
        TamErrorException tamErrorException = th instanceof TamErrorException ? (TamErrorException) th : null;
        return a(tamErrorException != null ? tamErrorException.a : null);
    }

    public static xj7 c(Context context) {
        qe7.v();
        xj7 xj7Var = new xj7(context.getResources());
        qe7.v();
        return xj7Var;
    }

    public static boolean d(yhh yhhVar) {
        String str = yhhVar != null ? yhhVar.b : null;
        if (!(yhhVar instanceof eih) || str == null || str.length() == 0) {
            return false;
        }
        return str.contentEquals("password.invalid") || str.contentEquals("hint.invalid") || str.contentEquals("password2fa.wrong") || str.contentEquals("email.wrong") || str.contentEquals("email.compromised");
    }

    public static boolean e(Throwable th) {
        String str;
        if (th instanceof IOException) {
            return true;
        }
        if (!(th instanceof TamErrorException) || (str = ((TamErrorException) th).a.b) == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1923846901:
                return str.equals("proto.state");
            case -1582981336:
                return str.equals("service.timeout");
            case -1202230471:
                return str.equals("session.state");
            case -870493304:
                return str.equals("proto.payload");
            case -755046460:
                return str.equals("track.not.found");
            case -192382585:
                return str.equals("io.exception");
            case -93784873:
                return str.equals("password2fa.no.attempts");
            case 570410685:
                return str.equals("internal");
            case 1484015372:
                return str.equals("phone.not.checked");
            case 1562713945:
                return str.equals("too.many.requests");
            case 1571810967:
                return str.equals("service.unavailable");
            default:
                return false;
        }
    }
}
