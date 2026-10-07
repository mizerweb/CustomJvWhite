package defpackage;

import android.os.Build;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.Size;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r2m {
    public static final Size a(CropAndScaleParamsProvider.CropAndScaleParams cropAndScaleParams) {
        return new Size(cropAndScaleParams.getScaleWidth(), cropAndScaleParams.getScaleHeight());
    }

    public static boolean b() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Blu") || Build.BRAND.equalsIgnoreCase("Blu")) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean c() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Itel") || Build.BRAND.equalsIgnoreCase("Itel")) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Positivo") || Build.BRAND.equalsIgnoreCase("Positivo")) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && z5h.K0(Build.MODEL, "SM-A536", false);
    }

    public static boolean g() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    public static boolean h() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo")) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }
}
