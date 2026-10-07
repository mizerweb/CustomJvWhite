package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import com.vk.push.core.remote.config.omicron.ParseException;
import com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import defpackage.b1k;
import defpackage.ore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkDataRetriever implements DataRetriever {
    public final RequestExecutor a;
    public final ResponseParser b;
    public final AnalyticsHandler c;
    public Data d;

    public NetworkDataRetriever(RequestExecutor requestExecutor, ResponseParser responseParser, AnalyticsHandler analyticsHandler) {
        this.a = requestExecutor;
        this.b = responseParser;
        this.c = analyticsHandler;
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.DataRetriever
    public Data getData() {
        Data data = this.d;
        if (data != null) {
            return data;
        }
        ore.k("Cannot get data if retrieve status is not SUCCESS");
        return null;
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
    @Override // com.vk.push.core.remote.config.omicron.retriever.DataRetriever
    public RetrievalStatus retrieve(DataId dataId, DataQuery dataQuery) {
        String url = dataId.getUrl();
        b1k b1kVar = new b1k(25);
        b1kVar.x(dataId.getAppId(), "mytracker_id");
        Integer num = dataQuery.a;
        if (num != null) {
            b1kVar.x(num, "config_v");
        }
        String str = dataQuery.b;
        if (str != null) {
            b1kVar.x(str, "cond_s");
        }
        Map map = dataQuery.c;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : map.values()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str2);
            }
            b1kVar.x(sb.toString(), AnalyticsBaseParamsConstantsKt.SEGMENTS);
        }
        OmicronEnvironment omicronEnvironment = dataQuery.d;
        if (omicronEnvironment != null) {
            b1kVar.x(omicronEnvironment.name(), "app_env");
        }
        String str3 = dataQuery.e;
        if (str3 != null) {
            b1kVar.x(str3, "account");
        }
        HashMap map2 = new HashMap();
        Iterator it = dataQuery.f.iterator();
        while (it.hasNext()) {
            ((OmicronFingerprint) it.next()).collect(map2);
            for (Map.Entry entry : map2.entrySet()) {
                b1kVar.x(entry.getValue(), (String) entry.getKey());
            }
            map2.clear();
        }
        HttpRequest.Post post = new HttpRequest.Post(url, ((StringBuilder) b1kVar.b).toString());
        String string = post.toString();
        AnalyticsHandler analyticsHandler = this.c;
        analyticsHandler.onConfigRequestStarted(string);
        try {
            HttpResponse httpResponseExecute = this.a.execute(post);
            analyticsHandler.onConfigRequestEnded(httpResponseExecute.getCode());
            int code = httpResponseExecute.getCode();
            if (code == 200) {
                this.d = this.b.parse(httpResponseExecute.getBody());
                analyticsHandler.onResponseSuccess(dataId);
                return RetrievalStatus.SUCCESS;
            }
            if (code != 304) {
                analyticsHandler.onResponseError(dataId, httpResponseExecute.getCode());
                return RetrievalStatus.ERROR;
            }
            analyticsHandler.onResponseNotModified(dataId);
            return RetrievalStatus.NOT_MODIFIED;
        } catch (ParseException e) {
            analyticsHandler.onConfigRequestFailedWithException(e);
            analyticsHandler.onResponseParseException(dataId, e);
            return RetrievalStatus.ERROR;
        } catch (Throwable th) {
            analyticsHandler.onConfigRequestFailedWithException(th);
            analyticsHandler.onResponseException(dataId, th);
            return RetrievalStatus.ERROR;
        }
    }
}
