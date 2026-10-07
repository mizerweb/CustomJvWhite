package org.apache.commons.logging;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LogConfigurationException extends RuntimeException {
    protected Throwable cause;

    public LogConfigurationException(String str, Throwable th) {
        super(str + " (Caused by " + th + ")");
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public LogConfigurationException(String str) {
        super(str);
        this.cause = null;
    }

    public LogConfigurationException(Throwable th) {
        this(th == null ? null : th.toString(), th);
    }

    public LogConfigurationException() {
        this.cause = null;
    }
}
