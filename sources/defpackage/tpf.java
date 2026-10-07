package defpackage;

import android.os.Bundle;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tpf extends mk0 {
    public static final upf k;
    public static final upf l;
    public static final upf m;
    public final ynh b;
    public final List c;
    public final y3f d;
    public final Bundle e;
    public static final tpf f = new tpf(new tnh(R.string.oneme_settings_privacy_screen_dialog_online_title), xw3.P0(new spf(R.id.oneme_settings_privacy_screen_dialog_online_button_contacts, new tnh(R.string.contacts), false), new spf(R.id.oneme_settings_privacy_screen_dialog_online_button_nobody, new tnh(R.string.nobody), false)), y3f.SETTINGS_PRIVACY_SAFE_MODE_ONLINE, null, 8);
    public static final tpf g = new tpf(new tnh(R.string.oneme_settings_privacy_screen_dialog_call_title), xw3.P0(new spf(R.id.oneme_settings_privacy_screen_dialog_call_button_all, new tnh(R.string.all), false), new spf(R.id.oneme_settings_privacy_screen_dialog_call_button_contacts, new tnh(R.string.contacts), false)), y3f.SETTINGS_PRIVACY_SAFE_MODE_CALLS, null, 8);
    public static final tpf h = new tpf(new tnh(R.string.oneme_settings_privacy_screen_dialog_seach_by_phone_title), xw3.P0(new spf(R.id.oneme_settings_privacy_screen_dialog_search_by_phone_all, new tnh(R.string.all), false), new spf(R.id.oneme_settings_privacy_screen_dialog_search_by_phone_contacts, new tnh(R.string.contacts), false)), y3f.SETTINGS_PRIVACY_SAFE_MODE_SEARCH_BY_PHONE, null, 8);
    public static final tpf i = new tpf(new tnh(R.string.oneme_settings_privacy_screen_dialog_add_chat_title), xw3.P0(new spf(R.id.oneme_settings_privacy_screen_dialog_add_chat_button_all, new tnh(R.string.all), false), new spf(R.id.oneme_settings_privacy_screen_dialog_add_chat_button_contacts, new tnh(R.string.contacts), false)), y3f.SETTINGS_PRIVACY_SAFE_MODE_INVITE, null, 8);
    public static final tpf j = new tpf(new tnh(R.string.oneme_settings_privace_screen_dialog_content_level_access_title), xw3.P0(new spf(R.id.oneme_settings_privacy_screen_dialog_content_level_access_all, new tnh(R.string.oneme_settings_privacy_content_level_access_all), false), new spf(R.id.oneme_settings_privacy_screen_dialog_content_level_access_safe, new tnh(R.string.oneme_settings_privacy_content_level_access_safe), false)), y3f.SETTINGS_PRIVACY_SENSITIVE_CONTENT, null, 8);
    public static final tpf n = new tpf(new tnh(R.string.oneme_settings_privacy_screen_dialog_see_phone_number), xw3.P0(new spf(R.id.oneme_settings_privacy_screen_dialog_phone_number_privacy_all, new tnh(R.string.all), false), new spf(R.id.oneme_settings_privacy_screen_dialog_phone_number_privacy_contacts, new tnh(R.string.contacts), false), new spf(R.id.oneme_settings_privacy_screen_dialog_phone_number_privacy_no_one, new tnh(R.string.nobody), false)), y3f.SETTINGS_PRIVACY_PHONE_NUMBER, null, 8);

    static {
        int i2 = 4;
        k = new upf(i2, new tnh(R.string.oneme_settings_privacy_screen_safe_mode_enabled_snackbar_title), Integer.valueOf(R.drawable.icon_security_check_fill));
        l = new upf(i2, new tnh(R.string.oneme_settings_privacy_screen_safe_mode_disabled_snackbar_title), Integer.valueOf(R.drawable.icon_info_fill));
        m = new upf(i2, new tnh(R.string.oneme_settings_privacy_screen_safe_mode_change_disabled_snackbar_title), Integer.valueOf(R.drawable.icon_privacy_fill));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpf(ynh ynhVar, List list, y3f y3fVar, Bundle bundle, int i2) {
        super(16);
        y3fVar = (i2 & 4) != 0 ? null : y3fVar;
        bundle = (i2 & 8) != 0 ? null : bundle;
        this.b = ynhVar;
        this.c = list;
        this.d = y3fVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpf)) {
            return false;
        }
        tpf tpfVar = (tpf) obj;
        return this.b.equals(tpfVar.b) && this.c.equals(tpfVar.c) && this.d == tpfVar.d && cqk.d(this.e, tpfVar.e);
    }

    public final int hashCode() {
        int iC = qv1.c(this.b.hashCode() * 31, 31, this.c);
        y3f y3fVar = this.d;
        int iHashCode = (iC + (y3fVar == null ? 0 : y3fVar.hashCode())) * 31;
        Bundle bundle = this.e;
        return iHashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", statScreen=" + this.d + ", payload=" + this.e + ")";
    }
}
