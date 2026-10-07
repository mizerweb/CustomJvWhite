package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import androidx.core.widget.NestedScrollView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kwk {
    public static u70 a(AudioManager audioManager, p70 p70Var) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(p70Var.c());
        HashMap map = new HashMap();
        map.put(2, new HashSet(k4m.a(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfileJ = hg.j(directProfilesForAttributes.get(i));
            if (audioProfileJ.getEncapsulationType() != 1) {
                int format = audioProfileJ.getFormat();
                if (vqi.O(format) || u70.e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(k4m.a(audioProfileJ.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(k4m.a(audioProfileJ.getChannelMasks())));
                    }
                }
            }
        }
        z88 z88VarL = c98.l();
        for (Map.Entry entry : map.entrySet()) {
            z88VarL.c(new t70(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new u70(z88VarL.h());
    }

    public static boolean b(NestedScrollView nestedScrollView) {
        return nestedScrollView.getClipToPadding();
    }

    public static AudioDeviceInfo c(AudioManager audioManager, p70 p70Var) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(p70Var.c());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }
}
