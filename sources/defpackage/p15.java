package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.ParserException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class p15 extends DefaultHandler implements qmc {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public p15() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            ore.h("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = vqi.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new kcf(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0093 A[PHI: r13
  0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01a3, B:120:0x0190, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    public static int d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 5;
        byte b2 = 4;
        int i2 = 0;
        int i3 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i3 = iBitCount;
                    break;
                }
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int i4 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & i4) == 0) {
                        iBitCount = 0;
                        while (true) {
                            int[] iArr = e;
                            if (i2 < iArr.length) {
                                iBitCount += ((i4 >> i2) & 1) * iArr[i2];
                                i2++;
                            } else if (iBitCount != 0) {
                                i3 = iBitCount;
                            }
                        }
                    } else {
                        String[] strArrL0 = vqi.l0(str);
                        if (strArrL0.length != 0) {
                            List listT = ed7.S('.').T(n1g.b0(strArrL0[0].trim()));
                            if (listT.size() == 4 && ((String) listT.get(0)).equals("ac-4")) {
                                String str2 = (String) listT.get(3);
                                str2.getClass();
                                if (str2.equals("03")) {
                                    i3 = 18;
                                } else if (str2.equals("04")) {
                                    i3 = 21;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                if (attributeValue4 != null) {
                    i3 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                if (attributeValue5 != null) {
                    String strB0 = n1g.b0(attributeValue5);
                    strB0.getClass();
                    switch (strB0.hashCode()) {
                        case 1596796:
                            b2 = !strB0.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b2 = !strB0.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094034:
                            b2 = !strB0.equals("f800") ? (byte) -1 : (byte) 2;
                            break;
                        case 3094035:
                            b2 = !strB0.equals("f801") ? (byte) -1 : (byte) 3;
                            break;
                        case 3133436:
                            if (!strB0.equals("fa01")) {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i = 6;
                            break;
                        case 4:
                            i = 8;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = -1;
                }
                i3 = i;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                int i5 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (i5 >= 0) {
                    int[] iArr2 = f;
                    if (i5 < iArr2.length) {
                        i3 = iArr2[i5];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue7 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                if (attributeValue7 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue7, 16))) != 0) {
                    i3 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!a05.e(xmlPullParser, "AudioChannelConfiguration"));
        return i3;
    }

    public static long e(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        return "INF".equals(attributeValue) ? BuildConfig.MAX_TIME_TO_UPLOAD : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!a05.e(xmlPullParser, "BaseURL"));
        if (text != null && w1m.a(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return j8f.e(new ws0(text, i, i2, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ws0 ws0Var = (ws0) arrayList.get(i3);
            String strD = w1m.d(ws0Var.a, text);
            String str = attributeValue3 == null ? strD : attributeValue3;
            if (z) {
                i = ws0Var.c;
                i2 = ws0Var.d;
                str = ws0Var.b;
            }
            arrayList2.add(new ws0(strD, i, i2, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x013f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static Pair g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? B;
        UUID uuid3;
        String attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strB0 = n1g.b0(attributeValue3);
            strB0.getClass();
            switch (strB0) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = f71.c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = f71.e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = f71.d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue2 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue2 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] strArrSplit = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            uuidArr[i2] = UUID.fromString(strArrSplit[i2]);
                        }
                        uuid = f71.b;
                        text = 0;
                        B = iml.b(uuid, uuidArr, null);
                        break;
                    } else {
                        lvb.G0("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        B = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    B = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            B = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((a05.f(xmlPullParser, "clearkey:Laurl") || a05.f(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                B = B;
                text = xmlPullParser.getText();
            } else if (a05.f(xmlPullParser, "ms:laurl")) {
                B = B;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (B == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    a9m a9mVarC = iml.c(bArrDecode);
                    UUID uuid4 = a9mVarC == null ? null : (UUID) a9mVarC.c;
                    if (uuid4 == null) {
                        lvb.G0("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        B = 0;
                        text = text;
                    } else {
                        UUID uuid5 = uuid4;
                        B = bArrDecode;
                        uuid = uuid5;
                        text = text;
                    }
                } else if (B == 0) {
                    uuid3 = f71.e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        B = B;
                        text = text;
                    } else {
                        b(xmlPullParser);
                        B = B;
                        text = text;
                    }
                } else {
                    b(xmlPullParser);
                    B = B;
                    text = text;
                }
            } else if (B == 0) {
                uuid3 = f71.e;
                if (!uuid3.equals(uuid) && a05.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    B = iml.b(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    b(xmlPullParser);
                    B = B;
                    text = text;
                }
            } else {
                b(xmlPullParser);
                B = B;
                text = text;
            }
        } while (!a05.e(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new vu5(uuid, text, "video/mp4", B) : null);
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static hi5 i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!a05.e(xmlPullParser, str));
        return new hi5(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = vqi.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static float k(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
            }
        }
        return f2;
    }

    public static fvd o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "moreInformationURL");
        String str = attributeValue == null ? null : attributeValue;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "lang");
        String str2 = attributeValue2 == null ? null : attributeValue2;
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (a05.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (a05.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                b(xmlPullParser);
            }
            String str3 = strNextText2;
            String str4 = strNextText;
            String str5 = strNextText3;
            if (a05.e(xmlPullParser, "ProgramInformation")) {
                return new fvd(str4, str3, str5, str, str2);
            }
            strNextText = str4;
            strNextText2 = str3;
            strNextText3 = str5;
        }
    }

    public static l4e p(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new l4e(attributeValue, j, j2);
    }

    public static int r(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return np0.m;
                case "description":
                    return np0.o;
                case "enhanced-audio-intelligibility":
                    return np0.q;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return np0.n;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int s(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (n1g.r("http://dashif.org/guidelines/trickmode", ((hi5) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static lcf t(XmlPullParser xmlPullParser, lcf lcfVar) throws XmlPullParserException, IOException {
        long j = lcfVar != null ? lcfVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = lcfVar != null ? lcfVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = lcfVar != null ? lcfVar.d : 0L;
        long j6 = lcfVar != null ? lcfVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j5 = Long.parseLong(strArrSplit[0]);
            j6 = (Long.parseLong(strArrSplit[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        l4e l4eVarP = lcfVar != null ? lcfVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "Initialization")) {
                l4eVarP = p(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            l4e l4eVar = l4eVarP;
            if (a05.e(xmlPullParser, "SegmentBase")) {
                return new lcf(l4eVar, j2, j4, j8, j7);
            }
            l4eVarP = l4eVar;
        }
    }

    public static icf u(XmlPullParser xmlPullParser, icf icfVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6 = icfVar != null ? icfVar.b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = icfVar != null ? icfVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = icfVar != null ? icfVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = icfVar != null ? icfVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == BuildConfig.MAX_TIME_TO_UPLOAD ? -9223372036854775807L : j14;
        l4e l4eVarP = null;
        List listW = null;
        do {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "Initialization")) {
                l4eVarP = p(xmlPullParser, "sourceURL", "range");
            } else if (a05.f(xmlPullParser, "SegmentTimeline")) {
                listW = w(xmlPullParser, j7, j2);
            } else if (a05.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(p(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!a05.e(xmlPullParser, "SegmentList"));
        if (icfVar != null) {
            if (l4eVarP == null) {
                l4eVarP = icfVar.a;
            }
            if (listW == null) {
                listW = icfVar.f;
            }
            if (arrayList == null) {
                arrayList = icfVar.j;
            }
        }
        return new icf(l4eVarP, j7, j9, j13, j11, listW, j15, arrayList, vqi.X(j5), vqi.X(j));
    }

    public static jcf v(XmlPullParser xmlPullParser, jcf jcfVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7 = jcfVar != null ? jcfVar.b : 1L;
        l4e l4eVarP = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = jcfVar != null ? jcfVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = jcfVar != null ? jcfVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = jcfVar != null ? jcfVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            hi5 hi5Var = (hi5) list.get(i);
            if (n1g.r("http://dashif.org/guidelines/last-segment-number", hi5Var.a)) {
                j6 = Long.parseLong(hi5Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == BuildConfig.MAX_TIME_TO_UPLOAD ? -9223372036854775807L : j16;
        xtj xtjVarY = y(xmlPullParser, "media", jcfVar != null ? jcfVar.k : null);
        xtj xtjVarY2 = y(xmlPullParser, "initialization", jcfVar != null ? jcfVar.j : null);
        List listW = null;
        do {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "Initialization")) {
                l4eVarP = p(xmlPullParser, "sourceURL", "range");
            } else if (a05.f(xmlPullParser, "SegmentTimeline")) {
                listW = w(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!a05.e(xmlPullParser, "SegmentTemplate"));
        if (jcfVar != null) {
            if (l4eVarP == null) {
                l4eVarP = jcfVar.a;
            }
            if (listW == null) {
                listW = jcfVar.f;
            }
        }
        return new jcf(l4eVarP, j8, j10, j14, j15, j12, listW, j17, xtjVarY2, xtjVarY, vqi.X(j5), vqi.X(j));
    }

    public static ArrayList w(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j5 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = j5;
                    jA = a(arrayList, jA, j4, i2, j3);
                } else {
                    j3 = j5;
                }
                if (j3 != -9223372036854775807L) {
                    jA = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j4 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!a05.e(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = vqi.a;
            a(arrayList, jA, j4, i, vqi.i0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static ijf x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f2 = -3.4028235E38f;
        float f3 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "Latency")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "target");
                j = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "min");
                j2 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "max");
                j3 = attributeValue3 == null ? -9223372036854775807L : Long.parseLong(attributeValue3);
            } else if (a05.f(xmlPullParser, "PlaybackRate")) {
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "min");
                f2 = attributeValue4 == null ? -3.4028235E38f : Float.parseFloat(attributeValue4);
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "max");
                f3 = attributeValue5 == null ? -3.4028235E38f : Float.parseFloat(attributeValue5);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f4 = f2;
            float f5 = f3;
            if (a05.e(xmlPullParser, "ServiceDescription")) {
                return new ijf(j4, j5, j6, f4, f5);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f2 = f4;
            f3 = f5;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00fc. Please report as an issue. */
    public static xtj y(XmlPullParser xmlPullParser, String str, xtj xtjVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return xtjVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i);
                String strSubstring2 = attributeValue.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            ore.p("Invalid template: ".concat(attributeValue));
                            return null;
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new xtj(arrayList, arrayList2, arrayList3, 18);
    }

    @Override // defpackage.qmc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k15 n(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw ParserException.b(e2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fa A[LOOP:1: B:44:0x00d1->B:100:0x01fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01df  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f3  */
    public k15 l(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3 = false;
        String[] strArrSplit = new String[0];
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit = attributeValue.split(",");
        }
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z2 = false;
                break;
            }
            if (strArrSplit[i].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z2 = true;
                break;
            }
            i++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long jA0 = attributeValue2 == null ? -9223372036854775807L : vqi.a0(attributeValue2);
        long j2 = j(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long j3 = j(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long j4 = zEquals ? j(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long j5 = zEquals ? j(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long j6 = zEquals ? j(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long jA1 = attributeValue3 == null ? -9223372036854775807L : vqi.a0(attributeValue3);
        long j7 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListE = j8f.e(new ws0(uri.toString(), z2 ? 1 : Integer.MIN_VALUE, 1, uri.toString()));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j8 = zEquals ? -9223372036854775807L : 0L;
        long jE = j7;
        boolean z4 = false;
        boolean z5 = false;
        fvd fvdVarO = null;
        ewe eweVar = null;
        Uri uriE = null;
        ijf ijfVarX = null;
        while (true) {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, "BaseURL")) {
                if (!z4) {
                    jE = e(xmlPullParser, jE);
                    z4 = z;
                }
                arrayList5.addAll(f(xmlPullParser, arrayListE, z2));
            } else if (a05.f(xmlPullParser, "ProgramInformation")) {
                fvdVarO = o(xmlPullParser);
            } else if (a05.f(xmlPullParser, "UTCTiming")) {
                eweVar = new ewe(xmlPullParser.getAttributeValue(str, "schemeIdUri"), xmlPullParser.getAttributeValue(str, SdkMetricStatEvent.VALUE_KEY), z3, 10);
            } else if (a05.f(xmlPullParser, "Location")) {
                uriE = w1m.e(uri.toString(), xmlPullParser.nextText());
            } else {
                if (a05.f(xmlPullParser, "ServiceDescription")) {
                    ijfVarX = x(xmlPullParser);
                } else if (!a05.f(xmlPullParser, "Period") || z5) {
                    jA0 = jA0;
                    arrayList = arrayList4;
                    j = -9223372036854775807L;
                    arrayList2 = arrayList5;
                    b(xmlPullParser);
                } else {
                    if (arrayList5.isEmpty()) {
                        arrayList3 = arrayListE;
                        arrayList2 = arrayList5;
                    } else {
                        arrayList3 = arrayList5;
                        arrayList2 = arrayList3;
                    }
                    arrayList = arrayList4;
                    j = -9223372036854775807L;
                    Pair pairM = m(xmlPullParser, arrayList3, j8, jE, jA0, j5, z2);
                    fsc fscVar = (fsc) pairM.first;
                    if (fscVar.b != -9223372036854775807L) {
                        long jLongValue = ((Long) pairM.second).longValue();
                        long j9 = jLongValue == -9223372036854775807L ? -9223372036854775807L : jLongValue + fscVar.b;
                        arrayList.add(fscVar);
                        j8 = j9;
                    } else {
                        if (!zEquals) {
                            throw ParserException.b(null, "Unable to determine start of period " + arrayList.size());
                        }
                        z5 = true;
                    }
                }
                if (a05.e(xmlPullParser, "MPD")) {
                    if (j2 == j) {
                        if (j8 != j) {
                            j2 = j8;
                        } else if (!zEquals) {
                            throw ParserException.b(null, "Unable to determine duration of static manifest.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        throw ParserException.b(null, "No periods found.");
                    }
                    return new k15(jA0, j2, j3, zEquals, j4, j5, j6, jA1, fvdVarO, eweVar, ijfVarX, uriE, arrayList);
                }
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                z3 = false;
                str = null;
                z = true;
                jA0 = jA0;
            }
            jA0 = jA0;
            arrayList = arrayList4;
            j = -9223372036854775807L;
            arrayList2 = arrayList5;
            if (a05.e(xmlPullParser, "MPD")) {
                if (j2 == j) {
                    if (j8 != j) {
                        j2 = j8;
                    } else if (!zEquals) {
                        throw ParserException.b(null, "Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    return new k15(jA0, j2, j3, zEquals, j4, j5, j6, jA1, fvdVarO, eweVar, ijfVarX, uriE, arrayList);
                }
                throw ParserException.b(null, "No periods found.");
            }
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            z3 = false;
            str = null;
            z = true;
            jA0 = jA0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final Pair m(XmlPullParser xmlPullParser, ArrayList arrayList, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        String str;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j5;
        ArrayList arrayList4;
        Pair pair;
        long j6;
        long j7;
        long j8;
        long j9;
        ArrayList arrayList5;
        long j10;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str3;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        long j11;
        String str4;
        int i;
        ArrayList arrayList12;
        String str5;
        String str6;
        int i2;
        long j12;
        Pair pair2;
        String str7;
        String str8;
        ArrayList arrayList13;
        long j13;
        ble zkeVar;
        String str9;
        String str10;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Pair pair3 = null;
        String str11 = "id";
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long j14 = j(xmlPullParser2, "start", j);
        long j15 = -9223372036854775807L;
        long j16 = j3 != -9223372036854775807L ? j3 + j14 : -9223372036854775807L;
        String str12 = "duration";
        long j17 = j(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        long jE = j2;
        mcf mcfVarV = null;
        long j18 = -9223372036854775807L;
        boolean z2 = false;
        while (true) {
            xmlPullParser2.next();
            String str13 = "BaseURL";
            if (a05.f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jE = e(xmlPullParser2, jE);
                    z2 = true;
                }
                arrayList16.addAll(f(xmlPullParser2, arrayList, z));
                pair = pair3;
                str = str11;
                j8 = j15;
                str2 = str12;
                arrayList4 = arrayList14;
                arrayList2 = arrayList15;
                arrayList3 = arrayList16;
                j7 = j16;
                j6 = j17;
            } else {
                String str14 = "SegmentTemplate";
                String str15 = "SegmentList";
                if (a05.f(xmlPullParser2, "AdaptationSet")) {
                    ArrayList arrayList17 = !arrayList16.isEmpty() ? arrayList16 : arrayList;
                    String attributeValue2 = xmlPullParser2.getAttributeValue(null, str11);
                    long j19 = attributeValue2 == null ? -1L : Long.parseLong(attributeValue2);
                    int iH = h(xmlPullParser2);
                    String str16 = "SegmentBase";
                    String attributeValue3 = xmlPullParser2.getAttributeValue(null, "mimeType");
                    String attributeValue4 = xmlPullParser2.getAttributeValue(null, "codecs");
                    str = str11;
                    String attributeValue5 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
                    String attributeValue6 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
                    String attributeValue7 = xmlPullParser2.getAttributeValue(null, "width");
                    int i3 = attributeValue7 == null ? -1 : Integer.parseInt(attributeValue7);
                    String attributeValue8 = xmlPullParser2.getAttributeValue(null, "height");
                    int i4 = attributeValue8 == null ? -1 : Integer.parseInt(attributeValue8);
                    float fK = k(xmlPullParser2, -1.0f);
                    int i5 = i4;
                    String attributeValue9 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                    int i6 = attributeValue9 == null ? -1 : Integer.parseInt(attributeValue9);
                    String str17 = "lang";
                    String attributeValue10 = xmlPullParser2.getAttributeValue(null, "lang");
                    String attributeValue11 = xmlPullParser2.getAttributeValue(null, "label");
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = new ArrayList();
                    String str18 = attributeValue11;
                    ArrayList arrayList20 = new ArrayList();
                    ArrayList arrayList21 = new ArrayList();
                    String str19 = "AdaptationSet";
                    ArrayList arrayList22 = new ArrayList();
                    str2 = str12;
                    ArrayList arrayList23 = new ArrayList();
                    arrayList4 = arrayList14;
                    ArrayList arrayList24 = new ArrayList();
                    arrayList2 = arrayList15;
                    ArrayList arrayList25 = new ArrayList();
                    ArrayList arrayList26 = new ArrayList();
                    j5 = jE;
                    int i7 = i3;
                    float f2 = fK;
                    String str20 = attributeValue10;
                    boolean z3 = false;
                    mcf mcfVarV2 = mcfVarV;
                    long j20 = j18;
                    int iD = -1;
                    arrayList3 = arrayList16;
                    int iH2 = iH;
                    String str21 = null;
                    while (true) {
                        xmlPullParser2.next();
                        if (a05.f(xmlPullParser2, str13)) {
                            if (!z3) {
                                jE = e(xmlPullParser2, jE);
                                z3 = true;
                            }
                            long j21 = jE;
                            arrayList26.addAll(f(xmlPullParser2, arrayList17, z));
                            ArrayList arrayList27 = arrayList18;
                            arrayList17 = arrayList17;
                            arrayList7 = arrayList27;
                            str14 = str14;
                            attributeValue6 = attributeValue6;
                            attributeValue4 = attributeValue4;
                            str7 = str17;
                            arrayList19 = arrayList19;
                            j7 = j16;
                            str = str;
                            j20 = j20;
                            i6 = i6;
                            str18 = str18;
                            arrayList8 = arrayList20;
                            str2 = str2;
                            arrayList4 = arrayList4;
                            arrayList2 = arrayList2;
                            arrayList9 = arrayList21;
                            arrayList11 = arrayList24;
                            str13 = str13;
                            i = i7;
                            arrayList3 = arrayList3;
                            str8 = str19;
                            arrayList10 = arrayList23;
                            str4 = str20;
                            arrayList12 = arrayList22;
                            j6 = j17;
                            pair2 = null;
                            str6 = str15;
                            str5 = str16;
                            arrayList6 = arrayList26;
                            j11 = j21;
                        } else {
                            if (a05.f(xmlPullParser2, "ContentProtection")) {
                                Pair pairG = g(xmlPullParser2);
                                arrayList6 = arrayList26;
                                Object obj = pairG.first;
                                if (obj != null) {
                                    str21 = (String) obj;
                                }
                                Object obj2 = pairG.second;
                                if (obj2 != null) {
                                    arrayList19.add((vu5) obj2);
                                }
                                ArrayList arrayList28 = arrayList18;
                                arrayList17 = arrayList17;
                                arrayList7 = arrayList28;
                                str14 = str14;
                                attributeValue6 = attributeValue6;
                                attributeValue4 = attributeValue4;
                                arrayList19 = arrayList19;
                            } else {
                                arrayList6 = arrayList26;
                                if (a05.f(xmlPullParser2, "ContentComponent")) {
                                    String attributeValue12 = xmlPullParser2.getAttributeValue(null, str17);
                                    if (str20 == null) {
                                        str20 = attributeValue12;
                                    } else if (attributeValue12 != null) {
                                        lvb.b0(str20.equals(attributeValue12));
                                    }
                                    int iH3 = h(xmlPullParser2);
                                    if (iH2 == -1) {
                                        iH2 = iH3;
                                    } else if (iH3 != -1) {
                                        lvb.b0(iH2 == iH3);
                                    }
                                    arrayList7 = arrayList18;
                                } else {
                                    if (a05.f(xmlPullParser2, "Role")) {
                                        arrayList22.add(i(xmlPullParser2, "Role"));
                                    } else if (a05.f(xmlPullParser2, "AudioChannelConfiguration")) {
                                        arrayList7 = arrayList18;
                                        iD = d(xmlPullParser2, attributeValue4);
                                    } else if (a05.f(xmlPullParser2, "Accessibility")) {
                                        arrayList21.add(i(xmlPullParser2, "Accessibility"));
                                    } else if (a05.f(xmlPullParser2, "EssentialProperty")) {
                                        arrayList23.add(i(xmlPullParser2, "EssentialProperty"));
                                    } else if (a05.f(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList24.add(i(xmlPullParser2, "SupplementalProperty"));
                                    } else if (a05.f(xmlPullParser2, "Representation")) {
                                        String str22 = str17;
                                        if (arrayList6.isEmpty()) {
                                            arrayList13 = arrayList17;
                                            arrayList17 = arrayList13;
                                        } else {
                                            arrayList13 = arrayList6;
                                            arrayList17 = arrayList17;
                                        }
                                        String str23 = attributeValue4;
                                        XmlPullParser xmlPullParser3 = xmlPullParser2;
                                        int i8 = iH2;
                                        int i9 = i5;
                                        o15 o15VarQ = q(xmlPullParser3, arrayList13, attributeValue3, str23, attributeValue5, attributeValue6, i7, i9, f2, iD, i6, str20, arrayList22, arrayList21, arrayList23, arrayList24, mcfVarV2, j16, j17, jE, j20, j4, z);
                                        i5 = i9;
                                        f2 = f2;
                                        str4 = str20;
                                        arrayList9 = arrayList21;
                                        arrayList10 = arrayList23;
                                        arrayList11 = arrayList24;
                                        String str24 = attributeValue3;
                                        String str25 = attributeValue5;
                                        attributeValue6 = attributeValue6;
                                        arrayList12 = arrayList22;
                                        j6 = j17;
                                        j20 = j20;
                                        i = i7;
                                        int i10 = iD;
                                        j11 = jE;
                                        i6 = i6;
                                        iH2 = uya.h(o15VarQ.a.n);
                                        if (i8 != -1) {
                                            if (iH2 != -1) {
                                                lvb.b0(i8 == iH2);
                                            }
                                            iH2 = i8;
                                        }
                                        ArrayList arrayList29 = arrayList25;
                                        arrayList29.add(o15VarQ);
                                        xmlPullParser2 = xmlPullParser3;
                                        arrayList25 = arrayList29;
                                        attributeValue3 = str24;
                                        attributeValue4 = str23;
                                        attributeValue5 = str25;
                                        j7 = j16;
                                        iD = i10;
                                        arrayList7 = arrayList18;
                                        arrayList8 = arrayList20;
                                        str14 = str14;
                                        str6 = str15;
                                        str5 = str16;
                                        str8 = str19;
                                        str7 = str22;
                                        pair2 = null;
                                    } else {
                                        String str26 = str14;
                                        String str27 = str15;
                                        attributeValue6 = attributeValue6;
                                        String str28 = str17;
                                        arrayList19 = arrayList19;
                                        str = str;
                                        i6 = i6;
                                        arrayList7 = arrayList18;
                                        str18 = str18;
                                        arrayList8 = arrayList20;
                                        str3 = str19;
                                        str2 = str2;
                                        arrayList4 = arrayList4;
                                        arrayList2 = arrayList2;
                                        String str29 = str16;
                                        XmlPullParser xmlPullParser4 = xmlPullParser2;
                                        arrayList9 = arrayList21;
                                        arrayList10 = arrayList23;
                                        arrayList11 = arrayList24;
                                        int i11 = iH2;
                                        j11 = jE;
                                        str13 = str13;
                                        arrayList17 = arrayList17;
                                        j6 = j17;
                                        arrayList3 = arrayList3;
                                        ArrayList arrayList30 = arrayList25;
                                        iD = iD;
                                        String str30 = attributeValue5;
                                        str4 = str20;
                                        String str31 = attributeValue3;
                                        ArrayList arrayList31 = arrayList22;
                                        String str32 = attributeValue4;
                                        j20 = j20;
                                        i = i7;
                                        arrayList12 = arrayList31;
                                        if (a05.f(xmlPullParser4, str29)) {
                                            mcfVarV2 = t(xmlPullParser4, (lcf) mcfVarV2);
                                            iH2 = i11;
                                            xmlPullParser2 = xmlPullParser4;
                                            arrayList25 = arrayList30;
                                            attributeValue3 = str31;
                                            attributeValue4 = str32;
                                            attributeValue5 = str30;
                                            iD = iD;
                                            arrayList7 = arrayList7;
                                            arrayList8 = arrayList8;
                                            str14 = str26;
                                            str6 = str27;
                                            str8 = str3;
                                            str7 = str28;
                                            pair2 = null;
                                            str5 = str29;
                                            j7 = j16;
                                        } else {
                                            if (a05.f(xmlPullParser4, str27)) {
                                                long jE2 = e(xmlPullParser4, j20);
                                                arrayList25 = arrayList30;
                                                attributeValue3 = str31;
                                                attributeValue4 = str32;
                                                attributeValue5 = str30;
                                                str6 = str27;
                                                str5 = str29;
                                                long j22 = j16;
                                                xmlPullParser2 = xmlPullParser4;
                                                mcfVarV2 = u(xmlPullParser2, (icf) mcfVarV2, j22, j6, j11, jE2, j4);
                                                j6 = j6;
                                                j7 = j22;
                                                j20 = jE2;
                                                j11 = j11;
                                                pair2 = null;
                                                iH2 = i11;
                                                str14 = str26;
                                            } else {
                                                arrayList25 = arrayList30;
                                                attributeValue3 = str31;
                                                attributeValue4 = str32;
                                                attributeValue5 = str30;
                                                Pair pair4 = null;
                                                str5 = str29;
                                                str6 = str27;
                                                long j23 = j16;
                                                i2 = i11;
                                                xmlPullParser2 = xmlPullParser4;
                                                j7 = j23;
                                                if (a05.f(xmlPullParser2, str26)) {
                                                    j11 = j11;
                                                    long jE3 = e(xmlPullParser2, j20);
                                                    str14 = str26;
                                                    mcfVarV2 = v(xmlPullParser2, (jcf) mcfVarV2, arrayList11, j7, j6, j11, jE3, j4);
                                                    j20 = jE3;
                                                    pair2 = null;
                                                    iH2 = i2;
                                                } else {
                                                    str14 = str26;
                                                    if (a05.f(xmlPullParser2, "InbandEventStream")) {
                                                        j11 = j11;
                                                        arrayList8 = arrayList8;
                                                        arrayList8.add(i(xmlPullParser2, "InbandEventStream"));
                                                        j12 = j20;
                                                        pair2 = null;
                                                        arrayList7 = arrayList7;
                                                        str7 = str28;
                                                    } else {
                                                        arrayList8 = arrayList8;
                                                        if (a05.f(xmlPullParser2, "Label")) {
                                                            j11 = j11;
                                                            str7 = str28;
                                                            String attributeValue13 = xmlPullParser2.getAttributeValue(null, str7);
                                                            String text = "";
                                                            while (true) {
                                                                xmlPullParser2.next();
                                                                pair2 = pair4;
                                                                j12 = j20;
                                                                if (xmlPullParser2.getEventType() == 4) {
                                                                    text = xmlPullParser2.getText();
                                                                } else {
                                                                    b(xmlPullParser2);
                                                                }
                                                                String str33 = text;
                                                                if (a05.e(xmlPullParser2, "Label")) {
                                                                    arrayList7 = arrayList7;
                                                                    arrayList7.add(new sx8(attributeValue13, str33));
                                                                } else {
                                                                    text = str33;
                                                                    pair4 = pair2;
                                                                    j20 = j12;
                                                                }
                                                            }
                                                        } else {
                                                            j12 = j20;
                                                            pair2 = null;
                                                            arrayList7 = arrayList7;
                                                            str7 = str28;
                                                            if (xmlPullParser2.getEventType() == 2) {
                                                                j11 = j11;
                                                                b(xmlPullParser2);
                                                            }
                                                        }
                                                    }
                                                    j11 = j11;
                                                    iH2 = i2;
                                                    j20 = j12;
                                                    str8 = str3;
                                                    iD = iD;
                                                }
                                            }
                                            str8 = str3;
                                            str7 = str28;
                                        }
                                    }
                                    ArrayList arrayList32 = arrayList18;
                                    arrayList17 = arrayList17;
                                    arrayList7 = arrayList32;
                                    str14 = str14;
                                    attributeValue6 = attributeValue6;
                                    attributeValue4 = attributeValue4;
                                    arrayList19 = arrayList19;
                                    str = str;
                                    i6 = i6;
                                    str18 = str18;
                                    str3 = str19;
                                    str2 = str2;
                                    arrayList4 = arrayList4;
                                    arrayList2 = arrayList2;
                                    arrayList10 = arrayList23;
                                    arrayList11 = arrayList24;
                                    j11 = jE;
                                    str13 = str13;
                                    arrayList3 = arrayList3;
                                    arrayList8 = arrayList20;
                                    str7 = str17;
                                    arrayList9 = arrayList21;
                                    str4 = str20;
                                    j7 = j16;
                                    j6 = j17;
                                    iD = iD;
                                    pair2 = null;
                                    str6 = str15;
                                    i2 = iH2;
                                    j12 = j20;
                                    i = i7;
                                    arrayList12 = arrayList22;
                                    str5 = str16;
                                    j11 = j11;
                                    iH2 = i2;
                                    j20 = j12;
                                    str8 = str3;
                                    iD = iD;
                                }
                            }
                            arrayList11 = arrayList24;
                            j11 = jE;
                            str13 = str13;
                            i = i7;
                            arrayList3 = arrayList3;
                            arrayList8 = arrayList20;
                            str8 = str19;
                            str7 = str17;
                            arrayList9 = arrayList21;
                            arrayList10 = arrayList23;
                            str4 = str20;
                            arrayList12 = arrayList22;
                            j7 = j16;
                            j6 = j17;
                            pair2 = null;
                            str6 = str15;
                            str5 = str16;
                        }
                        if (a05.e(xmlPullParser2, str8)) {
                            ArrayList arrayList33 = new ArrayList(arrayList25.size());
                            int i12 = 0;
                            while (i12 < arrayList25.size()) {
                                ArrayList arrayList34 = arrayList25;
                                o15 o15Var = (o15) arrayList34.get(i12);
                                a87 a87VarA = o15Var.a.a();
                                String str34 = str18;
                                if (str34 == null || !arrayList7.isEmpty()) {
                                    a87VarA.l(arrayList7);
                                } else {
                                    a87VarA.b = str34;
                                }
                                String str35 = o15Var.d;
                                if (str35 == null) {
                                    str35 = str21;
                                }
                                ArrayList arrayList35 = o15Var.e;
                                int i13 = i12;
                                arrayList35.addAll(arrayList19);
                                long j24 = j7;
                                if (arrayList35.isEmpty()) {
                                    j13 = j6;
                                    arrayList25 = arrayList34;
                                } else {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < arrayList35.size()) {
                                            vu5 vu5Var = (vu5) arrayList35.get(i14);
                                            j13 = j6;
                                            if (!f71.c.equals(vu5Var.b) || (str10 = vu5Var.c) == null) {
                                                i14++;
                                                j6 = j13;
                                            } else {
                                                arrayList35.remove(i14);
                                                str9 = str10;
                                            }
                                        } else {
                                            j13 = j6;
                                            str9 = pair2;
                                        }
                                    }
                                    if (str9 != 0) {
                                        int i15 = 0;
                                        while (i15 < arrayList35.size()) {
                                            vu5 vu5Var2 = (vu5) arrayList35.get(i15);
                                            if (f71.b.equals(vu5Var2.b) && vu5Var2.c == null) {
                                                arrayList35.set(i15, new vu5(f71.c, str9, vu5Var2.d, vu5Var2.e));
                                            }
                                            i15++;
                                            arrayList34 = arrayList34;
                                        }
                                    }
                                    arrayList25 = arrayList34;
                                    for (int size = arrayList35.size() - 1; size >= 0; size--) {
                                        vu5 vu5Var3 = (vu5) arrayList35.get(size);
                                        if (vu5Var3.e == null) {
                                            for (int i16 = 0; i16 < arrayList35.size(); i16++) {
                                                vu5 vu5Var4 = (vu5) arrayList35.get(i16);
                                                if (vu5Var4.e != null && vu5Var3.e == null && vu5Var4.a(vu5Var3.b)) {
                                                    arrayList35.remove(size);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    a87VarA.q = new wu5(str35, arrayList35);
                                }
                                ArrayList arrayList36 = o15Var.f;
                                arrayList36.addAll(arrayList8);
                                b87 b87Var = new b87(a87VarA);
                                c98 c98Var = o15Var.b;
                                mcf mcfVar = o15Var.c;
                                if (mcfVar instanceof lcf) {
                                    zkeVar = new ale(b87Var, c98Var, (lcf) mcfVar, arrayList36);
                                } else {
                                    if (!(mcfVar instanceof hcf)) {
                                        ore.p("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                        return pair2;
                                    }
                                    zkeVar = new zke(b87Var, c98Var, (hcf) mcfVar, arrayList36);
                                }
                                arrayList33.add(zkeVar);
                                i12 = i13 + 1;
                                j6 = j13;
                                str18 = str34;
                                j7 = j24;
                            }
                            arrayList4.add(new ga(j19, iH2, arrayList33, arrayList9, arrayList10, arrayList11));
                            pair = pair2;
                            j8 = -9223372036854775807L;
                        } else {
                            j16 = j7;
                            long j25 = j20;
                            ArrayList arrayList37 = arrayList17;
                            arrayList18 = arrayList7;
                            arrayList17 = arrayList37;
                            z = z;
                            j17 = j6;
                            str15 = str6;
                            str16 = str5;
                            attributeValue6 = attributeValue6;
                            arrayList22 = arrayList12;
                            i6 = i6;
                            i7 = i;
                            str20 = str4;
                            arrayList21 = arrayList9;
                            arrayList23 = arrayList10;
                            arrayList3 = arrayList3;
                            arrayList4 = arrayList4;
                            arrayList2 = arrayList2;
                            arrayList19 = arrayList19;
                            str = str;
                            j20 = j25;
                            arrayList20 = arrayList8;
                            str17 = str7;
                            str19 = str8;
                            str13 = str13;
                            str18 = str18;
                            attributeValue4 = attributeValue4;
                            jE = j11;
                            arrayList24 = arrayList11;
                            arrayList26 = arrayList6;
                            str2 = str2;
                            str14 = str14;
                        }
                    }
                } else {
                    str = str11;
                    str2 = str12;
                    ArrayList arrayList38 = arrayList14;
                    arrayList2 = arrayList15;
                    arrayList3 = arrayList16;
                    j5 = jE;
                    long j26 = j17;
                    if (a05.f(xmlPullParser2, "EventStream")) {
                        String attributeValue14 = xmlPullParser2.getAttributeValue(null, "schemeIdUri");
                        String str36 = attributeValue14 == null ? "" : attributeValue14;
                        String attributeValue15 = xmlPullParser2.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                        String str37 = attributeValue15 == null ? "" : attributeValue15;
                        String attributeValue16 = xmlPullParser2.getAttributeValue(null, "timescale");
                        long j27 = attributeValue16 == null ? 1L : Long.parseLong(attributeValue16);
                        String attributeValue17 = xmlPullParser2.getAttributeValue(null, "presentationTimeOffset");
                        long j28 = attributeValue17 == null ? 0L : Long.parseLong(attributeValue17);
                        ArrayList arrayList39 = new ArrayList();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(np0.o);
                        while (true) {
                            xmlPullParser2.next();
                            if (a05.f(xmlPullParser2, "Event")) {
                                String str38 = str;
                                String attributeValue18 = xmlPullParser2.getAttributeValue(null, str38);
                                long j29 = attributeValue18 == null ? 0L : Long.parseLong(attributeValue18);
                                String str39 = str2;
                                String attributeValue19 = xmlPullParser2.getAttributeValue(null, str39);
                                long j30 = attributeValue19 == null ? -9223372036854775807L : Long.parseLong(attributeValue19);
                                String attributeValue20 = xmlPullParser2.getAttributeValue(null, "presentationTime");
                                long j31 = attributeValue20 == null ? 0L : Long.parseLong(attributeValue20);
                                String str40 = vqi.a;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                str2 = str39;
                                str = str38;
                                long jI0 = vqi.i0(j30, 1000L, j27, roundingMode);
                                long jI1 = vqi.i0(j31 - j28, 1000000L, j27, roundingMode);
                                String attributeValue21 = xmlPullParser2.getAttributeValue(null, "messageData");
                                if (attributeValue21 == null) {
                                    attributeValue21 = null;
                                }
                                byteArrayOutputStream.reset();
                                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
                                xmlPullParser2.nextToken();
                                while (!a05.e(xmlPullParser2, "Event")) {
                                    switch (xmlPullParser2.getEventType()) {
                                        case 0:
                                            arrayList38 = arrayList38;
                                            j10 = j28;
                                            xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                            break;
                                        case 1:
                                            arrayList38 = arrayList38;
                                            j10 = j28;
                                            xmlSerializerNewSerializer.endDocument();
                                            break;
                                        case 2:
                                            xmlSerializerNewSerializer.startTag(xmlPullParser2.getNamespace(), xmlPullParser2.getName());
                                            int i17 = 0;
                                            while (i17 < xmlPullParser2.getAttributeCount()) {
                                                xmlSerializerNewSerializer.attribute(xmlPullParser2.getAttributeNamespace(i17), xmlPullParser2.getAttributeName(i17), xmlPullParser2.getAttributeValue(i17));
                                                i17++;
                                                j28 = j28;
                                            }
                                            j10 = j28;
                                            break;
                                        case 3:
                                            xmlSerializerNewSerializer.endTag(xmlPullParser2.getNamespace(), xmlPullParser2.getName());
                                            j10 = j28;
                                            break;
                                        case 4:
                                            xmlSerializerNewSerializer.text(xmlPullParser2.getText());
                                            j10 = j28;
                                            break;
                                        case 5:
                                            xmlSerializerNewSerializer.cdsect(xmlPullParser2.getText());
                                            j10 = j28;
                                            break;
                                        case 6:
                                            xmlSerializerNewSerializer.entityRef(xmlPullParser2.getText());
                                            j10 = j28;
                                            break;
                                        case 7:
                                            xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser2.getText());
                                            j10 = j28;
                                            break;
                                        case 8:
                                            xmlSerializerNewSerializer.processingInstruction(xmlPullParser2.getText());
                                            j10 = j28;
                                            break;
                                        case 9:
                                            xmlSerializerNewSerializer.comment(xmlPullParser2.getText());
                                            j10 = j28;
                                            break;
                                        case 10:
                                            xmlSerializerNewSerializer.docdecl(xmlPullParser2.getText());
                                            j10 = j28;
                                            break;
                                        default:
                                            j10 = j28;
                                            break;
                                    }
                                    xmlPullParser2.nextToken();
                                    j28 = j10;
                                    arrayList38 = arrayList38;
                                }
                                arrayList4 = arrayList38;
                                j9 = j28;
                                xmlSerializerNewSerializer.flush();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                Long lValueOf = Long.valueOf(jI1);
                                if (attributeValue21 != null) {
                                    byteArray = attributeValue21.getBytes(StandardCharsets.UTF_8);
                                }
                                byte[] bArr = byteArray;
                                arrayList5 = arrayList39;
                                arrayList5.add(Pair.create(lValueOf, new tc6(str36, str37, jI0, j29, bArr)));
                            } else {
                                arrayList4 = arrayList38;
                                j9 = j28;
                                arrayList5 = arrayList39;
                                b(xmlPullParser2);
                            }
                            if (a05.e(xmlPullParser2, "EventStream")) {
                                long[] jArr = new long[arrayList5.size()];
                                tc6[] tc6VarArr = new tc6[arrayList5.size()];
                                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                                    Pair pair5 = (Pair) arrayList5.get(i18);
                                    jArr[i18] = ((Long) pair5.first).longValue();
                                    tc6VarArr[i18] = (tc6) pair5.second;
                                }
                                arrayList2.add(new xc6(str36, str37, jArr, tc6VarArr));
                                j6 = j26;
                                j7 = j16;
                                j8 = -9223372036854775807L;
                                pair = null;
                            } else {
                                arrayList39 = arrayList5;
                                byteArrayOutputStream = byteArrayOutputStream;
                                j27 = j27;
                                arrayList38 = arrayList4;
                                j28 = j9;
                            }
                        }
                    } else {
                        arrayList4 = arrayList38;
                        if (a05.f(xmlPullParser2, "SegmentBase")) {
                            pair = null;
                            j6 = j26;
                            mcfVarV = t(xmlPullParser2, null);
                            arrayList2 = arrayList2;
                            j7 = j16;
                            jE = j5;
                            j8 = -9223372036854775807L;
                        } else {
                            pair = null;
                            if (a05.f(xmlPullParser2, str15)) {
                                j8 = -9223372036854775807L;
                                long jE4 = e(xmlPullParser2, -9223372036854775807L);
                                long j32 = j16;
                                j6 = j26;
                                j7 = j32;
                                mcfVarV = u(xmlPullParser2, null, j32, j26, j5, jE4, j4);
                                j18 = jE4;
                                arrayList2 = arrayList2;
                            } else {
                                j6 = j26;
                                j7 = j16;
                                j8 = -9223372036854775807L;
                                if (a05.f(xmlPullParser2, str14)) {
                                    long jE5 = e(xmlPullParser2, -9223372036854775807L);
                                    a98 a98Var = c98.b;
                                    arrayList2 = arrayList2;
                                    mcfVarV = v(xmlPullParser2, null, ghe.e, j7, j6, j5, jE5, j4);
                                    j18 = jE5;
                                } else if (a05.f(xmlPullParser2, "AssetIdentifier")) {
                                    arrayList2 = arrayList2;
                                    i(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    arrayList2 = arrayList2;
                                    b(xmlPullParser2);
                                }
                            }
                        }
                    }
                }
                jE = j5;
            }
            if (a05.e(xmlPullParser2, "Period")) {
                return Pair.create(new fsc(attributeValue, j14, arrayList4, arrayList2), Long.valueOf(j6));
            }
            j16 = j7;
            j17 = j6;
            j15 = j8;
            pair3 = pair;
            arrayList16 = arrayList3;
            arrayList14 = arrayList4;
            arrayList15 = arrayList2;
            str12 = str2;
            str11 = str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:127:0x02a9 A[PHI: r0
  0x02a9: PHI (r0v13 java.lang.String) = (r0v12 java.lang.String), (r0v34 java.lang.String) binds: [B:109:0x0264, B:125:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x0342  */
    /* JADX WARN: Code duplicated, block: B:169:0x034d  */
    /* JADX WARN: Code duplicated, block: B:274:0x055b A[LOOP:0: B:29:0x00a3->B:274:0x055b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:278:0x01e6 A[EDGE_INSN: B:278:0x01e6->B:71:0x01e6 BREAK  A[LOOP:0: B:29:0x00a3->B:274:0x055b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ee A[EDGE_INSN: B:74:0x01ee->B:83:0x020b BREAK  A[LOOP:8: B:76:0x01f7->B:82:0x0208]] */
    public o15 q(XmlPullParser xmlPullParser, ArrayList arrayList, String str, String str2, String str3, String str4, int i, int i2, float f2, int i3, int i4, String str5, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, mcf mcfVar, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        String str6;
        String str7;
        int i5;
        ArrayList arrayList6;
        int i6;
        int i7;
        String str8;
        ArrayList arrayList7;
        int i8;
        String str9;
        ArrayList arrayList8;
        ArrayList arrayList9;
        int iD;
        String strD;
        String str10;
        String strD2;
        String str11;
        int i9;
        Pair pairCreate;
        int i10;
        String str12;
        int i11;
        int iR;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "bandwidth");
        int i12 = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "mimeType");
        if (attributeValue3 == null) {
            attributeValue3 = str;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "codecs");
        if (attributeValue4 == null) {
            attributeValue4 = str2;
        }
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
        if (attributeValue5 == null) {
            attributeValue5 = str3;
        }
        xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "width");
        int i13 = attributeValue6 == null ? i : Integer.parseInt(attributeValue6);
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "height");
        int i14 = attributeValue7 == null ? i2 : Integer.parseInt(attributeValue7);
        float fK = k(xmlPullParser, f2);
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
        int i15 = attributeValue8 == null ? i4 : Integer.parseInt(attributeValue8);
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList(arrayList4);
        String str13 = attributeValue;
        ArrayList arrayList13 = arrayList5;
        ArrayList arrayList14 = new ArrayList(arrayList13);
        ArrayList arrayList15 = new ArrayList();
        int i16 = i3;
        mcf mcfVarV = mcfVar;
        int i17 = i12;
        ArrayList arrayList16 = arrayList14;
        int i18 = i13;
        int i19 = i14;
        boolean z2 = false;
        String str14 = null;
        long jE = j3;
        long j6 = j4;
        while (true) {
            xmlPullParser.next();
            str6 = attributeValue3;
            if (a05.f(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    jE = e(xmlPullParser, jE);
                    z2 = true;
                }
                str7 = attributeValue5;
                i5 = 1;
                arrayList15.addAll(f(xmlPullParser, arrayList, z));
            } else {
                str7 = attributeValue5;
                i5 = 1;
                if (a05.f(xmlPullParser, "AudioChannelConfiguration")) {
                    iD = d(xmlPullParser, attributeValue4);
                    i6 = i18;
                    i7 = i19;
                    str8 = str7;
                    arrayList7 = arrayList15;
                    i8 = i17;
                    str9 = attributeValue4;
                    arrayList8 = arrayList10;
                    arrayList9 = arrayList16;
                } else if (a05.f(xmlPullParser, "SegmentBase")) {
                    mcfVarV = t(xmlPullParser, (lcf) mcfVarV);
                } else {
                    if (a05.f(xmlPullParser, "SegmentList")) {
                        float f3 = fK;
                        long jE2 = e(xmlPullParser, j6);
                        arrayList6 = arrayList16;
                        fK = f3;
                        arrayList11 = arrayList11;
                        i6 = i18;
                        i7 = i19;
                        i15 = i15;
                        str8 = str7;
                        arrayList7 = arrayList15;
                        i8 = i17;
                        str9 = attributeValue4;
                        arrayList8 = arrayList10;
                        mcfVarV = u(xmlPullParser, (icf) mcfVarV, j, j2, jE, jE2, j5);
                        j6 = jE2;
                        str13 = str13;
                    } else {
                        arrayList6 = arrayList16;
                        fK = fK;
                        i15 = i15;
                        arrayList11 = arrayList11;
                        i6 = i18;
                        i7 = i19;
                        str8 = str7;
                        arrayList7 = arrayList15;
                        i8 = i17;
                        str9 = attributeValue4;
                        arrayList8 = arrayList10;
                        if (a05.f(xmlPullParser, "SegmentTemplate")) {
                            long jE3 = e(xmlPullParser, j6);
                            long j7 = jE;
                            str13 = str13;
                            jE = j7;
                            mcfVarV = v(xmlPullParser, (jcf) mcfVarV, arrayList13, j, j2, j7, jE3, j5);
                            j6 = jE3;
                        } else {
                            str13 = str13;
                            if (a05.f(xmlPullParser, "ContentProtection")) {
                                Pair pairG = g(xmlPullParser);
                                Object obj = pairG.first;
                                if (obj != null) {
                                    str14 = (String) obj;
                                }
                                Object obj2 = pairG.second;
                                if (obj2 != null) {
                                    arrayList8.add((vu5) obj2);
                                }
                            } else {
                                if (a05.f(xmlPullParser, "InbandEventStream")) {
                                    arrayList11.add(i(xmlPullParser, "InbandEventStream"));
                                } else {
                                    if (a05.f(xmlPullParser, "EssentialProperty")) {
                                        arrayList12.add(i(xmlPullParser, "EssentialProperty"));
                                    } else if (a05.f(xmlPullParser, "SupplementalProperty")) {
                                        arrayList9 = arrayList6;
                                        arrayList9.add(i(xmlPullParser, "SupplementalProperty"));
                                    } else {
                                        arrayList9 = arrayList6;
                                        b(xmlPullParser);
                                    }
                                    iD = i16;
                                }
                                arrayList9 = arrayList6;
                                iD = i16;
                            }
                        }
                    }
                    iD = i16;
                    arrayList9 = arrayList6;
                }
                if (a05.e(xmlPullParser, "Representation")) {
                    break;
                }
                attributeValue3 = str6;
                arrayList13 = arrayList5;
                arrayList16 = arrayList9;
                i16 = iD;
                arrayList11 = arrayList11;
                arrayList10 = arrayList8;
                attributeValue4 = str9;
                i17 = i8;
                attributeValue5 = str8;
                i18 = i6;
                i19 = i7;
                fK = fK;
                i15 = i15;
                str13 = str13;
                arrayList15 = arrayList7;
            }
            iD = i16;
            i6 = i18;
            i7 = i19;
            str8 = str7;
            arrayList7 = arrayList15;
            i8 = i17;
            str9 = attributeValue4;
            arrayList8 = arrayList10;
            arrayList9 = arrayList16;
            if (a05.e(xmlPullParser, "Representation")) {
                break;
                break;
            }
            attributeValue3 = str6;
            arrayList13 = arrayList5;
            arrayList16 = arrayList9;
            i16 = iD;
            arrayList11 = arrayList11;
            arrayList10 = arrayList8;
            attributeValue4 = str9;
            i17 = i8;
            attributeValue5 = str8;
            i18 = i6;
            i19 = i7;
            fK = fK;
            i15 = i15;
            str13 = str13;
            arrayList15 = arrayList7;
        }
        if (uya.i(str6)) {
            if (str9 == null) {
                strD2 = null;
                break;
            }
            String[] strArrL0 = vqi.l0(str9);
            int length = strArrL0.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    strD2 = null;
                    break;
                }
                strD2 = uya.d(strArrL0[i20]);
                if (strD2 != null && uya.i(strD2)) {
                    break;
                }
                i20++;
            }
            strD = strD2;
            str10 = str6;
        } else if (uya.m(str6)) {
            if (str9 == null) {
                strD2 = null;
                break;
            }
            String[] strArrL1 = vqi.l0(str9);
            int length2 = strArrL1.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length2) {
                    strD2 = null;
                    break;
                }
                strD2 = uya.d(strArrL1[i21]);
                if (strD2 != null && uya.m(strD2)) {
                    break;
                }
                i21++;
            }
            strD = strD2;
            str10 = str6;
        } else if (uya.l(str6) || uya.k(str6)) {
            strD = str6;
            str10 = strD;
        } else {
            str10 = str6;
            if ("application/mp4".equals(str10)) {
                strD = uya.d(str9);
                if ("text/vtt".equals(strD)) {
                    strD = "application/x-mp4-vtt";
                }
            } else {
                strD = null;
            }
        }
        if ("audio/eac3".equals(strD)) {
            int i22 = 0;
            while (true) {
                if (i22 >= arrayList9.size()) {
                    strD = "audio/eac3";
                    break;
                }
                hi5 hi5Var = (hi5) arrayList9.get(i22);
                String str15 = hi5Var.a;
                String str16 = hi5Var.b;
                if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str15) && "JOC".equals(str16)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str15) && "ec+3".equals(str16))) {
                    strD = "audio/eac3-joc";
                    break;
                }
                i22++;
            }
            str11 = "audio/eac3-joc".equals(strD) ? "ec+3" : str9;
        }
        String str17 = str8;
        if (uya.j(str11, str17)) {
            if (str17 != null) {
                str11 = str17;
            }
            strD = "video/dolby-vision";
        }
        int i23 = 0;
        for (int i24 = 0; i24 < arrayList2.size(); i24++) {
            hi5 hi5Var2 = (hi5) arrayList2.get(i24);
            if (n1g.r("urn:mpeg:dash:role:2011", hi5Var2.a)) {
                String str18 = hi5Var2.b;
                i23 |= (str18 != null && (str18.equals("forced_subtitle") || str18.equals("forced-subtitle"))) ? 2 : 0;
            }
        }
        int iR2 = 0;
        for (int i25 = 0; i25 < arrayList2.size(); i25++) {
            hi5 hi5Var3 = (hi5) arrayList2.get(i25);
            if (n1g.r("urn:mpeg:dash:role:2011", hi5Var3.a)) {
                iR2 |= r(hi5Var3.b);
            }
        }
        int i26 = 0;
        int i27 = 0;
        while (i26 < arrayList3.size()) {
            hi5 hi5Var4 = (hi5) arrayList3.get(i26);
            String str19 = hi5Var4.a;
            int i28 = i26;
            String str20 = hi5Var4.b;
            if (n1g.r("urn:mpeg:dash:role:2011", str19)) {
                iR = r(str20);
            } else {
                if (n1g.r("urn:tva:metadata:cs:AudioPurposeCS:2007", hi5Var4.a)) {
                    if (str20 != null) {
                        switch (str20.hashCode()) {
                            case 49:
                                if (str20.equals("1")) {
                                    i11 = 0;
                                } else {
                                    i11 = -1;
                                }
                                break;
                            case 50:
                                if (str20.equals("2")) {
                                    i11 = i5;
                                } else {
                                    i11 = -1;
                                }
                                break;
                            case 51:
                                if (str20.equals("3")) {
                                    i11 = 2;
                                } else {
                                    i11 = -1;
                                }
                                break;
                            case 52:
                                if (str20.equals("4")) {
                                    i11 = 3;
                                } else {
                                    i11 = -1;
                                }
                                break;
                            case 53:
                            default:
                                i11 = -1;
                                break;
                            case 54:
                                if (str20.equals("6")) {
                                    i11 = 4;
                                } else {
                                    i11 = -1;
                                }
                                break;
                        }
                        switch (i11) {
                            case 0:
                                iR = np0.o;
                                break;
                            case 1:
                                iR = np0.q;
                                break;
                            case 2:
                                iR = 4;
                                break;
                            case 3:
                                iR = 8;
                                break;
                            case 4:
                                iR = i5;
                                break;
                            default:
                                iR = 0;
                                break;
                        }
                    } else {
                        iR = 0;
                    }
                }
                i26 = i28 + 1;
            }
            i27 |= iR;
            i26 = i28 + 1;
        }
        int iS = iR2 | i27 | s(arrayList12) | s(arrayList9);
        int i29 = 0;
        while (true) {
            if (i29 < arrayList12.size()) {
                hi5 hi5Var5 = (hi5) arrayList12.get(i29);
                if ((n1g.r("http://dashif.org/thumbnail_tile", hi5Var5.a) || n1g.r("http://dashif.org/guidelines/thumbnail_tile", hi5Var5.a)) && (str12 = hi5Var5.b) != null) {
                    String str21 = vqi.a;
                    i9 = -1;
                    String[] strArrSplit = str12.split("x", -1);
                    if (strArrSplit.length != 2) {
                        continue;
                    } else {
                        try {
                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i5])));
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    }
                }
                i29++;
            } else {
                i9 = -1;
                pairCreate = null;
            }
        }
        a87 a87Var = new a87();
        a87Var.a = str13;
        a87Var.l = uya.n(str10);
        a87Var.m = uya.n(strD);
        a87Var.j = str11;
        a87Var.i = i8;
        a87Var.e = i23;
        a87Var.f = iS;
        a87Var.d = str5;
        a87Var.L = pairCreate != null ? ((Integer) pairCreate.first).intValue() : i9;
        a87Var.M = pairCreate != null ? ((Integer) pairCreate.second).intValue() : i9;
        if (uya.m(strD)) {
            a87Var.t = i6;
            a87Var.u = i7;
            a87Var.x = fK;
        } else {
            int i30 = i6;
            int i31 = i7;
            if (uya.i(strD)) {
                a87Var.E = iD;
                a87Var.F = i15;
            } else if (uya.l(strD)) {
                if ("application/cea-608".equals(strD)) {
                    int i32 = 0;
                    while (true) {
                        if (i32 < arrayList3.size()) {
                            hi5 hi5Var6 = (hi5) arrayList3.get(i32);
                            String str22 = hi5Var6.a;
                            String str23 = hi5Var6.b;
                            if ("urn:scte:dash:cc:cea-608:2015".equals(str22) && str23 != null) {
                                Matcher matcher = c.matcher(str23);
                                if (matcher.matches()) {
                                    i10 = Integer.parseInt(matcher.group(i5));
                                } else {
                                    lvb.G0("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str23));
                                }
                            }
                            i32++;
                            i5 = 1;
                        } else {
                            i10 = i9;
                        }
                    }
                } else if ("application/cea-708".equals(strD)) {
                    int i33 = 0;
                    while (true) {
                        if (i33 < arrayList3.size()) {
                            hi5 hi5Var7 = (hi5) arrayList3.get(i33);
                            String str24 = hi5Var7.a;
                            String str25 = hi5Var7.b;
                            if ("urn:scte:dash:cc:cea-708:2015".equals(str24) && str25 != null) {
                                Matcher matcher2 = d.matcher(str25);
                                if (matcher2.matches()) {
                                    i10 = Integer.parseInt(matcher2.group(1));
                                } else {
                                    lvb.G0("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str25));
                                }
                            }
                            i33++;
                        } else {
                            i10 = i9;
                        }
                    }
                } else {
                    i10 = i9;
                }
                a87Var.J = i10;
            } else if (uya.k(strD)) {
                a87Var.t = i30;
                a87Var.u = i31;
            }
        }
        b87 b87Var = new b87(a87Var);
        if (mcfVarV == null) {
            mcfVarV = new lcf(null, 1L, 0L, 0L, 0L);
        }
        return new o15(b87Var, !arrayList7.isEmpty() ? arrayList7 : arrayList, mcfVarV, str14, arrayList8, arrayList11, arrayList12, arrayList9, -1L);
    }
}
