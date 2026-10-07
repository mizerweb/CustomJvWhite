package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class a7a {
    public static final d98 f;
    public static final zs2 g;
    public static final HashMap h;
    public static final a7a i;
    public static final vn7 j;
    public final String a;
    public final String b;
    public final d98 c;
    public String d;
    public int e;

    static {
        d98 d98Var;
        String strB0 = n1g.b0(StandardCharsets.UTF_8.name());
        uik uikVar = new uik(15);
        oc9.n("charset", strB0);
        u44 u44VarA = (u44) uikVar.b;
        if (u44VarA == null) {
            u44VarA = u44.a();
            uikVar.b = u44VarA;
        }
        r88 z88Var = (r88) u44VarA.get("charset");
        if (z88Var == null) {
            a98 a98Var = c98.b;
            oc9.p(4, "expectedSize");
            z88Var = new z88(4);
            u44 u44VarA2 = (u44) uikVar.b;
            if (u44VarA2 == null) {
                u44VarA2 = u44.a();
                uikVar.b = u44VarA2;
            }
            u44VarA2.put("charset", z88Var);
        }
        z88Var.a(strB0);
        u44 u44Var = (u44) uikVar.b;
        if (u44Var == null) {
            d98Var = p66.g;
        } else {
            Collection collectionEntrySet = u44Var.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                d98Var = p66.g;
            } else {
                s44<Map.Entry> s44Var = (s44) collectionEntrySet;
                hle hleVar = new hle(((u44) s44Var.b).size());
                int i2 = 0;
                for (Map.Entry entry : s44Var) {
                    Object key = entry.getKey();
                    ghe gheVarH = ((z88) entry.getValue()).h();
                    hleVar.j(key, gheVarH);
                    i2 += gheVarH.d;
                }
                d98Var = new d98(hleVar.c(true), i2);
            }
        }
        f = d98Var;
        at2 at2Var = at2.d;
        at2 at2Var2 = at2.e;
        at2Var2.getClass();
        ft2 ft2Var = new ft2(at2Var2);
        at2Var.getClass();
        g = new zs2(new zs2(new zs2(at2Var, ft2Var), new dt2(' ', 1)), gt2.b("()<>@,;:\\\"/[]?=").d());
        gt2.b("\"\\\r").d().getClass();
        gt2.b(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "*");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "*");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "mp4");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "mpeg");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "ogg");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "webm");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "l16");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "l24");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "basic");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "aac");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vorbis");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "x-ms-wma");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "x-ms-wax");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vnd.rn-realaudio");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vnd.wave");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "mp4");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "mpeg");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "ogg");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "quicktime");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "webm");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "x-ms-wmv");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "x-flv");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "3gpp");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "3gpp2");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "xml");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "atom+xml");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-bzip2");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "dart");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.apple.pkpass");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.ms-fontobject");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "epub+zip");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-www-form-urlencoded");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "pkcs12");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "binary");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "geo+json");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-gzip");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "hal+json");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "javascript");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "jose");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "jose+json");
        i = b(CallAnalyticsApiRequest.KEY_APPLICATION, "json");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "jwt");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "manifest+json");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.google-earth.kml+xml");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.google-earth.kmz");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "mbox");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-apple-aspen-config");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.ms-excel");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.ms-outlook");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.ms-powerpoint");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "msword");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "dash+xml");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "wasm");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-nacl");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-pnacl");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "octet-stream");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "ogg");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.oasis.opendocument.graphics");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.oasis.opendocument.presentation");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.oasis.opendocument.spreadsheet");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.oasis.opendocument.text");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "opensearchdescription+xml");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "pdf");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "postscript");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "protobuf");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "rdf+xml");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "rtf");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "font-sfnt");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-shockwave-flash");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "vnd.sketchup.skp");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "soap+xml");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "x-tar");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "font-woff");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "font-woff2");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "xhtml+xml");
        b(CallAnalyticsApiRequest.KEY_APPLICATION, "xrd+xml");
        a(CallAnalyticsApiRequest.KEY_APPLICATION, "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new vn7(19, new ste("; ", 1));
    }

    public a7a(String str, String str2, d98 d98Var) {
        this.a = str;
        this.b = str2;
        this.c = d98Var;
    }

    public static void a(String str, String str2) {
        a7a a7aVar = new a7a(str, str2, p66.g);
        h.put(a7aVar, a7aVar);
    }

    public static a7a b(String str, String str2) {
        a7a a7aVar = new a7a(str, str2, f);
        h.put(a7aVar, a7aVar);
        StandardCharsets.UTF_8.getClass();
        return a7aVar;
    }

    public final um9 c() {
        return new um9(this.c.b(), new ex8(20, new f4a(16)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a7a)) {
            return false;
        }
        a7a a7aVar = (a7a) obj;
        return this.a.equals(a7aVar.a) && this.b.equals(a7aVar.b) && c().equals(a7aVar.c());
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        d98 d98Var = this.c;
        if (d98Var.size() != 0) {
            sb.append("; ");
            Collection collectionA = new f7b(d98Var, new ex8(20, new f4a(15))).a();
            vn7 vn7Var = j;
            vn7Var.getClass();
            try {
                vn7Var.i(sb, collectionA.iterator());
            } catch (IOException e) {
                c.e(e);
                return null;
            }
        }
        String string = sb.toString();
        this.d = string;
        return string;
    }
}
