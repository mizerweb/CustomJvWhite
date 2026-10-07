package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.deeplink.InvalidDeeplinkNamingException;

/* JADX INFO: loaded from: classes.dex */
public final class n65 {
    public String a = "";
    public final ArrayList b = new ArrayList();

    public final Uri a() {
        return wk8.e(b());
    }

    public final String b() {
        boolean zK0 = z5h.K0(this.a, ":", false);
        String str = this.a;
        if (!zK0) {
            throw new InvalidDeeplinkNamingException(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('?');
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('&');
        }
        sb.deleteCharAt(r5h.Q0(sb));
        return sb.toString();
    }

    public final void c(String str, String str2) {
        this.b.add(str + "=" + Uri.encode(str2));
    }

    public final void d(Object obj, String str) {
        this.b.add(str + "=" + obj);
    }
}
