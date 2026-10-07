package org.apache.http.impl.io;

import defpackage.np0;
import defpackage.ore;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractMessageWriter implements HttpMessageWriter {
    protected final CharArrayBuffer lineBuf;
    protected final LineFormatter lineFormatter;
    protected final SessionOutputBuffer sessionBuffer;

    public AbstractMessageWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        if (sessionOutputBuffer == null) {
            ore.p("Session input buffer may not be null");
            throw null;
        }
        this.sessionBuffer = sessionOutputBuffer;
        this.lineBuf = new CharArrayBuffer(np0.m);
        this.lineFormatter = lineFormatter == null ? BasicLineFormatter.DEFAULT : lineFormatter;
    }

    @Override // org.apache.http.io.HttpMessageWriter
    public void write(HttpMessage httpMessage) throws HttpException, IOException {
        if (httpMessage == null) {
            ore.p("HTTP message may not be null");
            return;
        }
        writeHeadLine(httpMessage);
        HeaderIterator headerIterator = httpMessage.headerIterator();
        while (headerIterator.hasNext()) {
            this.sessionBuffer.writeLine(this.lineFormatter.formatHeader(this.lineBuf, (Header) headerIterator.next()));
        }
        this.lineBuf.clear();
        this.sessionBuffer.writeLine(this.lineBuf);
    }

    public abstract void writeHeadLine(HttpMessage httpMessage) throws IOException;
}
