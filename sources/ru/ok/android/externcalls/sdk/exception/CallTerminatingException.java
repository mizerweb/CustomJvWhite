package ru.ok.android.externcalls.sdk.exception;

import defpackage.j95;
import java.util.Locale;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B=\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0012\u001a\u00020\u0005J \u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014*\u00060\u0014j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0017\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/exception/CallTerminatingException;", "", ClientCookie.DOMAIN_ATTR, "Lru/ok/android/externcalls/sdk/exception/Domain;", "message", "", "subDomain", "Lru/ok/android/externcalls/sdk/exception/SubDomain;", "code", "", "cause", "<init>", "(Lru/ok/android/externcalls/sdk/exception/Domain;Ljava/lang/String;Lru/ok/android/externcalls/sdk/exception/SubDomain;Ljava/lang/Integer;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getCause", "()Ljava/lang/Throwable;", "asString", "appendSection", "Ljava/lang/StringBuilder;", "kotlin.jvm.PlatformType", "Lkotlin/text/StringBuilder;", "str", "", "Builder", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallTerminatingException extends Throwable {
    private final Throwable cause;
    private final Integer code;
    private final Domain domain;
    private final String message;
    private final SubDomain subDomain;

    public /* synthetic */ CallTerminatingException(Domain domain, String str, SubDomain subDomain, Integer num, Throwable th, int i, j95 j95Var) {
        this(domain, str, (i & 4) != 0 ? null : subDomain, (i & 8) != 0 ? null : num, th);
    }

    private final StringBuilder appendSection(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(':');
        return sb;
    }

    public final String asString() {
        StringBuilder sb = new StringBuilder();
        appendSection(sb, this.domain.name().toLowerCase(Locale.ROOT));
        SubDomain subDomain = this.subDomain;
        if (subDomain != null) {
            appendSection(sb, subDomain.asString());
        }
        Integer num = this.code;
        if (num != null) {
            appendSection(sb, Integer.valueOf(num.intValue()));
        }
        String message = getMessage();
        if (message == null) {
            message = String.valueOf(getCause());
        }
        sb.append(message);
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/exception/CallTerminatingException$Builder;", "", ClientCookie.DOMAIN_ATTR, "Lru/ok/android/externcalls/sdk/exception/Domain;", "cause", "", "message", "", "<init>", "(Lru/ok/android/externcalls/sdk/exception/Domain;Ljava/lang/Throwable;Ljava/lang/String;)V", "(Lru/ok/android/externcalls/sdk/exception/Domain;Ljava/lang/Throwable;)V", "(Lru/ok/android/externcalls/sdk/exception/Domain;Ljava/lang/String;)V", "getDomain", "()Lru/ok/android/externcalls/sdk/exception/Domain;", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "subDomain", "Lru/ok/android/externcalls/sdk/exception/SubDomain;", "code", "", "Ljava/lang/Integer;", "setSubDomain", "setCode", "build", "Lru/ok/android/externcalls/sdk/exception/CallTerminatingException;", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        private final Throwable cause;
        private Integer code;
        private final Domain domain;
        private final String message;
        private SubDomain subDomain;

        public Builder(Domain domain, Throwable th, String str) {
            this.domain = domain;
            this.cause = th;
            this.message = str;
        }

        public final CallTerminatingException build() {
            return new CallTerminatingException(this.domain, this.message, this.subDomain, this.code, this.cause, null);
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final Domain getDomain() {
            return this.domain;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Builder setCode(int code) {
            this.code = Integer.valueOf(code);
            return this;
        }

        public final Builder setSubDomain(SubDomain subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public Builder(Domain domain, Throwable th) {
            this(domain, th, th.getMessage());
        }

        public Builder(Domain domain, String str) {
            this(domain, null, str);
        }
    }

    private CallTerminatingException(Domain domain, String str, SubDomain subDomain, Integer num, Throwable th) {
        super(str, th);
        this.domain = domain;
        this.message = str;
        this.subDomain = subDomain;
        this.code = num;
        this.cause = th;
    }

    public /* synthetic */ CallTerminatingException(Domain domain, String str, SubDomain subDomain, Integer num, Throwable th, j95 j95Var) {
        this(domain, str, subDomain, num, th);
    }
}
