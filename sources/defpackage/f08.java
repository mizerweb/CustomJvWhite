package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f08 {
    public static final bu7[] a;
    public static final Map b;

    static {
        bu7 bu7Var = new bu7(bu7.i, "");
        d71 d71Var = bu7.f;
        bu7 bu7Var2 = new bu7(d71Var, HttpGet.METHOD_NAME);
        bu7 bu7Var3 = new bu7(d71Var, HttpPost.METHOD_NAME);
        d71 d71Var2 = bu7.g;
        bu7 bu7Var4 = new bu7(d71Var2, "/");
        bu7 bu7Var5 = new bu7(d71Var2, "/index.html");
        d71 d71Var3 = bu7.h;
        bu7 bu7Var6 = new bu7(d71Var3, HttpHost.DEFAULT_SCHEME_NAME);
        bu7 bu7Var7 = new bu7(d71Var3, "https");
        d71 d71Var4 = bu7.e;
        bu7[] bu7VarArr = {bu7Var, bu7Var2, bu7Var3, bu7Var4, bu7Var5, bu7Var6, bu7Var7, new bu7(d71Var4, "200"), new bu7(d71Var4, "204"), new bu7(d71Var4, "206"), new bu7(d71Var4, "304"), new bu7(d71Var4, "400"), new bu7(d71Var4, "404"), new bu7(d71Var4, "500"), new bu7("accept-charset", ""), new bu7("accept-encoding", "gzip, deflate"), new bu7("accept-language", ""), new bu7("accept-ranges", ""), new bu7("accept", ""), new bu7("access-control-allow-origin", ""), new bu7("age", ""), new bu7("allow", ""), new bu7("authorization", ""), new bu7("cache-control", ""), new bu7("content-disposition", ""), new bu7("content-encoding", ""), new bu7("content-language", ""), new bu7("content-length", ""), new bu7("content-location", ""), new bu7("content-range", ""), new bu7("content-type", ""), new bu7("cookie", ""), new bu7("date", ""), new bu7("etag", ""), new bu7("expect", ""), new bu7(ClientCookie.EXPIRES_ATTR, ""), new bu7("from", ""), new bu7(CandidateTypeHintConfig.TYPE_HOST, ""), new bu7("if-match", ""), new bu7("if-modified-since", ""), new bu7("if-none-match", ""), new bu7("if-range", ""), new bu7("if-unmodified-since", ""), new bu7("last-modified", ""), new bu7("link", ""), new bu7("location", ""), new bu7("max-forwards", ""), new bu7("proxy-authenticate", ""), new bu7("proxy-authorization", ""), new bu7("range", ""), new bu7("referer", ""), new bu7("refresh", ""), new bu7("retry-after", ""), new bu7("server", ""), new bu7("set-cookie", ""), new bu7("strict-transport-security", ""), new bu7("transfer-encoding", ""), new bu7("user-agent", ""), new bu7("vary", ""), new bu7("via", ""), new bu7("www-authenticate", "")};
        a = bu7VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(bu7VarArr[i].a)) {
                linkedHashMap.put(bu7VarArr[i].a, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(d71 d71Var) throws IOException {
        int iA = d71Var.a();
        for (int i = 0; i < iA; i++) {
            byte bK = d71Var.k(i);
            if (65 <= bK && bK < 91) {
                qr7.k("PROTOCOL_ERROR response malformed: mixed case name: ".concat(d71Var.p()));
                return;
            }
        }
    }
}
