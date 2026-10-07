package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ytf extends mk0 {
    public static final ytf d = new ytf(new tnh(R.string.oneme_settings_media_photo_title), xw3.P0(new xtf(R.id.oneme_settings_media_photo_always, new tnh(R.string.oneme_settings_media_action_always)), new xtf(R.id.oneme_settings_media_photo_wifi, new tnh(R.string.oneme_settings_media_action_wifi)), new xtf(R.id.oneme_settings_media_photo_dont_load, new tnh(R.string.oneme_settings_media_action_dont_load))));
    public static final ytf e = new ytf(new tnh(R.string.oneme_settings_media_gif_title), xw3.P0(new xtf(R.id.oneme_settings_media_gif_always, new tnh(R.string.oneme_settings_media_action_always)), new xtf(R.id.oneme_settings_media_gif_wifi, new tnh(R.string.oneme_settings_media_action_wifi)), new xtf(R.id.oneme_settings_media_gif_dont_load, new tnh(R.string.oneme_settings_media_action_dont_load))));
    public static final ytf f = new ytf(new tnh(R.string.oneme_settings_media_video_messages_title), xw3.P0(new xtf(R.id.oneme_settings_media_video_messages_always, new tnh(R.string.oneme_settings_media_action_always)), new xtf(R.id.oneme_settings_media_video_messages_wifi, new tnh(R.string.oneme_settings_media_action_wifi)), new xtf(R.id.oneme_settings_media_video_messages_dont_load, new tnh(R.string.oneme_settings_media_action_dont_load))));
    public static final ytf g = new ytf(new tnh(R.string.oneme_settings_media_audio_messages_title), xw3.P0(new xtf(R.id.oneme_settings_media_audio_messages_always, new tnh(R.string.oneme_settings_media_action_always)), new xtf(R.id.oneme_settings_media_audio_messages_wifi, new tnh(R.string.oneme_settings_media_action_wifi)), new xtf(R.id.oneme_settings_media_audio_messages_dont_load, new tnh(R.string.oneme_settings_media_action_dont_load))));
    public final tnh b;
    public final List c;

    public ytf(tnh tnhVar, List list) {
        super(17);
        this.b = tnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytf)) {
            return false;
        }
        ytf ytfVar = (ytf) obj;
        return this.b.equals(ytfVar.b) && this.c.equals(ytfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b.c) * 31);
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ")";
    }
}
