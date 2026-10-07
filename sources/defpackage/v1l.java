package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes4.dex */
public final class v1l implements Runnable {
    public static final ed7 c = new ed7("RevokeAccessOperation", new String[0]);
    public final String a;
    public final wkg b;

    public v1l(String str) {
        yab.p(str);
        this.a = str;
        this.b = new wkg(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ed7 ed7Var = c;
        Status status = Status.g;
        try {
            String strValueOf = String.valueOf(this.a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) ed7Var.c, ((String) ed7Var.d).concat("Unable to revoke access!"));
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            String string = sb.toString();
            if (ed7Var.b <= 3) {
                Log.d((String) ed7Var.c, ((String) ed7Var.d).concat(string));
            }
        } catch (IOException e) {
            String strValueOf2 = String.valueOf(e.toString());
            Log.e((String) ed7Var.c, ((String) ed7Var.d).concat(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: ")));
        } catch (Exception e2) {
            String strValueOf3 = String.valueOf(e2.toString());
            Log.e((String) ed7Var.c, ((String) ed7Var.d).concat(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: ")));
        }
        this.b.e(status);
    }
}
