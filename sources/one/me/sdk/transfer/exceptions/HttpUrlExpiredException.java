package one.me.sdk.transfer.exceptions;

import defpackage.m18;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/exceptions/HttpUrlExpiredException;", "Lone/me/sdk/transfer/exceptions/HttpErrorException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HttpUrlExpiredException extends HttpErrorException {
    public HttpUrlExpiredException(m18 m18Var, String str, int i) {
        super("Expired url", (i & 2) != 0 ? null : m18Var, (i & 4) != 0 ? null : str);
    }
}
