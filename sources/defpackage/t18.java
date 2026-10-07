package defpackage;

import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public abstract class t18 {
    public static final /* synthetic */ int a = 0;

    static {
        new d71(BasicHeaderValueFormatter.UNSAFE_CHARS.getBytes(pt2.a)).c = BasicHeaderValueFormatter.UNSAFE_CHARS;
        new d71("\t ,=".getBytes(pt2.a)).c = "\t ,=";
    }

    public static final boolean a(pne pneVar) {
        if (cqk.d(pneVar.a.b, HttpHead.METHOD_NAME)) {
            return false;
        }
        int i = pneVar.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || uqi.k(pneVar) != -1) {
            return true;
        }
        String strA = pneVar.f.a(HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        return HTTP.CHUNK_CODING.equalsIgnoreCase(strA);
    }
}
