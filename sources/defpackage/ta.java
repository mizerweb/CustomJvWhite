package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ta {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ta);
    }

    public final int hashCode() {
        return qt4.D(1) + zo5.c(R.string.profile_add_admins_tab_chat_members, Integer.hashCode(R.id.profile_add_admins_tab_chat_members) * 31, 31);
    }

    public final String toString() {
        return zo5.w(qv1.p("AddAdminsTabState(id=", R.id.profile_add_admins_tab_chat_members, ", title=", R.string.profile_add_admins_tab_chat_members, ", type="), "CHAT_MEMBERS", ")");
    }
}
