package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vqf extends rbb {
    public static final vqf d = new vqf(new tnh(R.string.oneme_settings_battery_video_title), xw3.P0(new uqf(R.id.oneme_settings_battery_auto_play_video_always, new tnh(R.string.oneme_settings_battery_action_always)), new uqf(R.id.oneme_settings_battery_auto_play_video_wifi, new tnh(R.string.oneme_settings_battery_action_wifi)), new uqf(R.id.oneme_settings_battery_auto_play_video_disable, new tnh(R.string.oneme_settings_battery_action_disabled))));
    public static final vqf e = new vqf(new tnh(R.string.oneme_settings_battery_video_quality_title), xw3.P0(new uqf(R.id.oneme_settings_battery_quality_1080, new tnh(R.string.oneme_settings_battery_action_video_quality_1080)), new uqf(R.id.oneme_settings_battery_quality_720, new tnh(R.string.oneme_settings_battery_action_video_quality_720)), new uqf(R.id.oneme_settings_battery_quality_480, new tnh(R.string.oneme_settings_battery_action_video_quality_480))));
    public final tnh b;
    public final List c;

    public vqf(tnh tnhVar, List list) {
        super(sbi.a);
        this.b = tnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqf)) {
            return false;
        }
        vqf vqfVar = (vqf) obj;
        return this.b.equals(vqfVar.b) && this.c.equals(vqfVar.c);
    }

    public final int hashCode() {
        return qv1.c(Integer.hashCode(this.b.c) * 31, 31, this.c);
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", payload=null)";
    }
}
