package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class olb extends emb {
    public CharSequence e;

    @Override // defpackage.emb
    public final void b(vyh vyhVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) vyhVar.d).setBigContentTitle(this.b).bigText(this.e);
        if (this.d) {
            bigTextStyleBigText.setSummaryText(this.c);
        }
    }

    @Override // defpackage.emb
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
