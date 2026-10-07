package com.vk.push.core.network.utils;

import android.net.Uri;
import com.vk.push.common.HostInfoProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"getHostInfoHttpBuilder", "Lcom/vk/push/core/network/utils/UrlBuilder;", "Lcom/vk/push/common/HostInfoProvider;", "hostInfo", "Landroid/net/Uri$Builder;", "hostInfoProvider", "core-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ExtensionsKt {
    public static final UrlBuilder getHostInfoHttpBuilder(HostInfoProvider hostInfoProvider) {
        return new UrlBuilder(hostInfoProvider);
    }

    public static final Uri.Builder hostInfo(Uri.Builder builder, HostInfoProvider hostInfoProvider) {
        String host;
        if (hostInfoProvider.getPort() != null) {
            host = hostInfoProvider.getHost() + ':' + hostInfoProvider.getPort();
        } else {
            host = hostInfoProvider.getHost();
        }
        return builder.scheme(hostInfoProvider.getScheme()).encodedAuthority(host);
    }
}
