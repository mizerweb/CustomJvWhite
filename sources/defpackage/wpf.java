package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.IOException;
import one.me.sdk.ringtone.player.MediaSource$SoundConfigException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wpf implements z4a {
    @Override // defpackage.z4a
    public final boolean t(MediaPlayer mediaPlayer, Context context) {
        try {
            mediaPlayer.setDataSource(context.getResources().openRawResourceFd(R.raw.call_incoming));
            return true;
        } catch (IOException e) {
            gm0.X("SettingRingtoneViewModel", e, e.getMessage(), new Object[0]);
            return false;
        } catch (IllegalStateException e2) {
            gm0.X("SettingRingtoneViewModel", new MediaSource$SoundConfigException(e2), e2.getMessage(), new Object[0]);
            return false;
        }
    }
}
