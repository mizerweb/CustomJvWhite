package ru.ok.android.externcalls.sdk.api;

import android.net.Uri;
import defpackage.eu6;
import defpackage.fq;
import defpackage.g0;
import defpackage.hu8;
import defpackage.l6m;
import defpackage.np;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.vu8;
import defpackage.zo;
import java.io.IOException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonParseException;

/* JADX INFO: loaded from: classes3.dex */
public class GetAnonymTokenByLinkRequest extends g0 implements zo {
    private static final hu8 PARSER = new eu6(13);
    public final String joinLink;
    public final String name;

    public static final class Response {
        public final String token;
        public final String uid;

        public Response(String str, String str2) {
            this.uid = str;
            this.token = str2;
        }
    }

    public GetAnonymTokenByLinkRequest(String str, String str2) {
        this.joinLink = str;
        this.name = str2;
    }

    public static boolean isAuthRequired(ApiInvocationException apiInvocationException) {
        return apiInvocationException.getErrorCode() == 457;
    }

    public static /* synthetic */ Response lambda$static$0(vu8 vu8Var) throws JsonParseException, IOException {
        vu8Var.p();
        String strF = null;
        String strF2 = null;
        while (vu8Var.hasNext()) {
            String strName = vu8Var.name();
            strName.getClass();
            if (strName.equals("uid")) {
                strF = vu8Var.F();
            } else if (strName.equals(ApiProtocol.KEY_TOKEN)) {
                strF2 = vu8Var.F();
            } else {
                vu8Var.x();
            }
        }
        vu8Var.t();
        return new Response(strF, strF2);
    }

    @Override // defpackage.zo
    public /* bridge */ /* synthetic */ vo getConfigExtractor() {
        return vo.M;
    }

    @Override // defpackage.zo
    public /* bridge */ /* synthetic */ hu8 getFailParser() {
        return l6m.c;
    }

    @Override // defpackage.zo
    public hu8 getOkParser() {
        return PARSER;
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ int getPriority() {
        return 16;
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ up getScope() {
        return up.d;
    }

    @Override // defpackage.zo
    public /* bridge */ /* synthetic */ vp getScopeAfter() {
        return vp.a;
    }

    @Override // defpackage.op
    public Uri getUri() {
        return fq.b("vchat.getAnonymTokenByLink");
    }

    @Override // defpackage.g0
    public void populateParams(np npVar) {
        npVar.b(ApiProtocol.PARAM_JOIN_LINK, this.joinLink);
        npVar.b("anonymName", this.name);
    }

    public /* bridge */ /* synthetic */ boolean shouldGzip() {
        return false;
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ boolean shouldNeverGzip() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldNeverJson() {
        return false;
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ boolean shouldNeverPost() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldReport() {
        return true;
    }

    public GetAnonymTokenByLinkRequest(String str) {
        this(str, null);
    }
}
