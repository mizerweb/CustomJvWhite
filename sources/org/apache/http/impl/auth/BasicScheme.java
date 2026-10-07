package org.apache.http.impl.auth;

import defpackage.ore;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.params.AuthParams;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicScheme extends RFC2617Scheme {
    private boolean complete = false;

    public static Header authenticate(Credentials credentials, String str, boolean z) {
        if (credentials == null) {
            ore.p("Credentials may not be null");
            return null;
        }
        if (str == null) {
            ore.p("charset may not be null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(credentials.getUserPrincipal().getName());
        sb.append(":");
        sb.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] bArrEncodeBase64 = Base64.encodeBase64(EncodingUtils.getBytes(sb.toString(), str));
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (z) {
            charArrayBuffer.append(AUTH.PROXY_AUTH_RESP);
        } else {
            charArrayBuffer.append(AUTH.WWW_AUTH_RESP);
        }
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(bArrEncodeBase64, 0, bArrEncodeBase64.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "basic";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        return this.complete;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return false;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.AuthScheme
    public void processChallenge(Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        this.complete = true;
    }

    @Override // org.apache.http.auth.AuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        if (credentials == null) {
            ore.p("Credentials may not be null");
            return null;
        }
        if (httpRequest != null) {
            return authenticate(credentials, AuthParams.getCredentialCharset(httpRequest.getParams()), isProxy());
        }
        ore.p("HTTP request may not be null");
        return null;
    }
}
