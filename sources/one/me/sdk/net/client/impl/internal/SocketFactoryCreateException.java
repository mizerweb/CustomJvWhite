package one.me.sdk.net.client.impl.internal;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/net/client/impl/internal/SocketFactoryCreateException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "client-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SocketFactoryCreateException extends RuntimeException {
    public final IOException a;

    public SocketFactoryCreateException(IOException iOException) {
        super(iOException);
        this.a = iOException;
    }
}
