package org.apache.http.message;

import defpackage.ore;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicHeader implements Header, Cloneable {
    private final String name;
    private final String value;

    public BasicHeader(String str, String str2) {
        if (str == null) {
            ore.p("Name may not be null");
            throw null;
        }
        this.name = str;
        this.value = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.Header
    public HeaderElement[] getElements() throws ParseException {
        String str = this.value;
        return str != null ? BasicHeaderValueParser.parseElements(str, (HeaderValueParser) null) : new HeaderElement[0];
    }

    @Override // org.apache.http.Header
    public String getName() {
        return this.name;
    }

    @Override // org.apache.http.Header
    public String getValue() {
        return this.value;
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatHeader((CharArrayBuffer) null, this).toString();
    }
}
