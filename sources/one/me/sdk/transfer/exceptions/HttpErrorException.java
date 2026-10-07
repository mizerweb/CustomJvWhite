package one.me.sdk.transfer.exceptions;

import defpackage.m18;
import defpackage.zo5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/transfer/exceptions/HttpErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class HttpErrorException extends Exception {
    public final m18 a;
    public final String b;

    public /* synthetic */ HttpErrorException(String str, m18 m18Var, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : m18Var, (i & 4) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m18 getA() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String message = getMessage();
        StringBuilder sb = new StringBuilder("HttpErrorException(msg='");
        sb.append(message);
        sb.append("', error='");
        sb.append(this.a);
        sb.append("', response='");
        return zo5.w(sb, this.b, "')");
    }

    public HttpErrorException(String str, m18 m18Var, String str2) {
        super(str);
        this.a = m18Var;
        this.b = str2;
    }
}
