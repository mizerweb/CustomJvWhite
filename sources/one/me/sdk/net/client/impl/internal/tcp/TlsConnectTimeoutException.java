package one.me.sdk.net.client.impl.internal.tcp;

import defpackage.ew5;
import java.net.SocketTimeoutException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/net/client/impl/internal/tcp/TlsConnectTimeoutException;", "Ljava/net/SocketTimeoutException;", "client-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TlsConnectTimeoutException extends SocketTimeoutException {
    public TlsConnectTimeoutException(long j) {
        super("Tls connect timed out after ".concat(ew5.t(j)));
    }
}
