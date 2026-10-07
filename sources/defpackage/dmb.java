package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dmb extends emb {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final htc g;
    public CharSequence h;
    public Boolean i;

    public dmb(htc htcVar) {
        if (TextUtils.isEmpty(htcVar.a)) {
            ore.p("User's name must not be empty.");
            throw null;
        }
        this.g = htcVar;
    }

    @Override // defpackage.emb
    public final void a(Bundle bundle) {
        super.a(bundle);
        htc htcVar = this.g;
        bundle.putCharSequence("android.selfDisplayName", htcVar.a);
        bundle.putBundle("android.messagingStyleUser", htcVar.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", cmb.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", cmb.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // defpackage.emb
    public final void b(vyh vyhVar) {
        Notification.MessagingStyle messagingStyleB;
        qlb qlbVar = this.a;
        boolean zBooleanValue = false;
        if (qlbVar == null || qlbVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.h != null) {
            zBooleanValue = true;
        }
        this.i = Boolean.valueOf(zBooleanValue);
        int i = Build.VERSION.SDK_INT;
        htc htcVar = this.g;
        if (i >= 28) {
            htcVar.getClass();
            messagingStyleB = zlb.a(go.i(htcVar));
        } else {
            messagingStyleB = xlb.b(htcVar.a);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            xlb.a(messagingStyleB, ((cmb) it.next()).b());
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ylb.a(messagingStyleB, ((cmb) it2.next()).b());
        }
        if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            xlb.c(messagingStyleB, this.h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            zlb.b(messagingStyleB, this.i.booleanValue());
        }
        messagingStyleB.setBuilder((Notification.Builder) vyhVar.d);
    }

    @Override // defpackage.emb
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
