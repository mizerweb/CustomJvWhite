package com.vk.push.core.network.http;

import defpackage.cqk;
import defpackage.j95;
import kotlin.Metadata;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/vk/push/core/network/http/HttpRequest;", "", "", "a", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "method", "b", "getUrl", MLFeatureConfigProviderBase.URL_KEY, DatabaseHelper.COMPRESSED_COLUMN_NAME, "getBody", "body", "Get", "Post", "Lcom/vk/push/core/network/http/HttpRequest$Get;", "Lcom/vk/push/core/network/http/HttpRequest$Post;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class HttpRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String method;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String body;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/vk/push/core/network/http/HttpRequest$Get;", "Lcom/vk/push/core/network/http/HttpRequest;", "", MLFeatureConfigProviderBase.URL_KEY, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/vk/push/core/network/http/HttpRequest$Get;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "getUrl", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Get extends HttpRequest {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final String url;

        public Get(String str) {
            super(HttpGet.METHOD_NAME, str, null, null);
            this.url = str;
        }

        public static /* synthetic */ Get copy$default(Get get, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = get.getUrl();
            }
            return get.copy(str);
        }

        public final String component1() {
            return getUrl();
        }

        public final Get copy(String url) {
            return new Get(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Get) && cqk.d(getUrl(), ((Get) other).getUrl());
        }

        @Override // com.vk.push.core.network.http.HttpRequest
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return getUrl().hashCode();
        }

        public String toString() {
            return "Get(url=" + getUrl() + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/vk/push/core/network/http/HttpRequest$Post;", "Lcom/vk/push/core/network/http/HttpRequest;", "", MLFeatureConfigProviderBase.URL_KEY, "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/push/core/network/http/HttpRequest$Post;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "getUrl", "e", "getBody", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Post extends HttpRequest {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final String url;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final String body;

        public Post(String str, String str2) {
            super(HttpPost.METHOD_NAME, str, str2, null);
            this.url = str;
            this.body = str2;
        }

        public static /* synthetic */ Post copy$default(Post post, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = post.getUrl();
            }
            if ((i & 2) != 0) {
                str2 = post.getBody();
            }
            return post.copy(str, str2);
        }

        public final String component1() {
            return getUrl();
        }

        public final String component2() {
            return getBody();
        }

        public final Post copy(String url, String body) {
            return new Post(url, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Post)) {
                return false;
            }
            Post post = (Post) other;
            return cqk.d(getUrl(), post.getUrl()) && cqk.d(getBody(), post.getBody());
        }

        @Override // com.vk.push.core.network.http.HttpRequest
        public String getBody() {
            return this.body;
        }

        @Override // com.vk.push.core.network.http.HttpRequest
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return getBody().hashCode() + (getUrl().hashCode() * 31);
        }

        public String toString() {
            return "Post(url=" + getUrl() + ", body=" + getBody() + ')';
        }
    }

    public HttpRequest(String str, String str2, String str3, j95 j95Var) {
        this.method = str;
        this.url = str2;
        this.body = str3;
    }

    public String getBody() {
        return this.body;
    }

    public final String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }
}
