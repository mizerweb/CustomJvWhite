package com.vk.push.core.network.utils;

import com.vk.push.common.HostInfoProvider;
import defpackage.cqk;
import defpackage.j95;
import defpackage.nbh;
import defpackage.qv1;
import defpackage.r5h;
import defpackage.rl0;
import defpackage.ww3;
import defpackage.x05;
import defpackage.zo5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.apache.http.HttpHost;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/vk/push/core/network/utils/UrlBuilder;", "", "", "scheme", CandidateTypeHintConfig.TYPE_HOST, "", ClientCookie.PORT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/vk/push/common/HostInfoProvider;", "hostInfoProvider", "(Lcom/vk/push/common/HostInfoProvider;)V", "pathSegments", "addPathSegments", "(Ljava/lang/String;)Lcom/vk/push/core/network/utils/UrlBuilder;", SdkMetricStatEvent.NAME_KEY, SdkMetricStatEvent.VALUE_KEY, "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/push/core/network/utils/UrlBuilder;", "", "params", "addQueryParams", "(Ljava/util/Map;)Lcom/vk/push/core/network/utils/UrlBuilder;", "build", "()Ljava/lang/String;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UrlBuilder {
    public final String a;
    public final String b;
    public final Integer c;
    public final ArrayList d;
    public final ArrayList e;

    public UrlBuilder(HostInfoProvider hostInfoProvider) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = hostInfoProvider.getScheme();
        this.b = hostInfoProvider.getHost();
        this.c = hostInfoProvider.getPort();
    }

    public final UrlBuilder addPathSegments(String pathSegments) {
        List listM1 = r5h.m1(pathSegments, new String[]{"/"}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        this.d.addAll(arrayList);
        return this;
    }

    public final UrlBuilder addQueryParameter(String name, String value) {
        x05.m(name, value, this.e);
        return this;
    }

    public final UrlBuilder addQueryParams(Map<String, String> params) {
        for (Map.Entry<String, String> entry : params.entrySet()) {
            x05.m(entry.getKey(), entry.getValue(), this.e);
        }
        return this;
    }

    public final String build() {
        int i;
        ArrayList arrayList = this.d;
        String strJ = "";
        String strConcat = !arrayList.isEmpty() ? "/".concat(ww3.z1(arrayList, "/", null, null, null, 62)) : "";
        ArrayList arrayList2 = this.e;
        String strConcat2 = !arrayList2.isEmpty() ? "?".concat(ww3.z1(arrayList2, "&", null, null, rl0.p, 30)) : "";
        String str = this.a;
        Integer num = this.c;
        if (num != null) {
            if (cqk.d(str, HttpHost.DEFAULT_SCHEME_NAME)) {
                i = 80;
            } else {
                i = cqk.d(str, "https") ? 443 : -1;
            }
            if (num.intValue() != i) {
                strJ = qv1.j(":", num);
            }
        }
        return nbh.y(zo5.z(str, "://"), this.b, strJ, strConcat, strConcat2);
    }

    public /* synthetic */ UrlBuilder(String str, String str2, Integer num, int i, j95 j95Var) {
        this(str, str2, (i & 4) != 0 ? null : num);
    }

    public UrlBuilder(String str, String str2, Integer num) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = str;
        this.b = str2;
        this.c = num;
    }
}
