package defpackage;

import android.os.Trace;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlinx.serialization.SerializationException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import ru.ok.android.api.core.ApiResponseException;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class i18 implements to {
    public final l18 a;
    public volatile String c;
    public final j85 g;
    public final mp4 b = new mp4(1);
    public final lhb d = lhb.h;
    public final lhb e = xs4.a;
    public qp f = qp.a;

    public i18(l18 l18Var) {
        this.a = l18Var;
        h18.q0.getClass();
        this.g = g18.b;
    }

    public final Object a(zo zoVar, uo uoVar) {
        lhb lhbVar = this.d;
        try {
            try {
                Trace.beginSection("HttpApiClient.execute: ".concat(etk.a(zoVar)));
                this.f.debugApiRequest(this, zoVar, uoVar);
                ljf ljfVarB = b(zoVar, uoVar);
                a28 a28VarR = this.a.r(ljfVarB);
                try {
                    if (a28VarR.K() != 200) {
                        throw new HttpStatusApiException(a28VarR.K());
                    }
                    try {
                        wu8 wu8VarB = wu8.b(a28VarR.A().l());
                        if (a28VarR.E().a(SM.SET_COOKIE)) {
                            lhb lhbVar2 = this.e;
                            xs4.a(a28VarR.E());
                            lhbVar2.getClass();
                        }
                        if (!a28VarR.E().a("Invocation-Error")) {
                            try {
                                if (!a28VarR.E().a("WMF-Invocation-Error")) {
                                    try {
                                        Object obj = zoVar.getOkParser().parse(this.f.debugApiResponseOk(this, zoVar, wu8VarB));
                                        if (ljfVarB.B().b("Geo-Position") != null) {
                                            lhbVar.getClass();
                                        }
                                        a28VarR.close();
                                        Trace.endSection();
                                        return obj;
                                    } catch (SerializationException e) {
                                        throw new ApiResponseException(e);
                                    } catch (JsonParseException e2) {
                                        throw new ApiResponseException(e2);
                                    } catch (JsonSyntaxException e3) {
                                        throw new ApiResponseException(e3);
                                    }
                                }
                            } catch (Throwable th) {
                                if (ljfVarB.B().b("Geo-Position") != null) {
                                    lhbVar.getClass();
                                }
                                throw th;
                            }
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                rx8.n(a28VarR, th);
                                throw th2;
                            }
                        }
                        try {
                            throw ((Throwable) zoVar.getFailParser().parse(this.f.debugApiResponseFail(this, zoVar, wu8VarB)));
                        } catch (JsonParseException e4) {
                            throw new ApiResponseException(e4);
                        }
                    } catch (JsonSyntaxException e5) {
                        throw new ApiResponseException(e5);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (IOException e6) {
                this.f.debugIoException(this, zoVar, e6);
                throw e6;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ljf b(zo zoVar, uo uoVar) {
        i18 i18Var;
        zo zoVar2;
        ljf ljfVarA = a2m.a();
        ljfVarA.U(zoVar.getPriority());
        String str = zoVar.shouldNeverPost() ? HttpGet.METHOD_NAME : HttpPost.METHOD_NAME;
        boolean z = false;
        if (str.equals(HttpPost.METHOD_NAME)) {
            ljfVarA.P(str);
            String string = this.b.a(zoVar).toString();
            ljfVarA.X(string);
            this.g.getClass();
            ljfVarA.M(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE);
            boolean zShouldNeverGzip = zoVar.shouldNeverGzip();
            boolean z2 = !zShouldNeverGzip;
            if (!zShouldNeverGzip) {
                ljfVarA.M(HTTP.CONTENT_ENCODING, "gzip");
            }
            i18Var = this;
            zoVar2 = zoVar;
            ljfVarA.p(new t80(i18Var, zoVar2, uoVar, y1m.d(string), z2));
        } else {
            i18Var = this;
            zoVar2 = zoVar;
            mp4 mp4Var = i18Var.b;
            String string2 = mp4Var.a(zoVar2).toString();
            int iD = k18.$EnumSwitchMapping$0[qt4.D(3)] == 1 ? y1m.d(string2) : 3;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mp4Var.b(byteArrayOutputStream, zoVar2, uoVar, iD);
            if (byteArrayOutputStream.size() != 0) {
                string2 = zo5.p(string2, r5h.U0(string2, '?', 0, 6) < 0 ? "?" : "&", byteArrayOutputStream.toString("UTF-8"));
            }
            ljfVarA.X(string2);
        }
        ljfVarA.O(etk.a(zoVar2));
        if (zoVar2.canRepeat() && zoVar2.getScopeAfter() == vp.a) {
            z = true;
        }
        ljfVarA.u(z);
        String str2 = i18Var.c;
        if (str2 != null) {
            ljfVarA.M(HTTP.USER_AGENT, str2);
        }
        if (cqk.d(zoVar2.getUri().getAuthority(), "api")) {
            i18Var.d.getClass();
            i18Var.e.getClass();
        }
        ljfVarA.M("Accept", "application/json");
        return ljfVarA.q();
    }
}
