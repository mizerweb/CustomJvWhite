package org.apache.http.impl.cookie;

import defpackage.ore;
import java.util.ArrayList;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class NetscapeDraftHeaderParser {
    public static final NetscapeDraftHeaderParser DEFAULT = new NetscapeDraftHeaderParser();
    private static final char[] DELIMITERS = {';'};
    private final BasicHeaderValueParser nvpParser = BasicHeaderValueParser.DEFAULT;

    public HeaderElement parseHeader(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        if (charArrayBuffer == null) {
            ore.p("Char array buffer may not be null");
            return null;
        }
        if (parserCursor == null) {
            ore.p("Parser cursor may not be null");
            return null;
        }
        NameValuePair nameValuePair = this.nvpParser.parseNameValuePair(charArrayBuffer, parserCursor, DELIMITERS);
        ArrayList arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            arrayList.add(this.nvpParser.parseNameValuePair(charArrayBuffer, parserCursor, DELIMITERS));
        }
        return new BasicHeaderElement(nameValuePair.getName(), nameValuePair.getValue(), (NameValuePair[]) arrayList.toArray(new NameValuePair[arrayList.size()]));
    }
}
