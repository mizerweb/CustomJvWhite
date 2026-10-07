package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class hlb {
    public final Context a;
    public final v4c b;
    public final d95 c;
    public final e1c d;
    public final zed e;
    public NotificationManager f;

    public hlb(Context context, v4c v4cVar, d95 d95Var, e1c e1cVar, zed zedVar) {
        this.a = context;
        this.b = v4cVar;
        this.c = d95Var;
        this.d = e1cVar;
        this.e = zedVar;
    }

    public final glb a() {
        glb glbVar = new glb();
        this.c.getClass();
        glbVar.c("ru.oneme.app.new.activeCalls");
        glbVar.f(this.a.getString(R.string.tt_notif_category_active_calls));
        glbVar.j(false);
        glbVar.k(false);
        glbVar.e(false);
        glbVar.g(false);
        glbVar.d();
        return glbVar.a();
    }

    public final glb b() {
        boolean z = this.e.c.d.getBoolean("app.notification.vibrate", true);
        Context context = this.a;
        int iB = d3m.b(context);
        if (iB != 3) {
            z = z && iB == 1;
        }
        glb glbVar = new glb();
        this.c.getClass();
        glbVar.c("ru.oneme.app.new.incomingCalls.");
        glbVar.f(context.getString(R.string.tt_notif_category_incoming_calls));
        glbVar.j(false);
        glbVar.k(z);
        glbVar.h(null);
        glbVar.g(true);
        glbVar.b();
        glbVar.e(true);
        return glbVar.a();
    }

    public final glb c() {
        glb glbVar = new glb();
        zed zedVar = this.e;
        boolean z = !zedVar.c.j("app.notification.chats.ringtone").equals("_NONE_");
        Uri uriI = i(false);
        this.c.getClass();
        glbVar.c("ru.oneme.app.chats");
        glbVar.f(this.a.getString(R.string.tt_notif_category_chats));
        glbVar.j(z);
        nni nniVar = zedVar.c;
        glbVar.k(nniVar.d.getBoolean("app.notification.chats.vibrate", true));
        glbVar.h(uriI);
        glbVar.g(nniVar.d.getBoolean("app.notification.important.priority", true));
        glbVar.i();
        return glbVar.a();
    }

    public final glb d() {
        glb glbVar = new glb();
        zed zedVar = this.e;
        boolean z = !zedVar.c.j("app.notification.ringtone").equals("_NONE_");
        Uri uriI = i(true);
        this.c.getClass();
        glbVar.c("ru.oneme.app.dialogs");
        glbVar.f(this.a.getString(R.string.tt_notif_category_dialogs));
        glbVar.j(z);
        nni nniVar = zedVar.c;
        glbVar.k(nniVar.d.getBoolean("app.notification.vibrate", true));
        glbVar.h(uriI);
        glbVar.g(nniVar.d.getBoolean("app.notification.important.priority", true));
        glbVar.i();
        return glbVar.a();
    }

    public final glb e() {
        glb glbVar = new glb();
        this.b.getClass();
        this.c.getClass();
        glbVar.c("ru.oneme.app.inapp.2");
        glbVar.f(this.a.getString(R.string.tt_notif_category_inapp));
        glbVar.j(true);
        glbVar.h(null);
        glbVar.k(this.e.c.d.getBoolean("app.notification.in.app.vibrate", true));
        glbVar.l(new long[]{0, 100});
        glbVar.g(false);
        glbVar.i();
        return glbVar.a();
    }

    public final void f(glb glbVar) {
        int i;
        long[] jArr;
        StringBuilder sb = new StringBuilder("createChannel: ");
        String str = glbVar.a;
        boolean z = glbVar.d;
        sb.append(str);
        gm0.n("hlb", sb.toString());
        if (glbVar.c) {
            i = glbVar.f ? 4 : 3;
        } else {
            i = 2;
        }
        if (glbVar.h) {
            i = 5;
        }
        int i2 = glbVar.i;
        if (i2 != -1000) {
            i = i2;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, glbVar.b, i);
        Uri uri = glbVar.e;
        if (uri != null) {
            this.c.getClass();
            notificationChannel.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(str.equals("ru.oneme.app.new.incomingCalls.") ? 6 : 5).build());
        } else {
            notificationChannel.setSound(null, null);
        }
        notificationChannel.enableVibration(z);
        if (z && (jArr = glbVar.g) != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(pq3.j.e(this.b.a).m().h().a);
        String strB = this.d.b(str);
        if (strB != null) {
            notificationChannel.setGroup(strB);
        }
        notificationChannel.setShowBadge(glbVar.j);
        notificationChannel.setBypassDnd(glbVar.k);
        j().createNotificationChannel(notificationChannel);
    }

    public final void g() {
        e1c e1cVar = this.d;
        List<NotificationChannelGroup> notificationChannelGroups = ((NotificationManager) e1cVar.e.getValue()).getNotificationChannelGroups();
        if (notificationChannelGroups != null) {
            pw pwVar = new pw(0);
            Iterator<T> it = notificationChannelGroups.iterator();
            while (it.hasNext()) {
                pwVar.add(((NotificationChannelGroup) it.next()).getId());
            }
            if (!pwVar.contains("ru.oneme.app.notifications.group.chats")) {
                e1cVar.a(R.string.tt_notif_category_group_chats, "ru.oneme.app.notifications.group.chats");
            }
            if (!pwVar.contains("ru.oneme.app.notifications.group.other")) {
                e1cVar.a(R.string.tt_notif_category_group_other, "ru.oneme.app.notifications.group.other");
            }
            if (!pwVar.contains("ru.oneme.app.notifications.group.calls")) {
                e1cVar.a(R.string.tt_notif_category_group_calls, "ru.oneme.app.notifications.group.calls");
            }
        }
        List<NotificationChannel> notificationChannels = j().getNotificationChannels();
        HashSet hashSet = new HashSet();
        Iterator<NotificationChannel> it2 = notificationChannels.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getId());
        }
        this.c.getClass();
        if (!hashSet.contains("ru.oneme.app.chats")) {
            f(c());
            hashSet.add("ru.oneme.app.chats");
        }
        if (!hashSet.contains("ru.oneme.app.dialogs")) {
            f(d());
            hashSet.add("ru.oneme.app.dialogs");
        }
        boolean zContains = hashSet.contains("ru.oneme.app.misc");
        Context context = this.a;
        if (!zContains) {
            glb glbVar = new glb();
            zed zedVar = this.e;
            boolean z = !zedVar.c.j("app.notification.ringtone").equals("_NONE_");
            Uri uriI = i(true);
            glbVar.c("ru.oneme.app.misc");
            glbVar.f(context.getString(R.string.tt_notif_category_misc));
            glbVar.j(z);
            glbVar.k(zedVar.c.d.getBoolean("app.notification.vibrate", true));
            glbVar.h(uriI);
            f(glbVar.a());
            hashSet.add("ru.oneme.app.misc");
        }
        if (!hashSet.contains("ru.oneme.app.inapp.2")) {
            f(e());
            hashSet.add("ru.oneme.app.inapp.2");
        }
        if (!hashSet.contains("ru.oneme.app.fileUpload")) {
            glb glbVar2 = new glb();
            glbVar2.c("ru.oneme.app.fileUpload");
            glbVar2.f(context.getString(R.string.tt_notif_category_file_loading));
            glbVar2.j(false);
            glbVar2.k(false);
            glbVar2.g(false);
            f(glbVar2.a());
            hashSet.add("ru.oneme.app.fileUpload");
        }
        if (!hashSet.contains("ru.oneme.app.media")) {
            glb glbVar3 = new glb();
            glbVar3.c("ru.oneme.app.media");
            glbVar3.f(context.getString(R.string.tt_notif_category_media));
            glbVar3.j(true);
            glbVar3.h(null);
            glbVar3.k(false);
            glbVar3.g(false);
            f(glbVar3.a());
            hashSet.add("ru.oneme.app.media");
        }
        if (hashSet.contains("ru.oneme.app.incomingCalls")) {
            try {
                j().deleteNotificationChannel("ru.oneme.app.incomingCalls");
            } catch (Throwable unused) {
            }
        }
        if (hashSet.contains("ru.oneme.app.activeCalls")) {
            try {
                j().deleteNotificationChannel("ru.oneme.app.activeCalls");
            } catch (Throwable unused2) {
            }
        }
        if (!hashSet.contains("ru.oneme.app.new.incomingCalls.")) {
            f(b());
            hashSet.add("ru.oneme.app.new.incomingCalls.");
        }
        if (!hashSet.contains("ru.oneme.app.new.activeCalls")) {
            f(a());
            hashSet.add("ru.oneme.app.new.activeCalls");
        }
        if (hashSet.contains("ru.oneme.app.liveLocation")) {
            return;
        }
        glb glbVar4 = new glb();
        glbVar4.c("ru.oneme.app.liveLocation");
        glbVar4.f(context.getString(R.string.tt_notif_category_live_location));
        glbVar4.j(false);
        glbVar4.k(false);
        glbVar4.g(false);
        f(glbVar4.a());
        hashSet.add("ru.oneme.app.liveLocation");
    }

    public final NotificationChannel h(String str) {
        if (ch3.r(str)) {
            return null;
        }
        for (NotificationChannel notificationChannel : j().getNotificationChannels()) {
            if (str.equals(notificationChannel.getId())) {
                return notificationChannel;
            }
        }
        return null;
    }

    public final Uri i(boolean z) {
        zed zedVar = this.e;
        String strJ = z ? zedVar.c.j("app.notification.ringtone") : zedVar.c.j("app.notification.chats.ringtone");
        if (!"DEFAULT".equals(strJ)) {
            return Uri.parse(strJ);
        }
        this.b.getClass();
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final NotificationManager j() {
        if (this.f == null) {
            this.f = (NotificationManager) this.a.getSystemService("notification");
        }
        return this.f;
    }

    public final boolean k() {
        this.c.getClass();
        NotificationChannel notificationChannelH = h("ru.oneme.app.new.activeCalls");
        glb glbVarA = a();
        if (notificationChannelH == null) {
            f(glbVarA);
            return true;
        }
        if (notificationChannelH.getSound() == null && !notificationChannelH.shouldVibrate() && notificationChannelH.getAudioAttributes() == null && notificationChannelH.getImportance() == 2) {
            return false;
        }
        j().deleteNotificationChannel("ru.oneme.app.new.activeCalls");
        f(glbVarA);
        return true;
    }

    public final boolean l() {
        this.c.getClass();
        NotificationChannel notificationChannelH = h("ru.oneme.app.new.incomingCalls.");
        glb glbVarB = b();
        if (notificationChannelH == null) {
            f(glbVarB);
            return true;
        }
        if (notificationChannelH.getSound() == null && !notificationChannelH.shouldVibrate() && notificationChannelH.getAudioAttributes() == null && notificationChannelH.getImportance() >= 4 && notificationChannelH.canBypassDnd()) {
            return false;
        }
        j().deleteNotificationChannel("ru.oneme.app.new.incomingCalls.");
        f(glbVarB);
        return true;
    }
}
