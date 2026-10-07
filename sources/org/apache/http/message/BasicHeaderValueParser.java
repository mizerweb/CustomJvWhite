package org.apache.http.message;

import defpackage.ore;
import java.util.ArrayList;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicHeaderValueParser implements HeaderValueParser {
    public static final BasicHeaderValueParser DEFAULT = new BasicHeaderValueParser();
    private static final char PARAM_DELIMITER = ';';
    private static final char ELEM_DELIMITER = ',';
    private static final char[] ALL_DELIMITERS = {PARAM_DELIMITER, ELEM_DELIMITER};

    private static boolean isOneOf(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    public HeaderElement createHeaderElement(String str, String str2, NameValuePair[] nameValuePairArr) {
        return new BasicHeaderElement(str, str2, nameValuePairArr);
    }

    public NameValuePair createNameValuePair(String str, String str2) {
        return new BasicNameValuePair(str, str2);
    }

    @Override // org.apache.http.message.HeaderValueParser
    public HeaderElement[] parseElements(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        if (charArrayBuffer == null) {
            ore.p("Char array buffer may not be null");
            return null;
        }
        if (parserCursor == null) {
            ore.p("Parser cursor may not be null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            HeaderElement headerElement = parseHeaderElement(charArrayBuffer, parserCursor);
            if (headerElement.getName().length() != 0 || headerElement.getValue() != null) {
                arrayList.add(headerElement);
            }
        }
        return (HeaderElement[]) arrayList.toArray(new HeaderElement[arrayList.size()]);
    }

    @Override // org.apache.http.message.HeaderValueParser
    public HeaderElement parseHeaderElement(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        NameValuePair[] parameters = null;
        if (charArrayBuffer == null) {
            ore.p("Char array buffer may not be null");
            return null;
        }
        if (parserCursor == null) {
            ore.p("Parser cursor may not be null");
            return null;
        }
        NameValuePair nameValuePair = parseNameValuePair(charArrayBuffer, parserCursor);
        if (!parserCursor.atEnd() && charArrayBuffer.charAt(parserCursor.getPos() - 1) != ',') {
            parameters = parseParameters(charArrayBuffer, parserCursor);
        }
        return createHeaderElement(nameValuePair.getName(), nameValuePair.getValue(), parameters);
    }

    public NameValuePair parseNameValuePair(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, char[] cArr) {
        boolean z;
        boolean z2;
        String strSubstringTrimmed;
        char cCharAt;
        if (charArrayBuffer == null) {
            ore.p("Char array buffer may not be null");
            return null;
        }
        if (parserCursor == null) {
            ore.p("Parser cursor may not be null");
            return null;
        }
        int pos = parserCursor.getPos();
        int pos2 = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (true) {
            z = true;
            if (pos >= upperBound || (cCharAt = charArrayBuffer.charAt(pos)) == '=') {
                z2 = false;
                break;
            }
            if (isOneOf(cCharAt, cArr)) {
                z2 = true;
                break;
            }
            pos++;
        }
        if (pos == upperBound) {
            strSubstringTrimmed = charArrayBuffer.substringTrimmed(pos2, upperBound);
            z2 = true;
        } else {
            strSubstringTrimmed = charArrayBuffer.substringTrimmed(pos2, pos);
            pos++;
        }
        if (z2) {
            parserCursor.updatePos(pos);
            return createNameValuePair(strSubstringTrimmed, null);
        }
        int i = pos;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i >= upperBound) {
                z = z2;
                break;
            }
            char cCharAt2 = charArrayBuffer.charAt(i);
            if (cCharAt2 == '\"' && !z3) {
                z4 = !z4;
            }
            if (!z4 && !z3 && isOneOf(cCharAt2, cArr)) {
                break;
            }
            z3 = !z3 && z4 && cCharAt2 == '\\';
            i++;
        }
        while (pos < i && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        int i2 = i;
        while (i2 > pos && HTTP.isWhitespace(charArrayBuffer.charAt(i2 - 1))) {
            i2--;
        }
        if (i2 - pos >= 2 && charArrayBuffer.charAt(pos) == '\"' && charArrayBuffer.charAt(i2 - 1) == '\"') {
            pos++;
            i2--;
        }
        String strSubstring = charArrayBuffer.substring(pos, i2);
        if (z) {
            i++;
        }
        parserCursor.updatePos(i);
        return createNameValuePair(strSubstringTrimmed, strSubstring);
    }

    @Override // org.apache.http.message.HeaderValueParser
    public NameValuePair[] parseParameters(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        if (charArrayBuffer == null) {
            ore.p("Char array buffer may not be null");
            return null;
        }
        if (parserCursor == null) {
            ore.p("Parser cursor may not be null");
            return null;
        }
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
        if (parserCursor.atEnd()) {
            return new NameValuePair[0];
        }
        ArrayList arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            arrayList.add(parseNameValuePair(charArrayBuffer, parserCursor));
            if (charArrayBuffer.charAt(parserCursor.getPos() - 1) == ',') {
                break;
            }
        }
        return (NameValuePair[]) arrayList.toArray(new NameValuePair[arrayList.size()]);
    }

    public static final HeaderElement parseHeaderElement(String str, HeaderValueParser headerValueParser) throws ParseException {
        if (str != null) {
            if (headerValueParser == null) {
                headerValueParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return headerValueParser.parseHeaderElement(charArrayBuffer, new ParserCursor(0, str.length()));
        }
        ore.p("Value to parse may not be null");
        return null;
    }

    public static final HeaderElement[] parseElements(String str, HeaderValueParser headerValueParser) throws ParseException {
        if (str != null) {
            if (headerValueParser == null) {
                headerValueParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return headerValueParser.parseElements(charArrayBuffer, new ParserCursor(0, str.length()));
        }
        ore.p("Value to parse may not be null");
        return null;
    }

    public static final NameValuePair[] parseParameters(String str, HeaderValueParser headerValueParser) throws ParseException {
        if (str != null) {
            if (headerValueParser == null) {
                headerValueParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return headerValueParser.parseParameters(charArrayBuffer, new ParserCursor(0, str.length()));
        }
        ore.p("Value to parse may not be null");
        return null;
    }

    @Override // org.apache.http.message.HeaderValueParser
    public NameValuePair parseNameValuePair(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        return parseNameValuePair(charArrayBuffer, parserCursor, ALL_DELIMITERS);
    }

    public static final NameValuePair parseNameValuePair(String str, HeaderValueParser headerValueParser) throws ParseException {
        if (str != null) {
            if (headerValueParser == null) {
                headerValueParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return headerValueParser.parseNameValuePair(charArrayBuffer, new ParserCursor(0, str.length()));
        }
        ore.p("Value to parse may not be null");
        return null;
    }
}
