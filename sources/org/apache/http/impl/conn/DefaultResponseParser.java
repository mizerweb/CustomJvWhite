package org.apache.http.impl.conn;

import defpackage.np0;
import defpackage.ore;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.conn.params.ConnConnectionPNames;
import org.apache.http.impl.io.AbstractMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultResponseParser extends AbstractMessageParser {
    private final CharArrayBuffer lineBuf;
    private final int maxGarbageLines;
    private final HttpResponseFactory responseFactory;

    public DefaultResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        if (httpResponseFactory == null) {
            ore.p("Response factory may not be null");
            throw null;
        }
        this.responseFactory = httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(np0.m);
        this.maxGarbageLines = httpParams.getIntParameter(ConnConnectionPNames.MAX_STATUS_LINE_GARBAGE, Integer.MAX_VALUE);
    }

    @Override // org.apache.http.impl.io.AbstractMessageParser
    public HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws HttpException, IOException {
        this.lineBuf.clear();
        int i = 0;
        while (true) {
            int line = sessionInputBuffer.readLine(this.lineBuf);
            if (line == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            ParserCursor parserCursor = new ParserCursor(0, this.lineBuf.length());
            if (this.lineParser.hasProtocolVersion(this.lineBuf, parserCursor)) {
                return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, parserCursor), null);
            }
            if (line == -1 || i >= this.maxGarbageLines) {
                throw new ProtocolException("The server failed to respond with a valid HTTP response");
            }
            i++;
        }
    }
}
