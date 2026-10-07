package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.vk.push.core.base.AidlException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.http.HttpStatus;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class se6 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final String[] R;
    public static final int[] S;
    public static final byte[] T;
    public static final pe6 U;
    public static final pe6[][] V;
    public static final pe6[] W;
    public static final HashMap[] X;
    public static final HashMap[] Y;
    public static final Set Z;
    public static final HashMap a0;
    public static final Charset b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final Pattern e0;
    public static final Pattern f0;
    public static final Pattern g0;
    public static final boolean v = Log.isLoggable("ExifInterface", 3);
    public static final int[] w;
    public static final int[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public oe6 t;
    public boolean u;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        w = new int[]{8, 8, 8};
        x = new int[]{8};
        y = new byte[]{-1, -40, -1};
        z = new byte[]{102, 116, 121, 112};
        A = new byte[]{109, 105, 102, 49};
        B = new byte[]{104, 101, 105, 99};
        C = new byte[]{97, 118, 105, 102};
        D = new byte[]{97, 118, 105, 115};
        E = new byte[]{79, 76, 89, 77, 80, 0};
        F = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        G = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        H = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        I = new byte[]{82, 73, 70, 70};
        J = new byte[]{87, 69, 66, 80};
        K = new byte[]{69, 88, 73, 70};
        L = new byte[]{-99, 1, 42};
        M = "VP8X".getBytes(Charset.defaultCharset());
        N = "VP8L".getBytes(Charset.defaultCharset());
        O = "VP8 ".getBytes(Charset.defaultCharset());
        P = "ANIM".getBytes(Charset.defaultCharset());
        Q = "ANMF".getBytes(Charset.defaultCharset());
        R = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        S = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        T = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        pe6[] pe6VarArr = {new pe6("NewSubfileType", 254, 4), new pe6("SubfileType", 255, 4), new pe6(np0.n, "ImageWidth", 3, 4), new pe6(257, "ImageLength", 3, 4), new pe6("BitsPerSample", 258, 3), new pe6("Compression", 259, 3), new pe6("PhotometricInterpretation", 262, 3), new pe6("ImageDescription", 270, 2), new pe6("Make", 271, 2), new pe6("Model", 272, 2), new pe6(273, "StripOffsets", 3, 4), new pe6("Orientation", 274, 3), new pe6("SamplesPerPixel", 277, 3), new pe6(278, "RowsPerStrip", 3, 4), new pe6(279, "StripByteCounts", 3, 4), new pe6("XResolution", 282, 5), new pe6("YResolution", 283, 5), new pe6("PlanarConfiguration", 284, 3), new pe6("ResolutionUnit", 296, 3), new pe6("TransferFunction", 301, 3), new pe6("Software", HttpStatus.SC_USE_PROXY, 2), new pe6("DateTime", 306, 2), new pe6("Artist", 315, 2), new pe6("WhitePoint", 318, 5), new pe6("PrimaryChromaticities", 319, 5), new pe6("SubIFDPointer", 330, 4), new pe6("JPEGInterchangeFormat", 513, 4), new pe6("JPEGInterchangeFormatLength", 514, 4), new pe6("YCbCrCoefficients", 529, 5), new pe6("YCbCrSubSampling", 530, 3), new pe6("YCbCrPositioning", 531, 3), new pe6("ReferenceBlackWhite", 532, 5), new pe6("Copyright", 33432, 2), new pe6("ExifIFDPointer", 34665, 4), new pe6("GPSInfoIFDPointer", 34853, 4), new pe6("SensorTopBorder", 4, 4), new pe6("SensorLeftBorder", 5, 4), new pe6("SensorBottomBorder", 6, 4), new pe6("SensorRightBorder", 7, 4), new pe6("ISO", 23, 3), new pe6("JpgFromRaw", 46, 7), new pe6("Xmp", 700, 1)};
        pe6[] pe6VarArr2 = {new pe6("ExposureTime", 33434, 5), new pe6("FNumber", 33437, 5), new pe6("ExposureProgram", 34850, 3), new pe6("SpectralSensitivity", 34852, 2), new pe6("PhotographicSensitivity", 34855, 3), new pe6("OECF", 34856, 7), new pe6("SensitivityType", 34864, 3), new pe6("StandardOutputSensitivity", 34865, 4), new pe6("RecommendedExposureIndex", 34866, 4), new pe6("ISOSpeed", 34867, 4), new pe6("ISOSpeedLatitudeyyy", 34868, 4), new pe6("ISOSpeedLatitudezzz", 34869, 4), new pe6("ExifVersion", 36864, 2), new pe6("DateTimeOriginal", 36867, 2), new pe6("DateTimeDigitized", 36868, 2), new pe6("OffsetTime", 36880, 2), new pe6("OffsetTimeOriginal", 36881, 2), new pe6("OffsetTimeDigitized", 36882, 2), new pe6("ComponentsConfiguration", 37121, 7), new pe6("CompressedBitsPerPixel", 37122, 5), new pe6("ShutterSpeedValue", 37377, 10), new pe6("ApertureValue", 37378, 5), new pe6("BrightnessValue", 37379, 10), new pe6("ExposureBiasValue", 37380, 10), new pe6("MaxApertureValue", 37381, 5), new pe6("SubjectDistance", 37382, 5), new pe6("MeteringMode", 37383, 3), new pe6("LightSource", 37384, 3), new pe6("Flash", 37385, 3), new pe6("FocalLength", 37386, 5), new pe6("SubjectArea", 37396, 3), new pe6("MakerNote", 37500, 7), new pe6("UserComment", 37510, 7), new pe6("SubSecTime", 37520, 2), new pe6("SubSecTimeOriginal", 37521, 2), new pe6("SubSecTimeDigitized", 37522, 2), new pe6("FlashpixVersion", 40960, 7), new pe6("ColorSpace", 40961, 3), new pe6(40962, "PixelXDimension", 3, 4), new pe6(40963, "PixelYDimension", 3, 4), new pe6("RelatedSoundFile", 40964, 2), new pe6("InteroperabilityIFDPointer", 40965, 4), new pe6("FlashEnergy", 41483, 5), new pe6("SpatialFrequencyResponse", 41484, 7), new pe6("FocalPlaneXResolution", 41486, 5), new pe6("FocalPlaneYResolution", 41487, 5), new pe6("FocalPlaneResolutionUnit", 41488, 3), new pe6("SubjectLocation", 41492, 3), new pe6("ExposureIndex", 41493, 5), new pe6("SensingMethod", 41495, 3), new pe6("FileSource", 41728, 7), new pe6("SceneType", 41729, 7), new pe6("CFAPattern", 41730, 7), new pe6("CustomRendered", 41985, 3), new pe6("ExposureMode", 41986, 3), new pe6("WhiteBalance", 41987, 3), new pe6("DigitalZoomRatio", 41988, 5), new pe6("FocalLengthIn35mmFilm", 41989, 3), new pe6("SceneCaptureType", 41990, 3), new pe6("GainControl", 41991, 3), new pe6("Contrast", 41992, 3), new pe6("Saturation", 41993, 3), new pe6("Sharpness", 41994, 3), new pe6("DeviceSettingDescription", 41995, 7), new pe6("SubjectDistanceRange", 41996, 3), new pe6("ImageUniqueID", 42016, 2), new pe6("CameraOwnerName", 42032, 2), new pe6("BodySerialNumber", 42033, 2), new pe6("LensSpecification", 42034, 5), new pe6("LensMake", 42035, 2), new pe6("LensModel", 42036, 2), new pe6("Gamma", 42240, 5), new pe6("DNGVersion", 50706, 1), new pe6(50720, "DefaultCropSize", 3, 4)};
        pe6[] pe6VarArr3 = {new pe6("GPSVersionID", 0, 1), new pe6("GPSLatitudeRef", 1, 2), new pe6(2, "GPSLatitude", 5, 10), new pe6("GPSLongitudeRef", 3, 2), new pe6(4, "GPSLongitude", 5, 10), new pe6("GPSAltitudeRef", 5, 1), new pe6("GPSAltitude", 6, 5), new pe6("GPSTimeStamp", 7, 5), new pe6("GPSSatellites", 8, 2), new pe6("GPSStatus", 9, 2), new pe6("GPSMeasureMode", 10, 2), new pe6("GPSDOP", 11, 5), new pe6("GPSSpeedRef", 12, 2), new pe6("GPSSpeed", 13, 5), new pe6("GPSTrackRef", 14, 2), new pe6("GPSTrack", 15, 5), new pe6("GPSImgDirectionRef", 16, 2), new pe6("GPSImgDirection", 17, 5), new pe6("GPSMapDatum", 18, 2), new pe6("GPSDestLatitudeRef", 19, 2), new pe6("GPSDestLatitude", 20, 5), new pe6("GPSDestLongitudeRef", 21, 2), new pe6("GPSDestLongitude", 22, 5), new pe6("GPSDestBearingRef", 23, 2), new pe6("GPSDestBearing", 24, 5), new pe6("GPSDestDistanceRef", 25, 2), new pe6("GPSDestDistance", 26, 5), new pe6("GPSProcessingMethod", 27, 7), new pe6("GPSAreaInformation", 28, 7), new pe6("GPSDateStamp", 29, 2), new pe6("GPSDifferential", 30, 3), new pe6("GPSHPositioningError", 31, 5)};
        pe6[] pe6VarArr4 = {new pe6("InteroperabilityIndex", 1, 2)};
        pe6[] pe6VarArr5 = {new pe6("NewSubfileType", 254, 4), new pe6("SubfileType", 255, 4), new pe6(np0.n, "ThumbnailImageWidth", 3, 4), new pe6(257, "ThumbnailImageLength", 3, 4), new pe6("BitsPerSample", 258, 3), new pe6("Compression", 259, 3), new pe6("PhotometricInterpretation", 262, 3), new pe6("ImageDescription", 270, 2), new pe6("Make", 271, 2), new pe6("Model", 272, 2), new pe6(273, "StripOffsets", 3, 4), new pe6("ThumbnailOrientation", 274, 3), new pe6("SamplesPerPixel", 277, 3), new pe6(278, "RowsPerStrip", 3, 4), new pe6(279, "StripByteCounts", 3, 4), new pe6("XResolution", 282, 5), new pe6("YResolution", 283, 5), new pe6("PlanarConfiguration", 284, 3), new pe6("ResolutionUnit", 296, 3), new pe6("TransferFunction", 301, 3), new pe6("Software", HttpStatus.SC_USE_PROXY, 2), new pe6("DateTime", 306, 2), new pe6("Artist", 315, 2), new pe6("WhitePoint", 318, 5), new pe6("PrimaryChromaticities", 319, 5), new pe6("SubIFDPointer", 330, 4), new pe6("JPEGInterchangeFormat", 513, 4), new pe6("JPEGInterchangeFormatLength", 514, 4), new pe6("YCbCrCoefficients", 529, 5), new pe6("YCbCrSubSampling", 530, 3), new pe6("YCbCrPositioning", 531, 3), new pe6("ReferenceBlackWhite", 532, 5), new pe6("Copyright", 33432, 2), new pe6("ExifIFDPointer", 34665, 4), new pe6("GPSInfoIFDPointer", 34853, 4), new pe6("DNGVersion", 50706, 1), new pe6(50720, "DefaultCropSize", 3, 4)};
        U = new pe6("StripOffsets", 273, 3);
        V = new pe6[][]{pe6VarArr, pe6VarArr2, pe6VarArr3, pe6VarArr4, pe6VarArr5, pe6VarArr, new pe6[]{new pe6("ThumbnailImage", np0.n, 7), new pe6("CameraSettingsIFDPointer", 8224, 4), new pe6("ImageProcessingIFDPointer", 8256, 4)}, new pe6[]{new pe6("PreviewImageStart", 257, 4), new pe6("PreviewImageLength", 258, 4)}, new pe6[]{new pe6("AspectFrame", 4371, 3)}, new pe6[]{new pe6("ColorSpace", 55, 3)}};
        W = new pe6[]{new pe6("SubIFDPointer", 330, 4), new pe6("ExifIFDPointer", 34665, 4), new pe6("GPSInfoIFDPointer", 34853, 4), new pe6("InteroperabilityIFDPointer", 40965, 4), new pe6("CameraSettingsIFDPointer", 8224, 1), new pe6("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[10];
        Y = new HashMap[10];
        Z = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        a0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        b0 = charsetForName;
        c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            pe6[][] pe6VarArr6 = V;
            if (i >= pe6VarArr6.length) {
                HashMap map = a0;
                pe6[] pe6VarArr7 = W;
                map.put(Integer.valueOf(pe6VarArr7[0].a), 5);
                map.put(Integer.valueOf(pe6VarArr7[1].a), 1);
                map.put(Integer.valueOf(pe6VarArr7[2].a), 2);
                map.put(Integer.valueOf(pe6VarArr7[3].a), 3);
                map.put(Integer.valueOf(pe6VarArr7[4].a), 7);
                map.put(Integer.valueOf(pe6VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            X[i] = new HashMap();
            Y[i] = new HashMap();
            for (pe6 pe6Var : pe6VarArr6[i]) {
                X[i].put(Integer.valueOf(pe6Var.a), pe6Var);
                Y[i].put(pe6Var.b, pe6Var);
            }
            i++;
        }
    }

    public se6(FileDescriptor fileDescriptor) throws Throwable {
        boolean z2;
        pe6[][] pe6VarArr = V;
        this.f = new HashMap[pe6VarArr.length];
        this.g = new HashSet(pe6VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (fileDescriptor == null) {
            ore.n("fileDescriptor cannot be null");
            throw null;
        }
        this.c = null;
        this.a = null;
        if (s(fileDescriptor)) {
            this.b = fileDescriptor;
            try {
                fileDescriptor = Os.dup(fileDescriptor);
                z2 = true;
            } catch (Exception e) {
                throw new IOException("Failed to duplicate file descriptor", e);
            }
        } else {
            this.b = null;
            z2 = false;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(fileDescriptor);
            try {
                u(fileInputStream2);
                ywl.b(fileInputStream2);
                if (z2) {
                    ywl.a(fileDescriptor);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                ywl.b(fileInputStream);
                if (z2) {
                    ywl.a(fileDescriptor);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Pair q(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairQ2 = q(strArrSplit[i]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static boolean s(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static ByteOrder x(ne6 ne6Var) throws IOException {
        short s = ne6Var.readShort();
        boolean z2 = v;
        if (s == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            eu6.d(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void A(String str) {
        for (int i = 0; i < V.length; i++) {
            this.f[i].remove(str);
        }
    }

    public final void B(int i, String str, String str2) {
        HashMap[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (oe6) map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2 A[Catch: all -> 0x00e9, Exception -> 0x00ed, TRY_ENTER, TryCatch #19 {Exception -> 0x00ed, all -> 0x00e9, blocks: (B:79:0x00e2, B:86:0x00fb, B:85:0x00f0), top: B:134:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0 A[Catch: all -> 0x00e9, Exception -> 0x00ed, TryCatch #19 {Exception -> 0x00ed, all -> 0x00e9, blocks: (B:79:0x00e2, B:86:0x00fb, B:85:0x00f0), top: B:134:0x00e0 }] */
    public final void C() {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        boolean z2;
        FileOutputStream fileOutputStream2;
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream2;
        int i = this.d;
        if (i != 4 && i != 13 && i != 14) {
            qr7.k("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
            return;
        }
        String str = this.a;
        FileDescriptor fileDescriptor = this.b;
        if (fileDescriptor == null && str == null) {
            qr7.k("ExifInterface does not support saving attributes for the current input.");
            return;
        }
        if (this.i && this.j && !this.k) {
            qr7.k("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            return;
        }
        int i2 = this.o;
        FileInputStream fileInputStream3 = null;
        BufferedOutputStream bufferedOutputStream = null;
        FileInputStream fileInputStream4 = null;
        BufferedInputStream bufferedInputStream2 = null;
        fileInputStream3 = null;
        this.n = (i2 == 6 || i2 == 7) ? o() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (str != null) {
                fileInputStream = new FileInputStream(str);
            } else {
                Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(fileDescriptor);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    ywl.e(fileInputStream, fileOutputStream);
                    ywl.b(fileInputStream);
                    ywl.b(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream5 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (str != null) {
                                        fileOutputStream2 = new FileOutputStream(str);
                                    } else {
                                        Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(fileDescriptor);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream5);
                                        try {
                                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i3 = this.d;
                                                if (i3 == 4) {
                                                    D(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 13) {
                                                    E(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 14) {
                                                    F(bufferedInputStream, bufferedOutputStream);
                                                }
                                                ywl.b(bufferedInputStream);
                                                ywl.b(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.n = null;
                                            } catch (Exception e) {
                                                e = e;
                                                fileInputStream4 = fileInputStream5;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (str != null) {
                                                            fileOutputStream2 = new FileOutputStream(str);
                                                        } else {
                                                            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream2 = new FileOutputStream(fileDescriptor);
                                                        }
                                                        ywl.e(fileInputStream2, fileOutputStream2);
                                                        ywl.b(fileInputStream2);
                                                        ywl.b(fileOutputStream2);
                                                        throw new IOException("Failed to save new file", e);
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        fileInputStream4 = fileInputStream2;
                                                        z2 = true;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            try {
                                                                ywl.b(fileInputStream4);
                                                                ywl.b(fileOutputStream2);
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                bufferedInputStream2 = bufferedInputStream;
                                                                ywl.b(bufferedInputStream2);
                                                                ywl.b(bufferedOutputStream);
                                                                if (!z2) {
                                                                    fileCreateTempFile.delete();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        fileInputStream4 = fileInputStream2;
                                                        z2 = false;
                                                        ywl.b(fileInputStream4);
                                                        ywl.b(fileOutputStream2);
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            bufferedOutputStream = null;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            bufferedInputStream2 = bufferedInputStream;
                                            z2 = false;
                                            ywl.b(bufferedInputStream2);
                                            ywl.b(bufferedOutputStream);
                                            if (!z2) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        bufferedInputStream = null;
                                        bufferedOutputStream = bufferedInputStream;
                                        fileInputStream4 = fileInputStream5;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (str != null) {
                                            fileOutputStream2 = new FileOutputStream(str);
                                        } else {
                                            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream2 = new FileOutputStream(fileDescriptor);
                                        }
                                        ywl.e(fileInputStream2, fileOutputStream2);
                                        ywl.b(fileInputStream2);
                                        ywl.b(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    fileOutputStream2 = null;
                                    bufferedInputStream = null;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                z2 = false;
                                ywl.b(bufferedInputStream2);
                                ywl.b(bufferedOutputStream);
                                if (!z2) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            fileOutputStream2 = null;
                            bufferedInputStream = null;
                            bufferedOutputStream = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e8) {
                    e = e8;
                    fileInputStream3 = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        ywl.b(fileInputStream3);
                        ywl.b(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    fileInputStream3 = fileInputStream;
                    ywl.b(fileInputStream3);
                    ywl.b(fileOutputStream);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b;
        byte[] bArr;
        if (v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ne6 ne6Var = new ne6(bufferedInputStream);
        t61 t61Var = new t61(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (ne6Var.readByte() != -1) {
            qr7.k("Invalid marker");
            return;
        }
        t61Var.b(-1);
        if (ne6Var.readByte() != -40) {
            qr7.k("Invalid marker");
            return;
        }
        t61Var.b(-40);
        t61Var.b(-1);
        t61Var.b(-31);
        this.p = L(t61Var);
        oe6 oe6Var = this.t;
        byte[] bArr2 = d0;
        if (oe6Var != null) {
            t61Var.write(-1);
            t61Var.b(-31);
            t61Var.A(bArr2.length + 2 + this.t.d.length);
            t61Var.write(bArr2);
            t61Var.write(this.t.d);
            this.u = true;
        }
        byte[] bArr3 = new byte[np0.r];
        while (ne6Var.readByte() == -1) {
            do {
                b = ne6Var.readByte();
            } while (b == -1);
            if (b == -39 || b == -38) {
                t61Var.b(-1);
                t61Var.b(b);
                ywl.e(ne6Var, t61Var);
                return;
            }
            if (b != -31) {
                t61Var.b(-1);
                t61Var.b(b);
                int unsignedShort = ne6Var.readUnsignedShort();
                t61Var.A(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    qr7.k("Invalid length");
                    return;
                }
                while (i > 0) {
                    int i2 = ne6Var.read(bArr3, 0, Math.min(i, np0.r));
                    if (i2 < 0) {
                        break;
                    }
                    t61Var.write(bArr3, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = ne6Var.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    qr7.k("Invalid length");
                    return;
                }
                int length2 = bArr2.length;
                byte[] bArr4 = c0;
                if (length >= length2) {
                    bArr = new byte[bArr2.length];
                } else {
                    bArr = length >= bArr4.length ? new byte[bArr4.length] : null;
                }
                if (bArr != null) {
                    ne6Var.readFully(bArr);
                    if (ywl.g(bArr, bArr4) || ywl.g(bArr, bArr2)) {
                        ne6Var.b(length - bArr.length);
                    }
                }
                t61Var.b(-1);
                t61Var.b(b);
                t61Var.A(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    t61Var.write(bArr);
                }
                while (length > 0) {
                    int i3 = ne6Var.read(bArr3, 0, Math.min(length, np0.r));
                    if (i3 < 0) {
                        break;
                    }
                    t61Var.write(bArr3, 0, i3);
                    length -= i3;
                }
            }
        }
        qr7.k("Invalid marker");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0041 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0041
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void E(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = defpackage.se6.v
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L24:
            ne6 r0 = new ne6
            r0.<init>(r9)
            t61 r9 = new t61
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = defpackage.se6.G
            int r10 = r10.length
            defpackage.ywl.d(r0, r9, r10)
            oe6 r10 = r8.t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L40
            boolean r10 = r8.u
            if (r10 == 0) goto L75
        L40:
            r10 = r1
        L41:
            if (r1 != 0) goto L4a
            if (r10 == 0) goto L46
            goto L4a
        L46:
            defpackage.ywl.e(r0, r9)
            return
        L4a:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L77
            r9.g(r3)
            r9.g(r4)
            int r3 = r3 + 4
            defpackage.ywl.d(r0, r9, r3)
            int r3 = r8.p
            if (r3 != 0) goto L6a
            r8.M(r9)
            r1 = r2
        L6a:
            oe6 r3 = r8.t
            if (r3 == 0) goto L41
            boolean r3 = r8.u
            if (r3 != 0) goto L41
            r8.N(r9)
        L75:
            r10 = r2
            goto L41
        L77:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L88
            if (r1 == 0) goto L88
            r8.M(r9)
            int r3 = r3 + 4
            r0.b(r3)
            r1 = r2
            goto L41
        L88:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lba
            byte[] r5 = defpackage.se6.H
            int r6 = r5.length
            if (r3 < r6) goto Lba
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lad
            oe6 r10 = r8.t
            if (r10 == 0) goto La9
            r8.N(r9)
        La9:
            r0.b(r6)
            goto L75
        Lad:
            r9.g(r3)
            r9.g(r4)
            r9.write(r7)
            defpackage.ywl.d(r0, r9, r6)
            goto L41
        Lba:
            r9.g(r3)
            r9.g(r4)
            int r3 = r3 + 4
            defpackage.ywl.d(r0, r9, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se6.E(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void F(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se6.F(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f9 A[LOOP:2: B:142:0x02f6->B:144:0x02f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x0318 A[LOOP:3: B:146:0x0316->B:147:0x0318, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x032e  */
    /* JADX WARN: Code duplicated, block: B:152:0x033a A[LOOP:4: B:150:0x0337->B:152:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0382 A[LOOP:5: B:154:0x0380->B:155:0x0382, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b2 A[LOOP:6: B:158:0x03af->B:160:0x03b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x03d1 A[LOOP:7: B:162:0x03cf->B:163:0x03d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f9 A[LOOP:8: B:166:0x03f6->B:168:0x03f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x042b  */
    /* JADX WARN: Code duplicated, block: B:173:0x043c A[LOOP:9: B:171:0x0439->B:173:0x043c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0453  */
    /* JADX WARN: Code duplicated, block: B:178:0x0464 A[LOOP:10: B:176:0x0461->B:178:0x0464, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x047b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0489  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x02da, please report this as an issue */
    public final void G(String str, String str2) {
        String str3;
        boolean z2;
        String str4;
        pe6 pe6Var;
        int[] iArr;
        String[] strArrSplit;
        int[] iArr2;
        int i;
        String[] strArrSplit2;
        long[] jArr;
        int i2;
        int i3;
        String[] strArrSplit3;
        qe6[] qe6VarArr;
        int i4;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i5;
        ByteBuffer byteBufferWrap;
        int i6;
        String[] strArrSplit5;
        int length2;
        qe6[] qe6VarArr2;
        int i7;
        ByteBuffer byteBufferWrap2;
        int i8;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i9;
        ByteBuffer byteBufferWrap3;
        int i10;
        qe6 qe6Var;
        long j;
        long j2;
        String strReplaceAll = str2;
        boolean zEquals = "ISOSpeedRatings".equals(str);
        boolean z3 = v;
        if (zEquals) {
            if (z3) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        } else {
            str3 = str;
        }
        String str5 = "/";
        if (strReplaceAll == null) {
            z2 = z3;
            str4 = "/";
        } else if (!Z.contains(str3) || strReplaceAll.contains("/")) {
            z2 = z3;
            str4 = "/";
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = e0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean zFind = f0.matcher(strReplaceAll).find();
                boolean zFind2 = g0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        } else {
            try {
                double d = Double.parseDouble(strReplaceAll);
                long j3 = 1;
                if (d >= 9.223372036854776E18d || d <= -9.223372036854776E18d) {
                    z2 = z3;
                    str4 = "/";
                    qe6Var = new qe6(d > 0.0d ? BuildConfig.MAX_TIME_TO_UPLOAD : Long.MIN_VALUE, 1L);
                } else {
                    double dAbs = Math.abs(d);
                    long j4 = 0;
                    long j5 = 1;
                    double d2 = dAbs;
                    long j6 = 0;
                    while (true) {
                        double d3 = d2 % 1.0d;
                        long j7 = (long) (d2 - d3);
                        str4 = str5;
                        j = (j7 * j3) + j6;
                        j2 = (j7 * j4) + j5;
                        d2 = 1.0d / d3;
                        z2 = z3;
                        if (Math.abs(dAbs - (j / j2)) <= 1.0E-8d * dAbs) {
                            break;
                        }
                        z3 = z2;
                        j5 = j4;
                        j4 = j2;
                        j6 = j3;
                        j3 = j;
                        str5 = str4;
                    }
                    if (d < 0.0d) {
                        j = -j;
                    }
                    qe6Var = new qe6(j, j2);
                }
                strReplaceAll = qe6Var.toString();
            } catch (NumberFormatException unused) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
        }
        boolean zEquals2 = "Xmp".equals(str3);
        int i11 = 12;
        int i12 = 9;
        int i13 = 4;
        HashMap[] mapArr = this.f;
        int i14 = 0;
        if (zEquals2) {
            boolean z4 = mapArr[0].containsKey("Xmp") || mapArr[5].containsKey("Xmp");
            int i15 = this.d;
            char c = i15 != 4 ? (i15 == 9 || i15 == 15 || i15 == 12 || i15 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c == 2 && (this.t != null || !z4)) || (c == 3 && !z4)) {
                this.t = strReplaceAll != null ? oe6.a(strReplaceAll) : null;
                return;
            }
        }
        int i16 = 0;
        while (i16 < V.length) {
            if ((i16 != i13 || this.i) && (pe6Var = (pe6) Y[i16].get(str3)) != null) {
                int i17 = pe6Var.d;
                int i18 = pe6Var.c;
                if (strReplaceAll != null) {
                    Pair pairQ = q(strReplaceAll);
                    int i19 = -1;
                    if (i18 == ((Integer) pairQ.first).intValue() || i18 == ((Integer) pairQ.second).intValue()) {
                        i17 = i18;
                        iArr = S;
                        switch (i17) {
                            case 1:
                                str4 = str4;
                                mapArr[i16].put(str3, oe6.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i16].put(str3, oe6.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i < strArrSplit.length) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i16].put(str3, oe6.g(iArr2, this.h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i2 < strArrSplit2.length) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i16].put(str3, oe6.d(jArr, this.h));
                                break;
                            case 5:
                                i3 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                qe6VarArr = new qe6[strArrSplit3.length];
                                i4 = i14;
                                while (i4 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i4].split(str4, i3);
                                    qe6VarArr[i4] = new qe6((long) Double.parseDouble(strArrSplit7[i14]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i4++;
                                    i3 = -1;
                                }
                                mapArr[i16].put(str3, oe6.e(qe6VarArr, this.h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z2) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i17);
                                }
                                break;
                            case 9:
                                int i20 = i12;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i5 < strArrSplit4.length) {
                                    iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                }
                                HashMap map = mapArr[i16];
                                ByteOrder byteOrder = this.h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i20] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i6 < length) {
                                    byteBufferWrap.putInt(iArr3[i6]);
                                }
                                map.put(str3, new oe6(i20, byteBufferWrap.array(), length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                qe6VarArr2 = new qe6[length2];
                                i7 = i14;
                                while (i7 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i7].split(str4, i19);
                                    qe6VarArr2[i7] = new qe6((long) Double.parseDouble(strArrSplit8[i14]), (long) Double.parseDouble(strArrSplit8[1]));
                                    i7++;
                                    i12 = i12;
                                    strArrSplit5 = strArrSplit5;
                                    i19 = -1;
                                }
                                HashMap map2 = mapArr[i16];
                                ByteOrder byteOrder2 = this.h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i8 < length2) {
                                    qe6 qe6Var2 = qe6VarArr2[i8];
                                    byteBufferWrap2.putInt((int) qe6Var2.a);
                                    byteBufferWrap2.putInt((int) qe6Var2.b);
                                }
                                map2.put(str3, new oe6(10, byteBufferWrap2.array(), length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i9 < strArrSplit6.length) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap map3 = mapArr[i16];
                                ByteOrder byteOrder3 = this.h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i11] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                while (i10 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map3.put(str3, new oe6(i11, byteBufferWrap3.array(), length3));
                                break;
                        }
                    } else if (i17 != -1 && (i17 == ((Integer) pairQ.first).intValue() || i17 == ((Integer) pairQ.second).intValue())) {
                        i14 = i14;
                        iArr = S;
                        switch (i17) {
                            case 1:
                                str4 = str4;
                                mapArr[i16].put(str3, oe6.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i16].put(str3, oe6.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i = i14; i < strArrSplit.length; i++) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i16].put(str3, oe6.g(iArr2, this.h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i2 = i14; i2 < strArrSplit2.length; i2++) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i16].put(str3, oe6.d(jArr, this.h));
                                break;
                            case 5:
                                i3 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                qe6VarArr = new qe6[strArrSplit3.length];
                                i4 = i14;
                                while (i4 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i4].split(str4, i3);
                                    qe6VarArr[i4] = new qe6((long) Double.parseDouble(strArrSplit9[i14]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i4++;
                                    i3 = -1;
                                }
                                mapArr[i16].put(str3, oe6.e(qe6VarArr, this.h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z2) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i17);
                                }
                                break;
                            case 9:
                                int i21 = i12;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i5 = i14; i5 < strArrSplit4.length; i5++) {
                                    iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                }
                                HashMap map4 = mapArr[i16];
                                ByteOrder byteOrder4 = this.h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i21] * length]);
                                byteBufferWrap.order(byteOrder4);
                                for (i6 = i14; i6 < length; i6++) {
                                    byteBufferWrap.putInt(iArr3[i6]);
                                }
                                map4.put(str3, new oe6(i21, byteBufferWrap.array(), length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                qe6VarArr2 = new qe6[length2];
                                i7 = i14;
                                while (i7 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i7].split(str4, i19);
                                    qe6VarArr2[i7] = new qe6((long) Double.parseDouble(strArrSplit10[i14]), (long) Double.parseDouble(strArrSplit10[1]));
                                    i7++;
                                    i12 = i12;
                                    strArrSplit5 = strArrSplit5;
                                    i19 = -1;
                                }
                                HashMap map5 = mapArr[i16];
                                ByteOrder byteOrder5 = this.h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                for (i8 = i14; i8 < length2; i8++) {
                                    qe6 qe6Var3 = qe6VarArr2[i8];
                                    byteBufferWrap2.putInt((int) qe6Var3.a);
                                    byteBufferWrap2.putInt((int) qe6Var3.b);
                                }
                                map5.put(str3, new oe6(10, byteBufferWrap2.array(), length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i9 = i14; i9 < strArrSplit6.length; i9++) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap map6 = mapArr[i16];
                                ByteOrder byteOrder6 = this.h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i11] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                for (i10 = i14; i10 < length3; i10++) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map6.put(str3, new oe6(i11, byteBufferWrap3.array(), length3));
                                break;
                        }
                    } else if (i18 == 1 || i18 == 7 || i18 == 2) {
                        i17 = i18;
                        iArr = S;
                        switch (i17) {
                            case 1:
                                str4 = str4;
                                mapArr[i16].put(str3, oe6.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i16].put(str3, oe6.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i < strArrSplit.length) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i16].put(str3, oe6.g(iArr2, this.h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i2 < strArrSplit2.length) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i16].put(str3, oe6.d(jArr, this.h));
                                break;
                            case 5:
                                i3 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                qe6VarArr = new qe6[strArrSplit3.length];
                                i4 = i14;
                                while (i4 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i4].split(str4, i3);
                                    qe6VarArr[i4] = new qe6((long) Double.parseDouble(strArrSplit11[i14]), (long) Double.parseDouble(strArrSplit11[1]));
                                    i4++;
                                    i3 = -1;
                                }
                                mapArr[i16].put(str3, oe6.e(qe6VarArr, this.h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z2) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i17);
                                }
                                break;
                            case 9:
                                int i22 = i12;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i5 < strArrSplit4.length) {
                                    iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                }
                                HashMap map7 = mapArr[i16];
                                ByteOrder byteOrder7 = this.h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i22] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i6 < length) {
                                    byteBufferWrap.putInt(iArr3[i6]);
                                }
                                map7.put(str3, new oe6(i22, byteBufferWrap.array(), length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                qe6VarArr2 = new qe6[length2];
                                i7 = i14;
                                while (i7 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i7].split(str4, i19);
                                    qe6VarArr2[i7] = new qe6((long) Double.parseDouble(strArrSplit12[i14]), (long) Double.parseDouble(strArrSplit12[1]));
                                    i7++;
                                    i12 = i12;
                                    strArrSplit5 = strArrSplit5;
                                    i19 = -1;
                                }
                                HashMap map8 = mapArr[i16];
                                ByteOrder byteOrder8 = this.h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i8 < length2) {
                                    qe6 qe6Var4 = qe6VarArr2[i8];
                                    byteBufferWrap2.putInt((int) qe6Var4.a);
                                    byteBufferWrap2.putInt((int) qe6Var4.b);
                                }
                                map8.put(str3, new oe6(10, byteBufferWrap2.array(), length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i9 < strArrSplit6.length) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap map9 = mapArr[i16];
                                ByteOrder byteOrder9 = this.h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i11] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                while (i10 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map9.put(str3, new oe6(i11, byteBufferWrap3.array(), length3));
                                break;
                        }
                    } else if (z2) {
                        StringBuilder sbV = qt4.v("Given tag (", str3, ") value didn't match with one of expected formats: ");
                        String[] strArr = R;
                        sbV.append(strArr[i18]);
                        sbV.append(i17 == -1 ? "" : ", " + strArr[i17]);
                        sbV.append(" (guess: ");
                        sbV.append(strArr[((Integer) pairQ.first).intValue()]);
                        sbV.append(((Integer) pairQ.second).intValue() != -1 ? ", " + strArr[((Integer) pairQ.second).intValue()] : "");
                        sbV.append(")");
                        Log.d("ExifInterface", sbV.toString());
                    }
                } else {
                    mapArr[i16].remove(str3);
                }
                i14 = i14;
            } else {
                i14 = i14;
            }
            i16++;
            i14 = i14;
            str4 = str4;
            i11 = 12;
            i12 = 9;
            i13 = 4;
        }
    }

    public final void H(ne6 ne6Var) throws IOException {
        String str;
        oe6 oe6Var;
        int i;
        HashMap map = this.f[4];
        oe6 oe6Var2 = (oe6) map.get("Compression");
        if (oe6Var2 == null) {
            this.o = 6;
            r(ne6Var, map);
            return;
        }
        int i2 = oe6Var2.i(this.h);
        this.o = i2;
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 6) {
                r(ne6Var, map);
                return;
            } else if (i2 != 7) {
                return;
            }
        }
        oe6 oe6Var3 = (oe6) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (oe6Var3 != null) {
            int[] iArr = (int[]) oe6Var3.k(this.h);
            int[] iArr2 = w;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (oe6Var = (oe6) map.get("PhotometricInterpretation")) != null && (((i = oe6Var.i(this.h)) == 1 && Arrays.equals(iArr, x)) || (i == 6 && Arrays.equals(iArr, iArr2))))) {
                oe6 oe6Var4 = (oe6) map.get("StripOffsets");
                oe6 oe6Var5 = (oe6) map.get("StripByteCounts");
                if (oe6Var4 == null || oe6Var5 == null) {
                    return;
                }
                long[] jArrC = ywl.c(oe6Var4.k(this.h));
                long[] jArrC2 = ywl.c(oe6Var5.k(this.h));
                if (jArrC == null || jArrC.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrC2 == null || jArrC2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrC.length != jArrC2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrC2) {
                    j += j2;
                }
                int i4 = (int) j;
                byte[] bArr = new byte[i4];
                this.k = true;
                this.j = true;
                this.i = true;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < jArrC.length) {
                    int i8 = (int) jArrC[i5];
                    int i9 = (int) jArrC2[i5];
                    if (i5 < jArrC.length - i3) {
                        str = str2;
                        if (i8 + i9 != jArrC[i5 + 1]) {
                            this.k = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i10 = i8 - i6;
                    if (i10 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        ne6Var.b(i10);
                        int i11 = i6 + i10;
                        byte[] bArr2 = new byte[i9];
                        try {
                            ne6Var.readFully(bArr2);
                            i6 = i11 + i9;
                            System.arraycopy(bArr2, 0, bArr, i7, i9);
                            i7 += i9;
                            i5++;
                            str2 = str3;
                            i3 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i9 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i10 + " bytes.");
                        return;
                    }
                }
                this.n = bArr;
                if (this.k) {
                    this.l = (int) jArrC[0];
                    this.m = i4;
                    return;
                }
                return;
            }
        }
        if (v) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void I(int i, int i2) {
        HashMap[] mapArr = this.f;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = v;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        oe6 oe6Var = (oe6) mapArr[i].get("ImageLength");
        oe6 oe6Var2 = (oe6) mapArr[i].get("ImageWidth");
        oe6 oe6Var3 = (oe6) mapArr[i2].get("ImageLength");
        oe6 oe6Var4 = (oe6) mapArr[i2].get("ImageWidth");
        if (oe6Var == null || oe6Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (oe6Var3 == null || oe6Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i3 = oe6Var.i(this.h);
        int i4 = oe6Var2.i(this.h);
        int i5 = oe6Var3.i(this.h);
        int i6 = oe6Var4.i(this.h);
        if (i3 >= i5 || i4 >= i6) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void J(re6 re6Var, int i) throws IOException {
        oe6 oe6VarF;
        oe6 oe6VarF2;
        HashMap[] mapArr = this.f;
        oe6 oe6Var = (oe6) mapArr[i].get("DefaultCropSize");
        oe6 oe6Var2 = (oe6) mapArr[i].get("SensorTopBorder");
        oe6 oe6Var3 = (oe6) mapArr[i].get("SensorLeftBorder");
        oe6 oe6Var4 = (oe6) mapArr[i].get("SensorBottomBorder");
        oe6 oe6Var5 = (oe6) mapArr[i].get("SensorRightBorder");
        if (oe6Var != null) {
            int i2 = oe6Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                qe6[] qe6VarArr = (qe6[]) oe6Var.k(byteOrder);
                if (qe6VarArr == null || qe6VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(qe6VarArr));
                    return;
                } else {
                    oe6VarF = oe6.e(new qe6[]{qe6VarArr[0]}, this.h);
                    oe6VarF2 = oe6.e(new qe6[]{qe6VarArr[1]}, this.h);
                }
            } else {
                int[] iArr = (int[]) oe6Var.k(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                oe6VarF = oe6.f(iArr[0], this.h);
                oe6VarF2 = oe6.f(iArr[1], this.h);
            }
            mapArr[i].put("ImageWidth", oe6VarF);
            mapArr[i].put("ImageLength", oe6VarF2);
            return;
        }
        if (oe6Var2 != null && oe6Var3 != null && oe6Var4 != null && oe6Var5 != null) {
            int i3 = oe6Var2.i(this.h);
            int i4 = oe6Var4.i(this.h);
            int i5 = oe6Var5.i(this.h);
            int i6 = oe6Var3.i(this.h);
            if (i4 <= i3 || i5 <= i6) {
                return;
            }
            oe6 oe6VarF3 = oe6.f(i4 - i3, this.h);
            oe6 oe6VarF4 = oe6.f(i5 - i6, this.h);
            mapArr[i].put("ImageLength", oe6VarF3);
            mapArr[i].put("ImageWidth", oe6VarF4);
            return;
        }
        oe6 oe6Var6 = (oe6) mapArr[i].get("ImageLength");
        oe6 oe6Var7 = (oe6) mapArr[i].get("ImageWidth");
        if (oe6Var6 == null || oe6Var7 == null) {
            oe6 oe6Var8 = (oe6) mapArr[i].get("JPEGInterchangeFormat");
            oe6 oe6Var9 = (oe6) mapArr[i].get("JPEGInterchangeFormatLength");
            if (oe6Var8 == null || oe6Var9 == null) {
                return;
            }
            int i7 = oe6Var8.i(this.h);
            int i8 = oe6Var8.i(this.h);
            re6Var.g(i7);
            byte[] bArr = new byte[i8];
            re6Var.readFully(bArr);
            g(new ne6(bArr), i7, i);
        }
    }

    public final void K() {
        I(0, 5);
        I(0, 4);
        I(5, 4);
        HashMap[] mapArr = this.f;
        oe6 oe6Var = (oe6) mapArr[1].get("PixelXDimension");
        oe6 oe6Var2 = (oe6) mapArr[1].get("PixelYDimension");
        if (oe6Var != null && oe6Var2 != null) {
            mapArr[0].put("ImageWidth", oe6Var);
            mapArr[0].put("ImageLength", oe6Var2);
        }
        if (mapArr[4].isEmpty() && t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!t(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        B(0, "ThumbnailOrientation", "Orientation");
        B(0, "ThumbnailImageLength", "ImageLength");
        B(0, "ThumbnailImageWidth", "ImageWidth");
        B(5, "ThumbnailOrientation", "Orientation");
        B(5, "ThumbnailImageLength", "ImageLength");
        B(5, "ThumbnailImageWidth", "ImageWidth");
        B(4, "Orientation", "ThumbnailOrientation");
        B(4, "ImageLength", "ThumbnailImageLength");
        B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int L(t61 t61Var) throws IOException {
        HashMap[] mapArr;
        int i;
        int[] iArr;
        int i2;
        pe6[][] pe6VarArr = V;
        int[] iArr2 = new int[pe6VarArr.length];
        int[] iArr3 = new int[pe6VarArr.length];
        pe6[] pe6VarArr2 = W;
        for (pe6 pe6Var : pe6VarArr2) {
            A(pe6Var.b);
        }
        if (this.i) {
            if (this.j) {
                A("StripOffsets");
                A("StripByteCounts");
            } else {
                A("JPEGInterchangeFormat");
                A("JPEGInterchangeFormatLength");
            }
        }
        int i3 = 0;
        while (true) {
            int length = pe6VarArr.length;
            mapArr = this.f;
            if (i3 >= length) {
                break;
            }
            Iterator it = mapArr[i3].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i3++;
        }
        if (mapArr[1].isEmpty()) {
            i = 1;
        } else {
            i = 1;
            mapArr[0].put(pe6VarArr2[1].b, oe6.c(0L, this.h));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(pe6VarArr2[2].b, oe6.c(0L, this.h));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i].put(pe6VarArr2[3].b, oe6.c(0L, this.h));
        }
        int i4 = 4;
        if (this.i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", oe6.f(0, this.h));
                mapArr[4].put("StripByteCounts", oe6.f(this.m, this.h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", oe6.c(0L, this.h));
                mapArr[4].put("JPEGInterchangeFormatLength", oe6.c(this.m, this.h));
            }
        }
        int i5 = 0;
        while (true) {
            int length2 = pe6VarArr.length;
            iArr = S;
            if (i5 >= length2) {
                break;
            }
            Iterator it2 = mapArr[i5].entrySet().iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                oe6 oe6Var = (oe6) ((Map.Entry) it2.next()).getValue();
                oe6Var.getClass();
                int i7 = iArr[oe6Var.a] * oe6Var.b;
                if (i7 > 4) {
                    i6 += i7;
                }
            }
            iArr3[i5] = iArr3[i5] + i6;
            i5++;
        }
        int size = 8;
        for (int i8 = 0; i8 < pe6VarArr.length; i8++) {
            if (!mapArr[i8].isEmpty()) {
                iArr2[i8] = size;
                size = (mapArr[i8].size() * 12) + 6 + iArr3[i8] + size;
            }
        }
        if (this.i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", oe6.f(size, this.h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", oe6.c(size, this.h));
            }
            this.l = size;
            size += this.m;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (v) {
            for (int i9 = 0; i9 < pe6VarArr.length; i9++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i9), Integer.valueOf(iArr2[i9]), Integer.valueOf(mapArr[i9].size()), Integer.valueOf(iArr3[i9]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i].isEmpty()) {
            mapArr[0].put(pe6VarArr2[i].b, oe6.c(iArr2[i], this.h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(pe6VarArr2[r6].b, oe6.c(iArr2[2], this.h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[i].put(pe6VarArr2[r6].b, oe6.c(iArr2[3], this.h));
        }
        int i10 = this.d;
        if (i10 == 4) {
            if (size > 65535) {
                ore.k(c0a.k(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
                return 0;
            }
            t61Var.A(size);
            t61Var.write(c0);
        } else if (i10 == 13) {
            t61Var.g(size);
            t61Var.g(1700284774);
        } else if (i10 == 14) {
            t61Var.write(K);
            t61Var.g(size);
        }
        int size2 = ((DataOutputStream) t61Var.c).size();
        t61Var.l(this.h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        t61Var.b = this.h;
        t61Var.A(42);
        t61Var.y(8L);
        int i11 = 0;
        while (i11 < pe6VarArr.length) {
            if (mapArr[i11].isEmpty()) {
                i2 = i4;
            } else {
                t61Var.A(mapArr[i11].size());
                int size3 = (mapArr[i11].size() * 12) + iArr2[i11] + 2 + i4;
                for (Map.Entry entry : mapArr[i11].entrySet()) {
                    int i12 = ((pe6) Y[i11].get(entry.getKey())).a;
                    oe6 oe6Var2 = (oe6) entry.getValue();
                    oe6Var2.getClass();
                    int i13 = oe6Var2.b;
                    int i14 = oe6Var2.a;
                    int i15 = iArr[i14] * i13;
                    t61Var.A(i12);
                    t61Var.A(i14);
                    t61Var.g(i13);
                    if (i15 > 4) {
                        t61Var.y(size3);
                        size3 += i15;
                    } else {
                        t61Var.write(oe6Var2.d);
                        if (i15 < 4) {
                            while (i15 < 4) {
                                t61Var.b(0);
                                i15++;
                            }
                        }
                    }
                    i4 = 4;
                }
                int i16 = i4;
                if (i11 != 0 || mapArr[i16].isEmpty()) {
                    t61Var.y(0L);
                } else {
                    t61Var.y(iArr2[i16]);
                }
                Iterator it3 = mapArr[i11].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((oe6) ((Map.Entry) it3.next()).getValue()).d;
                    if (bArr.length > 4) {
                        t61Var.write(bArr, 0, bArr.length);
                    }
                }
                i2 = 4;
            }
            i11++;
            i4 = i2;
        }
        if (this.i) {
            t61Var.write(o());
        }
        if (this.d == 14 && size % 2 == i) {
            t61Var.b(0);
        }
        t61Var.b = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void M(t61 t61Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.p = ((DataOutputStream) t61Var.c).size() + L(new t61(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        t61Var.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        t61Var.g((int) crc32.getValue());
    }

    public final void N(t61 t61Var) throws IOException {
        t61Var.g(this.t.d.length + 22);
        CRC32 crc32 = new CRC32();
        t61Var.g(1767135348);
        crc32.update(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = H;
        t61Var.write(bArr);
        crc32.update(bArr);
        t61Var.write(this.t.d);
        crc32.update(this.t.d);
        t61Var.g((int) crc32.getValue());
        this.u = true;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", oe6.b(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", oe6.c(0L, this.h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", oe6.c(0L, this.h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", oe6.c(0L, this.h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", oe6.c(0L, this.h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            ore.n("tag shouldn't be null");
            return null;
        }
        oe6 oe6VarE = e(str);
        if (oe6VarE != null) {
            int i = oe6VarE.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                qe6[] qe6VarArr = (qe6[]) oe6VarE.k(this.h);
                if (qe6VarArr == null || qe6VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(qe6VarArr));
                    return null;
                }
                qe6 qe6Var = qe6VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (qe6Var.a / qe6Var.b));
                qe6 qe6Var2 = qe6VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (qe6Var2.a / qe6Var2.b));
                qe6 qe6Var3 = qe6VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (qe6Var3.a / qe6Var3.b)));
            }
            boolean zContains = Z.contains(str);
            ByteOrder byteOrder = this.h;
            if (!zContains) {
                return oe6VarE.j(byteOrder);
            }
            try {
                return Double.toString(oe6VarE.h(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        oe6 oe6VarE = e(str);
        if (oe6VarE != null) {
            try {
                return oe6VarE.i(this.h);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final oe6 e(String str) {
        oe6 oe6Var;
        int i;
        oe6 oe6Var2;
        if (str == null) {
            ore.n("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (oe6Var2 = this.t) != null)) {
            return oe6Var2;
        }
        for (int i2 = 0; i2 < V.length; i2++) {
            oe6 oe6Var3 = (oe6) this.f[i2].get(str);
            if (oe6Var3 != null) {
                return oe6Var3;
            }
        }
        if (!"Xmp".equals(str) || (oe6Var = this.t) == null) {
            return null;
        }
        return oe6Var;
    }

    public final void f(re6 re6Var, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            c.i("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            c.i("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new me6(re6Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", oe6.f(Integer.parseInt(strExtractMetadata), this.h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", oe6.f(Integer.parseInt(strExtractMetadata3), this.h));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", oe6.f(i2, this.h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    re6Var.g(i5);
                    byte[] bArr = new byte[6];
                    re6Var.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    re6Var.readFully(bArr2);
                    this.p = i7;
                    y(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    re6Var.g(j);
                    byte[] bArr3 = new byte[i10];
                    re6Var.readFully(bArr3);
                    this.t = new oe6(j, bArr3, 1, i10);
                    this.u = true;
                }
                if (v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void g(defpackage.ne6 r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se6.g(ne6, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01a5  */
    public final int h(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        ne6 ne6Var;
        int i2;
        ne6 ne6Var2;
        int i3;
        int i4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr2 = y;
            if (i5 >= bArr2.length) {
                return 4;
            }
            if (bArr[i5] != bArr2[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        ne6 ne6Var3 = null;
                        try {
                            ne6Var = new ne6(bArr);
                            try {
                                try {
                                    long j2 = ne6Var.readInt();
                                    byte[] bArr3 = new byte[4];
                                    ne6Var.readFully(bArr3);
                                    if (Arrays.equals(bArr3, z)) {
                                        if (j2 == 1) {
                                            j2 = ne6Var.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            ne6Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > 5000) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            ne6Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        ne6Var.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, A)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, B)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr4, C) || Arrays.equals(bArr4, D)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    ne6Var.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    ne6Var.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                if (v) {
                                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                                }
                                                                if (ne6Var != null) {
                                                                    ne6Var.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused) {
                                                        i = 0;
                                                        ne6Var.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                ne6Var.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        ne6Var.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    ne6Var3 = ne6Var;
                                    if (ne6Var3 != null) {
                                        ne6Var3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = 0;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            ne6Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (ne6Var3 != null) {
                                ne6Var3.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            ne6Var2 = new ne6(bArr);
                            try {
                                ByteOrder byteOrderX = x(ne6Var2);
                                this.h = byteOrderX;
                                ne6Var2.c = byteOrderX;
                                short s = ne6Var2.readShort();
                                i3 = (s == 20306 || s == 21330) ? 1 : i;
                                ne6Var2.close();
                            } catch (Exception unused2) {
                                if (ne6Var2 != null) {
                                    ne6Var2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                ne6Var3 = ne6Var2;
                                if (ne6Var3 != null) {
                                    ne6Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            ne6Var2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            ne6 ne6Var4 = new ne6(bArr);
                            try {
                                ByteOrder byteOrderX2 = x(ne6Var4);
                                this.h = byteOrderX2;
                                ne6Var4.c = byteOrderX2;
                                i4 = ne6Var4.readShort() != 85 ? i : 1;
                                ne6Var4.close();
                            } catch (Exception unused4) {
                                ne6Var3 = ne6Var4;
                                if (ne6Var3 != null) {
                                    ne6Var3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                ne6Var3 = ne6Var4;
                                if (ne6Var3 != null) {
                                    ne6Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i7 = i;
                        while (true) {
                            byte[] bArr5 = G;
                            if (i7 >= bArr5.length) {
                                return 13;
                            }
                            if (bArr[i7] != bArr5[i7]) {
                                int i8 = i;
                                while (true) {
                                    byte[] bArr6 = I;
                                    if (i8 >= bArr6.length) {
                                        int i9 = i;
                                        while (true) {
                                            byte[] bArr7 = J;
                                            if (i9 >= bArr7.length) {
                                                return 14;
                                            }
                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        if (bArr[i8] != bArr6[i8]) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                return i;
                            }
                            i7++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void i(re6 re6Var) throws IOException {
        int i;
        int i2;
        l(re6Var);
        HashMap[] mapArr = this.f;
        oe6 oe6Var = (oe6) mapArr[1].get("MakerNote");
        if (oe6Var != null) {
            re6 re6Var2 = new re6(oe6Var.d);
            re6Var2.c = this.h;
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            re6Var2.readFully(bArr2);
            re6Var2.g(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            re6Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                re6Var2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                re6Var2.g(12L);
            }
            z(re6Var2, 6);
            oe6 oe6Var2 = (oe6) mapArr[7].get("PreviewImageStart");
            oe6 oe6Var3 = (oe6) mapArr[7].get("PreviewImageLength");
            if (oe6Var2 != null && oe6Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", oe6Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", oe6Var3);
            }
            oe6 oe6Var4 = (oe6) mapArr[8].get("AspectFrame");
            if (oe6Var4 != null) {
                int[] iArr = (int[]) oe6Var4.k(this.h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                oe6 oe6VarF = oe6.f(i5, this.h);
                oe6 oe6VarF2 = oe6.f(i6, this.h);
                mapArr[0].put("ImageWidth", oe6VarF);
                mapArr[0].put("ImageLength", oe6VarF2);
            }
        }
    }

    public final void j(ne6 ne6Var) throws IOException {
        if (v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + ne6Var);
        }
        ne6Var.c = ByteOrder.BIG_ENDIAN;
        int i = ne6Var.b;
        ne6Var.b(G.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                break;
            }
            try {
                int i2 = ne6Var.readInt();
                int i3 = ne6Var.readInt();
                int i4 = ne6Var.b;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    break;
                }
                if (i3 == 1700284774 && !z2) {
                    this.p = i6;
                    byte[] bArr = new byte[i2];
                    ne6Var.readFully(bArr);
                    int i7 = ne6Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    y(0, bArr);
                    K();
                    H(new ne6(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = H;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        ne6Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = ne6Var.b - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            ne6Var.readFully(bArr4);
                            this.t = new oe6(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                ne6Var.b(i5 - ne6Var.b);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
        this.u = z3;
    }

    public final void k(ne6 ne6Var) throws IOException {
        boolean z2 = v;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + ne6Var);
        }
        ne6Var.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        ne6Var.readFully(bArr);
        ne6Var.readFully(bArr2);
        ne6Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        ne6Var.b(i - ne6Var.b);
        ne6Var.readFully(bArr4);
        g(new ne6(bArr4), i, 5);
        ne6Var.b(i3 - ne6Var.b);
        ne6Var.c = ByteOrder.BIG_ENDIAN;
        int i4 = ne6Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = ne6Var.readUnsignedShort();
            int unsignedShort2 = ne6Var.readUnsignedShort();
            if (unsignedShort == U.a) {
                short s = ne6Var.readShort();
                short s2 = ne6Var.readShort();
                oe6 oe6VarF = oe6.f(s, this.h);
                oe6 oe6VarF2 = oe6.f(s2, this.h);
                HashMap[] mapArr = this.f;
                mapArr[0].put("ImageLength", oe6VarF);
                mapArr[0].put("ImageWidth", oe6VarF2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            ne6Var.b(unsignedShort2);
        }
    }

    public final void l(re6 re6Var) throws IOException {
        v(re6Var);
        z(re6Var, 0);
        J(re6Var, 0);
        J(re6Var, 5);
        J(re6Var, 4);
        K();
        if (this.d == 8) {
            HashMap[] mapArr = this.f;
            oe6 oe6Var = (oe6) mapArr[1].get("MakerNote");
            if (oe6Var != null) {
                re6 re6Var2 = new re6(oe6Var.d);
                re6Var2.c = this.h;
                re6Var2.b(6);
                z(re6Var2, 9);
                oe6 oe6Var2 = (oe6) mapArr[9].get("ColorSpace");
                if (oe6Var2 != null) {
                    mapArr[1].put("ColorSpace", oe6Var2);
                }
            }
        }
    }

    public final void m(re6 re6Var) throws IOException {
        if (v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + re6Var);
        }
        l(re6Var);
        HashMap[] mapArr = this.f;
        oe6 oe6Var = (oe6) mapArr[0].get("JpgFromRaw");
        if (oe6Var != null) {
            g(new ne6(oe6Var.d), (int) oe6Var.c, 5);
        }
        oe6 oe6Var2 = (oe6) mapArr[0].get("ISO");
        oe6 oe6Var3 = (oe6) mapArr[1].get("PhotographicSensitivity");
        if (oe6Var2 == null || oe6Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", oe6Var2);
    }

    public final boolean n(re6 re6Var) throws IOException {
        byte[] bArr = c0;
        byte[] bArr2 = new byte[bArr.length];
        re6Var.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = re6Var.a.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.p = bArr.length;
                y(0, bArrCopyOf2);
                return true;
            }
            i += i2;
            re6Var.b += i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final byte[] o() throws Throwable {
        FileDescriptor fileDescriptor;
        ?? fileInputStream;
        ?? r2 = 0;
        r2 = 0;
        if (this.i) {
            ?? fileInputStream2 = this.n;
            try {
                if (fileInputStream2 != 0) {
                    return fileInputStream2;
                }
                try {
                    fileInputStream2 = this.c;
                    if (fileInputStream2 != 0) {
                        try {
                            if (!fileInputStream2.markSupported()) {
                                Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                                ywl.b(fileInputStream2);
                                return null;
                            }
                            fileInputStream2.reset();
                            fileInputStream = fileInputStream2;
                            fileDescriptor = null;
                            fileInputStream2 = fileInputStream;
                            try {
                                ne6 ne6Var = new ne6((InputStream) fileInputStream2);
                                ne6Var.b(this.l + this.p);
                                byte[] bArr = new byte[this.m];
                                ne6Var.readFully(bArr);
                                this.n = bArr;
                                ywl.b(fileInputStream2);
                                if (fileDescriptor != null) {
                                    ywl.a(fileDescriptor);
                                }
                                return bArr;
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileDescriptor = null;
                        } catch (Throwable th) {
                            th = th;
                            fileDescriptor = null;
                        }
                    } else {
                        String str = this.a;
                        if (str != null) {
                            fileInputStream = new FileInputStream(str);
                            fileDescriptor = null;
                            fileInputStream2 = fileInputStream;
                            ne6 ne6Var2 = new ne6((InputStream) fileInputStream2);
                            ne6Var2.b(this.l + this.p);
                            byte[] bArr2 = new byte[this.m];
                            ne6Var2.readFully(bArr2);
                            this.n = bArr2;
                            ywl.b(fileInputStream2);
                            if (fileDescriptor != null) {
                                ywl.a(fileDescriptor);
                            }
                            return bArr2;
                        }
                        FileDescriptor fileDescriptorDup = Os.dup(this.b);
                        try {
                            Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream2 = new FileInputStream(fileDescriptorDup);
                            ne6 ne6Var3 = new ne6((InputStream) fileInputStream2);
                            ne6Var3.b(this.l + this.p);
                            byte[] bArr3 = new byte[this.m];
                            ne6Var3.readFully(bArr3);
                            this.n = bArr3;
                            ywl.b(fileInputStream2);
                            if (fileDescriptor != null) {
                                ywl.a(fileDescriptor);
                            }
                            return bArr3;
                        } catch (Exception e3) {
                            e = e3;
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream2 = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            fileDescriptor = fileDescriptorDup;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileInputStream2 = 0;
                    fileDescriptor = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = null;
                }
                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                ywl.b(fileInputStream2);
                if (fileDescriptor != null) {
                    ywl.a(fileDescriptor);
                }
            } catch (Throwable th4) {
                th = th4;
            }
            r2 = fileInputStream2;
            ywl.b(r2);
            if (fileDescriptor != null) {
                ywl.a(fileDescriptor);
            }
            throw th;
        }
        return null;
    }

    public final void p(ne6 ne6Var) throws IOException {
        if (v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + ne6Var);
        }
        ne6Var.c = ByteOrder.LITTLE_ENDIAN;
        ne6Var.b(I.length);
        int i = ne6Var.readInt() + 8;
        byte[] bArr = J;
        ne6Var.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                ne6Var.readFully(bArr2);
                int i2 = ne6Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    ne6Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = c0;
                    if (ywl.g(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.p = i3;
                    y(0, bArrCopyOfRange);
                    H(new ne6(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                ne6Var.b(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void r(ne6 ne6Var, HashMap map) throws IOException {
        oe6 oe6Var = (oe6) map.get("JPEGInterchangeFormat");
        oe6 oe6Var2 = (oe6) map.get("JPEGInterchangeFormatLength");
        if (oe6Var == null || oe6Var2 == null) {
            return;
        }
        int i = oe6Var.i(this.h);
        int i2 = oe6Var2.i(this.h);
        if (this.d == 7) {
            i += this.q;
        }
        if (i > 0 && i2 > 0) {
            this.i = true;
            if (this.a == null && this.c == null && this.b == null) {
                byte[] bArr = new byte[i2];
                ne6Var.b(i);
                ne6Var.readFully(bArr);
                this.n = bArr;
            }
            this.l = i;
            this.m = i2;
        }
        if (v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i + ", length: " + i2);
        }
    }

    public final boolean t(HashMap map) {
        oe6 oe6Var = (oe6) map.get("ImageLength");
        oe6 oe6Var2 = (oe6) map.get("ImageWidth");
        if (oe6Var == null || oe6Var2 == null) {
            return false;
        }
        return oe6Var.i(this.h) <= 512 && oe6Var2.i(this.h) <= 512;
    }

    public final void u(InputStream inputStream) {
        boolean z2 = v;
        for (int i = 0; i < V.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e) {
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (z2) {
                        w();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z2) {
                    w();
                }
                throw th;
            }
        }
        boolean z3 = this.e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            ne6 ne6Var = new ne6(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                g(ne6Var, 0, 0);
            } else if (i3 == 13) {
                j(ne6Var);
            } else if (i3 == 9) {
                k(ne6Var);
            } else if (i3 == 14) {
                p(ne6Var);
            }
        } else {
            re6 re6Var = new re6(inputStream);
            if (!z3) {
                int i4 = this.d;
                if (i4 == 12 || i4 == 15) {
                    f(re6Var, i4);
                } else if (i4 == 7) {
                    i(re6Var);
                } else if (i4 == 10) {
                    m(re6Var);
                } else {
                    l(re6Var);
                }
            } else if (!n(re6Var)) {
                a();
                if (z2) {
                    w();
                    return;
                }
                return;
            }
            re6Var.g(this.p);
            H(re6Var);
        }
        a();
        if (z2) {
            w();
        }
    }

    public final void v(re6 re6Var) throws IOException {
        ByteOrder byteOrderX = x(re6Var);
        this.h = byteOrderX;
        re6Var.c = byteOrderX;
        int unsignedShort = re6Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            eu6.d(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = re6Var.readInt();
        if (i2 < 8) {
            qr7.k(zo5.h(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            re6Var.b(i3);
        }
    }

    public final void w() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbY = zo5.y(i, "The size of tag group[", "]: ");
            sbY.append(mapArr[i].size());
            Log.d("ExifInterface", sbY.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                oe6 oe6Var = (oe6) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + oe6Var.toString() + ", tagValue: '" + oe6Var.j(this.h) + "'");
            }
            i++;
        }
    }

    public final void y(int i, byte[] bArr) throws IOException {
        re6 re6Var = new re6(bArr);
        v(re6Var);
        z(re6Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void z(re6 re6Var, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strJ;
        int i3;
        int i4 = re6Var.b;
        int i5 = re6Var.e;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.g;
        hashSet2.add(numValueOf);
        short s = re6Var.readShort();
        boolean z3 = v;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = re6Var.readUnsignedShort();
            int unsignedShort3 = re6Var.readUnsignedShort();
            int i6 = re6Var.readInt();
            long j6 = ((long) re6Var.b) + 4;
            short s3 = s;
            pe6 pe6Var = (pe6) X[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), pe6Var != null ? pe6Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (pe6Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = S;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = pe6Var.c;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = pe6Var.d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + R[unsignedShort3] + ") is unexpected for tag: " + pe6Var.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = re6Var.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(pe6Var.b)) {
                                    this.q = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(pe6Var.b)) {
                                    this.r = i3;
                                    this.s = i6;
                                    oe6 oe6VarF = oe6.f(6, this.h);
                                    oe6 oe6VarC = oe6.c(this.r, this.h);
                                    oe6 oe6VarC2 = oe6.c(this.s, this.h);
                                    mapArr[4].put("Compression", oe6VarF);
                                    mapArr[4].put("JPEGInterchangeFormat", oe6VarC);
                                    mapArr[4].put("JPEGInterchangeFormatLength", oe6VarC2);
                                }
                            }
                            re6Var.g(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            pe6Var = pe6Var;
                        }
                        num = (Integer) a0.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) re6Var.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = re6Var.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = re6Var.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pe6Var.b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z3 != 0) {
                                        strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i5 != -1) {
                                            strJ = strJ + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strJ);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        re6Var.g(j5);
                                        z(re6Var, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                re6Var.g(j3);
                            } else {
                                unsignedShort = re6Var.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pe6Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strJ = strJ + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strJ = strJ + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            }
                            re6Var.g(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i8 = re6Var.b + this.p;
                            byte[] bArr = new byte[(int) j2];
                            re6Var.readFully(bArr);
                            oe6 oe6Var = new oe6(i8, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = pe6Var.b;
                            map.put(str, oe6Var);
                            if ("DNGVersion".equals(str)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && oe6Var.j(this.h).contains("PENTAX")) || ("Compression".equals(str) && oe6Var.i(this.h) == 65535)) {
                                this.d = 8;
                            }
                            if (re6Var.b != j4) {
                                re6Var.g(j4);
                            }
                        }
                    } else {
                        re6Var.g(j);
                        hashSet = hashSet2;
                    }
                    s2 = (short) (s2 + 1);
                    hashSet2 = hashSet;
                    s = s3;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    re6Var.g(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = re6Var.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(pe6Var.b)) {
                                this.q = i3;
                            } else if (i != 6) {
                            }
                        }
                        re6Var.g(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        pe6Var = pe6Var;
                    }
                    num = (Integer) a0.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) re6Var.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = re6Var.readInt();
                            } else {
                                unsignedShort = re6Var.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pe6Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strJ = strJ + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strJ = strJ + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            }
                            re6Var.g(j3);
                        } else {
                            unsignedShort = re6Var.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pe6Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strJ = strJ + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strJ = strJ + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        }
                        re6Var.g(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i9 = re6Var.b + this.p;
                        byte[] bArr2 = new byte[(int) j2];
                        re6Var.readFully(bArr2);
                        oe6 oe6Var2 = new oe6(i9, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = pe6Var.b;
                        map2.put(str, oe6Var2);
                        if ("DNGVersion".equals(str)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.d = 8;
                        if (re6Var.b != j4) {
                            re6Var.g(j4);
                        }
                    }
                }
                s2 = (short) (s2 + 1);
                hashSet2 = hashSet;
                s = s3;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                re6Var.g(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = re6Var.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(pe6Var.b)) {
                            this.q = i3;
                        } else if (i != 6) {
                        }
                    }
                    re6Var.g(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    pe6Var = pe6Var;
                }
                num = (Integer) a0.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) re6Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = re6Var.readInt();
                        } else {
                            unsignedShort = re6Var.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pe6Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strJ = strJ + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strJ = strJ + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        }
                        re6Var.g(j3);
                    } else {
                        unsignedShort = re6Var.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pe6Var.b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strJ = strJ + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strJ);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strJ = zo5.j(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strJ = strJ + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strJ);
                        }
                    }
                    re6Var.g(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i10 = re6Var.b + this.p;
                    byte[] bArr3 = new byte[(int) j2];
                    re6Var.readFully(bArr3);
                    oe6 oe6Var3 = new oe6(i10, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = pe6Var.b;
                    map3.put(str, oe6Var3);
                    if ("DNGVersion".equals(str)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.d = 8;
                    if (re6Var.b != j4) {
                        re6Var.g(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s = s3;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i11 = re6Var.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        re6Var.g(j7);
        if (mapArr[4].isEmpty()) {
            z(re6Var, 4);
        } else if (mapArr[5].isEmpty()) {
            z(re6Var, 5);
        }
    }

    public se6(String str) throws Throwable {
        pe6[][] pe6VarArr = V;
        this.f = new HashMap[pe6VarArr.length];
        this.g = new HashSet(pe6VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (str != null) {
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (s(fileInputStream2.getFD())) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    u(fileInputStream2);
                    ywl.b(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    ywl.b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            ore.n("filename cannot be null");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public se6(InputStream inputStream) {
        pe6[][] pe6VarArr = V;
        this.f = new HashMap[pe6VarArr.length];
        this.g = new HashSet(pe6VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            this.e = false;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (s(fileInputStream.getFD())) {
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } else {
                    this.c = null;
                    this.b = null;
                }
            } else {
                this.c = null;
                this.b = null;
            }
            u(inputStream);
            return;
        }
        ore.n("inputStream cannot be null");
        throw null;
    }
}
