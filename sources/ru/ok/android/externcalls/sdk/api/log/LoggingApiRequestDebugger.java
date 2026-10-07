package ru.ok.android.externcalls.sdk.api.log;

import android.net.Uri;
import defpackage.c0a;
import defpackage.h2d;
import defpackage.j95;
import defpackage.op;
import defpackage.qp;
import defpackage.qv1;
import defpackage.rp;
import defpackage.to;
import defpackage.uo;
import defpackage.vu8;
import defpackage.wu8;
import defpackage.xp;
import defpackage.y3e;
import defpackage.ylc;
import defpackage.yp;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.collections.a;
import org.json.JSONException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J'\u0010'\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger;", "Lqp;", "Ly3e;", "log", "Lyp;", "sessionStore", "<init>", "(Ly3e;Lyp;)V", "Landroid/net/Uri;", "requestUri", "", "transformUriForLog", "(Landroid/net/Uri;)Ljava/lang/String;", "uriString", "Lylc;", "extractHostAndScheme", "(Ljava/lang/String;)Lylc;", "Lop;", "request", "getParams", "(Lop;)Ljava/lang/String;", "jsonString", "eraseSecrets", "(Ljava/lang/String;)Ljava/lang/String;", "getRawParams", "Lto;", "engine", "Luo;", "config", "Lsbi;", "debugApiRequest", "(Lto;Lop;Luo;)V", "Lvu8;", "reader", "debugApiResponseOk", "(Lto;Lop;Lvu8;)Lvu8;", "debugApiResponseFail", "Ljava/io/IOException;", "exception", "debugIoException", "(Lto;Lop;Ljava/io/IOException;)V", "Ly3e;", "Lyp;", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "secretEraser", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LoggingApiRequestDebugger implements qp {
    private static final Companion Companion = new Companion(null);
    private static final String ERASED_SECRET = "<ERASED_SECRET>";
    private static final String TAG = "CallsApiDebug";
    private final y3e log;
    private final RequestSecretEraser secretEraser = new RequestSecretEraser(a.p1(new String[]{ApiProtocol.KEY_TOKEN, "auth_data", "credential", "auth_token", "session_data"}), ERASED_SECRET);
    private final yp sessionStore;

    public LoggingApiRequestDebugger(y3e y3eVar, yp ypVar) {
        this.log = y3eVar;
        this.sessionStore = ypVar;
    }

    private final String eraseSecrets(String jsonString) {
        try {
            return this.secretEraser.eraseSecrets(jsonString);
        } catch (JSONException e) {
            this.log.logException(TAG, "can't erase secrets from json", e);
            return ERASED_SECRET;
        }
    }

    private final ylc extractHostAndScheme(String uriString) {
        Uri uri = Uri.parse(uriString);
        return new ylc(uri.getScheme(), uri.getHost());
    }

    private final String getParams(op request) {
        return eraseSecrets(getRawParams(request));
    }

    private final String getRawParams(op request) {
        StringWriter stringWriter = new StringWriter();
        h2d h2dVar = new h2d(stringWriter);
        try {
            h2dVar.p();
            request.writeParams(h2dVar);
            h2dVar.t();
            h2dVar.flush();
        } catch (Exception unused) {
            this.log.log(TAG, "failed to log request params");
        }
        return stringWriter.toString();
    }

    private final String transformUriForLog(Uri requestUri) {
        xp sessionInfo;
        yp ypVar = this.sessionStore;
        String str = (ypVar == null || (sessionInfo = ypVar.getSessionInfo()) == null) ? null : sessionInfo.b;
        if (str == null) {
            return requestUri.toString();
        }
        ylc ylcVarExtractHostAndScheme = extractHostAndScheme(str);
        String str2 = (String) ylcVarExtractHostAndScheme.a;
        String str3 = (String) ylcVarExtractHostAndScheme.b;
        return (str2 == null || str3 == null) ? requestUri.toString() : requestUri.buildUpon().scheme(str2).authority(str3).build().toString();
    }

    @Override // defpackage.qp
    public void debugApiRequest(to engine, op request, uo config) throws IOException {
        this.log.log(TAG, qv1.l("API request ", transformUriForLog(request.getUri()), " ", request instanceof rp ? qv1.k("start with params ", getParams(request)) : ""));
    }

    @Override // defpackage.qp
    public vu8 debugApiResponseFail(to engine, op request, vu8 reader) throws IOException {
        String strE0 = reader.E0();
        this.log.log(TAG, qv1.l("API request ", transformUriForLog(request.getUri()), " failed with response ", eraseSecrets(strE0)));
        return wu8.g(strE0);
    }

    @Override // defpackage.qp
    public vu8 debugApiResponseOk(to engine, op request, vu8 reader) throws IOException {
        String strE0 = reader.E0();
        this.log.log(TAG, qv1.l("API request ", transformUriForLog(request.getUri()), " success ", request instanceof rp ? qv1.k("with response ", eraseSecrets(strE0)) : ""));
        return wu8.g(strE0);
    }

    @Override // defpackage.qp
    public void debugIoException(to engine, op request, IOException exception) throws IOException {
        this.log.logException(TAG, c0a.o("API request ", transformUriForLog(request.getUri()), " failed with IO Exception"), exception);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger$Companion;", "", "<init>", "()V", "TAG", "", "ERASED_SECRET", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
