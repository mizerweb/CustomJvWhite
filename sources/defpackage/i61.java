package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class i61 {
    public final ny8 a;
    public final ny8 b;

    public i61(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static lyb a() {
        return new lyb(R.id.profile_notifs_disabled_button, Integer.valueOf(R.string.oneme_profile_notifications), (Integer) null, Integer.valueOf(R.drawable.icon_notifications_crossed), (Integer) null, 52);
    }

    public static lyb b() {
        return new lyb(R.id.profile_notifs_enabled_button, Integer.valueOf(R.string.oneme_profile_notifications), (Integer) null, Integer.valueOf(R.drawable.icon_notifications), (Integer) null, 52);
    }

    public static lyb c() {
        return new lyb(R.id.profile_search_button, Integer.valueOf(R.string.oneme_profile_search), (Integer) null, Integer.valueOf(R.drawable.icon_search), (Integer) null, 52);
    }

    public static lyb d() {
        return new lyb(R.id.profile_start_chat_button, Integer.valueOf(R.string.oneme_profile_start_chat), (Integer) null, Integer.valueOf(R.drawable.icon_message), (Integer) null, 52);
    }
}
