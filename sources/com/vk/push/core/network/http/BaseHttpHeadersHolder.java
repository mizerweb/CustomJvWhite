package com.vk.push.core.network.http;

import defpackage.j95;
import defpackage.wm9;
import defpackage.ylc;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/vk/push/core/network/http/BaseHttpHeadersHolder;", "", "", "versionName", "packageName", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "get", "()Ljava/util/Map;", "a", "Ljava/lang/String;", "getVersionName", "()Ljava/lang/String;", "b", "getPackageName", DatabaseHelper.COMPRESSED_COLUMN_NAME, "getContentType", "Companion", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BaseHttpHeadersHolder {
    public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    public static final String CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded; charset=utf-8";
    public static final String DEFAULT_DEBUG_HEADER = "x-vkpns-request-id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String versionName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String packageName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String contentType;

    public BaseHttpHeadersHolder(String str, String str2, String str3) {
        this.versionName = str;
        this.packageName = str2;
        this.contentType = str3;
    }

    public final Map<String, String> get() {
        return wm9.Q0(new ylc(DEFAULT_DEBUG_HEADER, UUID.randomUUID().toString()), new ylc(HTTP.USER_AGENT, this.versionName), new ylc("X-Vkpns-Package-Name", this.packageName), new ylc("content-type", this.contentType));
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public /* synthetic */ BaseHttpHeadersHolder(String str, String str2, String str3, int i, j95 j95Var) {
        this(str, str2, (i & 4) != 0 ? CONTENT_TYPE_JSON : str3);
    }
}
