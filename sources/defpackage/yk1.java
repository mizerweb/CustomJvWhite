package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewStub;
import androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
import androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.devmenu.tools.ChatInfoDevWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yk1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:155:0x0333  */
    /* JADX WARN: Code duplicated, block: B:167:0x0366  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:316:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:355:0x0650  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.af7
    public final Object invoke() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i = this.a;
        boolean z11 = true;
        boolean z12 = true;
        final int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                final al1 al1Var = (al1) obj;
                View view = al1Var.a;
                Drawable drawable = ((ph4) view).getContext().getDrawable(R.drawable.icon_call_fill);
                awb awbVar = awb.a;
                Context context = ((ph4) view).getContext();
                cf7 cf7Var = new cf7() { // from class: zk1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) {
                        int i3;
                        int i4 = i2;
                        a8g a8gVar = pq3.j;
                        al1 al1Var2 = al1Var;
                        switch (i4) {
                            case 0:
                                a8gVar.h(al1Var2.a);
                                i3 = -1;
                                break;
                            default:
                                a8gVar.h(al1Var2.a);
                                i3 = 0;
                                break;
                        }
                        return Integer.valueOf(i3);
                    }
                };
                final int i3 = z11 ? 1 : 0;
                return new qk0(drawable, awbVar, context, cf7Var, new cf7() { // from class: zk1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) {
                        int i4;
                        int i5 = i3;
                        a8g a8gVar = pq3.j;
                        al1 al1Var2 = al1Var;
                        switch (i5) {
                            case 0:
                                a8gVar.h(al1Var2.a);
                                i4 = -1;
                                break;
                            default:
                                a8gVar.h(al1Var2.a);
                                i4 = 0;
                                break;
                        }
                        return Integer.valueOf(i4);
                    }
                }, 32);
            case 1:
                ou7 ou7Var = CallIncomingScreen.m;
                return new svj((CallIncomingScreen) obj, 1);
            case 2:
                Context context2 = ((co1) obj).a;
                da9 da9Var = new da9(context2, pq3.j.k(context2).b.getIcon().f);
                da9Var.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                return da9Var;
            case 3:
                ((wo1) obj).f.set(false);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallInviteToP2PController", "Success enable invite to p2p feature.", null);
                    }
                }
                return sbi.a;
            case 4:
                return Long.valueOf(((s7f) ((et3) ((ny8) ((op1) obj).d.b).getValue())).t());
            case 5:
                Boolean bool = (Boolean) ((e5d) ((vq1) obj).g.getValue()).J0.a(e5d.S6[86]).i();
                bool.getClass();
                return bool;
            case 6:
                dr1 dr1Var = (dr1) obj;
                m mVar = dr1Var.g;
                ny8 ny8Var = dr1Var.k;
                xd1 xd1Var = dr1Var.c;
                y8j y8jVar = dr1Var.a;
                boolean zA = ((f5d) ((wo6) ny8Var.getValue())).a();
                y8j y8jVar2 = dr1Var.a;
                ViewStub viewStub = dr1Var.b;
                xd1 xd1Var2 = dr1Var.c;
                if (!zA) {
                    zsi zsiVar = new zsi(y8jVar2, viewStub, xd1Var2, dr1Var.f, mVar, dr1Var.h);
                    y8jVar.setOrientation(1);
                    xd1Var.setHintTextVisibility(true);
                    return zsiVar;
                }
                xy7 xy7Var = new xy7(y8jVar2, viewStub, xd1Var2, dr1Var.d, dr1Var.e, dr1Var.f, mVar, dr1Var.i, dr1Var.j);
                y8jVar.setOrientation(0);
                xd1Var.setHintTextVisibility(false);
                y8jVar.setOffscreenPageLimit(3);
                return xy7Var;
            case 7:
                CallPresettingsScreen callPresettingsScreen = (CallPresettingsScreen) obj;
                zv8[] zv8VarArr = CallPresettingsScreen.i;
                return new sbf(pq3.j.e(callPresettingsScreen.getContext()).m(), new ot4(17, callPresettingsScreen), null, null, null, 60);
            case 8:
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) obj;
                ew1 ew1Var = (ew1) callRateBottomSheet.z.getAccessor().c(848);
                vv vvVar = callRateBottomSheet.u;
                zv8[] zv8VarArr2 = CallRateBottomSheet.F;
                zv8 zv8Var = zv8VarArr2[0];
                String str = (String) vvVar.a(callRateBottomSheet);
                vv vvVar2 = callRateBottomSheet.v;
                zv8 zv8Var2 = zv8VarArr2[1];
                boolean zBooleanValue = ((Boolean) vvVar2.a(callRateBottomSheet)).booleanValue();
                vv vvVar3 = callRateBottomSheet.w;
                zv8 zv8Var3 = zv8VarArr2[2];
                boolean zBooleanValue2 = ((Boolean) vvVar3.a(callRateBottomSheet)).booleanValue();
                vv vvVar4 = callRateBottomSheet.x;
                zv8 zv8Var4 = zv8VarArr2[3];
                return new dw1(str, zBooleanValue, zBooleanValue2, (List) vvVar4.a(callRateBottomSheet), ew1Var.a);
            case 9:
                int i4 = ((h02) obj).c.i ? 6 : 8;
                a aVar = new a();
                aVar.setMaxRecycledViews(1, i4);
                return aVar;
            case 10:
                i32 i32Var = (i32) obj;
                return new h32(i32Var.a, i32Var.c, i32Var.d, i32Var.e, i32Var.f, i32Var.g, i32Var.h, i32Var.i, i32Var.j, i32Var.l, i32Var.m, i32Var.k, i32Var.n);
            case 11:
                CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) obj;
                f42 f42Var = (f42) callTopPanelWidget.b.getAccessor().c(859);
                return new e42((h02) callTopPanelWidget.a.getValue(), f42Var.a, f42Var.b);
            case 12:
                uw uwVar = ((u52) obj).e;
                synchronized (uwVar) {
                    j = uwVar.c;
                }
                return Boolean.valueOf(j == BuildConfig.MAX_TIME_TO_UPLOAD);
            case 13:
                k4f k4fVar = (k4f) ((ec1) obj).c;
                return Integer.valueOf((k4fVar.j || k4fVar.i) ? 4 : 6);
            case 14:
                Size[] sizeArrA = ((CamcorderProfileResolutionQuirk) obj).a.a(34);
                Object objAsList = sizeArrA != null ? Arrays.asList(sizeArrA) : r66.a;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "supportedResolutions = " + objAsList);
                }
                return objAsList;
            case 15:
                return (ke2) ((dc2) obj).d.get();
            case 16:
                ch2 ch2Var = (ch2) obj;
                q2e q2eVar = q2e.c;
                q2eVar.getClass();
                try {
                    p2e p2eVar = (p2e) q2eVar.a.f().get();
                    ArrayList arrayList = new ArrayList();
                    bg2 bg2Var = ch2Var.a;
                    if (bg2Var == null) {
                        if (tvj.f(6, "CXCP")) {
                            Log.e("CXCP", "Failed to enable quirks: camera metadata injection failed");
                        }
                        return new s2e(arrayList);
                    }
                    bg2.U.getClass();
                    if (p2eVar.a(AeFpsRangeLegacyQuirk.class, ag2.b(bg2Var))) {
                        arrayList.add(new AeFpsRangeLegacyQuirk(bg2Var));
                    }
                    if ((Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && Build.VERSION.SDK_INT < 33) {
                        Integer num = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num != null && num.intValue() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (p2eVar.a(AfRegionFlipHorizontallyQuirk.class, z)) {
                        arrayList.add(new AfRegionFlipHorizontallyQuirk());
                    }
                    ag2.b(bg2Var);
                    if (p2eVar.a(AspectRatioLegacyApi21Quirk.class, false)) {
                        arrayList.add(new AspectRatioLegacyApi21Quirk());
                    }
                    if (p2eVar.a(CamcorderProfileResolutionQuirk.class, ag2.b(bg2Var))) {
                        arrayList.add(new CamcorderProfileResolutionQuirk(ch2Var.b));
                    }
                    if (CameraNoResponseWhenEnablingFlashQuirk.a.contains(Build.MODEL.toUpperCase(Locale.ROOT))) {
                        Integer num2 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num2 != null && num2.intValue() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (p2eVar.a(CameraNoResponseWhenEnablingFlashQuirk.class, z2)) {
                        arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
                    }
                    if (p2eVar.a(CaptureSessionStuckQuirk.class, false)) {
                        arrayList.add(new CaptureSessionStuckQuirk());
                    }
                    if (p2eVar.a(CloseCaptureSessionOnVideoQuirk.class, true)) {
                        arrayList.add(new CloseCaptureSessionOnVideoQuirk());
                    }
                    if (p2eVar.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ag2.b(bg2Var))) {
                        arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
                    }
                    if (p2eVar.a(FinalizeSessionOnCloseQuirk.class, true)) {
                        arrayList.add(new FinalizeSessionOnCloseQuirk());
                    }
                    Iterator it = FlashTooSlowQuirk.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (z5h.K0(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next(), false)) {
                                Integer num3 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                                if (num3 != null && num3.intValue() == 1) {
                                    z3 = true;
                                }
                            }
                        }
                        z3 = false;
                    }
                    if (p2eVar.a(FlashTooSlowQuirk.class, z3)) {
                        arrayList.add(new FlashTooSlowQuirk());
                    }
                    List list = ImageCaptureFailWithAutoFlashQuirk.a;
                    String str2 = Build.MODEL;
                    Locale locale = Locale.ROOT;
                    if (list.contains(str2.toLowerCase(locale))) {
                        Integer num4 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num4 != null && num4.intValue() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    if (p2eVar.a(ImageCaptureFailWithAutoFlashQuirk.class, z4)) {
                        arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
                    }
                    if (ImageCaptureFlashNotFireQuirk.b.contains(str2.toLowerCase(locale))) {
                        Integer num5 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num5 != null && num5.intValue() == 0) {
                            b = true;
                        } else {
                            b = false;
                        }
                    } else {
                        b = false;
                    }
                    if (p2eVar.a(ImageCaptureFlashNotFireQuirk.class, b == true || ImageCaptureFlashNotFireQuirk.a.contains(str2.toLowerCase(locale)))) {
                        arrayList.add(new ImageCaptureFlashNotFireQuirk());
                    }
                    if (ImageCaptureWashedOutImageQuirk.a.contains(str2.toUpperCase(locale))) {
                        Integer num6 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num6 != null && num6.intValue() == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = false;
                    }
                    if (p2eVar.a(ImageCaptureWashedOutImageQuirk.class, z5)) {
                        arrayList.add(new ImageCaptureWashedOutImageQuirk());
                    }
                    if (ImageCaptureWithFlashUnderexposureQuirk.a.contains(str2.toLowerCase(locale))) {
                        Integer num7 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num7 != null && num7.intValue() == 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    if (p2eVar.a(ImageCaptureWithFlashUnderexposureQuirk.class, z6)) {
                        arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
                    }
                    if (p2eVar.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.a.contains(Build.DEVICE.toLowerCase(locale)))) {
                        arrayList.add(new JpegHalCorruptImageQuirk());
                    }
                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = JpegCaptureDownsizingQuirk.a;
                    if (JpegCaptureDownsizingQuirk.b.contains(str2.toLowerCase(locale))) {
                        Integer num8 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num8 != null && num8.intValue() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else {
                        z7 = false;
                    }
                    if (p2eVar.a(JpegCaptureDownsizingQuirk.class, z7)) {
                        arrayList.add(jpegCaptureDownsizingQuirk);
                    }
                    bg2.U.getClass();
                    if (p2eVar.a(PreviewOrientationIncorrectQuirk.class, ag2.b(bg2Var))) {
                        arrayList.add(new PreviewOrientationIncorrectQuirk());
                    }
                    if (p2eVar.a(TextureViewIsClosedQuirk.class, false)) {
                        arrayList.add(new TextureViewIsClosedQuirk());
                    }
                    Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Build.MODEL.toUpperCase(Locale.ROOT).equals((String) it2.next())) {
                                Integer num9 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                                if (num9 != null && num9.intValue() == 0) {
                                    z8 = true;
                                }
                            }
                        }
                        z8 = false;
                    }
                    if (p2eVar.a(TorchFlashRequiredFor3aUpdateQuirk.class, z8)) {
                        arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk());
                    }
                    String str3 = Build.MANUFACTURER;
                    if (p2eVar.a(YuvImageOnePixelShiftQuirk.class, ((str3.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "MotoG3".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-J700F".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-A920F".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-J415F".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi")) && "Mi A1".equalsIgnoreCase(Build.MODEL))))))) {
                        arrayList.add(new YuvImageOnePixelShiftQuirk());
                    }
                    if (p2eVar.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ((str3.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Oppo") || Build.BRAND.equalsIgnoreCase("Oppo")) && "A37F".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                        arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
                    }
                    if (p2eVar.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, str3.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei"))) {
                        arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
                    }
                    if (str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) {
                        bg2.U.getClass();
                        if (ag2.b(bg2Var)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                    if (p2eVar.a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, z9)) {
                        arrayList.add(new QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk());
                    }
                    if (p2eVar.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, r2m.b() || r2m.c() || r2m.h() || r2m.e() || ("pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29) || r2m.d() || r2m.g() || r2m.f() || fsl.b())) {
                        arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
                    }
                    String str4 = Build.MODEL;
                    if ("Pixel 8".equalsIgnoreCase(str4)) {
                        Integer num10 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                        if (num10 != null && num10.intValue() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (p2eVar.a(TemporalNoiseQuirk.class, z10)) {
                        arrayList.add(new TemporalNoiseQuirk());
                    }
                    if (p2eVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.a.contains(str4.toLowerCase(Locale.ROOT)) || fsl.b() || ((str3.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "FIG-LX1".equalsIgnoreCase(str4)))) {
                        arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
                    }
                    if (p2eVar.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, brk.b())) {
                        arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
                    }
                    List list2 = UltraWideFlashCaptureUnderexposureQuirk.a;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        z12 = false;
                    } else {
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (z5h.K0(Build.MODEL.toLowerCase(Locale.ROOT), (String) it3.next(), false)) {
                                    Integer num11 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.LENS_FACING);
                                    if (num11 == null || num11.intValue() != 1) {
                                    }
                                }
                            }
                            z12 = false;
                        }
                    }
                    if (p2eVar.a(UltraWideFlashCaptureUnderexposureQuirk.class, z12)) {
                        arrayList.add(new UltraWideFlashCaptureUnderexposureQuirk());
                    }
                    s2e s2eVar = new s2e(arrayList);
                    tvj.a("CameraQuirks", "camera2 CameraQuirks = " + s2e.d(s2eVar));
                    return s2eVar;
                } catch (InterruptedException | ExecutionException e) {
                    throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
                }
            case 17:
                hj2 hj2Var = (hj2) obj;
                w09 w09VarN0 = lvb.n0(hj2Var.d.a);
                ghb ghbVar = ew5.b;
                return new sd7(w09VarN0, qe7.O(10, lw5.SECONDS), new vi2(0, hj2Var), new vi2(1, hj2Var));
            case 18:
                return (zli) ((pm2) obj).h.get();
            case 19:
                return (pm2) ((rm2) obj).a.get();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                String str5 = ((un2) obj).g;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str5, "goToAppUpdateSource: no browser for RuStore url", null);
                    }
                }
                return sbi.a;
            case 21:
                qcd[] qcdVarArr = ((xo2) obj).a;
                ArrayList arrayList2 = new ArrayList(qcdVarArr.length);
                int length = qcdVarArr.length;
                while (i2 < length) {
                    arrayList2.add(String.valueOf(qcdVarArr[i2].b()));
                    i2++;
                }
                return new l6g("chained:".concat(ww3.z1(ww3.L1(arrayList2), null, null, null, null, 63)));
            case 22:
                op2 op2Var = (op2) obj;
                njf njfVar = op2Var.a;
                return cqk.D((njfVar != null ? njfVar : null).i(), op2Var.h);
            case 23:
                ar2 ar2Var = (ar2) obj;
                njf njfVar2 = ar2Var.a;
                return cqk.D((njfVar2 != null ? njfVar2 : null).i(), ar2Var.h);
            case 24:
                return (gr4) obj;
            case 25:
                return (xn3) ((ChatInfoDevWidget) obj).a.getAccessor().c(144);
            case 26:
                return n03.u((n03) obj);
            case 27:
                v23 v23Var = (v23) obj;
                int i5 = pq3.j.h(v23Var).getIcon().e;
                Drawable drawableMutate = v23Var.getContext().getDrawable(R.drawable.icon_eye_crossed_fill).mutate();
                sb8.m0(i5, drawableMutate);
                return drawableMutate;
            case 28:
                return new fmd((jcd) ((ga3) obj).u.getValue());
            default:
                return Integer.valueOf(pq3.j.h((ia3) obj).getText().h);
        }
    }
}
