package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import defpackage.eu6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final int PERIODIC_KEY_FRAME_INTERVAL_S = 3600;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HardwareVideoEncoderFactory";
    public static volatile BitrateAdjusterFactory bitrateAdjusterFactory;
    private final Predicate<MediaCodecInfo> codecAllowedPredicate;
    private final CropAndScaleParamsProvider cropAndScaleParamsProvider;
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;
    private final HardwareVideoEncoderExceptionHandler exceptionHandler;
    private final boolean isSimulcastEnabled;
    private final EglBase14.Context sharedContext;
    public static ArrayList<String> odklSupportedH264HwCodecPrefixes = new ArrayList<>();
    public static final BitrateAdjusterFactory defaultBitrateAdjusterFactory = new eu6(18);
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    private static final HardwareVideoEncoderExceptionHandler DEFAULT_EXCEPTION_HANDLER = new eu6(19);

    /* JADX INFO: renamed from: org.webrtc.HardwareVideoEncoderFactory$1 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType;

        static {
            int[] iArr = new int[VideoCodecMimeType.values().length];
            $SwitchMap$org$webrtc$VideoCodecMimeType = iArr;
            try {
                iArr[VideoCodecMimeType.VP8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[VideoCodecMimeType.VP9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[VideoCodecMimeType.H264.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[VideoCodecMimeType.H265.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[VideoCodecMimeType.AV1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, Predicate<MediaCodecInfo> predicate, boolean z3, CropAndScaleParamsProvider cropAndScaleParamsProvider, HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        if (context instanceof EglBase14.Context) {
            this.sharedContext = (EglBase14.Context) context;
        } else {
            Logging.w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.sharedContext = null;
        }
        this.enableIntelVp8Encoder = z;
        this.enableH264HighProfile = z2;
        this.codecAllowedPredicate = predicate;
        this.isSimulcastEnabled = z3;
        this.cropAndScaleParamsProvider = cropAndScaleParamsProvider;
        this.exceptionHandler = hardwareVideoEncoderExceptionHandler == null ? DEFAULT_EXCEPTION_HANDLER : hardwareVideoEncoderExceptionHandler;
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        BitrateAdjusterFactory bitrateAdjusterFactory2 = bitrateAdjusterFactory;
        return bitrateAdjusterFactory2 != null ? bitrateAdjusterFactory2.createBitrateAdjuster(videoCodecMimeType, str) : defaultBitrateAdjusterFactory.createBitrateAdjuster(videoCodecMimeType, str);
    }

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    private int getForcedKeyFrameIntervalMs(VideoCodecMimeType videoCodecMimeType, String str) {
        return (videoCodecMimeType == VideoCodecMimeType.VP8 && str.startsWith("OMX.qcom.")) ? 15000 : 0;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        return false;
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        int i = AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i == 2) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i != 3) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        for (int i = 0; i < odklSupportedH264HwCodecPrefixes.size(); i++) {
            if (name.startsWith(odklSupportedH264HwCodecPrefixes.get(i))) {
                return true;
            }
        }
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        return name.startsWith("OMX.Intel.") && this.enableIntelVp8Encoder;
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    private boolean isMediaCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate<MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        return MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) != null && isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecMimeType) && isMediaCodecAllowed(mediaCodecInfo);
    }

    public static /* synthetic */ BitrateAdjuster lambda$static$0(VideoCodecMimeType videoCodecMimeType, String str) {
        if (str.startsWith("OMX.Exynos.")) {
            return videoCodecMimeType == VideoCodecMimeType.VP8 ? new DynamicBitrateAdjuster() : new FramerateBitrateAdjuster();
        }
        return new BaseBitrateAdjuster();
    }

    public static /* synthetic */ void lambda$static$1(Throwable th) {
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecMimeType videoCodecMimeTypeValueOf = VideoCodecMimeType.valueOf(videoCodecInfo.getName());
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecMimeTypeValueOf);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        String name = mediaCodecInfoFindCodecForType.getName();
        String strMimeType = videoCodecMimeTypeValueOf.mimeType();
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        Integer numSelectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (videoCodecMimeTypeValueOf == VideoCodecMimeType.H264) {
            boolean zIsSameH264Profile = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(videoCodecMimeTypeValueOf, true));
            boolean zIsSameH264Profile2 = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(videoCodecMimeTypeValueOf, false));
            if (!zIsSameH264Profile && !zIsSameH264Profile2) {
                return null;
            }
            if (zIsSameH264Profile && !isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                return null;
            }
        }
        return (!this.isSimulcastEnabled || this.cropAndScaleParamsProvider == null) ? new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, videoCodecMimeTypeValueOf, numSelectColorFormat, numSelectColorFormat2, videoCodecInfo.params, PERIODIC_KEY_FRAME_INTERVAL_S, getForcedKeyFrameIntervalMs(videoCodecMimeTypeValueOf, name), createBitrateAdjuster(videoCodecMimeTypeValueOf, name), this.sharedContext, this.exceptionHandler) : new HardwareVideoEncoderV2(new MediaCodecWrapperFactoryImpl(), name, videoCodecMimeTypeValueOf, numSelectColorFormat, numSelectColorFormat2, videoCodecInfo.params, PERIODIC_KEY_FRAME_INTERVAL_S, getForcedKeyFrameIntervalMs(videoCodecMimeTypeValueOf, name), createBitrateAdjuster(videoCodecMimeTypeValueOf, name), this.sharedContext, this.cropAndScaleParamsProvider, this.exceptionHandler);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecMimeType[] videoCodecMimeTypeArr = {VideoCodecMimeType.VP8, VideoCodecMimeType.VP9, VideoCodecMimeType.H264, VideoCodecMimeType.AV1, VideoCodecMimeType.H265};
        for (int i = 0; i < 5; i++) {
            VideoCodecMimeType videoCodecMimeType = videoCodecMimeTypeArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecMimeType);
            if (mediaCodecInfoFindCodecForType != null) {
                String strName = videoCodecMimeType.name();
                if (videoCodecMimeType == VideoCodecMimeType.H264 && isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                    arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecMimeType, true)));
                }
                arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecMimeType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, CropAndScaleParamsProvider cropAndScaleParamsProvider, HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        this(context, z, z2, null, z3, cropAndScaleParamsProvider, hardwareVideoEncoderExceptionHandler);
    }

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z, boolean z2, boolean z3, CropAndScaleParamsProvider cropAndScaleParamsProvider, HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        this(null, z, z2, null, z3, cropAndScaleParamsProvider, hardwareVideoEncoderExceptionHandler);
    }
}
