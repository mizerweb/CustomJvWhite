package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class le6 {
    public static final ue6[] c;
    public static final ue6[][] d;
    public static final HashSet e;
    public static final String f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        ue6[] ue6VarArr = {new ue6(np0.n, "ImageWidth", 3, 4), new ue6(257, "ImageLength", 3, 4), new ue6("Make", 271, 2), new ue6("Model", 272, 2), new ue6("Orientation", 274, 3), new ue6("XResolution", 282, 5), new ue6("YResolution", 283, 5), new ue6("ResolutionUnit", 296, 3), new ue6("Software", HttpStatus.SC_USE_PROXY, 2), new ue6("DateTime", 306, 2), new ue6("YCbCrPositioning", 531, 3), new ue6("SubIFDPointer", 330, 4), new ue6("ExifIFDPointer", 34665, 4), new ue6("GPSInfoIFDPointer", 34853, 4)};
        ue6[] ue6VarArr2 = {new ue6("ExposureTime", 33434, 5), new ue6("FNumber", 33437, 5), new ue6("ExposureProgram", 34850, 3), new ue6("PhotographicSensitivity", 34855, 3), new ue6("SensitivityType", 34864, 3), new ue6("ExifVersion", 36864, 2), new ue6("DateTimeOriginal", 36867, 2), new ue6("DateTimeDigitized", 36868, 2), new ue6("ComponentsConfiguration", 37121, 7), new ue6("ShutterSpeedValue", 37377, 10), new ue6("ApertureValue", 37378, 5), new ue6("BrightnessValue", 37379, 10), new ue6("ExposureBiasValue", 37380, 10), new ue6("MaxApertureValue", 37381, 5), new ue6("MeteringMode", 37383, 3), new ue6("LightSource", 37384, 3), new ue6("Flash", 37385, 3), new ue6("FocalLength", 37386, 5), new ue6("SubSecTime", 37520, 2), new ue6("SubSecTimeOriginal", 37521, 2), new ue6("SubSecTimeDigitized", 37522, 2), new ue6("FlashpixVersion", 40960, 7), new ue6("ColorSpace", 40961, 3), new ue6(40962, "PixelXDimension", 3, 4), new ue6(40963, "PixelYDimension", 3, 4), new ue6("InteroperabilityIFDPointer", 40965, 4), new ue6("FocalPlaneResolutionUnit", 41488, 3), new ue6("SensingMethod", 41495, 3), new ue6("FileSource", 41728, 7), new ue6("SceneType", 41729, 7), new ue6("CustomRendered", 41985, 3), new ue6("ExposureMode", 41986, 3), new ue6("WhiteBalance", 41987, 3), new ue6("SceneCaptureType", 41990, 3), new ue6("Contrast", 41992, 3), new ue6("Saturation", 41993, 3), new ue6("Sharpness", 41994, 3)};
        ue6[] ue6VarArr3 = {new ue6("GPSVersionID", 0, 1), new ue6("GPSLatitudeRef", 1, 2), new ue6(2, "GPSLatitude", 5, 10), new ue6("GPSLongitudeRef", 3, 2), new ue6(4, "GPSLongitude", 5, 10), new ue6("GPSAltitudeRef", 5, 1), new ue6("GPSAltitude", 6, 5), new ue6("GPSTimeStamp", 7, 5), new ue6("GPSSpeedRef", 12, 2), new ue6("GPSTrackRef", 14, 2), new ue6("GPSImgDirectionRef", 16, 2), new ue6("GPSDestBearingRef", 23, 2), new ue6("GPSDestDistanceRef", 25, 2)};
        c = new ue6[]{new ue6("SubIFDPointer", 330, 4), new ue6("ExifIFDPointer", 34665, 4), new ue6("GPSInfoIFDPointer", 34853, 4), new ue6("InteroperabilityIFDPointer", 40965, 4)};
        d = new ue6[][]{ue6VarArr, ue6VarArr2, ue6VarArr3, new ue6[]{new ue6("InteroperabilityIndex", 1, 2)}};
        e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public le6(ByteOrder byteOrder, ArrayList arrayList) {
        qyj.l("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        qyj.j(i, c0a.k(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), 0, 4);
        return (Map) this.a.get(i);
    }
}
