package defpackage;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wlb extends emb {
    public final ArrayList e = new ArrayList();

    @Override // defpackage.emb
    public final void b(vyh vyhVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) vyhVar.d).setBigContentTitle(this.b);
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }

    @Override // defpackage.emb
    public final String c() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    public final void d(CharSequence charSequence) {
        if (charSequence != null) {
            this.e.add(qlb.c(charSequence));
        }
    }

    public final void e(String str) {
        this.b = qlb.c(str);
    }

    public final void f(String str) {
        this.c = qlb.c(str);
        this.d = true;
    }
}
