package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import defpackage.c98;
import defpackage.ghe;

/* JADX INFO: loaded from: classes3.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final c98 c;

    public UnrecognizedInputFormatException(String str, ghe gheVar) {
        super(str, null, false, 1);
        this.c = c98.n(gheVar);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        c98 c98Var = this.c;
        if (c98Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + c98Var;
    }
}
