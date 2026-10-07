package defpackage;

import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.media.EncoderProfiles;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u4 {
    public static hh0 a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new gh0(audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile(), audioProfile.getMediaType()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new ih0(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return hh0.e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static PackageInfo b(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object d(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static fx5 e(bg2 bg2Var) {
        Long l = (Long) ((qb2) bg2Var).c(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (fx5) gx5.a.get(l);
        }
        return null;
    }

    public static Serializable f(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static Serializable g(Intent intent, String str, Class cls) {
        return intent.getSerializableExtra(str, cls);
    }

    public static String h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList j(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void k(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
