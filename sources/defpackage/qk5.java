package defpackage;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import one.me.mediaeditor.PhotoEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qk5 implements ug4 {
    public final /* synthetic */ int a;

    public /* synthetic */ qk5(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x026d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0280  */
    /* JADX WARN: Code duplicated, block: B:175:0x0292  */
    /* JADX WARN: Code duplicated, block: B:178:0x0296  */
    /* JADX WARN: Code duplicated, block: B:183:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    private final void a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        int i;
        p2e p2eVar = (p2e) obj;
        ArrayList arrayList = new ArrayList();
        int i2 = PixelJpegRSupportedQuirk.b;
        int i3 = Build.VERSION.SDK_INT;
        boolean z8 = true;
        if (i3 >= 34) {
            tn0 tn0Var = (tn0) BackportedFixQuirk.a.getValue();
            jx8 jx8Var = kx8.a;
            tn0Var.getClass();
            if (((Boolean) jx8Var.c.invoke()).booleanValue()) {
                i = (jx8Var.b.contains(Build.FINGERPRINT) || ((Set) ((ifh) tn0Var.a.a).getValue()).contains(5)) ? 2 : 4;
            } else {
                i = 3;
            }
            int iD = qt4.D(i);
            if (iD != 0) {
                if (iD == 1 || iD == 2) {
                    z = false;
                } else if (iD != 3) {
                    ore.o();
                    return;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (p2eVar.a(PixelJpegRSupportedQuirk.class, z)) {
            arrayList.add(new PixelJpegRSupportedQuirk());
        }
        if (CloseCameraDeviceOnCameraGraphCloseQuirk.a || CloseCameraDeviceOnCameraGraphCloseQuirk.b) {
            z2 = true;
        } else if (30 <= i3 && i3 < 34) {
            String str2 = Build.MANUFACTURER;
            if (!str2.equalsIgnoreCase("Oppo")) {
                String str3 = Build.BRAND;
                if (!str3.equalsIgnoreCase("Oppo") && !str2.equalsIgnoreCase("OnePlus") && !str3.equalsIgnoreCase("OnePlus") && !str2.equalsIgnoreCase("Realme") && !str3.equalsIgnoreCase("Realme")) {
                    if (Build.MANUFACTURER.equalsIgnoreCase("Vivo")) {
                    }
                }
            }
            z2 = true;
        } else if (!Build.MANUFACTURER.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo") || CloseCameraDeviceOnCameraGraphCloseQuirk.c || CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (p2eVar.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z2)) {
            arrayList.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
        }
        List list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a;
        String str4 = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (p2eVar.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(str4.toUpperCase(locale)))) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        String str5 = Build.MANUFACTURER;
        if (p2eVar.a(ControlZoomRatioRangeAssertionErrorQuirk.class, ((str5.equalsIgnoreCase("Jio") || Build.BRAND.equalsIgnoreCase("Jio")) && z5h.K0(str4, "LS1542QW", true)) || ((str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && (z5h.K0(str4, "SM-A025", true) || str4.equalsIgnoreCase("SM-S124DL"))) || ((str5.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo")) && str4.equalsIgnoreCase("VIVO 2039")))) {
            arrayList.add(new ControlZoomRatioRangeAssertionErrorQuirk());
        }
        boolean z9 = DisableAbortCapturesOnStopQuirk.a;
        if (str5.equalsIgnoreCase("Tecno")) {
            z3 = true;
        } else {
            String str6 = Build.BRAND;
            if (str6.equalsIgnoreCase("Tecno") || str5.equalsIgnoreCase("Tecno-mobile") || str6.equalsIgnoreCase("Tecno-mobile") || DisableAbortCapturesOnStopQuirk.a || DisableAbortCapturesOnStopQuirk.b) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (p2eVar.a(DisableAbortCapturesOnStopQuirk.class, z3)) {
            arrayList.add(new DisableAbortCapturesOnStopQuirk());
        }
        if (str5.equalsIgnoreCase("Samsung")) {
            z4 = true;
        } else {
            String str7 = Build.BRAND;
            if (str7.equalsIgnoreCase("Samsung") || str5.equalsIgnoreCase("Xiaomi") || str7.equalsIgnoreCase("Xiaomi")) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (p2eVar.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z4)) {
            arrayList.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
        }
        Set set = FlashAvailabilityBufferUnderflowQuirk.a;
        Locale locale2 = Locale.US;
        if (p2eVar.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new dx6(str5.toLowerCase(locale2), str4.toLowerCase(locale2))))) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (p2eVar.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.a.contains(str4) && (str5.equalsIgnoreCase("Google") || Build.BRAND.equalsIgnoreCase("Google")))) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        List list2 = InvalidVideoProfilesQuirk.a;
        if ((str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && z5h.K0(Build.ID, "TP1A", true)) {
            z5 = true;
        } else if (InvalidVideoProfilesQuirk.a.contains(str4.toLowerCase(locale))) {
            String str8 = Build.ID;
            if (z5h.K0(str8, "TP1A", true) || z5h.K0(str8, "TD1A", true)) {
                z5 = true;
            } else {
                if (!str5.equalsIgnoreCase("Redmi") || Build.BRAND.equalsIgnoreCase("Redmi")) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!str5.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi")) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6 || z7) {
                    str = Build.ID;
                    if (!z5h.K0(str, "TKQ1", true) || z5h.K0(str, "TP1A", true)) {
                        z5 = true;
                    } else if ((!InvalidVideoProfilesQuirk.c.contains(str4.toLowerCase(locale)) && i3 == 33) || (InvalidVideoProfilesQuirk.b.contains(str4.toLowerCase(locale)) && i3 == 33)) {
                        z5 = true;
                    }
                } else {
                    z5 = !InvalidVideoProfilesQuirk.c.contains(str4.toLowerCase(locale)) ? false : false;
                }
            }
        } else {
            if (str5.equalsIgnoreCase("Redmi")) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (str5.equalsIgnoreCase("Xiaomi")) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (z6 || z7) {
                str = Build.ID;
                if (z5h.K0(str, "TKQ1", true)) {
                }
                z5 = true;
            } else if (!InvalidVideoProfilesQuirk.c.contains(str4.toLowerCase(locale))) {
            }
        }
        if (p2eVar.a(InvalidVideoProfilesQuirk.class, z5)) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (p2eVar.a(ExcludedSupportedSizesQuirk.class, uwl.c() || uwl.d() || uwl.a() || uwl.h() || uwl.g() || uwl.e() || uwl.f() || uwl.b() || uwl.i())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
        if (p2eVar.a(ExtraCroppingQuirk.class, cxl.a())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (p2eVar.a(ExtraSupportedOutputSizeQuirk.class, (str5.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e5 play".equalsIgnoreCase(str4))) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        qbh qbhVar = ExtraSupportedSurfaceCombinationsQuirk.a;
        String str9 = Build.DEVICE;
        if (p2eVar.a(ExtraSupportedSurfaceCombinationsQuirk.class, "heroqltevzw".equalsIgnoreCase(str9) || "heroqltetmo".equalsIgnoreCase(str9) || exl.b() || exl.c())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        int i4 = Nexus4AndroidLTargetAspectRatioQuirk.a;
        if (!str5.equalsIgnoreCase("Google")) {
            Build.BRAND.equalsIgnoreCase("Google");
        }
        if (p2eVar.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        List list3 = PreviewPixelHDRnetQuirk.a;
        if (p2eVar.a(PreviewPixelHDRnetQuirk.class, (str5.equalsIgnoreCase("Google") || Build.BRAND.equalsIgnoreCase("Google")) && PreviewPixelHDRnetQuirk.a.contains(str9.toLowerCase(Locale.getDefault())))) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (p2eVar.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, (str5.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "mha-l29".equalsIgnoreCase(str4))) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (p2eVar.a(StillCaptureFlashStopRepeatingQuirk.class, (str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && z5h.K0(str4.toUpperCase(locale), "SM-A716", false))) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (p2eVar.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.a.contains(str4.toLowerCase(locale)))) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        List list4 = SurfaceOrderQuirk.a;
        if (p2eVar.a(SurfaceOrderQuirk.class, (str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && SurfaceOrderQuirk.a.contains(Build.HARDWARE.toLowerCase(Locale.getDefault())))) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (p2eVar.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        List list5 = ZslDisablerQuirk.a;
        if (((!str5.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) || !ui6.b(ZslDisablerQuirk.a)) && ((!str5.equalsIgnoreCase("Xiaomi") && !Build.BRAND.equalsIgnoreCase("Xiaomi")) || !ui6.b(ZslDisablerQuirk.b))) {
            z8 = false;
        }
        if (p2eVar.a(ZslDisablerQuirk.class, z8)) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (p2eVar.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.a.containsKey(str4.toUpperCase(locale)))) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (p2eVar.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
            arrayList.add(PreviewUnderExposureQuirk.a);
        }
        uk5.a = new s2e(arrayList);
        StringBuilder sb = new StringBuilder("camera2 DeviceQuirks = ");
        s2e s2eVar = uk5.a;
        if (s2eVar == null) {
            s2eVar = null;
        }
        sb.append(s2e.d(s2eVar));
        tvj.a("DeviceQuirks", sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:112:0x0204  */
    /* JADX WARN: Code duplicated, block: B:115:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x0238  */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:134:0x024f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0259  */
    /* JADX WARN: Code duplicated, block: B:140:0x0262  */
    /* JADX WARN: Code duplicated, block: B:143:0x0270  */
    /* JADX WARN: Code duplicated, block: B:146:0x027b  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:189:0x030b  */
    /* JADX WARN: Code duplicated, block: B:192:0x031b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0327  */
    /* JADX WARN: Code duplicated, block: B:198:0x0330  */
    /* JADX WARN: Code duplicated, block: B:201:0x033e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0344  */
    /* JADX WARN: Code duplicated, block: B:207:0x034d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0359  */
    /* JADX WARN: Code duplicated, block: B:211:0x035b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0364  */
    /* JADX WARN: Code duplicated, block: B:217:0x0376  */
    /* JADX WARN: Code duplicated, block: B:220:0x0388  */
    /* JADX WARN: Code duplicated, block: B:253:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:256:0x040c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0416  */
    /* JADX WARN: Code duplicated, block: B:262:0x041f  */
    /* JADX WARN: Code duplicated, block: B:265:0x042d  */
    /* JADX WARN: Code duplicated, block: B:268:0x0437  */
    /* JADX WARN: Code duplicated, block: B:271:0x0440  */
    /* JADX WARN: Code duplicated, block: B:274:0x044e  */
    /* JADX WARN: Code duplicated, block: B:277:0x0458  */
    /* JADX WARN: Code duplicated, block: B:280:0x0461  */
    /* JADX WARN: Code duplicated, block: B:283:0x046f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0479  */
    /* JADX WARN: Code duplicated, block: B:289:0x0482  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:292:0x0490  */
    /* JADX WARN: Code duplicated, block: B:295:0x049a  */
    /* JADX WARN: Code duplicated, block: B:298:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:301:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:304:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:307:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:310:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:313:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:316:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:319:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:323:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:326:0x0501  */
    /* JADX WARN: Code duplicated, block: B:329:0x0513  */
    /* JADX WARN: Code duplicated, block: B:332:0x0521  */
    /* JADX WARN: Code duplicated, block: B:335:0x0531  */
    /* JADX WARN: Code duplicated, block: B:338:0x053d  */
    /* JADX WARN: Code duplicated, block: B:341:0x0546  */
    /* JADX WARN: Code duplicated, block: B:344:0x0558  */
    /* JADX WARN: Code duplicated, block: B:347:0x0563  */
    /* JADX WARN: Code duplicated, block: B:350:0x056d  */
    /* JADX WARN: Code duplicated, block: B:353:0x0576  */
    /* JADX WARN: Code duplicated, block: B:356:0x0591  */
    /* JADX WARN: Code duplicated, block: B:362:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:365:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    @Override // defpackage.ug4
    public final void accept(Object obj) {
        String str;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        switch (this.a) {
            case 0:
                p2e p2eVar = (p2e) obj;
                ArrayList arrayList = new ArrayList();
                String str2 = Build.BRAND;
                if (p2eVar.a(ImageCaptureRotationOptionQuirk.class, ("HUAWEI".equalsIgnoreCase(str2) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str2) && "STK-LX1".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList.add(new ImageCaptureRotationOptionQuirk());
                }
                if (p2eVar.a(androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class, true)) {
                    arrayList.add(new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.a;
                Locale locale = Locale.US;
                String upperCase = str2.toUpperCase(locale);
                String str3 = Build.MODEL;
                if (p2eVar.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.a.contains(Pair.create(upperCase, str3.toUpperCase(locale))))) {
                    arrayList.add(new CaptureFailedRetryQuirk());
                }
                if (p2eVar.a(LowMemoryQuirk.class, LowMemoryQuirk.a.contains(str3.toUpperCase(locale)))) {
                    arrayList.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.a;
                if (p2eVar.a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str2) || ("Vivo".equalsIgnoreCase(str2) && LargeJpegImageQuirk.a.contains(str3.toUpperCase(locale))))) {
                    arrayList.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.a;
                if (p2eVar.a(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str2) && IncorrectJpegMetadataQuirk.a.contains(Build.DEVICE.toUpperCase(locale)))) {
                    arrayList.add(new IncorrectJpegMetadataQuirk());
                }
                HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.a;
                if (p2eVar.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str2) && "cph2583".equalsIgnoreCase(str3)) || ("google".equalsIgnoreCase(str2) && ImageCaptureFailedForSpecificCombinationQuirk.a.contains(str3.toLowerCase())))) {
                    arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
                }
                PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.a;
                if (p2eVar.a(PreviewGreenTintQuirk.class, "motorola".equalsIgnoreCase(str2) && "moto e20".equalsIgnoreCase(str3))) {
                    arrayList.add(previewGreenTintQuirk);
                }
                rk5.a = new s2e(arrayList);
                tvj.a("DeviceQuirks", "core DeviceQuirks = " + s2e.d(rk5.a));
                break;
            case 1:
                p2e p2eVar2 = (p2e) obj;
                ArrayList arrayList2 = new ArrayList();
                List list = MediaCodecInfoReportIncorrectInfoQuirk.a;
                String str4 = Build.BRAND;
                if (("Nokia".equalsIgnoreCase(str4) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) || (("motorola".equalsIgnoreCase(str4) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("infinix".equalsIgnoreCase(str4) && "infinix x650".equalsIgnoreCase(Build.MODEL)) || (("LGE".equalsIgnoreCase(str4) && "LG-X230".equalsIgnoreCase(Build.MODEL)) || (("Huawei".equalsIgnoreCase(str4) && "mha-l29".equalsIgnoreCase(Build.MODEL)) || (("Redmi".equalsIgnoreCase(str4) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) || ("positivo".equalsIgnoreCase(str4) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)))))))) {
                    str = "DeviceQuirks";
                } else {
                    str = "DeviceQuirks";
                    if (!MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US))) {
                        z = false;
                    }
                    if (p2eVar2.a(MediaCodecInfoReportIncorrectInfoQuirk.class, z)) {
                        arrayList2.add(new MediaCodecInfoReportIncorrectInfoQuirk());
                    }
                    i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        z2 = CameraUseInconsistentTimebaseQuirk.b.contains(Build.SOC_MODEL.toLowerCase());
                        if (p2eVar2.a(CameraUseInconsistentTimebaseQuirk.class, z2)) {
                            arrayList2.add(new CameraUseInconsistentTimebaseQuirk());
                        }
                        if (!ReportedVideoQualityNotSupportedQuirk.e() || ReportedVideoQualityNotSupportedQuirk.f() || (("Vivo".equalsIgnoreCase(str4) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ReportedVideoQualityNotSupportedQuirk.g() || ReportedVideoQualityNotSupportedQuirk.h())) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (p2eVar2.a(ReportedVideoQualityNotSupportedQuirk.class, z3)) {
                            arrayList2.add(new ReportedVideoQualityNotSupportedQuirk());
                        }
                        if ("positivo".equalsIgnoreCase(str4) || !"twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (p2eVar2.a(VideoEncoderCrashQuirk.class, z4)) {
                            arrayList2.add(new VideoEncoderCrashQuirk());
                        }
                        if (p2eVar2.a(ExcludeStretchedVideoQualityQuirk.class, (!"Samsung".equalsIgnoreCase(str4) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str4) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || ExcludeStretchedVideoQualityQuirk.f() || ExcludeStretchedVideoQualityQuirk.e()))))) {
                            arrayList2.add(new ExcludeStretchedVideoQualityQuirk());
                        }
                        if (p2eVar2.a(MediaStoreVideoCannotWrite.class, (!"positivo".equalsIgnoreCase(str4) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str4) && "itel w6004".equalsIgnoreCase(Build.MODEL)))) {
                            arrayList2.add(new MediaStoreVideoCannotWrite());
                        }
                        if ("Sony".equalsIgnoreCase(str4) || !"G3125".equalsIgnoreCase(Build.MODEL)) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (p2eVar2.a(AudioEncoderIgnoresInputTimestampQuirk.class, z5)) {
                            arrayList2.add(new AudioEncoderIgnoresInputTimestampQuirk());
                        }
                        if ("Samsung".equalsIgnoreCase(str4) || i >= 29) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (p2eVar2.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, z6)) {
                            arrayList2.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
                        }
                        if (i < 34) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (p2eVar2.a(NegativeLatLongSavesIncorrectlyQuirk.class, z7)) {
                            arrayList2.add(new NegativeLatLongSavesIncorrectlyQuirk());
                        }
                        List list2 = AudioTimestampFramePositionIncorrectQuirk.a;
                        if (p2eVar2.a(AudioTimestampFramePositionIncorrectQuirk.class, (!"oppo".equalsIgnoreCase(str4) && AudioTimestampFramePositionIncorrectQuirk.a.contains(Build.MODEL.toLowerCase(Locale.ROOT))) || ("lge".equalsIgnoreCase(str4) && "lg-m250".equalsIgnoreCase(Build.MODEL)) || (("motorola".equalsIgnoreCase(str4) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("realme".equalsIgnoreCase(str4) && "rmx1941".equalsIgnoreCase(Build.MODEL)) || (("Xiaomi".equalsIgnoreCase(str4) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str4) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ("vivo".equalsIgnoreCase(str4) && "VIVO Y17".equalsIgnoreCase(Build.MODEL)))))))) {
                            arrayList2.add(new AudioTimestampFramePositionIncorrectQuirk());
                        }
                        if ("motorola".equalsIgnoreCase(str4) || !"moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (p2eVar2.a(ExtraSupportedResolutionQuirk.class, z8)) {
                            arrayList2.add(new ExtraSupportedResolutionQuirk());
                        }
                        if ("motorola".equalsIgnoreCase(str4) || !"moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (p2eVar2.a(StretchedVideoResolutionQuirk.class, z9)) {
                            arrayList2.add(new StretchedVideoResolutionQuirk());
                        }
                        if ("Nokia".equalsIgnoreCase(str4) || !"Nokia 1".equalsIgnoreCase(Build.MODEL)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (p2eVar2.a(CodecStuckOnFlushQuirk.class, z10)) {
                            arrayList2.add(new CodecStuckOnFlushQuirk());
                        }
                        if ("motorola".equalsIgnoreCase(str4) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (p2eVar2.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, z11)) {
                            arrayList2.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
                        }
                        if ("motorola".equalsIgnoreCase(str4) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (p2eVar2.a(ExtraSupportedQualityQuirk.class, z12)) {
                            arrayList2.add(new ExtraSupportedQualityQuirk());
                        }
                        if ("Nokia".equalsIgnoreCase(str4) || !"Nokia 1".equalsIgnoreCase(Build.MODEL)) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (p2eVar2.a(SignalEosOutputBufferNotComeQuirk.class, z13)) {
                            arrayList2.add(new SignalEosOutputBufferNotComeQuirk());
                        }
                        if ("motorola".equalsIgnoreCase(str4) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (p2eVar2.a(SizeCannotEncodeVideoQuirk.class, z14)) {
                            arrayList2.add(new SizeCannotEncodeVideoQuirk());
                        }
                        if (!PreviewBlackScreenQuirk.a || PreviewBlackScreenQuirk.b) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (p2eVar2.a(PreviewBlackScreenQuirk.class, z15)) {
                            arrayList2.add(new PreviewBlackScreenQuirk());
                        }
                        if (p2eVar2.a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.b)) {
                            arrayList2.add(PrematureEndOfStreamVideoQuirk.a);
                        }
                        if (p2eVar2.a(MediaCodecDefaultDataSpaceQuirk.class, true)) {
                            arrayList2.add(new MediaCodecDefaultDataSpaceQuirk());
                        }
                        if ("samsung".equalsIgnoreCase(str4) || !"pa3q".equalsIgnoreCase(Build.DEVICE)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (p2eVar2.a(HdrRepeatingRequestFailureQuirk.class, z16)) {
                            arrayList2.add(new HdrRepeatingRequestFailureQuirk());
                        }
                        if (p2eVar2.a(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.b)) {
                            arrayList2.add(PreviewFreezeAfterHighSpeedRecordingQuirk.a);
                        }
                        if ("positivo".equalsIgnoreCase(str4) || !"twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (p2eVar2.a(GLProcessingStuckOnCodecFlushQuirk.class, z17)) {
                            arrayList2.add(GLProcessingStuckOnCodecFlushQuirk.a);
                        }
                        if (!Collections.singletonList("SM-N9208").contains(Build.MODEL.toUpperCase(Locale.getDefault())) || (z5h.G0(str4, "Samsung", true) && z5h.K0(Build.PRODUCT, "zeroflte", true))) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (p2eVar2.a(VideoInterlacingQuirk.class, z18)) {
                            arrayList2.add(VideoInterlacingQuirk.a);
                        }
                        sk5.a = new s2e(arrayList2);
                        tvj.a(str, "video DeviceQuirks = " + s2e.d(sk5.a));
                    } else {
                        HashSet hashSet5 = CameraUseInconsistentTimebaseQuirk.a;
                    }
                    if (("SAMSUNG".equalsIgnoreCase(str4) || !CameraUseInconsistentTimebaseQuirk.a.contains(Build.HARDWARE.toLowerCase())) && !CameraUseInconsistentTimebaseQuirk.c.contains(Build.MODEL.toLowerCase())) {
                    }
                    if (p2eVar2.a(CameraUseInconsistentTimebaseQuirk.class, z2)) {
                        arrayList2.add(new CameraUseInconsistentTimebaseQuirk());
                    }
                    if (ReportedVideoQualityNotSupportedQuirk.e()) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (p2eVar2.a(ReportedVideoQualityNotSupportedQuirk.class, z3)) {
                        arrayList2.add(new ReportedVideoQualityNotSupportedQuirk());
                    }
                    if ("positivo".equalsIgnoreCase(str4)) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (p2eVar2.a(VideoEncoderCrashQuirk.class, z4)) {
                        arrayList2.add(new VideoEncoderCrashQuirk());
                    }
                    if (p2eVar2.a(ExcludeStretchedVideoQualityQuirk.class, (!"Samsung".equalsIgnoreCase(str4) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str4) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || ExcludeStretchedVideoQualityQuirk.f() || ExcludeStretchedVideoQualityQuirk.e()))))) {
                        arrayList2.add(new ExcludeStretchedVideoQualityQuirk());
                    }
                    if (p2eVar2.a(MediaStoreVideoCannotWrite.class, (!"positivo".equalsIgnoreCase(str4) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str4) && "itel w6004".equalsIgnoreCase(Build.MODEL)))) {
                        arrayList2.add(new MediaStoreVideoCannotWrite());
                    }
                    if ("Sony".equalsIgnoreCase(str4)) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (p2eVar2.a(AudioEncoderIgnoresInputTimestampQuirk.class, z5)) {
                        arrayList2.add(new AudioEncoderIgnoresInputTimestampQuirk());
                    }
                    if ("Samsung".equalsIgnoreCase(str4)) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (p2eVar2.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, z6)) {
                        arrayList2.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
                    }
                    if (i < 34) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (p2eVar2.a(NegativeLatLongSavesIncorrectlyQuirk.class, z7)) {
                        arrayList2.add(new NegativeLatLongSavesIncorrectlyQuirk());
                    }
                    List list3 = AudioTimestampFramePositionIncorrectQuirk.a;
                    if (p2eVar2.a(AudioTimestampFramePositionIncorrectQuirk.class, (!"oppo".equalsIgnoreCase(str4) && AudioTimestampFramePositionIncorrectQuirk.a.contains(Build.MODEL.toLowerCase(Locale.ROOT))) || ("lge".equalsIgnoreCase(str4) && "lg-m250".equalsIgnoreCase(Build.MODEL)) || (("motorola".equalsIgnoreCase(str4) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("realme".equalsIgnoreCase(str4) && "rmx1941".equalsIgnoreCase(Build.MODEL)) || (("Xiaomi".equalsIgnoreCase(str4) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str4) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ("vivo".equalsIgnoreCase(str4) && "VIVO Y17".equalsIgnoreCase(Build.MODEL)))))))) {
                        arrayList2.add(new AudioTimestampFramePositionIncorrectQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (p2eVar2.a(ExtraSupportedResolutionQuirk.class, z8)) {
                        arrayList2.add(new ExtraSupportedResolutionQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (p2eVar2.a(StretchedVideoResolutionQuirk.class, z9)) {
                        arrayList2.add(new StretchedVideoResolutionQuirk());
                    }
                    if ("Nokia".equalsIgnoreCase(str4)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (p2eVar2.a(CodecStuckOnFlushQuirk.class, z10)) {
                        arrayList2.add(new CodecStuckOnFlushQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (p2eVar2.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, z11)) {
                        arrayList2.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (p2eVar2.a(ExtraSupportedQualityQuirk.class, z12)) {
                        arrayList2.add(new ExtraSupportedQualityQuirk());
                    }
                    if ("Nokia".equalsIgnoreCase(str4)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (p2eVar2.a(SignalEosOutputBufferNotComeQuirk.class, z13)) {
                        arrayList2.add(new SignalEosOutputBufferNotComeQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (p2eVar2.a(SizeCannotEncodeVideoQuirk.class, z14)) {
                        arrayList2.add(new SizeCannotEncodeVideoQuirk());
                    }
                    if (PreviewBlackScreenQuirk.a) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (p2eVar2.a(PreviewBlackScreenQuirk.class, z15)) {
                        arrayList2.add(new PreviewBlackScreenQuirk());
                    }
                    if (p2eVar2.a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.b)) {
                        arrayList2.add(PrematureEndOfStreamVideoQuirk.a);
                    }
                    if (p2eVar2.a(MediaCodecDefaultDataSpaceQuirk.class, true)) {
                        arrayList2.add(new MediaCodecDefaultDataSpaceQuirk());
                    }
                    if ("samsung".equalsIgnoreCase(str4)) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (p2eVar2.a(HdrRepeatingRequestFailureQuirk.class, z16)) {
                        arrayList2.add(new HdrRepeatingRequestFailureQuirk());
                    }
                    if (p2eVar2.a(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.b)) {
                        arrayList2.add(PreviewFreezeAfterHighSpeedRecordingQuirk.a);
                    }
                    if ("positivo".equalsIgnoreCase(str4)) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (p2eVar2.a(GLProcessingStuckOnCodecFlushQuirk.class, z17)) {
                        arrayList2.add(GLProcessingStuckOnCodecFlushQuirk.a);
                    }
                    if (Collections.singletonList("SM-N9208").contains(Build.MODEL.toUpperCase(Locale.getDefault()))) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (p2eVar2.a(VideoInterlacingQuirk.class, z18)) {
                        arrayList2.add(VideoInterlacingQuirk.a);
                    }
                    sk5.a = new s2e(arrayList2);
                    tvj.a(str, "video DeviceQuirks = " + s2e.d(sk5.a));
                }
                z = true;
                if (p2eVar2.a(MediaCodecInfoReportIncorrectInfoQuirk.class, z)) {
                    arrayList2.add(new MediaCodecInfoReportIncorrectInfoQuirk());
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    if (CameraUseInconsistentTimebaseQuirk.b.contains(Build.SOC_MODEL.toLowerCase())) {
                    }
                    if (p2eVar2.a(CameraUseInconsistentTimebaseQuirk.class, z2)) {
                        arrayList2.add(new CameraUseInconsistentTimebaseQuirk());
                    }
                    if (ReportedVideoQualityNotSupportedQuirk.e()) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (p2eVar2.a(ReportedVideoQualityNotSupportedQuirk.class, z3)) {
                        arrayList2.add(new ReportedVideoQualityNotSupportedQuirk());
                    }
                    if ("positivo".equalsIgnoreCase(str4)) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (p2eVar2.a(VideoEncoderCrashQuirk.class, z4)) {
                        arrayList2.add(new VideoEncoderCrashQuirk());
                    }
                    if (p2eVar2.a(ExcludeStretchedVideoQualityQuirk.class, (!"Samsung".equalsIgnoreCase(str4) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str4) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || ExcludeStretchedVideoQualityQuirk.f() || ExcludeStretchedVideoQualityQuirk.e()))))) {
                        arrayList2.add(new ExcludeStretchedVideoQualityQuirk());
                    }
                    if (p2eVar2.a(MediaStoreVideoCannotWrite.class, (!"positivo".equalsIgnoreCase(str4) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str4) && "itel w6004".equalsIgnoreCase(Build.MODEL)))) {
                        arrayList2.add(new MediaStoreVideoCannotWrite());
                    }
                    if ("Sony".equalsIgnoreCase(str4)) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (p2eVar2.a(AudioEncoderIgnoresInputTimestampQuirk.class, z5)) {
                        arrayList2.add(new AudioEncoderIgnoresInputTimestampQuirk());
                    }
                    if ("Samsung".equalsIgnoreCase(str4)) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (p2eVar2.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, z6)) {
                        arrayList2.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
                    }
                    if (i < 34) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (p2eVar2.a(NegativeLatLongSavesIncorrectlyQuirk.class, z7)) {
                        arrayList2.add(new NegativeLatLongSavesIncorrectlyQuirk());
                    }
                    List list4 = AudioTimestampFramePositionIncorrectQuirk.a;
                    if (p2eVar2.a(AudioTimestampFramePositionIncorrectQuirk.class, (!"oppo".equalsIgnoreCase(str4) && AudioTimestampFramePositionIncorrectQuirk.a.contains(Build.MODEL.toLowerCase(Locale.ROOT))) || ("lge".equalsIgnoreCase(str4) && "lg-m250".equalsIgnoreCase(Build.MODEL)) || (("motorola".equalsIgnoreCase(str4) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("realme".equalsIgnoreCase(str4) && "rmx1941".equalsIgnoreCase(Build.MODEL)) || (("Xiaomi".equalsIgnoreCase(str4) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str4) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ("vivo".equalsIgnoreCase(str4) && "VIVO Y17".equalsIgnoreCase(Build.MODEL)))))))) {
                        arrayList2.add(new AudioTimestampFramePositionIncorrectQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (p2eVar2.a(ExtraSupportedResolutionQuirk.class, z8)) {
                        arrayList2.add(new ExtraSupportedResolutionQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (p2eVar2.a(StretchedVideoResolutionQuirk.class, z9)) {
                        arrayList2.add(new StretchedVideoResolutionQuirk());
                    }
                    if ("Nokia".equalsIgnoreCase(str4)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (p2eVar2.a(CodecStuckOnFlushQuirk.class, z10)) {
                        arrayList2.add(new CodecStuckOnFlushQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (p2eVar2.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, z11)) {
                        arrayList2.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (p2eVar2.a(ExtraSupportedQualityQuirk.class, z12)) {
                        arrayList2.add(new ExtraSupportedQualityQuirk());
                    }
                    if ("Nokia".equalsIgnoreCase(str4)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (p2eVar2.a(SignalEosOutputBufferNotComeQuirk.class, z13)) {
                        arrayList2.add(new SignalEosOutputBufferNotComeQuirk());
                    }
                    if ("motorola".equalsIgnoreCase(str4)) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (p2eVar2.a(SizeCannotEncodeVideoQuirk.class, z14)) {
                        arrayList2.add(new SizeCannotEncodeVideoQuirk());
                    }
                    if (PreviewBlackScreenQuirk.a) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (p2eVar2.a(PreviewBlackScreenQuirk.class, z15)) {
                        arrayList2.add(new PreviewBlackScreenQuirk());
                    }
                    if (p2eVar2.a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.b)) {
                        arrayList2.add(PrematureEndOfStreamVideoQuirk.a);
                    }
                    if (p2eVar2.a(MediaCodecDefaultDataSpaceQuirk.class, true)) {
                        arrayList2.add(new MediaCodecDefaultDataSpaceQuirk());
                    }
                    if ("samsung".equalsIgnoreCase(str4)) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (p2eVar2.a(HdrRepeatingRequestFailureQuirk.class, z16)) {
                        arrayList2.add(new HdrRepeatingRequestFailureQuirk());
                    }
                    if (p2eVar2.a(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.b)) {
                        arrayList2.add(PreviewFreezeAfterHighSpeedRecordingQuirk.a);
                    }
                    if ("positivo".equalsIgnoreCase(str4)) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (p2eVar2.a(GLProcessingStuckOnCodecFlushQuirk.class, z17)) {
                        arrayList2.add(GLProcessingStuckOnCodecFlushQuirk.a);
                    }
                    if (Collections.singletonList("SM-N9208").contains(Build.MODEL.toUpperCase(Locale.getDefault()))) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (p2eVar2.a(VideoInterlacingQuirk.class, z18)) {
                        arrayList2.add(VideoInterlacingQuirk.a);
                    }
                    sk5.a = new s2e(arrayList2);
                    tvj.a(str, "video DeviceQuirks = " + s2e.d(sk5.a));
                } else {
                    HashSet hashSet6 = CameraUseInconsistentTimebaseQuirk.a;
                }
                if ("SAMSUNG".equalsIgnoreCase(str4)) {
                }
                if (p2eVar2.a(CameraUseInconsistentTimebaseQuirk.class, z2)) {
                    arrayList2.add(new CameraUseInconsistentTimebaseQuirk());
                }
                if (ReportedVideoQualityNotSupportedQuirk.e()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (p2eVar2.a(ReportedVideoQualityNotSupportedQuirk.class, z3)) {
                    arrayList2.add(new ReportedVideoQualityNotSupportedQuirk());
                }
                if ("positivo".equalsIgnoreCase(str4)) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (p2eVar2.a(VideoEncoderCrashQuirk.class, z4)) {
                    arrayList2.add(new VideoEncoderCrashQuirk());
                }
                if (p2eVar2.a(ExcludeStretchedVideoQualityQuirk.class, (!"Samsung".equalsIgnoreCase(str4) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str4) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str4) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || ExcludeStretchedVideoQualityQuirk.f() || ExcludeStretchedVideoQualityQuirk.e()))))) {
                    arrayList2.add(new ExcludeStretchedVideoQualityQuirk());
                }
                if (p2eVar2.a(MediaStoreVideoCannotWrite.class, (!"positivo".equalsIgnoreCase(str4) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str4) && "itel w6004".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList2.add(new MediaStoreVideoCannotWrite());
                }
                if ("Sony".equalsIgnoreCase(str4)) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (p2eVar2.a(AudioEncoderIgnoresInputTimestampQuirk.class, z5)) {
                    arrayList2.add(new AudioEncoderIgnoresInputTimestampQuirk());
                }
                if ("Samsung".equalsIgnoreCase(str4)) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (p2eVar2.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, z6)) {
                    arrayList2.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
                }
                if (i < 34) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (p2eVar2.a(NegativeLatLongSavesIncorrectlyQuirk.class, z7)) {
                    arrayList2.add(new NegativeLatLongSavesIncorrectlyQuirk());
                }
                List list5 = AudioTimestampFramePositionIncorrectQuirk.a;
                if (p2eVar2.a(AudioTimestampFramePositionIncorrectQuirk.class, (!"oppo".equalsIgnoreCase(str4) && AudioTimestampFramePositionIncorrectQuirk.a.contains(Build.MODEL.toLowerCase(Locale.ROOT))) || ("lge".equalsIgnoreCase(str4) && "lg-m250".equalsIgnoreCase(Build.MODEL)) || (("motorola".equalsIgnoreCase(str4) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("realme".equalsIgnoreCase(str4) && "rmx1941".equalsIgnoreCase(Build.MODEL)) || (("Xiaomi".equalsIgnoreCase(str4) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str4) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ("vivo".equalsIgnoreCase(str4) && "VIVO Y17".equalsIgnoreCase(Build.MODEL)))))))) {
                    arrayList2.add(new AudioTimestampFramePositionIncorrectQuirk());
                }
                if ("motorola".equalsIgnoreCase(str4)) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (p2eVar2.a(ExtraSupportedResolutionQuirk.class, z8)) {
                    arrayList2.add(new ExtraSupportedResolutionQuirk());
                }
                if ("motorola".equalsIgnoreCase(str4)) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (p2eVar2.a(StretchedVideoResolutionQuirk.class, z9)) {
                    arrayList2.add(new StretchedVideoResolutionQuirk());
                }
                if ("Nokia".equalsIgnoreCase(str4)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (p2eVar2.a(CodecStuckOnFlushQuirk.class, z10)) {
                    arrayList2.add(new CodecStuckOnFlushQuirk());
                }
                if ("motorola".equalsIgnoreCase(str4)) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (p2eVar2.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, z11)) {
                    arrayList2.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
                }
                if ("motorola".equalsIgnoreCase(str4)) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (p2eVar2.a(ExtraSupportedQualityQuirk.class, z12)) {
                    arrayList2.add(new ExtraSupportedQualityQuirk());
                }
                if ("Nokia".equalsIgnoreCase(str4)) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (p2eVar2.a(SignalEosOutputBufferNotComeQuirk.class, z13)) {
                    arrayList2.add(new SignalEosOutputBufferNotComeQuirk());
                }
                if ("motorola".equalsIgnoreCase(str4)) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (p2eVar2.a(SizeCannotEncodeVideoQuirk.class, z14)) {
                    arrayList2.add(new SizeCannotEncodeVideoQuirk());
                }
                if (PreviewBlackScreenQuirk.a) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (p2eVar2.a(PreviewBlackScreenQuirk.class, z15)) {
                    arrayList2.add(new PreviewBlackScreenQuirk());
                }
                if (p2eVar2.a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.b)) {
                    arrayList2.add(PrematureEndOfStreamVideoQuirk.a);
                }
                if (p2eVar2.a(MediaCodecDefaultDataSpaceQuirk.class, true)) {
                    arrayList2.add(new MediaCodecDefaultDataSpaceQuirk());
                }
                if ("samsung".equalsIgnoreCase(str4)) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (p2eVar2.a(HdrRepeatingRequestFailureQuirk.class, z16)) {
                    arrayList2.add(new HdrRepeatingRequestFailureQuirk());
                }
                if (p2eVar2.a(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.b)) {
                    arrayList2.add(PreviewFreezeAfterHighSpeedRecordingQuirk.a);
                }
                if ("positivo".equalsIgnoreCase(str4)) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (p2eVar2.a(GLProcessingStuckOnCodecFlushQuirk.class, z17)) {
                    arrayList2.add(GLProcessingStuckOnCodecFlushQuirk.a);
                }
                if (Collections.singletonList("SM-N9208").contains(Build.MODEL.toUpperCase(Locale.getDefault()))) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (p2eVar2.a(VideoInterlacingQuirk.class, z18)) {
                    arrayList2.add(VideoInterlacingQuirk.a);
                }
                sk5.a = new s2e(arrayList2);
                tvj.a(str, "video DeviceQuirks = " + s2e.d(sk5.a));
                break;
            case 2:
                p2e p2eVar3 = (p2e) obj;
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str5 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str5)) {
                        String str6 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str6) && !"Q2Q".equalsIgnoreCase(str6)) {
                            z19 = (!"OPPO".equalsIgnoreCase(str5) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) || ("LENOVO".equalsIgnoreCase(str5) && "Q706F".equalsIgnoreCase(Build.DEVICE));
                        }
                    } else if (!"OPPO".equalsIgnoreCase(str5)) {
                    }
                }
                if (p2eVar3.a(SurfaceViewStretchedQuirk.class, z19)) {
                    arrayList3.add(new SurfaceViewStretchedQuirk());
                }
                if (p2eVar3.a(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                    arrayList3.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                tk5.a = new s2e(arrayList3);
                tvj.a("DeviceQuirks", "view DeviceQuirks = " + s2e.d(tk5.a));
                break;
            case 3:
                a(obj);
                break;
            case 4:
                qvc qvcVar = (qvc) obj;
                zv8[] zv8VarArr = PhotoEditScreen.s1;
                if (qvcVar != null) {
                    c36 c36Var = qvcVar.b;
                    g36 g36Var = c36Var.a;
                    ArrayList arrayList4 = c36Var.d;
                    if (!arrayList4.isEmpty()) {
                        hb hbVar = (hb) qv1.f(1, arrayList4);
                        hbVar.a(g36Var);
                        arrayList4.remove(hbVar);
                        c36Var.e.add(hbVar);
                        c36Var.i = true;
                        g36Var.invalidate();
                        c36Var.c();
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                gm0.V("VideoMessageCameraEffect", "Failed init camera effect", (Throwable) obj);
                break;
        }
    }
}
