package org.apache.http.impl.io;

import defpackage.ore;
import defpackage.qr7;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractMessageParser implements HttpMessageParser {
    protected final LineParser lineParser;
    private final int maxHeaderCount;
    private final int maxLineLen;
    private final SessionInputBuffer sessionBuffer;

    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpParams httpParams) {
        if (sessionInputBuffer == null) {
            ore.p("Session input buffer may not be null");
            throw null;
        }
        if (httpParams == null) {
            ore.p("HTTP parameters may not be null");
            throw null;
        }
        this.sessionBuffer = sessionInputBuffer;
        this.maxHeaderCount = httpParams.getIntParameter("http.connection.max-header-count", -1);
        this.maxLineLen = httpParams.getIntParameter("http.connection.max-line-length", -1);
        this.lineParser = lineParser == null ? BasicLineParser.DEFAULT : lineParser;
    }

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser) throws HttpException, IOException {
        int i3;
        char cCharAt;
        if (sessionInputBuffer == null) {
            ore.p("Session input buffer may not be null");
            return null;
        }
        if (lineParser == null) {
            lineParser = BasicLineParser.DEFAULT;
        }
        ArrayList arrayList = new ArrayList();
        CharArrayBuffer charArrayBuffer = null;
        CharArrayBuffer charArrayBuffer2 = null;
        while (true) {
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(64);
            } else {
                charArrayBuffer.clear();
            }
            i3 = 0;
            if (sessionInputBuffer.readLine(charArrayBuffer) == -1 || charArrayBuffer.length() < 1) {
                break;
            }
            if ((charArrayBuffer.charAt(0) == ' ' || charArrayBuffer.charAt(0) == '\t') && charArrayBuffer2 != null) {
                while (i3 < charArrayBuffer.length() && ((cCharAt = charArrayBuffer.charAt(i3)) == ' ' || cCharAt == '\t')) {
                    i3++;
                }
                if (i2 > 0) {
                    if ((charArrayBuffer.length() + (charArrayBuffer2.length() + 1)) - i3 > i2) {
                        qr7.k("Maximum line length limit exceeded");
                        return null;
                    }
                }
                charArrayBuffer2.append(' ');
                charArrayBuffer2.append(charArrayBuffer, i3, charArrayBuffer.length() - i3);
            } else {
                arrayList.add(charArrayBuffer);
                charArrayBuffer2 = charArrayBuffer;
                charArrayBuffer = null;
            }
            if (i > 0 && arrayList.size() >= i) {
                qr7.k("Maximum header count exceeded");
                return null;
            }
        }
        Header[] headerArr = new Header[arrayList.size()];
        while (i3 < arrayList.size()) {
            try {
                headerArr[i3] = lineParser.parseHeader((CharArrayBuffer) arrayList.get(i3));
                i3++;
            } catch (ParseException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        return headerArr;
    }

    @Override // org.apache.http.io.HttpMessageParser
    public HttpMessage parse() throws HttpException, IOException {
        try {
            HttpMessage head = parseHead(this.sessionBuffer);
            head.setHeaders(parseHeaders(this.sessionBuffer, this.maxHeaderCount, this.maxLineLen, this.lineParser));
            return head;
        } catch (ParseException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }

    public abstract HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws HttpException, ParseException, IOException;
}
